import org.junit.Test;

import java.util.regex.Pattern;

public class Demo {

    /**
     * speed of computation
     */
   @Test
   public void test01(){
       long sum = (long) (1+200000)*100000 -1 ;
       for (long i=2;i<= 200000 ;i++) {
           if (Math.sqrt(i) %1 ==0){
               sum -= i ;
           }
           else{
               for (long j = 2; j < i; j++) {
                   if (i % j == 0) {
                       sum -= i ;
                       break;
                   }
               }
           }
       }
       System.out.println(sum);
   }

    /**
     * reducing the looping coun
     */
   @Test
   public void test02(){
       long sum = (long) (1+200000)*100000 -1 ;
       for (long i=2;i<= 200000 ;i++) {
           if (Math.sqrt(i) %1 ==0){
               sum -= i ;
           }
          else if (i!=2 &&i%2==0){
                   sum -= i ;
           }
           else if (i!=3 &&i%3==0){
               sum -= i ;
           }
           else if (i!=5 &&i%5==0){
               sum -= i ;
           }
           else if (i!=7 &&i%7==0){
               sum -= i ;
           }
           else{
               for (long j = 2; j < i; j++) {
                   if (i % j == 0) {
                       sum -= i ;
                       break;
                   }
               }
           }
       }
       System.out.println(sum);
   }
}
