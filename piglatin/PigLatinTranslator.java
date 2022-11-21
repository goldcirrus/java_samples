/*
 * method decomposition practice, 
 */
package piglatin;

import java.util.Scanner;


public class PigLatinTranslator {
    
    public static String translate(String sentence1)       //translate sentenc1's token by token
    {
        String result1 = "";
        sentence1 = sentence1.toLowerCase();      //conver sentence1 to lower cases sentence.
        Scanner scan = new Scanner(sentence1);  //scan takes input by sentence1's string, instead of from keyboard, which is System.in
        
        while (scan.hasNext())                       //while scan object's sentence1 string has next token(a word), do the following block
        {
            result1 = result1 + translateWord(scan.next());    //translate the token(word) in scan object's string. translteWord() is a static meathed in its own class, so it can be used without a Classname.method()
            result1 = result1 + " ";                                //add/concatnate an additional space
        }
        
        return result1;         //return the result1 translated string for this method
    }
    
    private static String translateWord(String word)       //static meathod, within its own class, can be used without ClassName.method(), can be used with method() directly
    {
        String result = "";
        
        if (beginWithVowel(word))                  //if word begin with vow, simply add "yay" at the end of word,no other cutting off original word
            result = word+"yay";
        else
        {
            if(beginWithBlend(word))                                 //consonant blends such as ch,st, move the first two letters to the end of the word, then add "ay" after them. 
                result = word.substring(2)+word.substring(0,2)+"ay";  //substring(2) return word's substring from index 2 to the end(word with cuting off first two letters), substring(0,2) return string of word from index 0 to 1(index 2-1=1), so first two letters are returned
            else
                result = word.substring(1)+word.charAt(0)+"ay"; //general rule; cut off first letter of word, to put in the end of the rest of word, then add "ay".
        }
        
        return result;
    }
    
    private static boolean beginWithVowel(String word)
    {
         String vowel = "aeiou";
         char letter = word.charAt(0);       //take first letter of word. char is lower case!
         return (vowel.indexOf(letter)!= -1);           //if letter matches a character of aeiou, the index of matched char will be returned, if letter doesn't match any aeiou characteristics, -1 is returned.
                                               //if letter is a vowel and matching one of aeiou char, then -1 will not returned.so != -1 is true. true is returned.if not vowel, then is -1, != -1 is false. 
    }
    
    private static boolean beginWithBlend(String word)
    {
         String letters = word.substring(0, 2);               //first two letters of word, substring index 0-1 
         return (letters.indexOf("ch", 0)==0 || word.startsWith("sh") || word.startsWith("br"));
                                                           //    if letters mathch those two characteristics, ruturn true
    }
}
