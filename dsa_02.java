import java.util.ArrayList;

public class ArrayBasics {

    // Fixed-size array: size and type locked at creation
    public static void fixedArrayDemo() {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Access arr[2] -> O(1): " + arr[2]);
        // arr[5] = 60; // would throw ArrayIndexOutOfBoundsException -- no room to grow

        // To "grow" a fixed array, you must copy into a new, bigger one
        int[] bigger = new int[10];
        System.arraycopy(arr, 0, bigger, 0, arr.length);
        bigger[5] = 60;
        System.out.println("Grown via copy: length now " + bigger.length);
    }

    // ArrayList: Java's dynamic array, behaves like Python's list
    public static void arrayListDemo() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15); // O(n) -- shifts everything after index 1
        System.out.println("After insert at index 1 -> O(n): " + list);

        list.remove(Integer.valueOf(15)); // O(n) -- find + shift
        System.out.println("After remove(15) -> O(n): " + list);
    }

   
    static class SimpleDynamicArray {
        private int[] data;
        private int size;      // number of elements actually used
        private int capacity;  // total slots available

        SimpleDynamicArray() {
            capacity = 4;
            data = new int[capacity];
            size = 0;
        }

        void append(int value) {
            if (size == capacity) {
                capacity *= 2; // double the capacity
                int[] newData = new int[capacity];
                System.arraycopy(data, 0, newData, 0, size); // O(n) copy, but rare
                data = newData;
                System.out.println("  [grew to capacity " + capacity + "]");
            }
            data[size] = value;
            size++;
        }

        void print() {
            int[] used = new int[size];
            System.arraycopy(data, 0, used, 0, size);
            System.out.println(java.util.Arrays.toString(used));
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Fixed Array Demo ---");
        fixedArrayDemo();

        System.out.println("\n--- ArrayList Demo ---");
        arrayListDemo();

        System.out.println("\n--- Manual Dynamic Array (amortized O(1) append) ---");
        SimpleDynamicArray dynArr = new SimpleDynamicArray();
        for (int i = 1; i <= 6; i++) {
            dynArr.append(i * 10);
            dynArr.print();
        }
    }
}