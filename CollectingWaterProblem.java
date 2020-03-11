/*
 * You are given the heights of N buildings. All the buildings are of width 1 and are adjacent to each other with no empty space in between. Assume that its raining heavily, and as such water will be accumulated on top of certain buildings. Your task is to find the total amount of water accumulated.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the number of buildings. The second line contains N elements denoting the height of the buildings.

Constraints

30 points
1 <= T <= 1000
1 <= N <= 1000
1 <= a[i] <= 1000

70 points
1 <= T <= 1000
1 <= N <= 100000
1 <= a[i] <= 1000

Output Format

For each test case, print the units of water accumulated, separated by newline.

Sample Input 0

2
7
1 6 2 4 5 7 9 
5
3 2 7 4 7 
Sample Output 0

7
4
Explanation 0

Test Case 1
Water accumulated on top of Building-1 : 0
Water accumulated on top of Building-2 : 0
Water accumulated on top of Building-3 : 4
Water accumulated on top of Building-4 : 2
Water accumulated on top of Building-5 : 1
Water accumulated on top of Building-6 : 0
Water accumulated on top of Building-7 : 0
Total = 0 + 0 + 4 + 2 + 1 + 0 + 0 = 7


Test Case 2
Water accumulated on top of Building-1 : 0
Water accumulated on top of Building-2 : 1
Water accumulated on top of Building-3 : 0
Water accumulated on top of Building-4 : 3
Water accumulated on top of Building-5 : 0
Total = 0 + 1 + 0 + 3 + 0 = 4
 */
 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CollectingWaterProblem {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int a[] = new int[N];
            int l[] = new int[N];
            int r[] = new int[N];
            for(int j=0;j<N;j++)
            {
                a[j] = Integer.parseInt(s[j]);
            }
            l[0]=a[0];
            r[N-1]=a[N-1];
            for(int k=1;k<N-1;k++)
            {
                l[k] = Math.max(l[k-1],a[k]);
            }
            for(int p=N-2;p>=0;p--)
            {
                r[p] = Math.max(r[p+1],a[p]);
            }
            int count = 0;
            for(int x=0;x<N;x++)
            {
                count = count + ((Math.min(l[x],r[x]) - a[x])>0 ? (Math.min(l[x],r[x]) - a[x]) : 0);
                //System.out.print(Math.min(l[x],r[x]) - a[x]+" ");
            }
            //System.out.println();
            System.out.println(count);
        }
    }
    
}

