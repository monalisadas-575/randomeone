package harrypractise.practice;
class P {
        P() {
                System.out.println(this.hashCode()+"  ededed   "+this.getClass());
        }
}
class C extends P {
        C() {
                System.out.println(this.hashCode()+" gtrgrgrtg   "+this.getClass());
        }
}

class D extends C {
        D() {
                System.out.println(this.hashCode()+" ddddd   "+this.getClass());
        }
}

class Test{
        public static void main(String[] args) {
                P p=new D();
                System.out.println(p.hashCode());
        }
}