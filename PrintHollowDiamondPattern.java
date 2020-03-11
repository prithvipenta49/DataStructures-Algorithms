/*
Print hollow diamond pattern using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single odd integer N - the size of the diamond.

Constraints

1 <= T <= 100
3 <= N <= 201

Output Format

For each test case, print the test case number as shown, followed by the diamond pattern, separated by newline.

Sample Input 0

4
3
7
5
15
Sample Output 0

Case #1:
 *
* *
 *
Case #2:
   *
  * *
 *   *
*     *
 *   *
  * *
   *
Case #3:
  *
 * *
*   *
 * *
  *
Case #4:
       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
*             *
 *           *
  *         *
   *       *
    *     *
     *   *
      * *
       * 
        
*/

import java.io.*;
import java.util.*;

public class PrintHollowDiamondPattern {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter Number of test cases:");
        int T = sc.nextInt();
        int a[] = new int[T];
        for(int i=0;i<T;i++)
        {
            //System.out.print("Enter the size of the pattern:");
            a[i]=sc.nextInt();
        }
        for(int p=0;p<a.length;p++)
        {
        	int r=a[p];
        	String st = String.format("Case #%d:",(p+1));
        	System.out.println(st);
            
            int k=0;
        	for(int i=1;i<=r/2+1;i++)
            {
                for(int j=0;j<=r/2-i;j++)
                {
                    System.out.print(" ");
                }
                while(k != 2*i-1)
                {
                    if(k==0 || k==2*i-2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    k++;
                }
                k=0;
                System.out.println();
            }
            
            for(int i=r/2;i>=1;i--)
            {
                for(int j=0;j<=r/2-i;j++)
                {
                    System.out.print(" ");
                }
                while(k != 2*i-1)
                {
                    if(k==0||k==2*i-2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    k++;
                }
                k=0;
                System.out.println();
            }
        }
    }
}