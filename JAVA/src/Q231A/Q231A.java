package Q231A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q231A {
    private static final List<List<Integer>> decisions = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            List<Integer> decision = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                decision.add(scanner.nextInt());
            }
            decisions.add(decision);
        }

        q231A();

    }

    public static void q231A() {
        int result = 0;

        for (List<Integer> decision : decisions) {
            int curr = 0;
            for (int num : decision) {
                if (num == 1) curr++;
                if (curr == 2) {
                    result++;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
