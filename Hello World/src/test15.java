public class test15 {
    public static void main(String[] args) {

    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        int r1 = num_list[num_list.length - 1];
        int r2 = num_list[num_list.length - 2];
        for (int i = 0; i < num_list.length;i++){
            answer[i] = num_list[i];
        }
        if (r1 > r2) {

            answer[num_list.length+1] = r1 - r2;
        } else {
            answer[num_list.length+1] = r2 - r1;
        }
        return answer;

    }
}
