package at.aau.ESOP.AB5.Exercise1;

/**
 * Created by Nikita on 21.04.2021 at 18:09
 */
public class Exercise {

    public static void main(String[] args) {

        // input parameters
        int in = 17;
        int number1 = 4;
        int number2 = 3;
        String inputString = "A little String";


        // TODO: put your method calls here
        myFirstMethod();
        mySecondMethod(in);
        myThirdMethod(inputString);
        myFourthMethod(number1, number2);

    }

    // Method structure
//    static_keyword returnType name(DataType NameInputParam1, DataType NameInputParam2){
        //implements
        // return
//    }

    // Define your four static methods here.
    static void myFirstMethod(){
        System.out.println("First");
    }
    static void mySecondMethod(int input){
        System.out.println("Second " + input);
    }
    static void myThirdMethod(String input){
        System.out.println(input);
    }
    static void myFourthMethod(int summand1, int summand2){
        System.out.println(summand1 + summand2);
    }
}


