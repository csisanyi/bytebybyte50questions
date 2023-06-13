package _50.coding.interview.questions._12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        List<Integer> original = new ArrayList<Integer>(3);
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        for (int i = 0; i < len; i++) {
            int num = sc.nextInt();
            original.add(num);
        }



        permutations.add(original);

        int pointer1 = len-1;
        int pointer2 = len-2;

        int counter = 0;

        while (true) {
            List<Integer> temp = new ArrayList<Integer>(3);
            if (pointer1 >= 0) {
                if (pointer2 == -1) {
                    pointer2 = len - 1;
                    }
                for (int i = 0; i < len; i++) {
                    if (i != pointer1 && i != pointer2) {
                        temp.add(permutations.get(counter).get(i));
                    } else if(i == pointer1) {
                        temp.add(permutations.get(counter).get(pointer2));
                    } else {
                        temp.add(permutations.get(counter).get(pointer1));
                        }
                }
                if(pointer1 == 0) {
                    pointer1 = len;
                }
            }
            if(permutations.contains(temp)){
                break;
            } else {
                permutations.add(temp);
                counter++;
                pointer1--;
                pointer2--;
            }
        }

        for(List<Integer> list : permutations){
            System.out.println(list);
        }

    }

}
