package durgasirpractise.JavalangPractice;

public class StringBufferMethodPractice {
    public static void main(String[] args) {
        StringBuffer sm1=new StringBuffer("Monalisa");

        //todo 1, 2, 3  is length() & capacity(() & charAt(int index)
        System.out.println(sm1.capacity());   //24
        System.out.println(sm1.length());     //8
        System.out.println(sm1.charAt(3));
        //todo 4 setCharAt()-- set character at specified index
        sm1.setCharAt(2,'k');
        System.out.println(sm1);       //Mokalisa
        //todo 5 append(String s).it can append int,long,boolean,char,float, double
        sm1.append(23);
        sm1.append( " " +2345.600);      //Mokalisa23 2345.6
        System.out.println(sm1);
        //todo 6 insert method(String,int,double,char,boolean) can be insert at specified index
        sm1.insert(8," is ");
        System.out.println(sm1);        //Mokalisa is 23 2345.6
        //todo 7 delete method delete character from begin index to end-1 index
        sm1.delete(15,22);
        System.out.println(sm1);        //Mokalisa is 23

        //todo 8 delete charAt(int index)
        System.out.println(sm1.deleteCharAt(2));   //Moalisa is 23
        System.out.println(sm1.insert(2,'n'));   //Monalisa is 23
        //todo 9 reverse method
        System.out.println(sm1.reverse());                // 32 si asilanoM
        System.out.println(sm1.reverse());                //Monalisa is 23
        //todo 10 setLength()-- will set String of specified length
        sm1.setLength(8);
        System.out.println(sm1);                     //Monalisa
        //todo 11 ensureCapacity() to set capacity
        sm1.ensureCapacity(20);
        System.out.println(sm1.capacity());           //24
        //todo 12 trimToSize() to deallocate extra free memory
        sm1.trimToSize();
        System.out.println(sm1.capacity());           //8

        System.out.println("======METHOD CHAINING=====");
        sm1.append(" is ").insert(12,23).append(". She can dance ");
        System.out.println(sm1);                //Monalisa is 23. She can dance


    }
}
