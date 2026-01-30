import java.util.Scanner;

public class FlipKeyAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key it must be at least 6 characters long: ");
        String key = sc.next();
        String flippedKey = flipKey(key);
        System.out.println(flippedKey);

    }
    public static String flipKey(String key){
        if(key == null || key.length() < 6){
            return "";
        }
        if(key.chars().allMatch(Character::isDigit) || key.chars().allMatch(Character::isSpaceChar)){
            return "";
        }

        String input = key.toLowerCase();
        StringBuilder res = new StringBuilder();

        for(char ch: input.toCharArray()){
            int ascii = (int) ch;
            if(ascii % 2 != 0){
                res.append(ch);
            }
        }
        res.reverse();
        for(int i=0;i<res.length();i++){
            if(i%2 ==0){
                res.setCharAt(i, Character.toUpperCase(res.charAt(i)));
            }
        }
        return res.toString();
    }
}
