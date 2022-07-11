package com.transaction.service;

import java.util.Scanner;

public class TransactionService {
	Scanner sc=new Scanner(System.in);

	public void transaction(int targetno, int []arr) {

		int status=0;
		for(int i=0;i<targetno;i++) {
			
			System.out.println("Enter the value of target");
			int target=sc.nextInt();
			int temp=0;
			
			//for calculating and checking target
			for(int j=0;j<arr.length;j++) {
				  temp=temp+arr[j];
				
				if(target<=temp) {
					System.out.println("Target achived after "+ (j+1) + " transactions");
					status=1;
					break;
				}
				
				//System.out.println(temp);
			}
			if(status==0) {
				System.out.println("given target is not achieved");
				
			}
			
	
		}
		
		
		
		
	}


}
