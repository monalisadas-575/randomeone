package harrypractise.absract;
//Interface example & Default method
interface myCamera{
    void takeSnap();
    void recordSnap();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}
interface myWifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class myCellPhone{
    void callNumber(int phoneNo){
        System.out.println("Calling"+phoneNo);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class mySmartPhone extends myCellPhone implements myWifi, myCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordSnap() {
        System.out.println("Taking video");
    }
    //public void record4kVideo(){----------> These will run insted of above record4kVideo() where greet() is present.
    // System.out.println("taking snap & recording in 4k");
//}
    public String[] getNetworks(){
        System.out.println("getting list of network");
        String[] networkList={"Harry","Prasant","Anjali"};
        return networkList;
    }public void connectToNetworks(String network){
        System.out.println("Connecting to " + network);
    }
}
public class practice_on_interface{
    public static void main(String[] args) {
        mySmartPhone Ms= new mySmartPhone();
        //Ms.greet();----> throws error it cant be run private.
        Ms.record4kVideo();
        String[] network=Ms.getNetworks();
        for(String item:network){
            System.out.println(item);
        }
    }
}
























