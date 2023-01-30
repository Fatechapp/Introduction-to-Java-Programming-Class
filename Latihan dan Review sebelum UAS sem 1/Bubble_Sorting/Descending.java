package Bubble_Sorting;

public class Descending {
    public static void main(String[] args) {
        System.out.println("NUMBERS SORT ASCENDING");
        int[] numbers = {3, 1, 4, 2};
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted numbers (ascending):");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("");
        System.out.println("NUMBERS SORT ASCENDING");
        String[] name = {"Batara Wisnu", "Batara Indra", "Anjani", "Werkudara", "Drona"};
        for (int i = 0; i < name.length - 1; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].compareTo(name[j]) < 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
}
