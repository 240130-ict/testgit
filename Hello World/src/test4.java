class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = sol.solution("aceg","bdfh");
        System.out.println(s);
    }

    public String solution(String str1, String str2) {
        char[] res1 = str1.toCharArray();
        char[] res2 = str2.toCharArray();
        String answer = "";
        int j = 0;
        int k = 0;
        for (int i=1; i<str1.length()+ str2.length()+1; i++){
            if(i % 2 == 0){
                answer = answer + res2[j];
                j++;
            }
            else{
                answer = answer + res1[k];
                k++;
            }
        }

        return answer;
    }
}