/*
 Given an array of integers and a number K, check if there exist a pair of indices i,j s.t. a[i] + a[j] = K and i!=j.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, first line of each test case contains N - size of the array and K, and the next line contains N integers - the elements of the array.

Constraints

30 points
1 <= T <= 100
2 <= N <= 1000

70 points
1 <= T <= 300
2 <= N <= 10000

General Constraints
-108 <= K <= 108
-108 <= ar[i] <= 108

Output Format

For each test case, print "True" if such a pair exists, "False" otherwise, separated by newline.

Sample Input 0

3
5 -15
-30 15 20 10 -10 
2 20
10 10 
4 7
-4 0 10 -7 
Sample Output 0

True
True
False
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfPairs {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String str = br.readLine();
            String s1[] = str.split(" ");
            int N = Integer.parseInt(s1[0]);
            int K = Integer.parseInt(s1[1]);
            String str1 = br.readLine();
            String s[] = str1.split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[j]=Integer.parseInt(s[j]);    
            }
            Arrays.sort(a);
            int p1=0;
            int p2=N-1;
            String res = "False";
            while(p1<p2)
            {
                if(a[p1]+a[p2]==K)
                {
                    res="True";
                    break;
                }
                if(a[p1]+a[p2]<K)
                    p1++;
                else
                    p2--;
            }
            System.out.println(res);
            
            
        }   
    }
    
}