  class PezDispenser {
   public static final int MAX_PEZ = 12;
   final private String characterName;
   private int pezCount;

   //constructor = has same name as class and no return type

  public PezDispenser(String characterName){
                                // ^
  /* private field */    /* argument passed to constructor */
    this.characterName = characterName;
    pezCount = 0;
  }

  public void fill(){
    fill(MAX_PEZ);
  }

  public void fill(int pezAmount){
    int newAmount = pezCount + pezAmount; // add to pezAmount
    if (newAmount > MAX_PEZ) {
      throw new IllegalArgumentException("Too many PEZ!!!!");
    }
    pezCount = newAmount;
  }

  public boolean dispense(){
    boolean wasDispensed = false;
    if (!isEmpty()) {
      pezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }

  public boolean isEmpty(){
    return pezCount == 0;
  }

  public String getCharacterName(){
    return characterName;
  }

}
