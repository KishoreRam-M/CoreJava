package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListMethodsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Elements");
            System.out.println("2. Insert Element at Index");
            System.out.println("3. Get Element at Index");
            System.out.println("4. Set Element at Index");
            System.out.println("5. Remove Element by Index");
            System.out.println("6. Remove Element by Value");
            System.out.println("7. Check Size");
            System.out.println("8. Check if Empty");
            System.out.println("9. Check if Contains");
            System.out.println("10. Add All Elements");
            System.out.println("11. SubList");
            System.out.println("12. Iterator");
            System.out.println("13. List Iterator");
            System.out.println("14. To Array");
            System.out.println("15. Sort List");
            System.out.println("16. ForEach");
            System.out.println("17. Stream");
            System.out.println("18. Parallel Stream");
            System.out.println("19. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    list.add("Apple");
                    list.add("Banana");
                    list.add("Cherry");
                    System.out.println("Added elements: " + list);
                }
                case 2 -> {
                    list.add(1, "Blueberry");
                    System.out.println("Inserted 'Blueberry' at index 1: " + list);
                }
                case 3 -> System.out.println("Element at index 1: " + list.get(1));
                case 4 -> {
                    list.set(1, "Blackberry");
                    System.out.println("Set 'Blackberry' at index 1: " + list);
                }
                case 5 -> {
                    list.remove(2);
                    System.out.println("Removed element at index 2: " + list);
                }
                case 6 -> {
                    list.remove("Apple");
                    System.out.println("Removed 'Apple': " + list);
                }
                case 7 -> System.out.println("Size of list: " + list.size());
                case 8 -> System.out.println("Is list empty? " + list.isEmpty());
                case 9 -> System.out.println("List contains 'Banana': " + list.contains("Banana"));
                case 10 -> {
                    list.addAll(Arrays.asList("Date", "Elderberry", "Fig", "Grape"));
                    System.out.println("Added multiple elements: " + list);
                }
                case 11 -> {
                    List<String> subList = list.subList(1, 4);
                    System.out.println("Sublist from index 1 to 4: " + subList);
                }
                case 12 -> {
                    Iterator<String> iterator = list.iterator();
                    System.out.print("Elements in list using iterator: ");
                    while (iterator.hasNext()) {
                        System.out.print(iterator.next() + " ");
                    }
                    System.out.println();
                }
                case 13 -> {
                    System.out.print("ListIterator in forward direction: ");
                    list.listIterator().forEachRemaining(System.out::print);
                    System.out.println();
                }
                case 14 -> {
                    String[] array = list.toArray(new String[0]);
                    System.out.println("Array from list: " + Arrays.toString(array));
                }
                case 15 -> {
                    list.sort(Comparator.naturalOrder());
                    System.out.println("Sorted list: " + list);
                }
                case 16 -> {
                    System.out.print("Using forEach: ");
                    list.forEach(System.out::print);
                    System.out.println();
                }
                case 17 -> {
                    System.out.print("Stream output: ");
                    list.stream().forEach(System.out::print);
                    System.out.println();
                }
                case 18 -> {
                    System.out.print("Parallel Stream output: ");
                    list.parallelStream().forEach(System.out::print);
                    System.out.println();
                }
                case 19 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
