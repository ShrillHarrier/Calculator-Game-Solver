package com.cracker;

public class NumSystem { 
	
	int base;
	int tries;
	
	NumSystem(int base, int tries){
		this.base = base;
		this.tries = tries;
	}
	
	public String addToBase(String num) {
		
		int dec = fromBase(num);
		
		dec++;
		
		String newnum = toBase(dec);
		
		return newnum;
		
	}
	
	public String toBase(int num){
		{
		    
		    String string = "";

		    while(num > 0)
		    {
		        string += (num % base);
		        num = (num/base);
		    }

		    String string2 = "";

		    for(int i = string.length() - 1; i >= 0; i--)
		    {
		        string2 += string.charAt(i);
		    }
		    
		    while(string2.length() < tries) {
		    	string2 = "0" + string2;
		    }
		    
		    return string2;
		    
		}
		
	}
	
	public int fromBase(String num) {
		
		int decnum = 0;
		
		for(int i = 0; i < num.length(); i++){
		
		decnum += Integer.parseInt(num.substring(i, i+1)) * Math.pow(base, (num.length()-1) - i);
		
		}
		
		return decnum;
	
	}

}
