
package manipulatefile;
import java.util.*;

public class Emp implements Comparable<Emp> {
    String name;
    int age;
    double income;

    public Emp() {
    }

    public Emp(String name, int age, double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Emp{" + "name=" + name + ", age=" + age + ", income=" + income + '}';
    }
    
    
    
    @Override
    public int compareTo(Emp x) {
         if(age < x.age)
         return -1;
         else if(age==x.age) 
             return(name.compareTo(x.name));
         return 1;
    }
    
}
