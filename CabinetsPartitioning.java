/*
 * You are given a job which has been divide into N tasks. The task cannot be divided any further. Each of the N tasks takes Si number of seconds to complete. Your job will be completed when all your tasks are completed. You have K workers at your disposal to help you complete the tasks. But as per the nature of the job, a worker can only be allocated continuous tasks. A worker can work only on a single task at any given point of time. However, the workers can work in parallel on different tasks. You have to find the minimum possible time in which you can complete the job.


Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N and K - number of tasks and available workers for the current job, separated by space. The next line contains N positive integers - denoting the time taken to complete the ith task.


Constraints

50 points
1 <= N,K <= 20

150 points
1 <= N,K <= 10000

General Constraints
1 <= T <= 50
1 <= Si <= 103

Output Format

For each test case, print the minimum possible time in which you can complete the job, separated by newline.


Sample Input 0

6
10 3
1 10 13 4 5 12 23 12 18 8 
8 4
17 27 22 45 26 32 45 16 
2 2
74 61 
7 3
74 24 61 81 66 76 51 
2 1
54 10 
4 2
15 30 10 50 
Sample Output 0

38
66
74
159
64
55
 */
 

import java.io.*;
import java.util.*;

public class CabinetsPartitioning {

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
            int low = Integer.MIN_VALUE;
            int high = 0;
            for(int j=0;j<N;j++)
            {
                a[j] = Integer.parseInt(s1[j]);
                if(a[j]>low)
                {
                    low = a[j];
                }
                high = high + a[j];    
            }
            if(K==1)
            {
                System.out.println(high);
            }
            else
            {
                int mid=0;
                while(low<high)  
                {
                    mid = low+((high-low)/2);
                    if(valid(a,mid,K))
                        high = mid;
                    else
                        low = mid+1;
                }  

                System.out.println(low-1);
            }
            
        }
    }
    
    
    public static boolean valid(int a[] , int mid , int K )
    {
        int res[] = new int[K];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(res[j]+a[i]<mid)
            {
                res[j]=res[j]+a[i];
            }
            else
            {
                j++;
                if(j<K && res[j]+a[i]<mid)
                    res[j]=res[j]+a[i];
                else
                    return false;
            }
        }         
        return true;  
    }
}
