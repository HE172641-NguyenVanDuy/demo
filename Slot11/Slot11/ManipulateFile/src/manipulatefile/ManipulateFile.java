package manipulatefile;

import java.io.IOException;
import java.util.*;

public class ManipulateFile {

    
    public static void main(String[] args) throws IOException {
        MyList u = new MyList();
        String fname = "emp.txt";
        u.loadFile(fname);
        System.out.println("Test sorting by age and name");
        System.out.println("Before sorting: ");
        u.dislpay();
        System.out.println("After sorting: ");
        u.sortByAgeName();
        u.dislpay();
        System.out.println();
    }
    
}
