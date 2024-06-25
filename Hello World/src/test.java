import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
        char [] res = a.toCharArray();

        System.out.println(Arrays.toString(res));

        for (char c : res) {
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }else{
                c = Character.toUpperCase(c);
            }
            System.out.print(c);
        }

    }
}
