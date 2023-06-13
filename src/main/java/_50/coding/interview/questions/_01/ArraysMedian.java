package _50.coding.interview.questions._01;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysMedian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1 = sc.nextInt();
        int arr2 = sc.nextInt();
        int[] a1 = new int[arr1];
        int[] a2 = new int[arr2];

        if(arr1==0 || arr2!=arr1){
            System.out.println("Error");
        }
        else {
            for(int i=0; i<arr1; i++){
                a1[i] = sc.nextInt();
            }
            for(int i=0; i<arr2; i++){
                a2[i] = sc.nextInt();
            }
        }

        float median = ((float) Arrays.stream(a1).sum() + (float) Arrays.stream(a2).sum())/(float)(arr1+arr2);

        System.out.println("median: " + median);
    }
}

