public class test8 {
    public static void main(String[] args) {
        int r1 = solution(7);
        int r2 = solution(10);
        System.out.println(r1);
        System.out.println(r2);
    }

    public static int solution(int n) {
        int answer = 0;
        if(n%2!=0){
            for(int i=n;i>0;i--){
                if(i%2!=0){
                    answer += i;
                }
            }
        }else{
            for(int i=n;i>0;i--){
                if(i%2==0){
                    answer += i*i;
                }
            }
        }
        return answer;
    }
}
