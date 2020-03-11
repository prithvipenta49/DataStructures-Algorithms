/*
 You are given an array of n+2 elements. All elements of the array are in range 1 to n. All elements occur once except two numbers, which occur twice. Your task is to find the two repeating numbers.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

Constraints

30 points
1 <= T <= 100
4 <= N <= 103

70 points
1 <= T <= 100
4 <= N <= 106

Output Format

Print the 2 repeated numbers in sorted manner, for each test case, separated by new line.

Sample Input 0

2
8
1 3 2 3 4 6 5 5 
10
1 5 2 8 1 4 7 4 3 6 
Sample Output 0

3 5
1 4
 */
 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedNumbers {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[Integer.parseInt(s[j])]++;    
            }
            for(int k=0;k<N-1;k++)
            {
                //System.out.print(a[k]+" ");
               if(a[k]==2)
                   System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
