/*
 Implement Insertion Sort and print the index at which the ith element gets inserted [i>=1].

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100
2 <= N <= 100
-1000 <= ar[i] <= 1000

Output Format

For each test case, print the index at which the ith element gets inserted [i>=1], separated by space. Separate the output of different tests by newline.

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

0 1 2 4 0 0 6 
1 
0 0 3 0 0 2 
0 
 */

  
 
 import java.io.*;
 import java.util.*;

 public class InsertionSort {

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
             for(int p=1;p<N;p++)
             {
                 int currentElement = a[p];
                 int q = p-1;
                 while(q>=0 && a[q]>currentElement)
                 {
                     a[q+1]=a[q];
                     q--;
                 }
                 System.out.print((q+1)+" ");
                 a[q+1]=currentElement;
             }
             System.out.println();
         } 
     }
 }
