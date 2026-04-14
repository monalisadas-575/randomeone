package durgasirpractise.JavalangPractice.ObjectMethodPractice;

 class Address {
     String dist;
     int roadNo;
     String village;
   public Address() {
   }

   public Address(String dist, int roadNo, String village) {
       this.dist = dist;
       this.roadNo = roadNo;
       this.village = village;
   }
   public boolean equals(Object obj) {

       //Todo 1 one type of .equals() method overriding
//       try{
//           Address ad1=(Address)obj;
//                if(dist.equals(ad1.dist)&& (roadNo==ad1.roadNo) &&(village.equals(ad1.village))) {
//                    return true;
//                }
//                else
//                {
//                 return false;
//                }
//
//       }catch(ClassCastException e){
//           return false;
//       }
//       catch(NullPointerException e){
//               return false;
//       }
       //todo 2 .equls() overriding
       if (obj == this){
           return true;

   }return false;}

    //todo By overriding toString() we can write our own representation of object.
     @Override
     public String toString() {
//         return
//                 "{ dist='" + dist + '\'' +
//                 ", roadNo=" + roadNo +
//                 ", village='" + village + '\'' +
//                 '}';
        //Todo 1 we can print Address object reference as dist, roadNo, village
         // return "{ dist='"+dist+'\''+" ,roadNo="+roadNo+" ,village="+village+"}";

         //todo 2 we can print only dist, roadNo
         return "{ dist='"+dist+'\''+" ,roadNo="+roadNo+"}";

 }}
