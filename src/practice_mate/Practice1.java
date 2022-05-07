package practice_mate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args) {
        String str = "tttrrrttt";
        char[] withoutR = removeLetter(str);
        for (char ch : withoutR) {
            System.out.print(ch);
        }
    }

    private static char[] removeLetter(String someText) {
      List<Character> test = someText.chars().mapToObj(i -> (char)i).map(el -> {
            if (el == 'r') {
                el = '!';
            }
            return el;
        }).collect(Collectors.toList());
        return String.valueOf(test).toCharArray();
    }
}