/*
 Given a 2D square matrix, print the matrix in a spiral order. Refer examples for more details. From interviews point of view, after you scan the matrix in a 2D array, try to print the matrix in a spiral order without using any extra space.


Input Format

First line of input contains T - number of test cases. First line of each test case contains N - size of the matrix [NxN]. Its followed by N lines each containing N integers - elements of the matrix.

Constraints

1 <= T <= 100
1 <= N <= 100
-100 <= ar[i][j] <= 100

Output Format

For each test case, print the matrix in a spiral order, separated by newline.

Sample Input 0

4
1
1
2
1 2
4 3
3
1 2 3
8 9 4
7 6 5
5
-44 25 -52 69 -5 
17 22 51 27 -44 
-79 28 -78 1 -47 
65 -77 -14 -21 -6 
-96 43 -21 -20 90 
Sample Output 0

1 
1 2 3 4 
1 2 3 4 5 6 7 8 9 
-44 25 -52 69 -5 -44 -47 -6 90 -20 -21 43 -96 65 -79 17 22 51 27 1 -21 -14 -77 28 -78 
 */


import java.io.*;
import java.util.*;

public class SpiralTraversalOfMatrix {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int k=1;k<=T;k++)
        {
            int N = Integer.parseInt(br.readLine());
            int m[][] = new int[N][N];
            for(int i=0;i<N;i++)
            {
                String s = br.readLine();
                String str[] = s.split(" ");
                for(int j=0;j<N;j++)
                {
                    m[i][j]=Integer.parseInt(str[j]);
                }
            }

            int rowStart=0; 
            int colStart=0;
            int rowEnd=N;
            int colEnd=N;
            while(rowStart<rowEnd && colStart<colEnd )
            {
                for(int a=colStart;a<colEnd;a++)
                {
                    System.out.print(m[rowStart][a]+" ");
                }
                rowStart++;
                for(int a=rowStart;a<rowEnd;a++)
                {
                    System.out.print(m[a][colEnd-1]+" ");
                }
                colEnd--;
                if(rowStart<rowEnd)
                {
                    for(int a=colEnd-1;a>=colStart;--a)
                    {
                        System.out.print(m[rowEnd-1][a]+" ");
                    }
                    rowEnd--;
                }
                if(colStart<colEnd)
                {
                    for(int a=rowEnd-1;a>=rowStart;--a)
                    {
                        System.out.print(m[a][colStart]+" ");
                    }
                    colStart++;
                }
            } 
            System.out.println();
        }
    }
}
