package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        checkAnagram("CAT", "ACT");
        checkAnagram("MARY", "ARMY");
    }
    public static void checkAnagram(String word, String anagram){

        //implementation here...

        String a = "MARY";
        String b = "ARMY";
        boolean i = Anagram.isAnagram(a,b);

        if (i){
            System.out.println("\""+a+"\" and \""+b+"\" is Anagram.");
        }else{System.out.println(a+" and "+b+" is not Anagram.");}

    }
    static boolean isAnagram(String str1, String str2){

        //implementation here...
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        char[] str1c = str1.toCharArray();
        Arrays.sort(str1c);
        char[] str2c = str2.toCharArray();
        Arrays.sort(str2c);

        return Arrays.equals(str1c, str2c);



    }
}
