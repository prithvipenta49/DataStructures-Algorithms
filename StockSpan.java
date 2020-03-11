/*
 * You are given a series of daily price quotes for a stock and you need to calculate span of stock’s price for each day. The span Si of the stock’s price on current day i is defined as the maximum number of consecutive days just before the current day[including the current day], on which the price of the stock is less than or equal to its price on the current day.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains N integers - the elements of the array, ith element denotes the stock price on ith day.

Constraints

1 <= T <= 200
1 <= N <= 104
0 <= A[i] <= 104

Output Format

For each test case, print space-separated Stock Span Array, separated by new line.

Sample Input 0

2
7
100 80 60 70 60 75 85 
10
0 7 3 6 6 9 18 0 16 0 
Sample Output 0

1 1 1 2 1 4 6 
1 2 1 2 3 6 7 1 2 1
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockSpan {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int a[] = new int[N];
            for(int j=0;j<N;j++)    
            {
                a[j] = Integer.parseInt(s[j]);
            }
            
            Stack<Integer> st = new Stack<Integer>();
            
            int res[] = new int[N];
            res[0]=1;
            st.push(0);
            
            for(int k=0;k<N;k++)
            {
                while(!st.empty() && a[st.peek()]<=a[k])
                {
                    st.pop();
                }
                res[k] = (st.empty()) ? (k+1) : (k-st.peek());
                st.push(k);
            }
            
            for(int x=0;x<N;x++)
            {
                log.write(res[x]+" ");
            }
            log.write("\n");
        }
        log.flush();
    }
}
