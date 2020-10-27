import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static int n;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        n = Integer.parseInt(scanner.nextLine());  
        
        int k = Integer.parseInt(scanner.nextLine());   
        
        arr = new int[k];
        
        combine(0, 1); 
    } 
    
    private static void combine(int index, int start) {
        if (index == arr.length) {
            printArr();
        } else {
            for (int i = start; i <=n; i++) {
                arr[index] = i;
                combine(index + 1, i + 1);
            }
        }
    }
    
    private static void printArr() {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();       
    }
}