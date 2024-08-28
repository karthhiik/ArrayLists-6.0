
import java.util.*;
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops
List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            ls.add(i + 1);
        }
        int p = ls.size() - 1;
        while (p >= 0) {
            System.out.println(ls.get(p));
            p--;
        }
        Iterator it = ls.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
}
}
