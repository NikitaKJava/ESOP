package at.aau.ESOP.AB7.Exercise1;

/**
 * Created by Nikita on 05.05.2021 at 08:42
 */
public class Exercise {
    public static void main(String[] args) {


        String[] words = {"boolean", "", "byte", "case", "char", "class", "default", "do", "double"};
        System.out.println(longestString(words));
//        System.out.println(words[0].length());
    }

    static String longestString(String[] words){
        if(words == null || words.length == 0){
            return "";
        }
        int max = words[0].length();

        int k = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > max){
                max = words[i].length();
                k = i;
            }
        }
        return words[k];
    }


}
