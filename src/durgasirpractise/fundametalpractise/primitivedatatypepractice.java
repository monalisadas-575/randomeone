package durgasirpractise.fundametalpractise;

 class primitive {
     public static void main(String[] args) {
         byte b1=-128;
         byte b0=-127;
        // byte b2=129;
         //byte b3=true;  //found-boolean,reqd-byte
         //byte b4=True;  //java: cannot find symbol,symbol-variable type
        // byte b5=null;  //requd type-byte,found-null
         byte b6=07;      //Octal form(adding prefix 0)
         byte b7=0X1;     //hexa decimal form(adding prefix 0X/0x)
         byte b8=0x70;//allowed only upto (a-f)


         short s1= -32768;
         short s2= 32767;
         //short s3=32768;  //found-int,reqd-short
         //short s4=-32769; //found-int,reqd-short
         short s5=077;     //Octal form(adding prefix 0)
         short s6=0X1;     //hexa decimal form(adding prefix 0X/0x)
         short s7=0x70;//allowed only upto (a-f)


         int x1=-2147483648;
         int x2=2147483647;
         //int x3=2147483648; //integer no too large
         //int x4=12l;   //found-long,reqd-int
         int x5=0777;//octal form
         int x6=0XBeef;
         System.out.println(x6);    //48879
         //int x7=10.0;// cant take floating point


         long l1=234567889989898989L;
         long l2=2345678909877656776l;  //warning due to visual similarity with digit 1.
         long l3=0777L;//octal form
         long l4=0xbee2L;
         System.out.println(l1+l2+l3+l4);  //2580246799867605142

         float f1=123.67f;
         float f2=123.67F;
         float f3=-12345.34f;
        float f4=03.777f;
       // float f5=0Xface.0;      //malformed floating-point literal
        // float f6=0X123.456f;   // floating pt literal cant take octal /hexadecimal form
         float f7=0123.5f;        //though it looks like octal but java traet it as decimal.


         double d1=1234.56788908;
         double d2=23367.678d;    // can use d/d but not required as
         double d3=669654778D;    // default data type for float point literal is double
         double d4=0786d;
         double d5=0X130;
         double d6=0x1245;
         double d7=1__2__345.90;
         System.out.println(d7);   //12345.9--->1.7v enhancement '-' can use b/w numeric literals.




         boolean y1=true;
         boolean y2=false;
         //boolean y3=True; //java: cannot find symbol,symbol-variable type
        // boolean y4=0;    //found-int,reqd-boolean

         char c1='a';
         char c2='z';
         char c3='A';
         char c4='#';
         char c5='@';
         char c6='%';
         char c7='\u0061';//'a'
         System.out.println(c7);
         char c8='\n';
         System.out.println("a");
         System.out.println(c8);
         System.out.println("b");
















     }
}
