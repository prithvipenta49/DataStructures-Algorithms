/*
 Implement Selection Sort and print the index which gets swapped at each step.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
2 <= N <= 100
-1000 <= ar[i] <= 1000


Output Format

For each test case, print the index which gets swapped at each step, separated by space. Separate the output of different tests by newline.

Sample Input 0

6
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161 
7
274 204 -161 481 -606 -767 -351 
2
154 -109 
4
5 3 1 5 
4
40 10 20 40 
Sample Output 0

4 0 4 3 1 2 1 
1 
3 0 1 2 2 1 
0 
0 0 1 
0 0 0 
 */


import java.io.*;
import java.util.*;

public class SelectionSort {

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
            
            
            for(int p=N-1;p>0;p--)
            {
                int maxEle=a[p];
                int nextMax=p;
                for(int q=p-1;q>=0;q--)
                {
                    if(maxEle<=a[q])
                    {
                        maxEle=a[q];
                        nextMax=q;   
                    } 
                    
                }
                
                
                a[p]=a[p]+a[nextMax]-(a[nextMax]=a[p]);
                
                System.out.print(nextMax+" ");
            }
            
            
            /*for(int x=0;x<N;x++)
            {
                System.out.print(a[x]+" ");
            }*/
            System.out.println();
        } 
    }
}
