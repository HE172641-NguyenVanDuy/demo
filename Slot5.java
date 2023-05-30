package slot5;

import java.util.Scanner;

public class Slot5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the data the array.");
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        int ch;
        System.out.println("Input the element of the array!");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu #" + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        do {
            printMenu();
            ch = Integer.parseInt(sc.nextLine());
            switch (ch) {
                case 1:
                    displayAllElement(arr, n);
                    break;
                case 2:
                    displayEvenNumber(arr, n);
                    break;
                case 3:
                    sort(arr, n);
                    break;
                case 4:
                    findMaxNumber(arr, n);
                    break;
                case 5:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Please choose the number from[1 -> 5]: ");
                    break;
            }
        } while (ch != 5);

    }

    public static void findMaxNumber(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        System.out.println("Max = "+ max);
    }

    public static void sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("the array after sort; ");
        displayAllElement(arr, n);
    }

    public static void displayAllElement(int arr[], int n) {
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void displayEvenNumber(int arr[], int n) {
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Display all the elements.");
        System.out.println("2. Display the even number.");
        System.out.println("3. Sort all number");
        System.out.println("4. Find the max number.");
        System.out.println("5. Exit");
    }
}
