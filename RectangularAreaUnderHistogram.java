/*
 * Given height of adjacent buildings, find the largest rectangular area possible, where the largest rectangle can be made of a number of contiguous buildings. For simplicity, assume that all buildings have same width and the width is 1 unit.
Note: The sides of rectangle has to be parallel to the axes.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines - the first line contains N - the number of buildings. The second line contains the height of the buildings.

Constraints

50 points
1 <= T <= 100
1 <= N <= 103
1 <= A[i] <= 1000

150 points
1 <= T <= 100
1 <= N <= 105
1 <= A[i] <= 104

Output Format

For each test case, print the area of the largest possible rectangle, separated by new line.

Sample Input 0

2
7
6 2 5 4 5 1 6 
4
5 10 12 4 
Sample Output 0

12
20
Explanation 0

Test Case 1

You can form the following rectangles:
6x1 = 6, 2x5 = 10, 5x1 = 5, 4x3 = 12, 5x1 = 5, 1x7 = 7, 6x1 = 6 : max = 12 [axb means rectangle with height a and width b]

Test Case 2

You can form the following rectangles:
5x3 = 15, 10x2 = 20, 12x1 = 12, 4x4 = 16 : max = 20 [axb means rectangle with height a and width b]
 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RectangularAreaUnderHistogram {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            int a[] = new int[N];
            String s[] = br.readLine().split(" ");
            for(int j=0;j<N;j++)
            {
                a[j] = Integer.parseInt(s[j]);
            }
            
            int FSL[] = new int[N];
            int FSR[] = new int[N];
            
            leftArray(a,FSL);
            rightArray(a,FSR);
            
            
            //log.write("\n");
            //log.write(Arrays.toString(FSL)+"\n");
            //log.write(Arrays.toString(FSR)+"\n");
            int max=0;
            
            for(int k=0;k<N;k++)
            {
                if(FSR[k]==0 && FSL[k]==0)
                {
                    max = Math.max(max,(a[k]*N));
                }
                else if (FSR[k]==0)
                {
                    max = Math.max(max,(a[k]*(N-FSL[k])));
                }   
                else                       
                    max = Math.max(max,(a[k]*(FSR[k]-FSL[k]-1)));
            }
            
            log.write(max+"\n");
        } 
        log.flush();
    }
    
    public static void leftArray(int a[] , int res[])
    {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<a.length;i++)
        {
            while(!st.empty() && a[st.peek()]>a[i])
            {
                st.pop();
            }
            res[i] = (st.empty())? 0 : st.peek()+1;
            st.push(i);
        }
    }
    
    
    public static void rightArray(int a[] , int res[])
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        for(int i=1;i<a.length;i++)
        {
            while(!st.empty() && a[st.peek()]>a[i])
            {
                res[st.peek()]=i+1;
                st.pop();  
            }
            st.push(i);
        }
    }
    
}

