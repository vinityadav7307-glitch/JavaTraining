public class PracticeHeap {
    int arr[];
    int capacity;
    int size;

    PracticeHeap(int c) {
        arr = new int[c];
        capacity = c;
        size = 0;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int Right(int i) {
        return 2 * i + 2;
    }

    int Parent(int i) {
        return (i - 1) / 2;
    }

    public void insert(int val) {

        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }

        int i = size;
        arr[size++] = val;

        // Up Heapify
        while (i != 0 && arr[Parent(i)] > arr[i]) {

            int temp = arr[i];
            arr[i] = arr[Parent(i)];
            arr[Parent(i)] = temp;

            i = Parent(i);
        }
    }

    public int pop() {

        if (size == 0) {
            System.out.println("Heap Underflow");
            return -1;
        }

        int root = arr[0];

        arr[0] = arr[--size];

        int i = 0;

        // Down Heapify
        while (left(i) < size) {

            int smallest = i;

            if (arr[left(i)] < arr[smallest]) {
                smallest = left(i);
            }

            if (Right(i) < size &&
                arr[Right(i)] < arr[smallest]) {
                smallest = Right(i);
            }

            if (smallest == i)
                break;

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            i = smallest;
        }

        return root;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        PracticeHeap heap = new PracticeHeap(10);

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(40);
        heap.insert(2);

        System.out.println("Heap:");
        heap.display();

        System.out.println("Deleted: " + heap.pop());

        System.out.println("Heap after deletion:");
        heap.display();
    }
}