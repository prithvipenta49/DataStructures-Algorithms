/*
 * Given an array of integers and a window size K, find the number of distinct elements in every window of size K of the given array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array and K - size of the window. The second line contains N integers - elements of the array.

Constraints

1 <= T <= 1000
1 <= N <= 10000
1 <= K <= N
-100 <= ar[i] <= 100

Output Format

For each test case, print the number of distinct elements in every window of size K, separated by newline.

Sample Input 0

3
5 3
-2 -4 -2 4 -2 
10 7
3 -4 -3 -4 -2 0 2 -2 6 0 
17 13
-5 -1 4 8 -5 -3 -4 7 4 -4 0 8 0 -2 3 2 5 
Sample Output 0

2 3 2 
6 5 6 5 
8 9 9 10 11 
 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DistinctElementsOfaWindow {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s[] = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            String s1[] = br.readLine().split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[j]=Integer.parseInt(s1[j]);
            }
            
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            int count=1;
            int result = 0 ;
            for(int x=0;x<K;x++)
            {
                if(!hm.containsKey(a[x]))
                {
                    hm.put(a[x],count);
                    result++;
                }
                else
                {
                    hm.put(a[x],(hm.get(a[x]))+1);
                }
            }
            
            System.out.print(result+" ");
            
            for(int y=K;y<N;y++)
            {
                if(hm.get(a[y-K])==1)
                {
                    hm.remove(a[y-K]);
                    result--;
                }   
                else
                {
                    hm.put(a[y-K],hm.get(a[y-K])-1);
                }
                if(hm.containsKey(a[y]))
                {
                    hm.put(a[y],hm.get(a[y])+1);
                }
                else
                {
                    count = 1;
                    hm.put(a[y],count);
                    result++;
                }
                System.out.print(result+" ");
            }
            System.out.println();
        }
        
    }
}

