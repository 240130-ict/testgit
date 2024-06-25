import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
        String str = sc.next();

        int len = str.length();
        System.out.printf("문자열 개수는 : %d 입니다.\n",len);
        checkEvenOdd(len);
    }

    public static void checkEvenOdd(int num){
        if(num % 2 == 0){
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
    }
}