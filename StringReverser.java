import java.util.*;

public class StringReverser {
  String word;

  public void reverseInput(){
    System.out.println("Type your word for reversion: ");
    String word = System.console().readLine();
    System.out.println("Your word is: " + word);

    int len = word.length();
    if (len > 0){
      //System.out.println("Your word's length is: " + len);
      String reverse = new StringBuffer(word).reverse().toString();
      System.out.println("Your reversed word is: " + reverse);
    }
    else {
      System.out.println("Couldn't reverse empty input");
    }
  }

  public static void main(String[] args){
    StringReverser reverser = new StringReverser();
    reverser.reverseInput();
  }
}
