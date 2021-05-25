/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 25-05-2021
 *   Time: 10:06
 *   File: StreamAPIIntermediate.java
 */

import java.util.ArrayList;

public class StreamAPIIntermediate {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(78);
        list.add(99);
        list.add(66);
        var stream= list.stream();
        var smallestNumber= stream.min(Integer::compareTo);
        smallestNumber.ifPresent((System.out::println));
    }
}