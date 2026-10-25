import java.util.*;
public class Oct23 {
    public static void main(String[] args) {

        // ==========================================
        // 1. CREATING AN ARRAYLIST
        // ==========================================

        // ArrayList is a resizable array.
        // It can grow or shrink dynamically.

        ArrayList<Integer> nums = new ArrayList<>();

        // Creating an ArrayList with initial values
        ArrayList<Integer> nums2 =
                new ArrayList<>(List.of(10, 20, 30));
                

        System.out.println("Initial List: " + nums2);


        // ==========================================
        // 2. ADDING ELEMENTS
        // ==========================================

        nums.add(10);       // Adds 10 at the end
        nums.add(20);       // Adds 20 at the end
        nums.add(30);       // Adds 30 at the end
    

        System.out.println("After add(): " + nums);

        // Insert element at a particular index
        nums.add(1, 15);
        //add(index,value)

        // 10, 15, 20, 30
        // Existing elements shift right.

        System.out.println("After indexed add(): " + nums);


        // ==========================================
        // 3. ACCESSING ELEMENTS
        // ==========================================

        // ArrayList indexing starts from 0.

        int first = nums.get(0);

        System.out.println("First Element: " + first);

        // Accessing an element at index 2
        System.out.println("Element at index 2: " + nums.get(2));


        // ==========================================
        // 4. UPDATING ELEMENTS
        // ==========================================

        // set(index, newValue) replaces existing value.

        nums.set(0, 100);

        System.out.println("After set(): " + nums);


        // ==========================================
        // 5. FINDING SIZE
        // ==========================================

        // size() returns the number of elements.
        // ArrayList uses size(), not length.

        System.out.println("Size: " + nums.size());


        // ==========================================
        // 6. TRAVERSING USING NORMAL FOR LOOP
        // ==========================================

        // Use this when index is required.

        System.out.println("\nNormal For Loop:");

        for (int i = 0; i < nums.size(); i++) {

            System.out.println(
                i+ ", Value: " + nums.get(i)
            );
        }


        // ==========================================
        // 7. TRAVERSING USING FOR-EACH LOOP
        // ==========================================

        // Use this when index is not required.

        System.out.println("\nFor-Each Loop:");

        for (int value : nums) {

            System.out.println(value);
        }
        // 8. Checking whether an element exists
        System.out.println(nums.contains(20)); // true

        // 9. Finding the index
        System.out.println(nums.indexOf(30)); // 3
        System.out.println(nums.indexOf(50)); // -1


       

        // 10. Removing by index
        nums.remove(1);
        System.out.println(nums); // [100, 20, 30]

        // 11. Removing by value
        nums.remove(Integer.valueOf(20));
        System.out.println(nums); // [100, 30]

        // 12. Checking whether the list is empty
        System.out.println(nums.isEmpty()); // false

        // 13. Iterating using Iterator
        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 14. Clearing the ArrayList
        nums.clear();
        System.out.println(nums); // []

        System.out.println(nums.isEmpty()); // true
    }
}