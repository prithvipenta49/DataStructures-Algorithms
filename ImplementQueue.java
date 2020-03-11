/*
 * Perform Enqueue and Dequeue operations on a queue. Implement Queue and avoid using inbuilt library.

Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "Enqueue x" or "Dequeue".

Constraints

1 <= T <= 10000
-100 <= x <= 100

Output Format

For each "Dequeue" operation, print the dequeued element, separated by newline. If the queue is empty, print "Empty".


Sample Input 0

8
Enqueue 5
Dequeue
Dequeue
Enqueue 10
Enqueue -15
Dequeue
Enqueue -10
Dequeue
Sample Output 0

5
Empty
10
-15
 */



import java.io.*;
import java.util.*;

public class ImplementQueue {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<T;i++)
        {
            String s[] = br.readLine().split(" ");
            if(s.length>1)
            {
                a.add(Integer.parseInt(s[1]));
            }
            else
            {
                if(a.size()!=0)
                {
                    System.out.println(a.get(0));
                    a.remove((0));
                }
                else
                    System.out.println("Empty");
            }
        }
    }
}
