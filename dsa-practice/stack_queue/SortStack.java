package stack_queue;

import java.util.Stack;

class SortStack {

    static void sortStack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            sortStack(st);
            insertSorted(st, x);
        }
    }

    static void insertSorted(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insertSorted(st, x);
        st.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(30);
        st.push(10);
        st.push(50);
        st.push(20);

        System.out.println("Before Sorting: " + st);

        SortStack.sortStack(st);

        System.out.println("After Sorting: " + st);
    }
}
