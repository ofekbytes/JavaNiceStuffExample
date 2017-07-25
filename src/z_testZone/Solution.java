	package z_testZone;
	//you can also use imports, for example:
	//import java.util.*;
	
	//you can write to stdout for debugging purposes, e.g.
	//System.out.println("this is a debug message");
	import java.lang.Math;
	import java.util.Random; 
	
	class Solution {
	 
	 private int maxN = 1000;
	 private int minN = 1;
	 private int N;
	 
	 //constant
	 private static final int j = 10; //jack
	 private static final int q = 11; //queen
	 private static final int k = 12; //king
	 private static final int a = 13; //ace
	 //private static final int J = 14; //Jocker
	
	 private char currentWinCheck(char chA, char chB) {
		 
		 int intA = 0;
		 int intB = 0;
		 
		 switch (chA) {
		 case '1' : intA = 1; break;
		 case '2' : intA = 2; break;
		 case '3' : intA = 3; break;
		 case '4' : intA = 4; break;
		 case '5' : intA = 5; break;
		 case '6' : intA = 6; break;
		 case '7' : intA = 7; break;
		 case '8' : intA = 8; break;
		 case '9' : intA = 9; break;
		 case 'j' : intA = 10; break;
		 case 'q' : intA = 11; break;
		 case 'k' : intA = 12; break;
		 case 'a' : intA = 13; break; 
		 }
		 
		 switch (chB) {
		 case '1' : intB = 1; break;
		 case '2' : intB = 2; break;
		 case '3' : intB = 3; break;
		 case '4' : intB = 4; break;
		 case '5' : intB = 5; break;
		 case '6' : intB = 6; break;
		 case '7' : intB = 7; break;
		 case '8' : intB = 8; break;
		 case '9' : intB = 9; break;
		 case 'j' : intB = 10; break;
		 case 'q' : intB = 11; break;
		 case 'k' : intB = 12; break;
		 case 'a' : intB = 13; break; 
		 }
		 
		 if (intA > intB)
			 return 'a'; //alec
		 else if (intA < intB)
			 return 'b'; //bob
		 else
			 return 't'; //0
	 }
	  
	 public int solution(String A, String B) {
		 char [] chA;
		 char [] chB;
	
	     chA = A.toLowerCase().toCharArray();
	     chB = B.toLowerCase().toCharArray();
		 
	     int intAlec = 0;
	     int intBob = 0;
	     
	
	     //random max card number [1...1000] 
		 N = (int) (Math.random() * maxN);
		 System.out.println(N);
		 
		 
	     int win = 0;
	     // write your code in Java SE 8
	
	     
	
	     System.out.println("\nPlayer one Cards");
	     for (int i=0; i < chA.length ; i++) {
	    	 System.out.print(chA[i]  + " ");
	     }
	     
	     
	     System.out.println("\nPlayer two Cards");     
	     for (int i=0; i < chB.length ; i++) {
	    	 System.out.print(chB[i] + " ");
	     }
	     
	     char result = 'z';
	     System.out.println("\nCheck who wins: ");
	     for (int i=0; i < chA.length ; i++) {
	    	 result = currentWinCheck(chA[i],chB[i]);
	    		 
	    	 switch (result)
	    	 {
	    	 case 'a' : intAlec++; break;
	    	 case 'b' : intBob++; break;
	    	 case 't' : break;
	    	 }    	 
	     }
	     
	     System.out.println("intAlec = " + intAlec);
	     System.out.println("intBob =  " + intBob);     
	     
	     if (intAlec > intBob)
	     {
	    	 System.out.println(intAlec);
	    	 win = intAlec;
	     }
	     else
	     {
	    	 System.out.println(intBob);
	    	 win = intBob;
	     }
	        
	    
	     return win;
	 }
	 
	 public static void main(String [] args)
	 {
	     Solution sol = new Solution();
	     sol.solution("45j", "32k");
	 }
	
	}    
