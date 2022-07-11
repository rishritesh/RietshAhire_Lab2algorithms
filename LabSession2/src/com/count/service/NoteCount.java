package com.count.service;

public class NoteCount {
	public void count(int pay,int [] arr) {
		int[] temp=new int[arr.length];
		int[] note=new int[arr.length];
		int status=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			//System.out.println(arr[i]);
			if(pay>=arr[i] ) {
				note[i]=(pay/arr[i]);
				temp[i]=pay-((pay/arr[i])*arr[i]);
				
				//System.out.println(temp[i]+"hi");
				pay=temp[i];
			}
			if(pay==0) {
				status=1;
				//for(int j=0;j<temp.length;j++) ;
				//System.out.println(arr[i]+"  "+note[j]);
			}
			
			
			
		}
		if(status==1) {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int j=0;j<arr.length;j++)
				if(note[j]!=0) 
					System.out.println(arr[j]+":"+note[j]);
				
		}else {
			System.out.println("not have change");
		}
	
	}

	

	

}
