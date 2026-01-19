package review;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    Queue<Integer> q = new LinkedList<>();
    public void add(int num){
        int size = q.size();
        q.add(num);
        for(int i=0;i<size;i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        if(q.isEmpty()){
            System.out.println("Queue is Empty");
        }
        return q.poll();
    }
    public int size(){
        return q.size();
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println(st.pop());
    }
}
