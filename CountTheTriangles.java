/*
 You have a collection of N rods. Each rod has a unique mark on it. You are given the lengths of each rod. You have to tell how many different triangles can be formed using these rods.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the number of rods. The second line contains the lengths of the rods.

Constraints

40 points
1 <= T <= 100
1 <= N <= 100
1 <= A[i] <= 100000

60 points
1 <= T <= 100
1 <= N <= 1000
1 <= A[i] <= 100000

Output Format

For each test case, print the total number of different triangles possible, separated by new line.

Sample Input 0

2
6
20 67 72 83 23 59 
6
4 2 10 12 8 10 
Sample Output 0

14
10
 */



import java.io.*;
import java.util.*;

public class CountTheTriangles {

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
            Arrays.sort(a);
            int count=0;
            for(int p=0;p<N-2;p++)
            {
                int r = p+2;
                for(int q=p+1;q<N-1;q++)
                {
                    while(r<N && a[p]+a[q]>a[r])
                    {
                        r++;
                    }  
                    count=count+r-q-1;
                }
            }
            System.out.println(count);
        }
    }
}
