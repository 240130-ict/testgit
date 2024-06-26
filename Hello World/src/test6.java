class test6 {
    public static void main(String[] args) {
        test6 t = new test6();

        int res = t.solution(9,91);

        System.out.println(res);

    }

    public int solution(int a, int b) {
        int answer = 0;

        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);

        String res1 = a1 + b1;
        String res2 = b1 + a1;

        int ab = Integer.parseInt(res1);
        int ba = Integer.parseInt(res2);


        if(ab > ba){
            answer = ab;

        } else if (ba > ab) {
            answer = ba;
        }else{
            answer = ab;
        }



        return answer;
    }
}
