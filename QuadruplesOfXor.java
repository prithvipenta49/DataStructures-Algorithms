/*
 * You are given 4 arrays - A, B, C, D of integers. You have to find the number of quadruples (i, j, k, l) such that A[i]^B[j]^C[k]^D[l] = 0, where ^ is the bitwise XOR operator.

Input Format

First line of input contains T - number of test cases. Its followed by 5T lines, the first line contains N - the size of the array. The next 4 lines contains the elements of the arrays A, B, C and D respectively.

Constraints

10 points
1 <= T <= 100
1 <= N <= 20
1 <= A[i] <= 100

20 points
1 <= T <= 100
1 <= N <= 100
1 <= A[i] <= 100

70 points
1 <= T <= 100
1 <= N <= 500
1 <= A[i] <= 100

Output Format

For each test case, print the total number of quadruples, separated by new line.

Sample Input 0

3
4
31 8 28 10 
18 7 22 5 
16 25 20 14 
39 9 34 19 
2
27 21 
39 40 
64 77 
36 5 
8
49 73 58 30 72 44 78 23 
9 40 65 92 42 87 3 27 
29 40 12 3 69 9 57 60 
33 99 78 16 35 97 26 12 
Sample Output 0

2
0
36
Explanation 0

Test Case 1
There are only 2 quadruples with XOR=0: 28^22^25^19 and 28^5^16^9.

Test Case 2
None of the quadruples has XOR=0.
 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuadruplesOfXor {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            
            int a[] = new int[N];
            int b[] = new int[N];
            int c[] = new int[N];
            int d[] = new int[N];
            
            String s1[] = br.readLine().split(" ");
            convert(s1,a);
            String s2[] = br.readLine().split(" ");
            convert(s2,b);
            String s3[] = br.readLine().split(" ");
            convert(s3,c);
            String s4[] = br.readLine().split(" ");
            convert(s4,d);
            
            int res1[] = new int[N*N];
            int res2[] = new int[N*N];
                
            int index = 0;
            int index1 = 0;
            for(int x=0;x<N;x++)
            {
                for(int y=0;y<N;y++)
                {
                    res1[index++]= a[x]^b[y];
                    res2[index1++]= 0^c[x]^d[y];
                }
            }
            
            HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();  
            int count =1;
            for(int k=0;k<N*N;k++)
            {
                if(!hm.containsKey(res2[k]))
                    hm.put(res2[k],count);                   
                else
                    hm.put(res2[k],(hm.get(res2[k]))+1);
            }
            
            int c1 = 0;
            for(int x1=0;x1<N*N;x1++)
            {
                int key = res1[x1];

                if(hm.containsKey(key))
                {
                    int value = hm.get(key);
                    c1 = c1+value;
                }
                else
                    c1 = c1;
            }
            
            
            System.out.println(c1);
            
            //System.out.println(Arrays.toString(res1));
            //System.out.println(Arrays.toString(res2));
            
            
        }
    }
    
    
    public static void convert(String[] s, int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
    }
    
    
    
}

