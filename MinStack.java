// import java.util.Stack;

// public class MinStack {

//   public static void main(String[] args) {
//     Stack<Integer> s = new Stack<>();

//     // Function calls
//   s.push(3);
//   s.push(5);
//   s.getMin();
//   s.push(2);
//   s.push(1);
//   s.getMin();
//   s.pop();
//   s.getMin();
//   s.pop();
//   s.peek();
//   }

//   public static class getMin {

//     Stack<Integer> st = new Stack<>();
//     Stack<Integer> min = new Stack<>();

//     public MinStack() {}

//     public void push(int val) {
//       if (st.size() == 0) {
//         st.push(val);
//         min.push(val);
//         return;
//       }

//       st.push(val);

//       int temp = Math.min(val, min.peek());
//       min.push(temp);
//     }

//     public void pop() {
//       st.pop();
//       min.pop();
//     }

//     public int top() {
//       return st.peek();
//     }

//     public int getMin() {
//       return min.peek();
//     }
//   }
// }

import java.util.Stack;

public class MinStack {

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();

    //   Function calls
    s.push(3);
    s.push(5);
    // s.getMin();
    s.push(2);
    s.push(1);
    // s.getMin();
    s.pop();
    // s.getMin();
    s.pop();
    s.peek();
  }



 }


