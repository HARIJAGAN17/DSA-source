package ust;

import java.util.Arrays;
import java.util.Scanner;

public class All_sort {
	
	public static void bubbleSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			boolean swap = false;
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap = true;
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			if(swap ==false)
				break;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int index = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
					index = j;
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				else
					break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int[] mergeSort(int arr[])
	{
		if(arr.length==1)
			return arr;
		int mid = arr.length/2;
		int left[] = MergeSort(Arrays.copyOfRange(arr, 0, mid));
		int right[] =MergeSort( Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}
	public static int[] merge(int left[],int right[])
	{
		int joined[] = new int[left.length+right.length];
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				joined[k++] = left[i++];
			}
			else
			{
				joined[k++] = right[j++];
			}
		}
		while(i<left.length)
		{
			joined[k++] = left[i++];
		}
		while(j<right.length)
		{
			joined[k++] = right[j++];
		}
		//System.out.println(Arrays.toString(joined));
		return joined;
		
	}
	public static void quickSort(int[] arr,int low,int high)
	{
		if(low>=high)
			return;
		
		int start = low;
		int end = high;
		int mid = (start+end)/2;
		int pivot = arr[mid];
		
		while(start<=end)
		{
			while(arr[start]<pivot)
				start++;
			while(arr[end]>pivot)
				end--;
			if(start<=end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		QuickSort(arr,low,end);
		QuickSort(arr,start,high);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		
		int n = ip.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = ip.nextInt();
		
		QuickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		ip.close();
		
	}

}
