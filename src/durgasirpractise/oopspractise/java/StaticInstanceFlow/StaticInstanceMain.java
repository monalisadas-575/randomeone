package durgasirpractise.oopspractise.java.StaticInstanceFlow;

public class StaticInstanceMain {
    //int x=100;
    {
        //todo in control flow 1st execution of variable assignments & instance block from top to bottom.
        //todo Execution of parent constructor.
        //todo execution of variable assignments & instance block from top to bottom in child class
        //todo execution of child constructor & child main method

        // variable x hase not been declared yet.
        //System.out.println(x);
        si1("Printing inside Instance block");
    }

    void m1(){
        //System.out.println(this.x);
    }

    //int x stores variable k value but k has not declared yet.
    //int x=k;
    int k=10;
    public String si1(String s1){
        return s1;
    }

    public static void main(String[] args) {
        StaticInstanceMain sim=new StaticInstanceMain();
        //System.out.println(sim.x);

    }

}
