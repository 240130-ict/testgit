public class test17 {
    public static void main(String[] args) {
        String [] str_list = {"abc", "def", "ghi"};
        String r = solution(str_list,"ef");
        System.out.println(r);
    }

    public static String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {

            for (int j = 0; j < str_list[i].length()-1; j++) {
                if(str_list[i].substring(j, j+ex.length())!=ex){

                }
            }
        }




        return answer;
    }
}
