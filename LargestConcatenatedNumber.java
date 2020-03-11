/*
 Given an array of integers, find the largest number that can be constructed by concatenating all the elements of the given array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array and the second line contains N integers - elements of the array.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 1000

Output Format

For each test case, print the largest number that can be constructed by concatenating all the elements of the given array, separated by newline.

Sample Input 0

3
8
49 73 58 30 72 44 78 23 
4
69 9 57 60 
2
40 4 
Sample Output 0

7873725849443023
9696057
440

 */
 

import java.io.*;
import java.util.*;

public class LargestConcatenatedNumber {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String str1 = br.readLine();
            String s[] = str1.split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[j]=Integer.parseInt(s[j]);        
            }
            mergeSort(a,0,N-1); 
            for(int r=0;r<N;r++)
            {
                System.out.print(a[r]);
            }
            System.out.println();
        }
    }
    
    public static void mergeSort(int a[],int low , int high)
    {
        
        if(low == high)
            return ;
        int mid = low+((high-low)/2);
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        mergeArrays(a,low,mid,high); 
    }
    
    public static void mergeArrays(int a[] ,int low , int mid ,int high)
    {
        int temp[] = new int[high-low+1];
        int k = 0;
        int p1 = low;
        int p2 = mid+1;
        while(p1<=mid && p2<=high)
        {
            if(comp(a[p1],a[p2]))
            {
                temp[k++]=a[p1++];
            }
            else
                temp[k++]=a[p2++];
        }
        while(p1<=mid)
        {
            temp[k++]=a[p1++];
        }
        while(p2<=high)
        {
            temp[k++]=a[p2++];
        }
        for(int x=0;x<(high-low+1);x++)
        {
            a[x+low]=temp[x];
        }
    }
    
    public static boolean comp(int a , int b)
    {
        if ((Integer.valueOf(String.valueOf(a)+String.valueOf(b)))>(Integer.valueOf(String.valueOf(b)+String.valueOf(a))))
            return true;
        else
            return false;
    }
}