package at.aau.ESOP.AB4.Exercise8;

/**
 * Created by Nikita on 07.04.2021 at 13:49
 */
public class Exercise {

    public static void main(String[] args) {

        char[] word1 = { 'H', 'e', 'l', 'l', 'o', ',', ' ' };

        char[] word2 = { '!', 'd', 'l', 'r', 'o', 'W' };

        char[] result;

        // TODO Put your code here
        result = new char[word1.length + word2.length];
        int length = word2.length - 1;

        for(int i = 0; i < word1.length + word2.length; i++) {

            if(i < word1.length ){      // 7 chars
                result[i] = word1[i];
            }

            if(i >= word1.length){          // 7 -13 chars
                result[i] = word2[length];
                length--;
            }
        }


        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

}
