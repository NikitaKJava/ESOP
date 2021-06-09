package at.aau.ESOP.AB8.Exercise1;
import java.util.Scanner;

/**
 * Created by Nikita on 18.05.2021 at 23:08
 */
class PersonTest{
    public static void main(String[] args){
        PersonTest test = new PersonTest();
        test.simplePersonTests();
    }

    public void simplePersonTests(){
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();
        for(int i = 0; i < numTests; i++){
            Person p = new Person();
            p.age = in.nextInt();
            p.name = in.next();
            System.out.println(String.format("%s is %d years old", p.name, p.age));
        }
    }

    static class Person{
        String name;
        int age;
    }
}