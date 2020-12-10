package chapterFive;

import java.util.Arrays;
import java.util.Random;

public class ArraryTest {
    public static void main(String[] args) {
       /* Random random = new Random(47);

        Integer [] a = new Integer[random.nextInt(20)];

        System.out.println("length of a :" + a.length );

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);
            System.out.println(Arrays.toString(a));
        }*/

       Integer [] a = {
               new Integer(1),
               new Integer(2),
       };

       Integer [] b = {
               new Integer(1),
               new Integer(2),
       };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
