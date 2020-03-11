/*
 Given an array, you have to find the floor of a number x. The floor of a number x is nothing but the largest number in the array less than or equal to x.

Input Format

First line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the floor of X in the given array.

Constraints

30 points
1 <= N <= 105
1 <= Q <= 102
-108 <= ar[i] <= 108

70 points
1 <= N <= 105
1 <= Q <= 105
-108 <= ar[i] <= 108

Output Format

For each query, print the floor of X, separated by newline. If floor not found, print the value of "INT_MIN"

Sample Input 0

6
-6 10 -1 20 15 5 
5
-1
10
8
-10
-4
Sample Output 0

-1
10
5
-2147483648
-6
 */


import java.io.*;
import java.util.*;

public class FindingTheFloor {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int a[] = new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int Q = Integer.parseInt(br.readLine());
        for(int j=0;j<Q;j++)
        {
            int k = Integer.parseInt(br.readLine());
            int floor = Integer.MIN_VALUE;
            int low =0 ;
            int high = N-1;
            while(low<=high)
            {
                int mid=low+((high-low)/2);
                if(a[mid]==k)
                {
                    floor=k;
                    break;
                }
                if(a[mid]>k)
                {
                    high=mid-1;
                }
                if(a[mid]<k)
                {
                    floor=a[mid];
                    low=mid+1;
                }
            }
            System.out.println(floor);
        }
    }
}
