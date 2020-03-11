/*
 Given 2 rectangles parallel to coordinate axes, find the area covered by them.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains 4 integers - xbl, ybl, xtr, ytr - the bottom-left and top-right coordinates of rectangle-1. The second line of each test case contains 4 integers - xbl, ybl, xtr, ytr - the bottom-left and top-right coordinates of rectangle-2.

Constraints

1 <= T <= 10000
-106 < x,y <= 106
(xbl, ybl) < (xtr, ytr)

Output Format

For each test case, print the area covered by the 2 rectangles, separated by newline.

Sample Input 0

4
2 5 4 6
1 2 5 4
-4 -3 -2 5
-3 -5 1 3
1 0 3 5
2 3 5 8
-2 2 4 4
-3 1 5 5
Sample Output 0

10
42
23
32
 */

 

import java.io.*;
import java.util.*;

public class OverlappingRectangles {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String str = br.readLine();
            String s[] = str.split(" ");
            long A = Long.parseLong(s[0]);
            long B = Long.parseLong(s[1]);
            long C = Long.parseLong(s[2]);
            long D = Long.parseLong(s[3]);
            long A1 = (D-B)*(C-A);
            
            String str1 = br.readLine();
            String s1[] = str1.split(" ");
            long P = Long.parseLong(s1[0]);
            long Q = Long.parseLong(s1[1]);
            long R = Long.parseLong(s1[2]);
            long S = Long.parseLong(s1[3]);
            long A2 = (S-Q)*(R-P);
            
            long I,J,K,L,A3,result;
            I = (A>P)?A:P;
            J = (B>Q)?B:Q;
            K = (C<R)?C:R;
            L = (D<S)?D:S;
            
            boolean flag = false;
            if(A>R || P>C){
                flag=false;
            }
            else if(D<Q || S<B){
                flag=false;
            }
            else{
                flag=true;
            }
            A3 = (L-J)*(K-I);
            result = (flag)?(A1+A2-A3):(A1+A2);
            
            
            System.out.println(result);
        }
    }
}