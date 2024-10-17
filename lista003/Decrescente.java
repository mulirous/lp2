package lista003;
import java.util.Arrays;
import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; 

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Digite um número:");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    
        System.out.printf(Arrays.toString(arr), "\n");
        
        sc.close();
        }
}
