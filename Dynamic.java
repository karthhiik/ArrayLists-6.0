
public class Dynamic{
class person {
    private String name;
    private int age;

    public void setname(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + age;
    }
}
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<person> ls = new ArrayList<person>();
        person ps = new person();
        ps.setname("hell", 23);
        ls.add(ps);
        Iterator it = ls.iterator();
        while (it.hasNext()) {
            person p = (person) it.next();
            System.out.println(p);
        }

  
}
}

