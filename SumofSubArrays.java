/*
 Given an array of integers, answer queries of the form: [i, j] : Print the sum of array elements from A[i] to A[j], both inclusive.

Input Format

First line of input contains N - size of the array. The next line contains N integers - elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains 2 space separated indexes: i and j.

Constraints

30 points
1 <= N,Q <= 10000

70 points
1 <= N,Q <= 500000

General Constraints
-109 <= A[i] <= 109
0 <= i <= j <= N-1

Output Format

For each query, print the sum of array elements from A[i] to A[j], both inclusive, separated by newline.

Sample Input 0

10
1 30 13 -4 -5 12 -53 -12 43 100 
4
0 5
1 7
2 3
7 9
Sample Output 0

47
-19
9
131
 */
 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumofSubArrays {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        long a[] = new long[N];
        long sum[] = new long[N];
        for(int i=0;i<N;i++)
        {
            a[i] = Long.parseLong(s[i]);
        }
        sum[0]=a[0];
        for(int j=1;j<N;j++)
        {
            sum[j]=sum[j-1]+a[j];
        }
        int T1 = Integer.parseInt(br.readLine());
        for(int k=0;k<T1;k++)
        {
            String s1[] = br.readLine().split(" ");
            int x = Integer.parseInt(s1[0]);
            int y = Integer.parseInt(s1[1]);

            if(x==y)
                System.out.println(sum[x]);
            else if(x==0)
                System.out.println(sum[y]);
            else
                System.out.println(sum[y]-sum[x-1]);
        }
    }
}
