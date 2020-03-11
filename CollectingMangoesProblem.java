/*
 * One day after storm Mina went to pick up mangoes in the garden with a basket. She began to pick up mangoes from the garden. And if she wants, she can throw away the last picked up mango from the basket. In this way, Mina kept picking up mangoes. She brought you with her to keep track of the biggest size of mango in the basket at that time. At any moment Mina can ask you about the biggest size of mango. Your job is to help Mina.

Since you are a good programmer, so you write a program by which you are easily able to answer the question of Mina. During picking up mangoes, Mina can have 3 types of question/instruction for you.

Type 1: Put an "x" size mango in the basket, which is picked up form garden.

Type 2: Throw out last picked up mango.

Type 3: Ask for the biggest mango size in the basket at that moment.

Input Format

First line of input contains T - number of test cases. Each case start with a positive integer N, which is number of question/operation Mina will ask during picking up mangoes. Next N lines will contain 3 types of operations (A, R, Q): A x (here x is picked up mango size), R (Throw out last picked up mango from basket), Q (Find out the biggest size mango). Please use fast IO due to large size of input/ouptut.

Constraints

30 points
1 <= T <= 100
1 <= N <= 1000
1 <= x <= 100000

70 points
1 <= T <= 100
1 <= N <= 100000
1 <= x <= 100000

Output Format

For each test case, first print the case number and print the answer to each of Mina's questions (Queries of Type 3 - Q). Whenever the basket is empty, then Mina's question's answer will be "Empty".

Sample Input 0

2
7
A 10
A 5
Q
A 100
Q
R
Q
6
A 5
Q
R
Q
R
R
Sample Output 0

Case 1:
10
100
10
Case 2:
5
Empty
 */

 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CollectingMangoesProblem {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            log.write("Case "+(i+1)+":\n");
            Stack<Integer> one = new Stack<Integer>();
            Stack<Integer> two = new Stack<Integer>();
            int N = Integer.parseInt(br.readLine());
            boolean res = false;
            for(int j=0;j<N;j++)
            {
                String s[] = br.readLine().split(" ");
                if(s.length == 2)
                {
                    if(one.size()==0)
                    {
                        one.push(Integer.parseInt(s[1]));
                        two.push(Integer.parseInt(s[1]));
                        res = false;
                    }
                    else if(Integer.parseInt(s[1]) > two.peek())
                    {
                        one.push(Integer.parseInt(s[1]));
                        two.push(Integer.parseInt(s[1]));
                    }
                    else
                    {
                        one.push(Integer.parseInt(s[1]));
                        two.push(two.peek());
                    }
                }
                else if(s[0].equals("R"))
                {
                    if(one.size()!=0)
                    {
                        one.pop();
                        two.pop();
                    }
                    else
                        res = false;
                }
                else
                {
                    if(two.size()==0)
                    {
                        if(res == false)
                        {
                            log.write("Empty\n");
                            res = true;
                        }
                    }
                    else
                    {
                        log.write(two.peek()+"\n");
                    }
                }   
            }
            log.flush();
        }
    }
}
