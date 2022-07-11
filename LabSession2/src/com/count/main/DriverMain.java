package com.count.main;

import java.util.Scanner;

import com.count.service.MergSort;
import com.count.service.NoteCount;

public class DriverMain {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter currency denominations value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
			}
		
		//mergeSorting 
		MergSort sort=new MergSort();
		sort.mergSort(arr, 0,arr.length-1);
		
		
		
		System.out.println("Enter the amout you want to pay");
		int amount=sc.nextInt();
		
		NoteCount ct=new NoteCount();
		ct.count(amount, arr);

		}

}
