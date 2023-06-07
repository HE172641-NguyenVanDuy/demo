
package data;


public class Box extends Rectangle{
   
    int height =0;
    public void set(int i, int w , int h)
    {
        super.setValue(i,w);
        height= h>0 ? h:0;
        
    }

    @Override
    public String toString() {
        return "{" + length + "," + width+"," + height+"}";
    }
    
    
}



