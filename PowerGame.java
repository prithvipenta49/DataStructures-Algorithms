/*
There are 2 teams, each having N players. There will be N rounds played between the 2 teams. In every round, a player from team A plays against a player from team B. The more powerful player wins the game. Given the strength of the players of both the teams, you have to find the maximum number of rounds team A can win. Note that a player cannot play more than 1 round.

Input Format

First line of input contains T - number of test cases. Its followed by 3T lines. The first line contains N - size of the team. The next 2 lines contains N numbers each - strength of the players of team A and team B respectively.

Constraints

1 <= T <= 500
1 <= N <= 10000
0 <= A[i], B[i] <= 10000

Output Format

For each test case, print the maximum number of rounds team A can win, separated by newline.

Sample Input 0

3
4
1 5 7 4 
3 8 2 10 
2
2 3 
10 5 
3
3 7 10 
5 20 15 
Sample Output 0

2
0
1
Explanation 0

Test Case 1
Player with strength 5 in team A can defeat player with strength 3 in team B.
Player with strength 7 in team A can defeat player with strength 2 in team B.

Test Case 2
No Player in team A can defeat any player in team B.

Test Case 1
Player with strength 7 in team A can defeat player with strength 5 in team B.
 */


import java.io.*;
import java.util.*;

public class PowerGame {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String str1[] = s1.split(" ");
            int A[] = new int[N];
            for(int j=0;j<N;j++)
            {
                A[j]=Integer.parseInt(str1[j]);
            }
            String s2 = br.readLine();
            String str2[] = s2.split(" ");
            int B[] = new int[N];
            for(int k=0;k<N;k++)
            {
                B[k]=Integer.parseInt(str2[k]);
            }
            Arrays.sort(A);
            Arrays.sort(B);
            int p1=0,p2=0,count=0;
            while(p1<N && p2<N)
            {
                if(A[p1]>B[p2])
                {
                    count++;
                    p1++;
                    p2++;
                }
                else
                    p1++;
            }
            System.out.println(count);
        }
    }
}