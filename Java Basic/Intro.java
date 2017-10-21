import java.io.Console;

public class Intro {

    public static void main(String[] args) {
        Console console = System.console();
      String firstName = console.readLine("What is your name? ");
      console.printf("Hello, my name is %s\n", firstName);
      console.printf("%s is learning how to write Java\n", firstName);
  }
}
