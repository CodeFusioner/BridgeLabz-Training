import java.util.*;
public class SameVowelCount{
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        int vcount = 0;
        int firstVcount = vCount(str[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(str[0] +" ");
        for(int i=1;i<str.length;i++){
            int count = vCount(str[i]);
            if(count == firstVcount){
                sb.append(reverse(str[i]) +" ");
            }else{
                sb.append(str[i]+" ");
            }
        }
        return sb.toString().trim();
    }
    public static int vCount(String s){
        int vcount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vcount++;
            }
        }
        return vcount;
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "cat and mice";
        System.out.println(reverseWords(s));
    }
}
