/*
 Given a positive integer, print its binary representation.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing a single integer.

Constraints

1 <= T <= 10000
0 <= N <= 109

Output Format

For each test case, print binary representation, separated by new line.

Sample Input 0

5
10
15
7
1
120
Sample Output 0

1010
1111
111
1
1111000
 */


import java.io.*;
import java.util.*;
import java.math.*;

public class BinaryRepresentation {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            long N = Long.parseLong(br.readLine());
            if(N==0)
            {
                System.out.print(N);
            }
            else
            {
                binaryNum(N);
            }
            System.out.println();
        }
    }
    
    public static void binaryNum(long N)
    {
        if(N>1)
            binaryNum(N/2);
        System.out.print(N%2+"");
    }
}
