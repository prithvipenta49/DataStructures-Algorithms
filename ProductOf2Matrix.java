/*
 Given 2 matrices, find the product.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N1, M1 - size of the 1st matrix. Its followed by N1 lines each containing M1 intergers - elements of the 1st matrix. The next line contains N2, M2 - size of the 2nd matrix. Its followed by N2 lines each containing M2 intergers - elements of the 2nd matrix. Note that M1 = N2.

Constraints

1 <= T <= 100
1 <= N1,M1,N2,M2 <= 50
-100 <= mat[i][j] <= 100

Output Format

For each test case, print the resultant product matrix, separated by newline.

Sample Input 0

2
2 2
1 2 
3 -1 
2 3
1 -2 3 
2 3 -1 
2 3
27 29 53 
-28 49 -24 
3 4
23 52 -38 72 
-64 15 -59 -10 
-75 43 10 25 
Sample Output 0

5 4 1 
1 -9 10 
-5210 4118 -2207 2979 
-1980 -1753 -2067 -3106 
 */


import java.io.*;
import java.util.*;

public class ProductOf2Matrix {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int k=1;k<=T;k++)
        {
            String matOneSize = br.readLine();
            String s[] = matOneSize.split(" ");
            int N1=Integer.parseInt(s[0]);
            int M1=Integer.parseInt(s[1]);
            int m[][] = new int[N1][M1];
            for(int i=0;i<N1;i++)
            {
                String s3 = br.readLine();
                String str[] = s3.split(" ");
                for(int j=0;j<M1;j++)
                {
                    m[i][j]=Integer.parseInt(str[j]);
                }
            }
            
            String matTwoSize = br.readLine();
            String s1[] = matTwoSize.split(" ");
            int N2=Integer.parseInt(s1[0]);
            int M2=Integer.parseInt(s1[1]);
            int n[][] = new int[N2][M2];
            for(int a=0;a<N2;a++)
            {
                String s2 = br.readLine();
                String str1[] = s2.split(" ");
                for(int b=0;b<M2;b++)
                {
                    n[a][b]=Integer.parseInt(str1[b]);
                }
            }
            
            //int result[][]=result[N1][M2];
            
            for(int p=0;p<N1;p++)
            {
                for(int q=0;q<M2;q++)
                {
                    int sum=0;
                    for(int r=0;r<N2;r++)
                    {
                        //result[p][q]=m[p][q]*n[q][p];
                        sum = sum + (m[p][r]*n[r][q]);
                    }
                    System.out.print(sum+" ");
                } 
                System.out.println();
            }  
        }
    }      
}
