public class test13 {
    public int solution(int[] num_list) {
        String r1 = "";
        String r2 = "";

        for(int i=0;i<num_list.length;i++){
            if(num_list[i] % 2 != 0){
                r1 += Integer.toString(num_list[i]);
            }else{
                r2 += Integer.toString(num_list[i]);
            }
        }


        return Integer.parseInt(r1)+Integer.parseInt(r2);
    }
}
