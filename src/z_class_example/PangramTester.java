package z_class_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class PangramTester {

	
	public String findMissingLetters(String sentence) {

	      //making String to Char Array - letters template a - z.	
		  final char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		  //using <TreeSet> to find the lost letters - by order.
		  final TreeSet alphabetTreeSet = new TreeSet();

		  // toLowerCase the method/function parameter "sentence" 
		  final char[] sentenceChar = sentence.toLowerCase().toCharArray();

		  // copy array String to "letter"  and add them to <alphabetTreeSet>
		  for (final char letter : sentenceChar) {
		   alphabetTreeSet.add(letter);
		  }
		  
		  // StringBuilder - used to contain the missing letters
		  final StringBuilder missingCharBuilder = new StringBuilder();
		  
		  // for loop - "character" get letter by letter (a-z)
		  for (final char character : alphabetArray) {
		   //check  "alphabetTreeSet" ("sentence") not equal to the character template "character" ("alphabetArray")
		   if (!alphabetTreeSet.contains(character)) {
			//if true, add them to the list in "missingCharBuilder" (module for enormous string).
		    missingCharBuilder.append(character);
		   }
		  }
		  // return the missing letters in "sentence"
		  return missingCharBuilder.toString();
		  
		 }

		 // print Result to screen
		 public void PrintTemplateResult(String StResult)
		 {
			    if (StResult.length() == 0)
			    {
			    	System.out.println("NULL");
			    }
			    else if (StResult.length() > 0)
			    {
			    	System.out.println(StResult);
			    }   
		 }
		 
		 
	public static void main(String[] args)  throws IOException {

		
		String  stMissingLatter = null;
		PangramTester t = new PangramTester();
		
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    
	    System.out.println("find out if you can enter a word containning all the alfabet sequance, "
	    		+ "\n(enter the word 007 and press enter to exit this area)"
	 			+ "\nenter a text here");
	    while ((s = in.readLine()) != null) {
	    	
	    if (s.equals("007")) //exit/ break the loop
	    	break;
	    
	    stMissingLatter =  t.findMissingLetters(s);
	    
	    t.PrintTemplateResult(stMissingLatter);
	    
	    //System.out.println("missing latter are: "  + stMissingLatter);
	    }

	}
	
	
}

