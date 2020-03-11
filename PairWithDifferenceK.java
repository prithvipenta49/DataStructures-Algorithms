/*
You are given an integer array and a positive integer K. You have to tell if there exists a pair of integers in the given array such that ar[i]-ar[j]=K and i≠j.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Constraints

1 <= T <= 50
2 <= N <= 100000
1 <= K <= 100000
-100000 <= A[i] <= 100000

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line.

Sample Input 0

2
5 60
1 20 40 100 80 
10 11
12 45 52 65 21 645 234 14 575 112 
Sample Output 0

true
false
 */
 

import java.io.*;
import java.util.*;

public class PairWithDifferenceK {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s[] = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int key = Integer.parseInt(s[1]);
            String s1[] = br.readLine().split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[j] = Integer.parseInt(s1[j]);
            }
            Arrays.sort(a);
            
            int x=0,y=1;
            boolean res = false;
            while(x<N&&y<N)
            {
                if(x!=y && a[y]-a[x]==key)
                {
                    res =true;
                    break;
                }
                else if (a[y]-a[x]<key)
                    y++;
                else
                    x++;
            }
            System.out.println(res);
            
            //boolean res=false;
            /*for(int k=0;k<N;k++)
            {
                int x=a[k];
                int y=x-key;
                boolean res = BSR(a,y,k+1,N-1);
                System.out.println(res);
            }  */

        }   
    }
    
    /*public static boolean BSR(int a[] , int key, int low , int high)
    {
        if(low<=high)
        {
            int mid = low+((high-low)/2);
            if(a[mid]==key)
                return true;
            if(a[mid]>key)
                return BSR(a,key,mid+1,high);
            if(a[mid]<key)
                return BSR(a,key,low,mid-1);
        }
        return false;
    }*/
}
