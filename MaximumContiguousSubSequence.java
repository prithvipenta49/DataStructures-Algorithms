/*
Given an array, find the length of the longest subsequence whose elements can be re-arranged in a strictly increasing contiguous order. The difference between 2 adjacent elements in the subsequence, after re-arrangement, should be exactly 1.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - the elements of the array.

Constraints

1 <= T <= 1000
1 <= N <= 10000
-100000 <= ar[i] <= 100000

Output Format

For each test case, print the length of the longest subsequence, separated by newline.

Sample Input 0

3
8
21 -22 -22 5 -31 -24 5 -23 
10
18 -33 31 33 30 -14 32 30 16 17 
6
6 3 8 5 2 5 
Sample Output 0

3
4
2
Explanation 0

Test Case 1
Subsequence is: -22, -24, -23.

Test Case 2
Subsequence is: 31, 33, 30, 32.

Test Case 3
Subsequence is: 6, 5 or 3, 2.
 */

 

import java.io.*;
import java.util.*;

public class MaximumContiguousSubSequence {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String str[] = s.split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[j]=Integer.parseInt(str[j]);           
            }
            Arrays.sort(a);
            int count=1;
            int res = 1;
            for(int p=0;p<N-1;p++)
            {
                if(a[p]==(a[p+1]-1))
                {
                    count++;
                }
                else if(a[p]==(a[p+1]))
                {
                    continue;
                }
                else
                {
                    res = (count>res)?count:res;
                    count=1;
                }
                res = (count>res)?count:res;
            }
            System.out.println(res);
        }
    }
}
