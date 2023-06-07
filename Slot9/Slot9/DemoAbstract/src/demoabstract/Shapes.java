
package demoabstract;


public abstract class Shapes {
    abstract public double circu();
    abstract public double area();
    
}

   
    
    

class Circle extends Shapes {
    double r;
    public Circle (double rr) {
        r=rr;
        
    }
    @Override
    public double circu() {
        return 2*Math.PI*r;
    }
    @Override
    public double area() {
        return Math.PI*r*r;
    }
    
    
}
class Rect extends Shapes {
    double l,w;
    public Rect(double ll, double ww) 
    {
        l=ll;w=ww;
    }
    @Override
    public double circu() {
        return 2*(l+w);
    }
    @Override
    public double area() {
        return l*w;
    }
}
class Program {
    public static void main(String[] args) {
       // Abstractclass s1= new Abstractclass();
       Shapes s = new Circle(5);
        System.out.println(s.area());
    }

}