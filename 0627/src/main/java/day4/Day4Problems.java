package day4;

import java.util.ArrayList;

public class Day4Problems {
    public int solution_181937(int num, int n) {
        int answer = 0;
        if(num % n == 0){
            answer = 1;
        }else if (num % n != 0){
            answer = 0;
        }
        return answer;
    }

    public String solution_181925(int[] numLog) {
        String answer = "";

        for(int i = 0; i < numLog.length-1; i++){
            if(numLog[i] - numLog[i+1] == -1 ){
                answer += "w";
            } else if (numLog[i] - numLog[i+1] == +1) {
                answer += "s";
            }else if (numLog[i] - numLog[i+1] == -10) {
                answer += "d";
            }else if (numLog[i] - numLog[i+1] == 10) {
                answer += "a";
            }
        }
        return answer;
    }
    public int[] solution_181924(int[] arr, int[][] queries) {
        int[] answer = {};

        int a =0;
        int b = 0;

        int i = 0;
        int j = 0;
        for(int k = 0; k < queries.length; k++){

           i = queries[k][0];// 1 0 = 1
           j = queries[k][1];// 1 1 = 2

           a= arr[i]; // a = 3
           b= arr[j];// a = 1

           arr[i] = b;
           arr[j] = a;
        }

        answer = arr;
        return answer;
    }

    public int[] solution_181923(int[] arr, int[][] queries) {

        int[] answer = {};
        for(int j = 0; j < queries.length; j++){
            int r =0;
            int s = queries[j][0]; // 0 0 = 0 , 1 0 = 0
            int e = queries[j][1]; // 0 1 = 4 , 1 1 = 3
            int k = queries[j][2]; // 0 2 = 2 , 1 2 = 2
            int[] a= new int[queries.length]; //(0-3)-1 = 2
            for(int i = s; i <= e; i++){ //0 <= i <= 4, 0 <= i <= 3 , 0 <= i <= 2
                if(i>k){ // 3 / 4 > 2 , 3 > 2 ,
                    if(r == 0) {
                        r = arr[i]; // 4
                        a[j] = r;
                    }else if(r>arr[i]){
                        r= arr[i];
                        a[j] = r;
                    }

                } else if (e-k==0) {
                    a[j] = -1;
                }
            }

            answer = a;
        }


        return answer;
    }
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for(String s :str_list){
            if(!s.contains(ex)){
                answer += s;
            }
        }
        return answer;
    }

}
