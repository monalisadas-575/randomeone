package durgasirpractise.JavalangPractice;

//todo created own immutable class where we can't perform any changes in the existing object.
// If we try to make changes it will create a new object.

final public class OwnImmutableClass {
    private int i;
    OwnImmutableClass(int i){
        this.i=i;
    }
    public OwnImmutableClass modify(int j){
        if(this.i==j){
           return this;
        }
        else{
            return new OwnImmutableClass(j);
        }
    }

    public static void main(String[] args) {
        OwnImmutableClass o1=new OwnImmutableClass(10);
        OwnImmutableClass o2=o1.modify(100);
        OwnImmutableClass o3=o1.modify(10);
        System.out.println(o1==o2);  //falise
        System.out.println(o1==o3);   //true
    }

}
