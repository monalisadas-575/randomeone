package harrypractise.inhertitance;

    //Create a class circle and use inheritance to create another class cylinder from it.
 /*   class circle {
        public int radius;

        public  circle(int r) {
            this.radius = r;
            System.out.println("I am radius");
        }

        public double area() {
            return Math.PI * this.radius * this.radius;
        }
    }
    class cylinder extends circle{
        public int height;
        cylinder(int r,int h){
            super(r);
            this.height=h;
            System.out.println("I am height");
        }
        public double volume(){
            return Math.PI*this.radius*this.radius*this.height;
        }
    }
    public class inheritance_practice_exer{
        public static void main(String[]args){
            circle cl=new circle(4);
            System.out.println(cl.area());
            cylinder cyl=new cylinder(10,20);
            System.out.println(cyl.volume());
        }
    }*/






//Problem-2: Create a class Rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world scenario as possible.

class rectangle{
    int length;
    int breadth;

     rectangle(int l, int b) {
        this.length = l;
        this.breadth=b;
    }
    public int area(){
         return this.length*this.breadth;
    }
}
class cuboid extends rectangle{
    int height;
    cuboid(int l, int b, int h){
        super(l,b);
        System.out.println("I am a constructor of cuboid");
        this.height=h;
    }
    public int area(){
        return 2 * (this.length * this.breadth + this.breadth * this.height + this.height * this.length);
    }
}
public class inheritance_practice_exer{
    public static void main(String[] args) {
        cuboid cd= new cuboid(6,11,20);
        System.out.println(cd.area());
    }
}







//







