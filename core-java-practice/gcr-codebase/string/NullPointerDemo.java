public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            genEx();
        } catch (NullPointerException e) {
            System.out.println("Caught from genEx(): " + e.getMessage());
        }
        handleEx();
    }
    public static void genEx() {
        String s = null;
        int l = s.length(); 
    }
    public static void handleEx() {
        String s = null;
        try {
            int l = s.length();
        } catch (NullPointerException e) {
            System.out.println("Handled in handleEx()");
        }
    }
}