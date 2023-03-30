public class Wordle {
  private final String word;
  private char[26] alphabet;
  public Wordle(){
    int counter;
    for(char i = 'A'; i <= 'Z'; i++){
      alphabet[counter] = i;
      counter++;
    }
  }
}
