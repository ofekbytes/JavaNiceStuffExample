package z_example.classes.PangramTester;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class PangramTester2 {
    
  	public String findMissingLetters(String sentence) {

		  final char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		  final TreeSet alphabetTreeSet = new TreeSet();

		  // toLowerCase
		  final char[] sentenceChar = sentence.toLowerCase().toCharArray();

		  // char enterd list
		  for (final char letter : sentenceChar) {
		   alphabetTreeSet.add(letter);
		  }
		  
		  // loop a-z and check if latter entered not exit, and make a list (in order)
		  final StringBuilder missingCharBuilder = new StringBuilder();
		  for (final char character : alphabetArray) {
		   if (!alphabetTreeSet.contains(character)) {
		    missingCharBuilder.append(character);
		   }
		  }
		  return missingCharBuilder.toString();
		  
		 }  
    
    
//  public static void main(String[] args) throws IOException {
// 			String  stMissingLatter = null;
//		PangramTester2 t = new PangramTester2();
//		
//	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	    String s;
//	    while ((s = in.readLine()) != null) {
//	    
//	    stMissingLatter =  t.findMissingLetters(s);	
//	    
//	    if (stMissingLatter.length() == 0)
//	    {
//	    	System.out.println("NULL");
//	    }
//	    else if (stMissingLatter.length() > 0)
//	    {
//	    	System.out.println(stMissingLatter);
//	    }   
//      
//      
//    }
//  }
}
