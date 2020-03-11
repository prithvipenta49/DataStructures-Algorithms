/*
 Count the number of trailing 0s in factorial of a given number.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing an integer N.

Constraints

1 <= T <= 10000
1 <= N <= 1015

Output Format

For each test case, print the number of trailing 0s in N!, separated by new line.

Sample Input 0

3
2
5
20
Sample Output 0

0
1
4
*/

 

import java.io.*;
import java.util.*;

public class TrailingZeroesEasy {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            long l = Long.parseLong(br.readLine());
            long ans=0l;
            while(l!=0)
            {
                ans = ans + (l/5);
                l = l/5;
            }
            System.out.println(ans);
        }
    }
}

