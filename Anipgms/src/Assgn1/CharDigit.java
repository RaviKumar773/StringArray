package Assgn1;

public class CharDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a ;
		a=0;
		a=8;
		
		String inputString = "a1.7b2c30d4e5-9";

		        String vowelsAndOddNumbers = "";
		        String consonantsAndEvenNumbers = "";

		        for (char c : inputString.toCharArray()) {
		            if (isVowel(c) || isOddNumber(c)) {
		                vowelsAndOddNumbers += c;
		            } else if (!isVowel(c) 
		            		|| !isOddNumber(c)) {
		                consonantsAndEvenNumbers += c;
		            } /*else if (isConsonant(c) || isEvenNumber(c)) {
		                consonantsAndEvenNumbers += c;
		            }*/
		        }

        System.out.println("Vowels and Odd Numbers: " + vowelsAndOddNumbers);
        System.out.println("Consonants and Even Numbers: " + consonantsAndEvenNumbers);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
        
    }

/*    private static boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }*/

    private static boolean isOddNumber(char c) {
       // return Character.isDigit(c) && (c - '0') % 2 != 0;
    	return Character.isDigit(c) && (c % 2) != 0;
    }

 /*   private static boolean isEvenNumber(char c) {
      //  return Character.isDigit(c) && (c - '0') % 2 == 0;
    	return Character.isDigit(c) && (c % 2) == 0;
    } */

	}


