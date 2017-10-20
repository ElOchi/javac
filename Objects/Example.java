public class Example {

  public static void main(String[] args) {

    System.out.println("We are making a new PEZ dispenser");

    System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n",
                  PezDispenser.MAX_PEZ);

    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("The dispenser is %s %n",
                      dispenser.getCharacterName());

    if (dispenser.isEmpty()) {
      System.out.println("Dispenser is empty");
    }
    System.out.println("Filling the dispenser ");
    dispenser.fill();
    if (!dispenser.isEmpty()) {
      System.out.println("Dispenser is full");
    }
    while (dispenser.dispense()){
      System.out.println("Chomp!");
    }
      if (dispenser.isEmpty()) {
        System.out.println("Ate all the PEZ");
      }
      dispenser.fill(4);
      while (dispenser.dispense()){
        System.out.println("Comí!!");
      }
      try{
        dispenser.fill(40);
        System.out.println("This will never happen");
      }catch(IllegalArgumentException iae){
        System.out.println("Whoa there!");
        System.out.printf("The error was %s %n", iae.getMessage());
      }
  }

}
