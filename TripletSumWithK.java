/*
 You are given an integer array and a number K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Constraints

30 points
1 <= T <= 100
3 <= N <= 100

70 points
1 <= T <= 100
3 <= N <= 1000

General
-100000 <= A[i] <= 100000
0 <= K <= 100000

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line.

Sample Input 0

3
5 60
1 20 40 100 80 
12 54
12 45 52 65 21 645 234 -100 14 575 -80 112 
3 15
5 5 5
Sample Output 0

false
true
true
 */
 

import java.io.*;
import java.util.*;

public class TripletSumWithK {

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
            
            boolean res = false;
            for(int x=0;x<N;x++)
            {
                int y = x+1;
                int z = N-1;
                while(y<z)
                {
                    if(a[x]+a[y]+a[z]==key)
                    {
                        res = true;
                        break;
                    }
                    else if (a[x]+a[y]+a[z]<key)
                        y++;
                    else
                        z--;
                }
            }
            System.out.println(res);
            
            
            

        }   
    }
    
    
}
