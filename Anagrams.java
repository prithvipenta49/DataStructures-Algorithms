/*
 * Given 2 strings, check if they are anagrams. An anagram is a rearrangement of the letters of one word to form another word. In other words, some permutation of string A must be same as string B.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 space separated strings.

Constraints

10 points
1 <= T <= 100
1 <= len(S) <= 103
'a' <= S[i] <= 'z'

40 points
1 <= T <= 100
1 <= len(S) <= 105
'a' <= S[i] <= 'z'

Output Format

For each test case, print True/False, separated by newline.

Sample Input 0

4
a a
b h
stop post
hi hey
Sample Output 0

True
False
True
False
 */
  
 
 import java.io.*;
 import java.util.*;

 public class Anagrams {

     public static void main(String[] args) throws IOException{
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(br.readLine());
         for(int i=0;i<T;i++)
         {
             String s[]=br.readLine().split(" ");
             if(s[0].length() != s[1].length())
             {
                 System.out.println("False");
             }
             else
             {
                 String a=sortString(s[0]);
                 String b=sortString(s[1]);
                 if(a.equals(b))
                     System.out.println("True");
                 else
                     System.out.println("False");
             }
         }
     }
     
     
     public static String sortString(String s)
     {
         char c[] = s.toCharArray();
         Arrays.sort(c);
         s=new String(c);
         return s;
     }
 }

