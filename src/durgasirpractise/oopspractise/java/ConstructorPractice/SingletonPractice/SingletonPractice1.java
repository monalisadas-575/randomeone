package durgasirpractise.oopspractise.java.ConstructorPractice.SingletonPractice;

class Test2 {
    private static Test2 t=new Test2();
    private Test2(){
    }

    /**
     * @return Test2
     * when the class loads static variable t initialize & new object created(new Test2())
     * INSIDE the mAIN METHOD t10 stores 't' & t11 stores 't'
     * One object only created at the time of class loading
     * all reference variable t10, t11 points at the same object.
     *
     */
    public static Test2 getTest2(){
        return t;
    }


    public static void main(String[] args) {
        Test2 t10=Test2.getTest2();
        Test2 t11=Test2.getTest2();
        System.out.println(t10.hashCode());
        System.out.println(t11.hashCode());
    }

}
