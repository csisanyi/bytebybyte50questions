package _50.coding.interview.questions._04;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            nums[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> dups = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                dups.add(entry.getKey());
            }
        }

        System.out.println(dups);

    }
}
