
package slot7;

import data.Box;
import data.Rectangle;


public class Slot7 {

    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,5);
        System.out.println("Rectangle : " + r.toString());
        System.out.println(" Area: " + r.getArea());
        Box b = new Box(2, 2, 2);
        System.out.println("BOx: " + b.toString());
        System.out.println("Area: " + b.getArea());
        System.out.println("Volumn: " + b.volumn());
    }
    
}
