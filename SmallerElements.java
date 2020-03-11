/*
 You are given an array of integers. For each element in the array, find the number of smaller elements on the right side and print the total count.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 100000
-10000 <= A[i] <= 10000

Output Format

For each test case, print the sum of count of smaller elements on right side of each element in the array, separated by new line.

Sample Input 0

2
5
4 10 54 11 8 
6
15 35 25 10 15 12 
Sample Output 0

4
10
Explanation 0

Test Case 1
Smaller Elements on right side of 4 : 0
Smaller Elements on right side of 10 : 1
Smaller Elements on right side of 54 : 2
Smaller Elements on right side of 11 : 1
Smaller Elements on right side of 8 : 0
Total Count = 0 + 1 + 2 + 1 + 0 = 4


Test Case 2
Smaller Elements on right side of 15 : 2
Smaller Elements on right side of 35 : 4
Smaller Elements on right side of 25 : 3
Smaller Elements on right side of 10 : 0
Smaller Elements on right side of 15 : 1
Smaller Elements on right side of 12 : 0
Total Count = 2 + 4 + 3 + 0 + 1 + 0 = 10
 */



import java.io.*;
import java.util.*;

public class SmallerElements {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String s[]=br.readLine().split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[j]=Integer.parseInt(s[j]);
            }
            long count = mergeSort(a,0,N-1);
            System.out.println(count);
        }    
    }
    
    public static long mergeSort(int a[] , int low , int high)
    {
        long count = 0L;
        if(low<high)
        {
            int mid = low +((high-low)/2);
            count=count+mergeSort(a,low,mid);
            count=count+mergeSort(a,mid+1,high);
            count=count+merge(a,low,mid,high);
        }
        return count;
    }
    
    public static long merge(int a[] , int low , int mid , int high)
    {
        int temp[] = new int[high-low+1];
        long count = 0;
        int p1=low;
        int p2=mid+1;//mid+1
        int k=0;
        
        while(p1<=mid&& p2<=high)
        {
            if(a[p1]<=a[p2])
            {
                temp[k++]=a[p1++];
            }
            else
            {
                temp[k++]=a[p2++];
                count += (mid-p1+1);   
            }
        }
        while(p1<=mid)
        {
            temp[k++]=a[p1++];
        }
        while(p2<=high)
        {
            temp[k++]=a[p2++];
        }
        for(int i=0;i<(high-low+1);i++)
        {
            a[low+i]=temp[i];
        }
        
        return count;
        
    }
}
