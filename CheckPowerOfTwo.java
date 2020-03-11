/*
 Given a number, check if it is a power of 2.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing a single positive integer.

Constraints

1 <= T <= 10000
1 <= N <= 1018

Output Format

For each test case, print "True" or "False", separated by new line.

Sample Input 0

5
1
8
10
25
512
Sample Output 0

True
True
False
False
True
 */

 

import java.io.*;
import java.util.*;
import java.math.*;

public class CheckPowerOfTwo {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            long N = Long.parseLong(br.readLine());
            int count = 0;
            while(N!=0)
            {
                if((N&(long)1)==((long)1))
                {
                    count++;
                    if(count>1)
                    {
                        System.out.println("False");
                        break;
                    }
                }
                N = N>>1;
            }
            if(count==1)
            {
                System.out.println("True");
            }
        }
    }
}
