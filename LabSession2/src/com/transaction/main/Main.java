package com.transaction.main;

import java.util.Scanner;


import com.transaction.service.TransactionService;

public class Main  {
	// TODO Auto-generated constructor 
	public static void main(String[] args) {
		
		System.out.println("Enter the size transaction array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the values of array");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		
		System.out.println("enter total no. targets that needs to be achieved");
		int targetno=sc.nextInt();
		//Create object for Transaction class
		TransactionService tc=new TransactionService();
		tc.transaction(targetno, arr);
		
		
	}

}
