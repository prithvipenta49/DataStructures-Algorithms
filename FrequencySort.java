/*
 You are given an array of integers. Sort them by frequency. See examples for more clarifications.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 10000
-1000 <= A[i] <= 1000

Output Format

For each test case, print the elements of the array sorted by frequency. In case 2 elements have the same frequency, print the smaller element first.

Sample Input 0

2
6
4 -2 10 12 -8 4 
8
176 -272 -272 -45 269 -327 -945 176 
Sample Output 0

-8 -2 10 12 4 4 
-945 -327 -45 269 -272 -272 176 176 
 */

 

import java.io.*;
import java.util.*;

public class FrequencySort {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int a[] = new int[2001];
            int count[] = new int[2001];
            for(int j=0;j<N;j++)
            {
                a[(Integer.parseInt(s[j]))+1000]++;
            }
            
            /*for(int x=0;x<2001;x++)
            {
                if(a[x]!=0)
                    System.out.println(a[x]+" "+(x-1000)+" ");
            }*/
            
            for(int y=0;y<2001;y++)
            {
                count[a[y]]++;
            }
            
            //System.out.println();
            
            for(int z=1;z<2001;z++)
            {
                if(count[z]!=0)
                {
                    for(int w=0;w<2001;w++)
                    {
                        if(a[w]==z)
                        {
                            for(int pq=0;pq<z;pq++)
                                System.out.print((w-1000)+" ");
                        }
                            
                    }
                }        
            
            }
            

            /*for(int k=0;k<2001;k++)
            {
                if(a[k]!=0)
                {
                    for(int x=0;x<a[k];x++)
                    {
                        System.out.print(k-1000+" ");
                    }
                }
            }*/
            System.out.println();
        }
    }
    
}