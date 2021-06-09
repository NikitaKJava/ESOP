package at.aau.ESOP.AB7.Exercise2;
import java.util.Scanner;

/**
 * Created by Nikita on 10.05.2021 at 17:45
 */
public class CharAtClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // TODO put your code here
        // #1
        System.out.println(input.charAt(0));
        // #2
        System.out.println(input.charAt(input.length() - 2));
        // #3
        if(input.length() > 0){
            if(input.charAt(input.length() - 1) == '?'){
                System.out.println("is a question");
            } else {
                System.out.println("is not a question");
            }
        }
        // #4
        if(input.length() > 0){
            int count = 0;
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == 'i'){
                    System.out.println(count);
                    break;
                }
                count++;
            }
        }
    }
}
