package harrypractise.practiceonoops;


// prpblem-1: Create  a class cylinder and use setters and getters to set its radius and height.
 /*   class cylinder{
        private int radius;
        private int height;

        public void setRadius(int radius) {
            this.radius = radius;
        }
        public void setHeight(int height) {
            this.height = height;
        }
        public int getHeight() {
            return height;
        }
        public int getRadius() {
            return radius;
        }
    }
public class practice_oops {
    public static void main(String[] args) {
        cylinder cyl=new cylinder();
        cyl.setHeight(12);
        System.out.println(cyl.getHeight());
        cyl.setRadius(9);
        System.out.println(cyl.getRadius());
    }
}*/





//Problem-2: Use p-1  to calculate volume & surface area of the cylinder
/*
class cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double SA(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double vol(){
        return Math.PI*radius*radius*height;
    }
}
public class practice_oops {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setHeight(12);
        cyl.setRadius(9);
        System.out.println(cyl.SA());
        System.out.println(cyl.vol());// Not printing the radius and height only printing the cylinder SA and vol so getters are not here.
    }

}*/







//Problem-3: Use a constructor and repeat 1
/*class cylinder{
    private int radius;
    private int height;
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double SA(){
        return ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
    }
    public double vol(){
        return Math.PI*radius*radius*height;
    }
}
public class practice_oops{
    public static void main(String[] args) {
     cylinder cyl= new cylinder(9,12);
        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
        System.out.println(cyl.SA());
        System.out.println(cyl.vol());
    }
}*/





//Problem: 4; Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameter.
 /*class rectangle{
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}
public class practice_oops {
    public static void main(String[] args) {
     rectangle rec=new rectangle();
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());
        rectangle rec2=new rectangle(0,0);
        System.out.println(rec2.getBreadth());
        System.out.println(rec2.getLength());
    }
}*/






// Problem-5: Repeat 1 for Sphere

class sphere{
    private int radius;

    public sphere() {
        this.radius = 5;
    }

    public int getRadius() {
        return radius;
    }
public double area(){
        return 4* Math.PI*radius*radius;
}
public double vol(){
        return (4/3)*(Math.PI*radius*radius*radius);
}
}
public class Practice_oops {
    public static void main(String[] args) {
     sphere sph=new sphere();
        System.out.println(sph.getRadius());
        System.out.println(sph.vol());
        System.out.println(sph.area());
    }
}

















