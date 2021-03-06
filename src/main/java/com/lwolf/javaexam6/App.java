package com.lwolf.javaexam6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int steps = 2;
        System.out.println(list);
        rotateList(list, steps);
        System.out.println("Rotated: "+list);

        List<String> stringList = new ArrayList<String>(Arrays.asList("react", "git", "java", "c#", "docker"));
        System.out.println(stringList);
        rotateList(stringList, steps);
        System.out.println("Rotated: "+stringList);
    }

    /**
     * @param list the list to be rotated
     * @param k    the number of steps of rotation
     * @return reference to the rotated same list
     */
    public static <T> List<T> rotateList(List<T> list, int k) {

        if (k == 0) return list;
        if (k > list.size()) k -= list.size();

        for (int step = 1; step <= k; step++) {
            T temp = list.get(0);
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i, list.get(i + 1));
            }
            list.set(list.size() - 1, temp);
        }

        /*for (int step = 1; step <= k; step++) {
            int temp = list.get(list.size() - 1);
            for (int i = list.size() - 1; i > 0; i--) {
                list.set(i, list.get(i - 1));
            }
            list.set(0, temp);
        }*/

        return list;
    }
}
