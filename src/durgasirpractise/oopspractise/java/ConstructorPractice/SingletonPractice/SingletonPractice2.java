package durgasirpractise.oopspractise.java.ConstructorPractice.SingletonPractice;

/**
 * we can create our own Singleton class for this we have to follow this requirements stated below
 * we have to use private constructor
 * private static variable
 * public factory method
 *
 */
 class Test {
    private static Test t =null; //here creating private static variable of class type Test

    private Test() {
    }

    /**
     * @return class type Test.This is public factory method
     * when the class load variable t initialize with null value.
     * inside the main method when we call getTest() as it matches with null so one  object created.
     * at first t was null now it points at one object.
     * so when we call Test,getTest() as it's not null so it returns t .
     * t1, t2 ... all points towards the same one object.
     *

     */
    public static Test getTest(){
      if(t==null){
          t=new Test();
      }
      return t;
    }

    public static void main(String[] args) {
        Test t1=Test.getTest();
        Test t2=Test.getTest();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.toString());
        System.out.println(t1==t2);

    }
}
