package test;

import java.util.Random;

/**
 * @author: liuxs
 * @description:
 * @date: Created in 11:05 AM  2019/2/26
 */
public class NormalTest {
   public static void main(String[] args){
       Random random = new Random();
       int b = random.nextInt(1);
       int a = b % 2;
       System.out.println(b);
   }
}
