public class test12 {
    public static void main(String[] args) {
        int r = solution(2,6,1);
        int r2 = solution(5,3,3);
        int r3 = solution(4,4,4);
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && a!=c && b!=c){
            answer = a+b+c;
        }else if (a==b && b==c && c==a){
            answer = (a+b+c)*((int)Math.pow(a,2)+(int)Math.pow(c,2)+(int)Math.pow(b,2))*((int)Math.pow(a,3)+(int)Math.pow(c,3)+(int)Math.pow(b,3));
        } else if (a==b || b==c || a==c){
            answer = (a+b+c)*((int)Math.pow(a,2)+(int)Math.pow(c,2)+(int)Math.pow(b,2));
        }
        return answer;
    }
}
