package com.count.service;



public class MergSort {
	
		public void mergSort(int [] arr,int s,int e ) { 
		
		if(s<e) {
			int mid=(s+e)/2;
			
			mergSort(arr,s,mid);
			
			mergSort(arr,mid+1,e);
			
			merg(arr,s,e,mid);
			
		}
		
		}
	private void merg(int[] arr, int s, int e, int mid) {
		// TODO Auto-generated method stub
		int l=mid-s+1;
		int r=e-mid;
		int left_subarray[]=new int[l];
		int right_subarray[]=new int[r];
		
		for(int i=0;i<l;i++) {
			left_subarray[i]=arr[s+i];	
		}
		
		for(int j=0;j<r;j++) {
			right_subarray[j]=arr[mid+1+j];
		}
		
		
		int i=0,j=0;
		int k=s;
		
		
		while(i<l && j<r) {
			if(left_subarray[i] <= right_subarray[j]) {
				arr[k]=left_subarray[i];
				i++;
			}else {
				arr[k]=right_subarray[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i<l) {
			arr[k]=left_subarray[i];
			i++;
			k++;
		}
		
		while(i<r) {
			arr[k]=right_subarray[j];
			j++;
			k++;
		}
		
		
	}

	
}
