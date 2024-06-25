public class test3 {

    public static void main(String[] args) {
        test3 t = new test3();
        String s = t.solution("He11oWor1d","lloWorl",2);
        System.out.println(s);
    }

    public String solution(String my_string, String overwrite_string, int s) {
        char[] res1 = my_string.toCharArray();
        char[] res2 = overwrite_string.toCharArray();
        String answer = "";

        for(int i = 0; i < res1.length; i++){

            if(i<=s-1 || i==res1.length-1){
                answer = answer + res1[i];
            } else if (s-1 < i && i<res1.length-1) {
                answer = answer + res2[i];
            }
        }

        return answer;
    }

}
