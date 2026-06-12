import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
         //Stack<Integer> stk = new Stack<>();
        Stack<String> stk = new Stack<>();

//         // stk.push(10);
//         // stk.push(20);
//         // stk.push(30);
//         // stk.push(40);
//         // stk.push(50);
//         // stk.push(60);
//         // stk.pop();
//         // stk.peek();
//         // System.out.println(stk.peek());
//         // stk.pop();
//         // stk.peek();
//         // stk.pop();

        
//         stk.push("Vinit");
//         stk.push("Vishal");
//         stk.push("Abhishek");
//         stk.push("Yash");
//         stk.push("Anand");

//         System.out.println(stk);

//         stk.add(0,"Anurag");  //.add() is the property of vector(vector is the parent class of Stack that's why it works but it's not correct method to do so.)

//         System.out.println(stk);
        
//     }
// }


// In this we pop all elements from container and add what we want to add and then again push
//all elements.

        stk.push("Vinit");
        stk.push("Vishal");
        stk.push("Abhishek");
        stk.push("Yash");
        stk.push("Anand");
        System.out.println(stk);

        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        //System.out.println(stk);

        stk.push("Anurag");
        stk.push("Vinit");
        stk.push("Vishal");
        stk.push("Abhishek");
        stk.push("Yash");
        stk.push("Anand");
        System.out.println(stk);
    }
}