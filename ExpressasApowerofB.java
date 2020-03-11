/*
 * Given a number, check if the number can be expressed as pow(a, b) where both a and b should be greater than 1.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N.

Constraints

30 points
1 <= T <= 104
1 <= N <= 106

70 points
1 <= T <= 106
1 <= N <= 108

Output Format

For each test case, print "Yes" if N can be expressed as pow(a, b), print "No" otherwise, separated by newline.

Sample Input 0

5
2
16
31
8880
961
Sample Output 0

No
Yes
No
No
Yes
 */
 
 
 import java.io.*;
 import java.util.*;

 public class ExpressasApowerofB {

     public static void main(String[] args) throws IOException{
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(br.readLine());
         HashSet<Long> h = new HashSet<Long>();
         for(long j=2;j<=10000L;j++)
         {
             long p=j*j;
             while(p<=100000000L)
             {
                 h.add(p);
                 p=p*j;  
             }  

         }
         
         
         BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
         
         
         
         for(int i=0;i<T;i++)
         {
             long N = Long.parseLong(br.readLine());
             if(h.contains(N))
             {
                 //System.out.println("Yes");
                 log.write("Yes\n");
                 
             }
             else
             {
                 //System.out.println("No");
                 log.write("No\n");
                 //log.flush();
             }
             log.flush();
         }   
     }
      
 }
