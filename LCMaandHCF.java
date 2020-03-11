/*
 Given 2 numbers, find their LCM and HCF.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains 2 numbers A and B.

Constraints

1 <= T <= 105
1 <= A,B <= 109

Output Format

For each test case, print their LCM and HCF separated by space, separated by newline.

Sample Input 0

4
4 710
13 1
6 4
605904 996510762
Sample Output 0

1420 2
13 1
12 2
7740895599216 78
 */
 

import java.io.*;
import java.util.*;

public class LCMaandHCF {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s = br.readLine();
            String s1[] = s.split(" ");
            long A = Long.parseLong(s1[0]);
            long B = Long.parseLong(s1[1]);
            long product = A*B;
            
            if(A<B)
            {
                A=A+B-(B=A);   
            }
            long temp,hcf;
            
            while(B!=0)
            {
                temp = B;
                B = A%B;
                A = temp;   
            }
            hcf = A;
            long lcm = product/hcf;
            String str = String.format("%d %d",lcm,hcf);
            System.out.println(str);
        }
    }
}
