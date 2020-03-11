/*
 Given a sentence containing only uppercase/lowercase english alphabets and spaces, you have to count the number of words, vowels and consonants.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single sentence.

Constraints

1 <= T <= 1000
1 <= len(sentence) <= 104

Output Format

For each test case, print the number of words, vowels and consonants, separated by newline.

Sample Input 0

4
Hi
Hello World
  Exception  
Hi there
Sample Output 0

1 1 1
2 3 7
1 4 5
2 3 4
 */
 
 
 import java.io.*;
 import java.util.*;

 public class WordsVowelsConsonants {

     public static void main(String[] args) throws IOException{
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(br.readLine());
         for(int i=0;i<T;i++)
         {
             String s = br.readLine().trim().toLowerCase();
             if(s.isEmpty())
             {
                 System.out.println("0 0 0");
             }
             int words=1;
             int vow=0;
             int con=0;
             if(!s.isEmpty())
             {
                 for(int j=0;j<s.length()-1;j++)
                 {
                     char ch = s.charAt(j);
                     if(s.charAt(j)==' ' && s.charAt(j+1)!=' ')
                         words++;
                     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                         vow++;
                     else if(ch>='a' && ch<='z')
                         con++;
                 }
                 char c = s.charAt(s.length()-1);
                 if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                     vow++;
                 else if(c>='a' && c<='z')
                     con++;
                 System.out.println(words+" "+vow+" "+con);
             }
         }
     }
 }