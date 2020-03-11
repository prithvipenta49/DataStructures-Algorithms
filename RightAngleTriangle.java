/*
Print mirror image of right-angled triangle using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N - the size of the pattern.

Constraints

1 <= T <= 100
1 <= N <= 100

Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by newline.

Sample Input 0

4
2
1
5
10
Sample Output 0

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
*/
 

import java.io.*;
import java.util.*;

public class RightAngleTriangle {
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
        	for(int i=0;i<r;i++)
        		{
        			for(int j=r;j>i+1;j--)
        			{
        				System.out.print(" ");
        			}
        			for(int k=0;k<=i;k++)
        			{
        				System.out.print("*");
        			}
        			System.out.println();
        		}
        }
    }
}