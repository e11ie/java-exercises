package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String args[]) {
        String sampleString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula " +
                "scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = sampleString.toCharArray();
        HashMap<Character, Integer> countOfChars = new HashMap<>();
//        Scanner in = new Scanner(System.in);

//        System.out.println("");

        /*
         * loop through the char array, and
         * if char is exists, add to count
         * else add char to HashMap and init count to 0
         */
        for (char singleChar : charactersInString) {

            if (countOfChars.containsKey(singleChar)) {
                Integer newValue = (countOfChars.get(singleChar) + 1);
                countOfChars.replace(singleChar, newValue);
            } else {
                countOfChars.put(singleChar, 1);
            }
        }

        /*
         * loop through and print the results
         */
        for (Map.Entry<Character, Integer> result : countOfChars.entrySet()) {
            System.out.println(result.getKey() + " : " + result.getValue());
        }
    }
}
