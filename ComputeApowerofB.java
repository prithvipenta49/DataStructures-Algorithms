/*
 Given 2 numbers - a and b, evaluate ab.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 numbers - a and b, separated by space.

Constraints

30 points
1 <= T <= 1000
0 <= a <= 106
0 <= b <= 103

70 points
1 <= T <= 1000
0 <= a <= 106
0 <= b <= 109

Output Format

For each test case, print ab, separated by new line. Since the result can be very large, print result % 1000000007

Sample Input 0

4
5 2
1 10
2 30
10 10
Sample Output 0

25
1
73741817
999999937
 */



import java.io.*;
import java.util.*;

public class ComputeApowerofB {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s = br.readLine();
            String st[] = s.split(" ");
            long a = Long.parseLong(st[0]);
            long b = Long.parseLong(st[1]);
            long sum;
            if(b==0)
            {   
                sum = 1;
                System.out.println(sum);
            }
            else
            {
                long result = (long)1;
                long m = (long)1e9+7;
                while(b>0)
                {
                    if((long)(b&(long)1) == (long)1)
                    {   
                        result=(result*a)%m;
                    }
                    b=b>>1;
                    a=(a*a)%m;   
                }
                System.out.println(result);
            }
        }
    }
}
