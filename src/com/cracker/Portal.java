package com.cracker; 

public class Portal {
	
	int in;
    int out;
	
	Portal(int in, int out){
		this.in = in;
		this.out = out;
	}
	
	public static String reverse(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	
	public int add(int num) {
		
		String wordnum = reverse(Integer.toString(num));
		
		num -= (Integer.parseInt(wordnum.substring(wordnum.length()-1, wordnum.length())) * (int)Math.pow(10, wordnum.length()-1));
		
		num += Integer.parseInt(wordnum.substring(wordnum.length()-1, wordnum.length())) * (int)Math.pow(10, out-1); 
		
		//more code 
		
		return num; 
		
	}

}
