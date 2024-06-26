public class test9 {
    public static void main(String[] args) {
        int r1 = solution("<","=",20,	50);
        System.out.println(r1);
    }
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">") && eq.equals("="))  {
            if(n >= m){
                answer = 1;
            }
        }else if (ineq.equals("<") && eq.equals("=")) {
            if(n <= m){
                answer = 1;
            }
        }else if (ineq.equals(">") && eq.equals("!")) {
            if(n > m){
                answer = 1;
            }
        }else if (ineq.equals("<") && eq.equals("!")) {
            if(n < m){
                answer = 1;
            }
        }
        return answer;
    }
}
