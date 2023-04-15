package Q228A;

import java.util.*;
import java.util.stream.Collectors;

public class A228A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        List<Integer> colors = Arrays.stream(numbers)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        Set<Integer> uniqueColors = new HashSet<>(colors);
        System.out.println(4 - uniqueColors.size());
    }
}
