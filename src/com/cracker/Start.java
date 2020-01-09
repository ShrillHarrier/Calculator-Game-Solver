package com.cracker; 

import java.util.Scanner;

public class Start {
	
	//static boolean isin = false;
	
	static Scanner sc = new Scanner(System.in); 
	
	static Functions func = new Functions();
	
	public static int in = 5;
	
	public static int out = 1;
	
	static Portal p = new Portal(in, out);
	
	static String addOne(String num) {
		String newnum = "";
		
		for(int i = 0; i<num.length(); i++) {
			newnum += Integer.toString(Integer.parseInt(num.substring(i, i+1)) + 1);
		}
		
		return newnum;
	}
	
	static int opp = 0;
	
	static int useFunc(String basenum, int num, int tries, int store) {
		
		char[] unisets = basenum.toCharArray();
		
		//System.out.println(basenum);
		
		for(int i = 0; i < tries; i++) {
			
			/*if(num == store) {
				isin = true;
			}*/
			
			if(unisets[i] == '0') {
				num = func.adddig(num, 7);
			}
			else if(unisets[i] == '1') {
				num = func.replacedig(num, 3, "5");
			}
			else if(unisets[i] == '2') {
				num = func.inverse(num);
			}
		    else if(unisets[i] == '3') {
		    	num = func.shift(num, "r");
			}
			/*else if(unisets[i] == '4') {
				num = func.replacedig(num, 23, "43"); 
	        }*/
			
			while(Integer.toString(num).length() >= in) { 
				num = p.add(num); 
			}
			
			//System.out.println(i + ": " + num);
			//System.out.println(opp);
			
		}
		
		return num;

	}
	
	public static void main(String[] args) {
		
		System.out.print("Goal: ");
		int goal = sc.nextInt();
		
		System.out.print("Starting Number: ");
		int start = sc.nextInt();
		
		System.out.print("Moves: ");
		int tries = sc.nextInt();
		
		System.out.print("Opperations: ");
		int opps = sc.nextInt();
		
		NumSystem ns = new NumSystem(opps, tries);
		
		String basestart = ns.toBase(0);
		
		String repeated = new String(new char[tries]).replace("\0", Integer.toString(opps-1));
		
		int testnum = useFunc(basestart, start, tries, 0);
		
		if(testnum == goal) {
			
			System.out.println("Code: " + basestart);
			
		}
		
		while(basestart.equals(repeated) == false) {
			
			basestart = ns.addToBase(basestart);
			
			//Remove loop for first sequence
			
			//for(int i = 1; i <= 100; i++) {
			
			opp = 0;
			
			testnum = useFunc(basestart, start, tries, 0);
			
			if(testnum == goal) {
				
				System.out.println("");
				
				System.out.println("Code: " + addOne(basestart));
				
				//System.out.println("Store: " + i);
				
				break;
			}
			
			//}
			
			//isin = false;
			
		}
		
	}
		
}
