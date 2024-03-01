package ust;

import java.util.Scanner;

public class BinarySearch {
	
	public static int Search(int[] arr,int val)
	{
		int start = 0;
		int end = arr.length-1;
		
		boolean asc = false;
		if(arr[start]<arr[end])
			asc = true;
		if(asc==true)
		{
			while(start<=end)
			{
				int mid = (start+end)/2;
				if(val>arr[mid])
					start = mid+1;
				else if(val<arr[mid])
					end = mid-1;
				else
					return mid;
			}
			
		}
		else
		{
			while(start<=end)
			{
				int mid = (start+end)/2;
				if(val<arr[mid])
					start = mid+1;
				else if(val>arr[mid])
					end = mid-1;
				else
					return mid;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = ip.nextInt();
		int val = ip.nextInt();
		System.out.println(Search(arr,val));
		ip.close();
	}

}
