/*
Look at the following sequence:
3, 5, 6, 9, 10, 12, 17, 18, 20....

All the numbers in the series has exactly 2 bits set in their binary representation. Your task is simple, you have to find the Nth number of this sequence.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing a single number N.

Constraints

20 points
1 <= T, N <= 200

60 points
1 <= T, N <= 105

120 points
1 <= T <= 105
1 <= N <= 1014

Output Format

For each test case, print the Nth number of the sequence, separated by newline. Since the number can be very large, print number % 1000000007.

Sample Input 0

5
1
2
5
50
100
Sample Output 0

3
5
10
1040
16640
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoSetBits {

    public static void main(String[] args) {
       int T;
       Scanner sc = new Scanner(System.in);
       T = sc.nextInt();
       for(int i=0;i<T;i++){
           long N;
           N = sc.nextLong();
           System.out.println(twobitsets(N));
       }
    }
    public static long twobitsets(long x){
       long high=100000000;
        long low=1;
        long mid=x/2;
        long ans;
        long sumUptoi;
        while(low<=high){
            mid = (high+low)/2;
            
            if((x>((mid-1)*(mid)/2)) && (x<=((mid)*(mid+1)/2)))
            {
                break;
            }
            else if(x>((mid)*(mid+1)/2) )
                low=mid+1;
            else
                high=mid-1;
            
            
            
            /*if(x<=((mid*(mid+1))/2)){
                if(x>((mid*(mid-1))/2))
                    break;
                high= mid-1;
            }
            else{
                if(x<=((mid+1)*(mid+2)/2)){
                    mid++;
                    break;
                }
                low =mid+1;
            }*/

        }
        //long secondbitpos = (mid-(((mid*(mid+1))/2)-(x)+1));
        long l =2;
        ans = (((pow(l,mid))%1000000007) + ((pow(l,(mid-(((mid*(mid+1))/2)-(x)+1))))%1000000007))%1000000007;
        return ans;
        //return mid;
      }
        public static long pow(long x, long y){
        long ans = 1;
        if (x==0){return 0;}
        else{
            while (y!=0){
                if((y&1)==1){
                    ans = (ans*x)%1000000007;
                }
                x = (x*x)%1000000007;
                y=(y>>1);
            }
            return (ans%1000000007);
        }

    }
}
