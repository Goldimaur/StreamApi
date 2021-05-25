/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 25-05-2021
 *   Time: 10:07
 *   File: StreamAPIUsingList.java
 */

import java.util.ArrayList;

public class StreamAPIUsingList {

    public static <stream1> void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(78);
        list.add(99);
        list.add(66);
        list.add(45);
        list.stream().filter(number -> number % 2 == 0).forEach(System.out::println); // soutc
        // using random
        for (int j = 0; j < 10; j++) {
            var randomNumber = (int) ((Math.random() * 100) + 1);
            list.add(randomNumber);
        }
        System.out.println(list);
        // other way to do
        int smallestNumber = list.get(0);
        for (Integer number : list) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        System.out.println("smallestNumber" + smallestNumber);

        // create a new stream from the data source
        //    var stream: stream1<Integer> = list.stream();

    }
}