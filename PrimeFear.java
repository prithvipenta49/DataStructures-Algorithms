/*
 * Ross and Rachael are afraid of prime numbers, but they are not afraid of all prime numbers. They were afraid of only a special kind of prime numbers. They are afraid of the prime numbers (without the digit zero, they love all the primes which have digits 0 in them) that remain prime no matter how many of the leading digits are omitted. For example, they are afraid of 4632647 because it doesn't have the digit 0 and each of its truncations (632647, 32647, 2647, 647, 47, and 7) are primes.

You are given a simple task, given a number of N, find out the number of primes not greater that N, that Ross and Rachael are afraid of.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing as single number - N.

Constraints

40 points
1 <= T <= 103
1 <= N <= 103

60 points
1 <= T <= 104
1 <= N <= 104

100 points
1 <= T <= 106
1 <= N <= 106

Output Format

For each test case, print the number of primes not greater that N, that Ross and Rachael are afraid of, separated by new line.

Sample Input 0

3
5
100
30
Sample Output 0

3
15
7
 */
 

import java.io.*;
import java.util.*;

public class PrimeFear {

    
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean a[] = new boolean[1000001];
        a[0]=a[1]=false;
        for(int i=2;i<=1000000;i++)
        {
            a[i]=true;
        }
        
        for(int j=2;j<=1000;j++)
        {
            if(a[j])
            {
                for(int k=j*2;k<=1000000;k=k+j)
                {
                    a[k]=false;
                }
            }
        }
        
        int pf[] = new int[1000001];
        pf[0]=0;
        for(int l=1;l<=1000000;l++)
        {
            if(a[l]==false)
                pf[l]=pf[l-1];
            else
            {
                String z = String.valueOf(l);
                if(z.contains("0"))
                    pf[l]=pf[l-1];
                else
                {
                    boolean flag = true;
                    for(int y=0;y<z.length()-1;y++)
                    {
                        if(a[Integer.valueOf(z.substring(y+1))])
                        {
                            flag=true;;
                        }
                        else
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                        pf[l]=pf[l-1]+1;
                    else
                        pf[l]=pf[l-1];
                }
            }
        }
        
       /* for(int w=0;w<=100;w++)
        {
            System.out.print(pf[w]+" ");
        }*/
        
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int x=0;x<T;x++)
        {
            int p = Integer.parseInt(br.readLine());
            /*int count=0;
            for(int y=2;y<=p;y++)
            {
                if(a[y])
                {
                    String z = String.valueOf(y);
                    if(z.contains("0") || z.charAt(z.length()-1)=='1' || z.charAt(z.length()-1)=='9' )
                        continue;
                    else
                    {
                        //System.out.print(y+" ");
                        count++;
                    }
                           
                }
            }*/
            log.write(pf[p]+"\n");
            
            log.flush();
             
        }
                
    }
    

}
