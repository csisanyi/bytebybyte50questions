package _50.coding.interview.questions._02;

import java.util.*;

public class Knapsack0_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int maxWeight = sc.nextInt();
        int  totalValue = 0;
        sc.nextLine();
        for(int i = 0; i < length; i++){
            String[] arr = sc.nextLine().split(" ");
            map.put(Integer.valueOf(arr[0]), Integer.valueOf(arr[1]));
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());

        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for(Map.Entry<Integer, Integer> entry : sortedEntries){
            if(entry.getKey() <= maxWeight){
                totalValue+= entry.getValue();
                maxWeight = maxWeight - entry.getKey();
            }
        }

        System.out.println(totalValue);
    }
}
