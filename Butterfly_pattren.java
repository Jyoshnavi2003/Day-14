package com.codegnan.pattrens;

public class Butterfly_pattren{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int row=5;
         for(int i=1;i<=row;i++) {
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("* ");
        	 }
        	 int spaces=2*(row-i);
        	 for(int j=1;j<=spaces;j++) {
        		System.out.print("  "); 
        	 }
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("* ");
        	 }
        	 System.out.println();
         }
         for(int i=row;i>=1;i--) {
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("* ");
        	 }
        	 int spaces=2*(row-i);
        	 for(int j=1;j<=spaces;j++) {
        		 System.out.print("  ");
        	 }
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("* ");
        	 }
        	 System.out.println();
         }
        
	}

}
