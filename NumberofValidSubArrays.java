/*
 * You are given a array containing only 0s and 1s . You have to tell the number of subarrays which has equal number of 0s and 1s.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines - the first line contains N - the size of the array. The second line contains the elements of the array.

Constraints

40 points
1 <= T <= 100
1 <= N <= 100

60 points
1 <= T <= 100
1 <= N <= 1000

100 points
1 <= T <= 100
1 <= N <= 50000

Output Format

For each test case, output the number of subarrays having equal numer of 0s and 1s, separated by new line.

Sample Input 0

3
4
1 0 1 0 
10
1 0 1 0 0 1 0 0 1 1 
4
1 1 1 1 
 */



import java.io.*;
import java.util.*;

public class NumberofValidSubArrays {

    public static void main(String[] args) throws Exception{
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            String [] input = br.readLine().split("\\s");
            int [] arr =  new int[N+1];
            arr[0]=0;
            for(int j=1;j<=N;j++){
                if((Integer.parseInt(input[j-1]))==0)
                    arr[j] = -1;
                else
                    arr[j]= 1;
            }
            
            int[] countArray = new int[2*N+1];
            for(int j=0;j<=N;j++){
                //System.out.println(j);
                if(j==0){
                    arr[j] = arr[j];
                    countArray[arr[j]-(N*(-1))]++;
                }
                else{
                    arr[j] = arr[j-1]+arr[j];
                    countArray[arr[j]-(N*(-1))]++;
                }
                    
            }
            System.out.println(noOfValidSubArrays(countArray,2*N+1));
           /*  for(int j=0;j<2*N+1;j++){
                System.out.printf("%d ", countArray[j]);
            }
            System.out.println();*/
        }
    }
    public static int noOfValidSubArrays(int[] arr, int n){
        int count = 0;
        for(int i =0; i<n;i++){
            if(arr[i]>1){
                int s = ((arr[i]*(arr[i]+1)/2)-arr[i]);
                count = count+s;
            }
        }
        return count;
    }
}
