package com.symon.challeges;


public class Main{
    public static String mergeAlternately(String word1, String word2) {
        int x = 0, y = 0, i = 0;
        int totalLength = word1.length() + word2.length();
        StringBuilder word3 = new StringBuilder();

        while (i < totalLength){
            if (i % 2 == 0 && x < word1.length() || y == word2.length()) {
                word3.append(word1.charAt(x));
                x++;
            }
            else if (word1.length() < word2.length() || i % 2 != 0){
                word3.append(word2.charAt(y));
                y++;
            }
            else {
                word3.append(word1.charAt(x));
                x++;
            }
            i++;
        }
        return word3.toString();
    }
    public static void main(String[] args) {
        String string1 = "aaaa";
        String string2 = "bb";
        String finalString;

        finalString = mergeAlternately(string1, string2);

        System.out.println(finalString);
    }
}
