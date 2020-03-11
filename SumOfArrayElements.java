/*
 Given an array of integers, find the sum of the elements of the given array.
Note: Try to solve this without declaring/storing the array elements.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 1000
1 <= ar[i] <= 1e15

Output Format

For each test case, print the sum of the elements of the array, separated by new line.

Sample Input 0

2
3
5 15 3 
2
70 100 
Sample Output 0

23
170
 */
 

import java.io.*;
import java.util.*;

public class SumOfArrayElements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T ;i++)
        {
            int S = sc.nextInt();
            long a[] = new long[(int)S];
            long sum =0L;
            for(int j=0;j<S;j++)
            {
                a[j] = sc.nextLong();
                sum = sum+a[j];
            }
            System.out.println(sum);
        }
    }
}