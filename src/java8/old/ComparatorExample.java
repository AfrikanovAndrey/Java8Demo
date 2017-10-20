package java8.old;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {

    private static class LengthStringComparator implements Comparator<String> {
        public int compare(String firstStr, String secondStr) {
            return Integer.compare(firstStr.length(),secondStr.length());
        }
    }

    public static void main(String[] args){
        String[] strings = new String[]{"a", "abcd", "abc", "ab"};
        Arrays.sort(strings, new LengthStringComparator ());

        for(String s : strings){
            System.out.println(s);
        }
    }


}
