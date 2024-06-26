public class test7 {
    public static void main(String[] args) {
        test7 t = new test7();

        int res = t.solution(2,91);

        System.out.println(res);
    }

    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);

        String res1 = a1 + b1;

        int ab = Integer.parseInt(res1);


        if(ab > 2*a*b){
            answer = ab;
        } else if (ab < 2*a*b) {
            answer = 2*a*b;
        }
        else {
            answer = ab;
        }


        return answer;
    }
}
