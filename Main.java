class Main {
  public static void main(String[] args) {
    //Step 1: boolean valid set to false
    boolean valid = false;
    //Step 2: start conditional loop while valild is false
    while(valid = false) {
    //Step 3: ask user to enter password
    String password = Keyboard.getText("enter password");
    //Step 4: set character firstLetter to the value of the first letter of password
    
    char firstletterStart = password.charAt(0);
    //Step 5: set character lastLetter to the value of the last letter of password
    char lastletterStart = password.charAt(password.length()-1);
    //Step 6: integer firstValue to the ascii value of firstLetter
    int firstLetterValue = (int) firstletterStart;
    //Step 7: integer lastValue to the ascii value of lastLetter
    int lastLetterValue = (int) lastletterStart;
    //Step 8: If firstValue is between 40 and 42 AND lastValue is between 65 and 90 AND password length is greater than 7 THEN
    if(firstLetterValue <43 && firstLetterValue >39  && lastLetterValue <91 && lastLetterValue >64 && password.length() >7){
    valid = true;
    }
    else {
    //Step 11: display "Error password must be at least 8 characters, with a ()* to start adn a captial at the end
    System.out.println("Error password must be at least 8 characters, with a ()* to start and a captial at the end");
    }
    //Step 12: END IF
    }
    //Step 13: END LOOP
    //Step 14: display "Your password meets the strength requirements"
     System.out.println("your password meets the strength requirements");
  }
}
