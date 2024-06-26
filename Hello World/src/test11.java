public class test11 {
    public static void main(String[] args) {

        boolean[] included = {true, false, false, true, true};
        boolean[] included2 = {false, false, false, true, false, false, false};
        int r = solution(3,4,included);
        int r2 = solution(7,1,included2);

        System.out.println(r);
        System.out.println(r2);
    }


    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] ints = new int[included.length]; ;
        ints[0] = a;
        for (int i = 1; i < included.length; i++) {
            ints[i] = ints[i-1]+d;
        }

        for (int j = 0; j < included.length; j++) {
            if(included[j]==true) {
                answer += ints[j];
            }
        }
        return answer;
    }
}
