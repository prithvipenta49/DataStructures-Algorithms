/*
 * Zack is learning Operating Systems. He came across the following commands:
cd - changes the location of working directory, and
pwd - display the present working directory

If the cd parameter contains "..", that means you have to step back one directory. The path of directories is separated by slashes "/". The default root directory is "/". Your task is to print the current working directory, for each "pwd" command.

Input Format

First line of input contains T - number of test cases. For each test case, first line of input contains N - number of commands. Its followed by N lines, each containing either a "cd <path>" or a "pwd" command. Each "cd" command will end with a "/".

Constraints

1 <= T <= 100
1 <= N <= 100
1 <= len(path) <= 200
path[i] ∈ ('a' - 'z', '.', '/')

Output Format

For each "pwd" command, print the present working directory, separated by new line. Print newline between output of test cases.

Sample Input 0

2
8
pwd
cd /Users/Guest/
pwd
cd ../Admin/Desktop/
pwd
cd /Users/Guest/Desktop/
cd os/labs/
pwd
6
cd /sem/networks/labs/
pwd
cd ../../os/labs/../slides/
pwd
cd /
pwd
Sample Output 0

/
/Users/Guest/
/Users/Admin/Desktop/
/Users/Guest/Desktop/os/labs/

/sem/networks/labs/
/sem/os/slides/
/
 */

 

import java.io.*;
import java.util.*;

public class ChangingDirectories {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            Stack<String> st = new Stack<String>();
            int N = Integer.parseInt(br.readLine());
            for(int j=0;j<N;j++)
            {
                String s[] = br.readLine().split(" ");
                if(s[0].equals("pwd"))
                {
                    if(st.empty())
                    {
                        log.write("/");
                    }
                    else
                    {
                        log.write("/");
                        //log.write(st.size()+"  ");
                        for(String x:st)
                        {
                            if(!x.equals(""))
                                log.write(x+"/");
                        }
                    }
                    log.write("\n");
                }  
                else
                {
                    
                    String s1[] = s[1].split("/");
                    if(s[1].charAt(0)=='/')
                    {
                        while(!st.empty())
                        {
                            st.pop();
                        }
                    }
                    if(s1.length!=0)
                    {
                        if(s1[0].equals(".."))
                        {
                            
                            for(int k=0;k<s1.length;k++)
                            {
                                if(s1[k].equals(".."))
                                {
                                    st.pop();
                                }
                                else
                                {
                                    st.push(s1[k]);
                                }
                            }
                        }
                        else
                        {
                            for(int l=0;l<s1.length;l++)
                            {
                                if(s1[l].equals(".."))
                                {
                                    st.pop();
                                }
                                else
                                {
                                    st.push(s1[l]);
                                }
                            }  
                        }
                    }
                    else
                    {
                        while(!st.empty())
                        {
                            st.pop();
                        }  
                    }
                }
            }
            log.write("\n");
        }
        log.flush();
    }
    
    

}

