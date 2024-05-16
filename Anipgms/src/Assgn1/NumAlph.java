package Assgn1;

public class NumAlph {
	
    public static void main(String[] args) {
        String inputString = "abc123def45678gh";

      //  StringBuilder letters = new StringBuilder();
      //  StringBuilder numbers = new StringBuilder();
        String let = new String();
        String num=null;

    /*    for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
                
            } else if (Character.isLetter(c)) {
                letters.append(c);
            }
             }
             System.out.println("Letters: " + letters.toString());
        System.out.println("Numbers: " + numbers..toString());
        */
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
            	num += c;
                
            } else if (Character.isLetter(c)) {
                let += c;
            }
          }

        System.out.println("Letters: " + let);
        System.out.println("Numbers: " + num);
    }
    

}
