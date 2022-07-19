/*
 * Activity 2.4.4
 * Archit Bhujang
 * P 3
 *AP Comp Sci A
 */
import java.util.Scanner;

public class NumberOfLetters
{
  public static void main(String[] args)
  {
  //Declares necessary variables and objects for an efficient and correct output
   int count = 0;
   Scanner userInput = new Scanner(System.in);
   String letters = "abcdefghijklmnopqrstuvwxyz"; 
   System.out.println("Please enter in a word, sentence, or a phrase");
   String sectionOfWord = userInput.nextLine();
	System.out.println("The next text shows how many of the same letters are present in the term or sentence that you inputted");
   System.out.println();
   System.out.println(sectionOfWord);
   System.out.println();
   
   for (int i = 0; i < letters.length(); i++) {
      //This creates an object to compare to letter
      String letter = (letters.substring(i,i+1));
     
      //This views the entire string that the user inputted and then compares to a letter
      for (int j = 0; j < sectionOfWord.length(); j++) {
      String current = sectionOfWord.substring(j,j+1);
      
      //This increases the counter which can help keep track of how many of the same letter occured
      if (letter.equals(current.toLowerCase())) {
         count += 1;
      }
     }
   if (count != 0) {
    if (count > 1)
    System.out.println(letter + " appears " + count + " times."); 
    else
    //This is to make the sentence gramatically correct
    System.out.println(letter + " appears " + count + " time."); 
   }
   //Count is equal to zero after the end of the looop to avoid errors in the counting
   count = 0; 
  }
 }
}