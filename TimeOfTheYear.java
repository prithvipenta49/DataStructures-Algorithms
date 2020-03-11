/*
 Given the number of seconds elapsed since epoch [01-01-1970 00:00:00 Thursday], you need to find the current date, along with the day.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains the number of seconds elapsed since epoch.

Constraints

1 <= T <= 10000
0 <= S <= 109

Output Format

For each test case, print the date in DD-MMM-YYYY format, followed by the day, separated by newline.

Sample Input 0

10
86399
86400
2592000
2678400
8639999
8640000
31535999
31536000
68169599
68169600
Sample Output 0

01-JAN-1970 Thursday
02-JAN-1970 Friday
31-JAN-1970 Saturday
01-FEB-1970 Sunday
10-APR-1970 Friday
11-APR-1970 Saturday
31-DEC-1970 Thursday
01-JAN-1971 Friday
28-FEB-1972 Monday
29-FEB-1972 Tuesday
 */

 

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class TimeOfTheYear {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int a=0;a<T;a++)
        {
            long S = Long.parseLong(br.readLine());
            Date date = new Date(S * 1000);
            //SimpleDateFormat sdf = (new SimpleDateFormat("dd-MMM-yyyy EEEE",Locale.ENGLISH));  
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy EEEE");
            //sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            String formattedDate = sdf.format(date);
            String d[] = formattedDate.split("-");
            d[1]=d[1].toUpperCase();
            String result = String.format("%s-%s-%s",d[0],d[1],d[2]);
            System.out.println(result);
            
            
        }
    }
}
