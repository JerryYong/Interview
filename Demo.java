public class Demo {
   public static void main(String[] args) {
       long sum = (long) (1+200000)*100000 -1 ;
       for (long i=0;i<= 200000 ;i++) {
           for (long j = 2; j < i; j++) {
               if (i % j == 0) {
                   sum -= i ;
                   break;
               }
           }
       }
       System.out.println(sum);
   }
}
