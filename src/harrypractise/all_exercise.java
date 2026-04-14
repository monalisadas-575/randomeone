package harrypractise;


// exercise-2 : create a program for rock, paper, scissor.
 /*   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock, enter 1 for paper, enter 2 for scissor");
        int userinput= sc.nextInt();
        Random rm=new Random();
        int computerinput= rm.nextInt(3);
        if(userinput==computerinput){
            System.out.println("Draw");
        } else if (userinput==0 && computerinput==2 || userinput==1 &&
                computerinput==0 || userinput==2 && computerinput==1) {
            System.out.println("You win!");
        }
        else{
            System.out.println("Computer win!");
        }
        System.out.println("Computer choice "+ computerinput);
    }
}*/



/* exercise-3: Create a class game which allow a user to play "Guess the number" game once. Game should have the following methods.
1. Constructor to generate the random number
2. take userInput() to take a userinput number.
3. is correctNmber() to detect whether the number entered by user is true.
4. getter and setter for number of guesses.
5. Use properties such as noOfGuess(int), etc to get this task done.
 */





















//Exercise-4: You have implement a library using Java class library methods: addBook(), issueBook(), returnBook(), showAvailableBooks()
//Properties:Array to store available book.
// array to store the issued books.
/*
class library{
    String[] books;
    int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+"has been added");
    }void showAvailableBooks(){
        System.out.println("available books are:");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("*"+book);
        }
    }void issueBook(String book ){
        for(int i=0; i<this.books.length; i++){
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }void returnBook(String book){
        addBook(book);
    }
}
public class harrypractise.all_exercise{
    public static void main(String[] args) {
        library cl=new library();
        cl.addBook("Think & grow Rich");
        cl.addBook("Algorithim");
        cl.addBook("C++");
        cl.showAvailableBooks();
        cl.issueBook("C++");
        cl.showAvailableBooks();
        cl.returnBook("C++");
        cl.showAvailableBooks();
    }
}*/




//package com.codewithharry.shape

class Rectangle {
    int length,breadth;

    //Setters
    public void setLength(int length){
        this.length = length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    //Getters
    public int getLength(){
        return this.length;
    }

    public int getBreadth(){
        return this.breadth;
    }

    public int area(){
        return this.length * this.breadth;
    }

}


class Square {
    int size;

    public void setsize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    public int SquareArea(){
        return this.size * this.size;
    }

}



class Circle {
    double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double area(){
        return Math.PI * (this.radius*this.radius);
    }

}

class Cylinder extends Circle{
    double height,radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getheight(){
        return this.height;
    }

    public double volumeCylinder(){
        return Math.PI * (this.radius*this.radius) * this.height;
    }
}



class Sphere extends Circle{
    double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double Spherearea(){
        return 4*Math.PI*(this.radius*this.radius);
    }

}



public class  all_exercise {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(12);
        System.out.println(c1.getRadius());
        System.out.println(c1.area());

        Square sq = new Square();
        sq.setsize(4);
        System.out.println(sq.getSize());
        System.out.println(sq.SquareArea());



        Cylinder CY = new Cylinder();
        CY.setHeight(12.2);
        CY.setRadius(10.0);
        System.out.println(CY.getRadius());
        System.out.println(CY.getheight());
        System.out.println(CY.area());



        Sphere sp = new Sphere();
        sp.setRadius(6.2);
        System.out.println(sp.getRadius());
        System.out.println(sp.Spherearea());
    }
}


















