import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> words;
  public RandomStringChooser(String[] wordArray){
    words = new ArrayList <String>();
    for(int i=0;i<wordArray.length;i++){
      words.add(wordArray[i]);
    }
  }
  public String getNext(){
    if (words.size() == 0)
        return "NONE";
    int pos = (int)(Math.random()*words.size());
    return words.remove(pos);
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
