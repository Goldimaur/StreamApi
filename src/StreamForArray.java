/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 25-05-2021
 *   Time: 10:07
 *   File: StreamForArray.java
 */

import java.util.ArrayList;
import java.util.Arrays;

public class StreamForArray {

    public static void main(String[] args) {
        // creating a stream for an array
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((char) (97 + (Math.random() * 26)));
        }
        Integer[] numbers = {9, 7, 8, 9, 5, 4,};
        var stream1 = Arrays.stream(numbers);
        var stream2 = list.stream();
        stream1 = stream1.filter(number -> number % 2 == 0);
        System.out.println(stream1.filter(number -> number > 20));
    }
}