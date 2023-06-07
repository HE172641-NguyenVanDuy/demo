
package vnreomote;


public class Television implements VNReomote,ChinaRemote{

    @Override
    public void onDevice() {
         System.out.println("on TV");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void offDevice() {
        System.out.println("off TV");; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void increaseVolum() {
        System.out.println("increase volumn"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descVolumn() {
        System.out.println("descrease volumn"); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        VNReomote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNReomote.setTimer(10000);
        System.out.println("TV remote's price: " + VNReomote.price);
        System.out.println("TV Remote has: " + VNReomote.MAXofButtons + "buttons");
    }
}
