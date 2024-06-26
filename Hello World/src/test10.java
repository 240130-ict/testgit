public class test10 {
    public static void main(String[] args) {
        String r = solution("abc1abc1abc");
        System.out.println(r);
        String r2 = solution("a1b1c1d1e1");
        System.out.println(r2);
    }

    public static String solution(String code) {
        String ret = "";
        int mode = 0;
        char[] codes = code.toCharArray();
        for (int i = 0; i < codes.length; i++) {
            if(mode == 0){
                if(codes[i] != '1'){
                    if(i % 2 == 0){
                        ret += codes[i];
                    }
                }else{
                    mode = 1;
                }
            }else{
                if(codes[i] != '1'){
                    if(i % 2 != 0){
                        ret += codes[i];
                    }
                }else{
                    mode = 0;
                }
            }
        }

        if(ret.equals("")){ret = "EMPTY";}

        return ret;
    }

}
