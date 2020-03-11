/*
 You are given two numbers A and B. Write a program to count the number of bits to be flipped to change the number A to the number B. Flipping a bit of a number means changing a bit from 1 to 0 or vice versa.

Input Format

First line of input contains T - number of test cases. Each of the next T lines contains 2 integer A and B, separated by space.

Constraints

1 <= T <= 100000
0 <= N <= 109

Output Format

For each test case, print the number of bit flips required to convert A to B, separated by new line.

Sample Input 0

4
20 10
16 8
1 153
549 24
Sample Output 0

4
2
3
6
 */


import java.io.*;
import java.util.*;

public class FlipBits {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int a=0;a<T;a++)
        {
            String p = br.readLine();
            String s[] = p.split(" ");
            int m = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            int count=0;
            while(true)
            {
                if(m%2 != n%2)
                {
                    count++;
                }
                m=m>>1;
                n=n>>1;
                if(m==0 && n==0)
                {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
