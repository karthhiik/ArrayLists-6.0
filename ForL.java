import java.util.*;
public class Main{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> food = new ArrayList<String>();
  food.add("pizza");
  food.add("burger");
  food.add("biryani");
  for(int i=0; i<food.size();i++){
    System.out.println(food.get(i));
  }     
 
}
}
