/*
 Given a string of characters, find the first repeating character.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single string of characters.

Constraints

1 <= T <= 1000
'a' <= str[i] <= 'z'
1 <= len(str) <= 104

Output Format

For each test case, print the first repeating character, separated by newline. If there are none, print '.'.

Sample Input 0

3
smartinterviews
algorithms
datastructures
Sample Output 0

s
.
a
Explanation 0

Self Explanatory


 */


import java.io.*;
import java.util.*;

public class FirstRepeatingCharacter {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s[] = br.readLine().split("");
            HashMap<String,Integer> h = new HashMap<String,Integer>();
            
            for(int j=0;j<s.length;j++)
            {
                int count=1;
                if(!h.containsKey(s[j]))
                {
                    h.put(s[j],count);
                    //System.out.print(s[j]+" ");
                }
                else
                {
                    h.put(s[j],h.get(s[j])+1);
                }
            }
            if(h.size()==s.length)
                System.out.println(".");
            else
            {
                for(int k=0;k<h.size();k++)
                {
                    if(h.get(s[k])!=1)
                    {
                        System.out.println(s[k]);
                        break;
                    } 
                }
            }
        }
    }
}
