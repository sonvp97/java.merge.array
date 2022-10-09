import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrnum1 = new int[5];
        int[] arrnum2 = new int[4];
        int[] arrnum3 = new int[9];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element array 1");
        for (int i = 0;i<arrnum1.length;i++){
            System.out.printf("Enter the element %d as: ",i + 1);
            arrnum1[i] = scanner.nextInt();
        }
        System.out.println("Enter element array 2");
        for (int i = 0;i<arrnum2.length;i++){
            System.out.printf("Enter the element %d as: ",i + 1);
            arrnum2[i] = scanner.nextInt();
        }
        for (int i = 0;i<arrnum1.length;i++){
            arrnum3[i] = arrnum1[i];
        }
        for (int i = 0;i<arrnum2.length;i++){
            arrnum3[arrnum1.length + i] = arrnum2[i];
        }
        System.out.println("Element array 3 is: ");
        for (int i = 0; i<arrnum3.length;i++){
            System.out.print(arrnum3[i] + "\t");
        }
    }
}