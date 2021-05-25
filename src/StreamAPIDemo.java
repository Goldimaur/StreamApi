/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 25-05-2021
 *   Time: 10:05
 *   File: StreamAPIDemo.java
 */

import java.util.stream.IntStream;

public class StreamAPIDemo {

    public static void main(String[] args) {
//        printAllOddNumber();
//    }
//    private static void printAllOddNumber(){
//        for (int i=1;i<=100;i++){
//            if(i%2 != 0){
//                System.out.println(i);
//            }
//        }
        System.out.println(IntStream.range(1,100).filter(number -> number % 2 != 0).min().getAsInt());
    }
}