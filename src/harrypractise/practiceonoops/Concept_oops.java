package harrypractise.practiceonoops;

//practice _1
/* class employee1{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
   public int getsalary(){
        return salary;
   }
}
public class concept_oops {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee1 harry=new employee1();
        employee1 monalisa=new employee1();
        harry.id=12;
        harry.name="codewithharry";
        harry.salary=12000;
        monalisa.id=20;
        monalisa.name="learning monalisa";
        monalisa.salary=2000;

        harry.printdetails();
        monalisa.printdetails();
        System.out.println("My slary is "+ harry.getsalary());
        System.out.println("My slary is "+ monalisa.getsalary());

    }
}*/


//Problem-1; Create a class employee with following properties and methods.
//      1.a: Salary(property int)
//      1.b: get salary(method returning int)
//      1.c: name (property string)
//      1.d: getName(method returning String)
//      1.e: SetName(method changing name)
/*
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}public class concept_oops {
    public static void main(String[] args) {
        Employee Mona=new Employee();
        Mona.salary=23000;
        Mona.setName("monalisa");
        System.out.println(Mona.getSalary());
        System.out.println(Mona.getName());
       // System.out.println(Mona.setName("monalisa));  because here setName() method is void so it cant return but u can change name by this function
        Mona.setName("harry");
        System.out.println(Mona.getName());

    }
}*/



//Problem-2 : Create a class cellphone with methods to print "ringing...", "vibrating..." etc.
/*
class cellphone{
    public void ring(){
        System.out.println("The cellphone is ringing");
    }
    public void vibrate(){
        System.out.println("The phone is vibrating");
    }
    public void callfriend(){
        System.out.println("calling Monalisa");
    }
}
public class concept_oops{
    public static void main(String[] args) {
        cellphone Googlepixel= new cellphone();
        Googlepixel.ring();
        Googlepixel.callfriend();
        Googlepixel.vibrate();
    }
}*/



//Problem-3: Create a class square with a method to intialize its side, calculating its area, perimeter etc.
/*
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class concept_oops{
    public static void main(String[]args){
        square sq=new square();
        sq.side=5;
        System.out.println("The area of square is "+sq.area());
        System.out.println("The perimeter of square is "+sq.perimeter());
    }
}*/



//Problem-5: Create a class TommyVecetti for Rockstar game capable of  Printing (hitting.....),runiing...,firing... etc
/*
class Tommy{
    public void hitting(){
        System.out.println("hitting the enemy");
    }
    public void running(){
        System.out.println("running from the enemy");
    }
    public void firing(){
        System.out.println("firing on the enemy");
    }
}
public class concept_oops{
    public static void main(String[] args) {
        Tommy player12= new Tommy();
        player12.firing();
        player12.hitting();
        player12.running();
    }
}*/


/**
 *   Access Modifier
 * @getName():Getter : return the value
 * setter: set/change the value
 */

/* class myemployee{
    private String name;
    private int id;

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class concept_oops{
    public static void main(String[] args) {
        myemployee harry=new myemployee();
        harry.setId(12);
        harry.setName("code with harry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}*/




//Constructor in java
/*
class mymainemployee{
    private int id;
    private String name;
    public mymainemployee(){
        id=45;
        name="Monalisa";
    }
    public String getName(){ return name;}
    public void setName(String n){this.name=n; }
    public int getId(){ return id;}
    public void setId(int id){ this.id=id;}
}
public class concept_oops{
    public static void main(String[] args) {
        mymainemployee harry=new mymainemployee();
        System.out.println(harry.getId());
        System.out.println(harry.getName());
       harry.setName("code with harry");
       harry.setId(23);
        System.out.println(harry.getId());

    }
}*/





//Constructor overloading in Java
/*
class employee22{
    private int id;
    private String name;
    //constructor type-1
    public employee22(){
        id=8;
        name="your-name-here";
    }
    //constructor type-2
    public employee22(String myName,int myid){
        id=myid;
        name=myName;
    }
    //constructor type-3
    public employee22(String name2){
        id=1;
        name=name2;
    }
    public String getName(){ return name;}
    public void setName(String n){ this.name=n;}
    public void setID(int i){this.id=i;}
    public int getId(){return id;}
}
public class concept_oops{
    public static void main(String[] args) {
     employee22 harry=new employee22();
        System.out.println(harry.getId());
        System.out.println(harry.getName());       //without setting name and Id
        harry.setID(43);
        harry.setName("code with harry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());     // after setting name and id the value printing
        employee22 mona=new employee22("monalisa",23);
        System.out.println(mona.getName()+" is now doing job at "+harry.getId());  // This value printing  using constructor type-2
    }
}*/



// Overload the employee constructor to intialize the salary to rs 10,000.
    /*
class employee23{
    private int id;
    private String name;
    private int salary;

    public employee23(){    //Constructor-1
        id= 101;
        name="Saumrit";
        salary=22000;
    }
    public employee23( String myName,int myId){
        id=102;
        name="Monalisa";
        salary=12000;
    }
    public employee23(String myName ){
        id=103;
        name="Dundun";
        salary=10000;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getSalary(){
        return salary;
    }
}

     */
public class Concept_oops {
    public static void main(String[] args) {
       /* employee23 mn = new employee23();
        System.out.println(mn.getId());
        System.out.println(mn.getName());
        System.out.println(mn.getSalary());
        employee23 sau = new employee23("Monalisa",23);
        System.out.println(sau.getId());
        System.out.println(sau.getName());
        System.out.println(sau.getSalary());

        */
    }
}
























