/*
 Implement Bubble Sort and print the total number of swaps involved to sort the array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 100
-1000 <= ar[i] <= 1000

Output Format

For each test case, print the total number of swaps, separated by new line.

Sample Input 0

4
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109
Sample Output 0

15
0
16
1
 */


import java.io.*;
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) throws IOException{
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
                a[j]=Integer.parseInt(s[j]);  
            }

            int count = 0 ;
            
            for(int p=0;p<N;p++)
            {
                for(int q=0;q<N-1;q++)
                {
                    if(a[q]>a[q+1])
                    {
                        a[q]=a[q]+a[q+1]-(a[q+1]=a[q]);
                        count++;
                    }
                }
            }
            
            System.out.println(count);
            
        }
        
    }
}
