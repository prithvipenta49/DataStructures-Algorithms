/*
 * Perform push and pop operations on stack. Implement Stacks and avoid using inbuilt library.

Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "push x" or "pop".

Constraints

1 <= T <= 10000
-100 <= x <= 100

Output Format

For each "pop" operation, print the popped element, separated by newline. If the stack is empty, print "Empty".

Sample Input 0

8
push 5
pop
pop
push 10
push -15
pop
push -10
pop
Sample Output 0

5
Empty
-15
-10
 */



import java.io.*;
import java.util.*;

public class ImplementStack {
    
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int a[] = new int[10000];
        int top = -1;
        for(int i=0;i<T;i++)
        {
            String s1[] = br.readLine().split(" ");
            if(s1.length>1)
            {
                int t = top+1;
                a[t]=a[t]+Integer.parseInt(s1[1]);
                //System.out.println(a[t]);
                top++;
            }
            else
            {
                if(top==-1)
                {
                    System.out.println("Empty");
                }
                else
                {
                    System.out.println(a[top]);
                    a[top]=0;
                    top--;
                }
            }
        }
    }   
    
}


