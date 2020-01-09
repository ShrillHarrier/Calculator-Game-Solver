package com.cracker;

public class Functions {
	
	public int addition(int num, int opp) {
		return num + opp;
	}
	
	public int subtract(int num, int opp) {
		return num - opp;
	}
	
	public int multiply(int num, int opp) {
		return num * opp;
	}
	
	public int divide(int num, int opp) {
		if(num % opp != 0) {
		return num;
		}
		else {
			return (int)(num/opp);
		}
	}
	
	public int negone(int num) {
		return num * -1;
	}
	
	public int adddig(int num, int opp) {
		
		String temp = Integer.toString(num);
		
		String opptemp = Integer.toString(opp);
		
		if(temp.length() + opptemp.length() >= 10) {
			return num;
		}
		
		else {
		
		temp += Integer.toString(opp);
		
		return Integer.parseInt(temp);
		
		}
		
	}
	
	public int replacedig(int num, int from, String to) {
		
		String temp = Integer.toString(num);
		String theold = Integer.toString(from);
		String thenew = to;
		
		temp = temp.replaceAll(theold, thenew);
		
		return Integer.parseInt(temp);
		
	}
	
	public int reverse(int num) {
		
		String old1 = Integer.toString(num);
		
		String new1 = "";
		
		for(int i = old1.length()-1; i>-1; i--) {
			new1 += old1.charAt(i);
		}
		
		if (new1.contains("-")) {
			new1 = new1.substring(0, new1.length() - 1);
			
			new1 = "-" + new1;
		}
		
		if(new1.length() >= 10) {
		return num;
		}
		else {
			return Integer.parseInt(new1);
		}
		}
	
	public int backspace(int num) {
		
		String newnum = Integer.toString(num);
		
		if(newnum.length() <= 1 || num < 0) {
			return num;
		}
		
		else {
			
		newnum = newnum.substring(0, newnum.length()-1);
		
		return Integer.parseInt(newnum);
		
		}
	}
	
	public int sum(int num) {
		
		if(num < 1) {
			int temp = 0;
			
			String wordnum = Integer.toString(num);
			
			for(int i = 1; i < wordnum.length(); i++) {
				temp += Integer.parseInt(wordnum.substring(i, i+1));
			}
			
			return temp * -1;
		}
		
		else {
		int temp = 0;
		
		String wordnum = Integer.toString(num);
		
		for(int i = 0; i < wordnum.length(); i++) {
			temp += Integer.parseInt(wordnum.substring(i, i+1));
		}
		
		return temp;
		
		}
	}
	
	public int square(int num) {
		return (int) Math.pow(num, 2);
	}
	
	public int cube(int num) {
		return (int) Math.pow(num, 3);
	}
	
	public int shift(int num, String pos) {
		
		String tempnum = Integer.toString(num);
		
		String shift = "";
		
		if(num < 0) {
			
			tempnum = tempnum.substring(1, tempnum.length());
			
			if(pos.equals("r")) {
				
				shift = tempnum.substring(tempnum.length() - 1, tempnum.length()) + tempnum.substring(0, tempnum.length() - 1);
				
				shift = "-" + shift;
				
				return Integer.parseInt(shift);
				
			}
			
			else if(pos.equals("l")) {
				
				shift = tempnum.substring(1, tempnum.length()) + tempnum.substring(0, 1);
				
				shift = "-" + shift;
				
				return Integer.parseInt(shift);
				
			}
		}
		
		else {
		if(pos.equals("r")) {
			
			shift = tempnum.substring(tempnum.length() - 1, tempnum.length()) + tempnum.substring(0, tempnum.length() - 1);
			
			return Integer.parseInt(shift);
			
		}
		
		else if(pos.equals("l")) {
			
			shift = tempnum.substring(1, tempnum.length()) + tempnum.substring(0, 1);
			
			return Integer.parseInt(shift);
			
		}
		
		}
		
		return 0;
		
	}
	
	public int mirror(int num) {
		
		String tempnum = Integer.toString(num);
		
		if(tempnum.length()*2 >= 9 && tempnum.contains("-") || tempnum.length()*2 >= 7 && tempnum.contains("-") == false) {
			return num;
		}
		else if(num < 0) {
			tempnum = tempnum.substring(1, tempnum.length());
			
			tempnum += Integer.toString(reverse(Integer.parseInt(tempnum)));
			
			tempnum = "-" + tempnum;
			
			return Integer.parseInt(tempnum);
		}
		else {
		String rev = Integer.toString(reverse(Integer.parseInt(tempnum)));
		
		while(rev.length() < tempnum.length()) {
			rev = "0" + rev;
		}
		
		tempnum += rev;
		
		return Integer.parseInt(tempnum);
		}
		
	}
	
	public int change(int opp, int inc) {
		return opp + inc;
	}
	
	public int inverse(int num) {
		String wordnum = Integer.toString(num);
		
		String newnum = "";
		
		if(wordnum.length() >= 10) {
			return Integer.parseInt(wordnum);
		}
		else {
		for(int i = 0; i<wordnum.length(); i++) {
			
			if(wordnum.charAt(i) == '0') {
				newnum += '0';
			}
			else {
				newnum += Integer.toString(10 - Math.abs(Integer.parseInt(wordnum.substring(i, i+1))));
			}
		}
		}
		
		return Integer.parseInt(newnum);
	}
	
public int getFunc(String opp, int num, int val1, int val2){
		
		if(opp.equals("add")) {
			return addition(num,val1);
		}
		else if(opp.equals("sub")){
			return subtract(num,val1);
		}
		else if(opp.equals("mul")){
			return multiply(num,val1);
		}
		else if(opp.equals("div")){
			return divide(num,val1);
		}
		else if(opp.equals("negone")) {
			return negone(num);
		}
		else if(opp.equals("adddig")) {
			return adddig(num, val1);
		}
		/*else if(opp.equals("replacedig")) {
			return replacedig(num, val1, val2);
		}*/
		else if(opp.equals("reversenum")) {
			return reverse(num);
		}
		else {
			return 0;
		}
		
	}

}
