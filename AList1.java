package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AList1 {

    // Basic Method of ArrayList
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add element");
            System.out.println("2. Add element at position");
            System.out.println("3. Remove element by value");
            System.out.println("4. Remove element by position");
            System.out.println("5. Get element");
            System.out.println("6. Set element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add(list);
                    break;
                case 2:
                    System.out.print("Enter element and position: ");
                    int e = scanner.nextInt();
                    int pos = scanner.nextInt();
                    add(e, pos, list);
                    break;
                case 3:
                    remove(list);
                    break;
                case 4:
                    System.out.print("Enter position to remove: ");
                    int position = scanner.nextInt();
                    remove(position, list);
                    break;
                case 5:
                    System.out.print("Enter position to get element: ");
                    int getPosition = scanner.nextInt();
                    get(getPosition, list);
                    break;
                case 6:
                    System.out.print("Enter position and new element: ");
                    int setPosition = scanner.nextInt();
                    int newElement = scanner.nextInt();
                    set(setPosition, newElement, list);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    public static void add(ArrayList<Integer> list) {
        System.out.print("Enter the element to add: ");
        list.add(scanner.nextInt());
    }

    public static void add(int e, int pos, ArrayList<Integer> list) {
        list.add(pos, e);
    }

    public static void remove(ArrayList<Integer> list) {
        System.out.print("Enter the element to delete: ");
        System.out.println(list.remove((Integer) scanner.nextInt()));
    }

    public static void remove(int pos, ArrayList<Integer> list) {
        System.out.println("Removed element: " + list.remove(pos));
    }

    public static void get(int pos, ArrayList<Integer> list) {
        System.out.println("Element at position " + pos + ": " + list.get(pos));
    }

    public static void set(int pos, int e, ArrayList<Integer> list) {
        list.set(pos, e);
    }
}
