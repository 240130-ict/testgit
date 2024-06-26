public class test3 {

    public static void main(String[] args) {
        String s = solution("He11oWor1d","lloWorl",2);
        String s2 = solution("Program29b8UYP","merS123",	7);
        System.out.println(s);
        System.out.println(s2);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0, s);
        answer += overwrite_string ;
        answer += my_string.substring(s+overwrite_string.length());

        return answer;
    }

}
