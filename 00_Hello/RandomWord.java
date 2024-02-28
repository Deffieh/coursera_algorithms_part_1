
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

  public static void main(String[] args) {

    String champion = null;
    int wordCount = 0;
    // Prints "Hello, World" in the terminal window.
    
    while (!StdIn.isEmpty()) {
      String currentWord = StdIn.readString();
      wordCount++;
      if (StdRandom.bernoulli(((double) 1)/((double) wordCount))) {
        champion = currentWord;
      }
    }
    
    if (champion != null) {
      StdOut.print(champion);
    } else {
      StdOut.print("No words provided");
    }
  }

}
