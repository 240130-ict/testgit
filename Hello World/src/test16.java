public class test16 {
    public static void main(String[] args) {

    }

    public static int solution(int a, int b) {
        int answer = 0;

        if (a%2 != 0 && b%2 != 0){
            answer = (int)Math.pow(a,2)+(int)Math.pow(b,2);
        }else if(a%2 == 0 & b%2 == 0){
            answer = (int)Math.abs(a-b);
        }else{
            answer = 2*(a+b);
        }

        return answer;
    }
}
