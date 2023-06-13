package _50.coding.interview.questions._05;

import java.util.*;

public class ConsecutiveArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> set = new ArrayList<>();
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }
        set.sort(Comparator.naturalOrder());
        System.out.println(set);
        int max = 1;
        int count = 1;
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) == set.get(i - 1) + 1) {
                count++;
                if (count > max)
                    max = count;
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
