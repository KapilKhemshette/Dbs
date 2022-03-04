import java.util.Scanner;
class Solution
{
	public  static int check(int[] arr)
	{ int sum=0;
	int temp=0;
		  for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        } 
		int start=arr[0];
		int end=arr[(arr.length)-1];
		for(int i=start;i<arr.length-1;i++)
		{
			sum+=arr[i]*arr[i+1];
		}
		return sum;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		int res;
		res=check(A);
		System.out.println(res);
		
	}
}
