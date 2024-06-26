public class test14 {
    public static void main(String[] args) {
        int r = solution(0,"wsdawsdassw");
        System.out.println(r);
    }

    public static int solution(int n, String control) {

        for(int i=0;i<control.length();i++){

            if(control.substring(i,i+1).equals("w")){
                n += 1;
            }else if(control.substring(i,i+1).equals("s")){
                n -= 1;
            }else if(control.substring(i,i+1).equals("d")){
                n += 10;
            }else if(control.substring(i,i+1).equals("a")){
                n -= 10;
            }
        }


        return n;
    }
}

