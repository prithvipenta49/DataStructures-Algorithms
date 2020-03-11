/*
 Given an array, you have to find the frequency of a number x.

Input Format

First line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the frequency of X in the given array.

Constraints

30 points
1 <= N <= 105
1 <= Q <= 102
-108 <= ar[i] <= 108

70 points
1 <= N <= 105
1 <= Q <= 105
-108 <= ar[i] <= 108

Output Format

For each query, print the frequency of X, separated by newline.

Sample Input 0

9
-6 10 -1 20 -1 15 5 -1 15
5
-1
10
8
15
20
Sample Output 0

3
1
0
2
1
 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindingFrequency {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int a[]=new int[N];
        for(int j=0;j<N;j++)
        {
            a[j]=Integer.parseInt(s[j]);
        }

        //Arrays.sort(a);

        //System.out.println(Arrays.toString(a));

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();  
        int count =1;
        for(int k=0;k<N;k++)
        {
            if(!hm.containsKey(a[k]))
                hm.put(a[k],count);                   
            else
                hm.put(a[k],(hm.get(a[k]))+1);

        }

        int Q = Integer.parseInt(br.readLine());
        for(int x=0;x<Q;x++)
        {
            int key = Integer.parseInt(br.readLine());
            
            if(hm.containsKey(key))
            {
                int value = hm.get(key);
                System.out.println(value);
            }
            else
                System.out.println(0);
        }


        
        
        
        
    }
}

