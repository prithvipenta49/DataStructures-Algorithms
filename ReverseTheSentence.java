/*
 * Given a sentence, reverse the entire sentence word-by-word.
Note: Solve using stack or in-place swap. Do not simply scan, split and print in reverse order.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains a sentence S of space separated words of lowercase english alphabet. All the words are separated by a single space.

Constraints

1 <= T <= 1000
1 <= len(S) <= 1000

Output Format

For each test case, print the reversed sentence, separated by newline.

Sample Input 0

3
hello world
a b c d
data structures and algorithms
Sample Output 0

world hello
d c b a
algorithms and structures data
 */



import java.io.*;
import java.util.*;

public class ReverseTheSentence {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            Stack<String> s = new Stack<String>();
            String s1[] = br.readLine().split(" ");
            for(int j=0;j<s1.length;j++)
            {
                s.push(s1[j]);
            }
            for(int k=0;k<s1.length;k++)
            {
                String p = s.pop();
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}