/*
 Find the cube root of the given number. Assume that all the input test cases will be a perfect cube.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing a single integer.

Constraints

30 points
1 <= T <= 103
-109 <= N <= 109

70 points
1 <= T <= 106
-1018 <= N <= 1018

Output Format

For each test case, print the cube root of the number, separated by newline.

Sample Input 0

5
-27
-125
1000
6859
-19683
Sample Output 0

-3
-5
10
19
-27
 */



import java.io.*;
import java.util.*;

public class FindingCuberoot {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++)
        {
            long N = Long.parseLong(br.readLine());
            if(N>=0)
            {
                System.out.println(cubeRoot(N));
            }
            else
            {
                System.out.println(cubeRoot((N*(-1)))*(-1));
            }   
        }
    }
    
    public static long cubeRoot(long n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        long low,mid,high;
        low=2;
        high=1000000;
        mid=1;
        while(low<=high)
        {
            mid=low+((high-low)/2);
            if((mid*mid*mid)==n)
            {
                return mid;
            }
            if((mid*mid*mid)<n)
            {
                low=mid+1;
            }
            if((mid*mid*mid)>n)
            {
                high=mid-1;
            }     
        }
        return mid;
    }
}
    
