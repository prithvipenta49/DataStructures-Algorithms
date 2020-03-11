/*
 * Perform push and pop operations on a deque. Implement Deque and avoid using inbuilt library.

Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "push_front x" or "push_back x" or "pop_front" or "pop_back".

Constraints

1 <= T <= 10000
-100 <= x <= 100

Output Format

For each of "pop_front" and "pop_back" operations, print the popped element, separated by newline. If the deque is empty, print "Empty".

Sample Input 0

10
push_back 5
pop_front
pop_front
push_back 10
push_front -15
pop_back
push_back -10
push_back 20
pop_front
pop_front
Sample Output 0

5
Empty
10
-15
-10
 */
 

import java.io.*;
import java.util.*;

public class ImplementingDequeue {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<Integer>();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s[]=br.readLine().split(" ");
            if(s.length>1)
            {
                if(s[0].equals("push_back"))
                {
                    a.add(Integer.parseInt(s[1]));
                   // System.out.println(a.size()+1);
                }
                else
                {
                    a.add(0,Integer.parseInt(s[1]));
                    //System.out.println(a.get(0));
                }
            }
            else
            {
                if(a.size()==0)
                {
                    System.out.println("Empty");
                }
                else if(s[0].equals("pop_front"))
                {
                    System.out.println(a.get(0));
                    a.remove(0);
                }
                else
                {
                    System.out.println(a.get(a.size()-1));
                    a.remove(a.size()-1);
                }
            }
        }
    }
}
