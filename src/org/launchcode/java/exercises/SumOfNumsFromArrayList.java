package org.launchcode.java.exercises;

import java.util.ArrayList;

public class SumOfNumsFromArrayList {

    public static int sumOfEvenNums(ArrayList<Integer> nums) {
        int total = 0;
        // if number is even, add it to the total
        for (int i = 0; i < nums.size(); i++) {
            if ((int) nums.get(i) % 2 == 0) {
                total += (int) nums.get(i);
            }
        }

        return total;
    }

    public static void main(String args[]) {
        ArrayList<Integer> randomArrayThing1 = new ArrayList();
        randomArrayThing1.add(2);
        randomArrayThing1.add(1);
        randomArrayThing1.add(2);
        randomArrayThing1.add(5);
        randomArrayThing1.add(7);

        SumOfNumsFromArrayList r = new SumOfNumsFromArrayList();
        int rSum = r.sumOfEvenNums(randomArrayThing1);


        System.out.println("Sum of Even Numbers is: " + rSum);
    }
}
