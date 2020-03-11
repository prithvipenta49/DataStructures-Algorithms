/*
Given an array of unique integer elements, print all the subsets of the given array in lexicographical order.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 10
0 <= A[i] <= 100

Output Format

For each test case, print the subsets of the given array in lexicographical order, separated by new line. Print an extra newline between output of different test cases.

Sample Input 0

3
3
5 15 3 
2
57 96 
4
3 15 8 23 
Sample Output 0

3 
3 5 
3 5 15 
3 15 
5 
5 15 
15 

57 
57 96 
96 

3 
3 8 
3 8 15 
3 8 15 23 
3 8 23 
3 15 
3 15 23 
3 23 
8 
8 15 
8 15 23 
8 23 
15 
15 23 
23 
 */



import java.io.*;
import java.util.*;


public class SubsetsOfanArray {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            int N = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String str[] = s.split(" ");
            int arr[] = new int[N];
            for(int j=0;j<N;j++)
            {
                arr[j]=Integer.parseInt(str[j]);
            }
            
           Arrays.sort(arr);
            
                        
            String res[] = new String[(1<<N)-1];
            for(int a=1;a<(1<<N);a++)
            {
                res[a-1]="";
                for(int b=0;b<N;b++)
                {
                    if((a & (1<<b)) > 0)
                    {
                        res[a-1] = res[a-1]+arr[b]+" ";
                    }
                }
            }
            
            int h = (1<<N)-2;
            
            mergeSort(res,0,h);
            
            //Arrays.sort(res);
           
            /*for(int p=1;p<(1<<N)-1;p++)
            {
                for(int q=1;q<(1<<N)-1;q++)
                {
                    String a[] = res[q].split(" ");
                    String b[] = res[q+1].split(" ");
                    int p1 = 0;
                    //int p2 = 0;
                                     
                    while(p1<a.length && p1<b.length)
                    {    
                        if ((Integer.valueOf(a[p1]))>(Integer.valueOf(b[p1])))
                        {
                            String temp = res[q];
                            res[q] = res[q+1];
                            res[q+1] = temp;
                            break;
                        }
                        p1++;
                        //p2++;
                    }
                }
            }*/
            
            //System.out.println(Arrays.toString(res));
            
            for(int k=0;k<(1<<N)-1;k++)
            {  
                System.out.println(res[k]);
            }
            
            System.out.println();

        }
    } 
    
    public static void mergeSort(String a[],int low , int high)
    {
        if(low==high)
            return;
        int mid = low+((high-low)/2);
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        mergeArrays(a,low,mid,high);
    }
    
    public static void mergeArrays(String a[],int low , int mid , int high)
    {
        String temp[] = new String[high-low+1];
        int k=0;
        int p1 = low;
        int p2 = mid+1;
        
        while(p1<=mid && p2<=high)
        {
            if(comp(a[p1],a[p2]))
            {
                temp[k++]=a[p2++];
            }
            else
            {
                temp[k++]=a[p1++];  
            }
        }
        while(p2<=high)
        {
            temp[k++]=a[p2++];
        }
        while(p1<=mid)
        {
            temp[k++]=a[p1++];
        }
        for(int x=0;x<(high-low+1);x++)
        {
            a[x+low]=temp[x];
        }
    }
    
    
    public static boolean comp(String x , String y)
    {
        String a[] = x.split(" ");
        String b[] = y.split(" ");
        
        int q1=0;
        boolean result = false;
        
        while(q1<a.length && q1<b.length)
        {
            if((Integer.valueOf(a[q1]))>(Integer.valueOf(b[q1])))
            {
                result = true;
                break;
            }
            if((Integer.valueOf(a[q1]))<(Integer.valueOf(b[q1])))
            {
                break;
            }
            else
            {
                q1++;
            }
            
            
        }
        return result;
    }
    
    
}
