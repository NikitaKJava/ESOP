package at.aau.ESOP.AB9.Exercise1;
import java.util.Scanner;

/**
 * Created by Nikita on 26.05.2021 at 17:40
 */

public class CarTest {

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        ct.testNewCar();
        ct.testOldCar();
    }

    private void testNewCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<carName>");
        Car car = new Car(sc.nextLine());
        System.out.println(car.getName());
        System.out.println(car.getLicense());
        System.out.println(car.isRegistered());
    }

    private void testOldCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<carName>");
        System.out.println("<licenseNumber>");
        Car car = new Car(sc.nextLine(), sc.nextLine());
        System.out.println(car.getName());
        System.out.println(car.getLicense());
        System.out.println(car.isRegistered());
    }
    static class Car {

        String name;
        String license;

        public Car(String name){
            this.name = name;
            this.license = "";
        }

        public Car(String name, String license){
            this.name = name;
            this.license = license;
        }

        public boolean isRegistered(){

            if(getLicense().equals("")){
                return false;
            }
            return true;
        }


        public String getLicense() {
            return license;
        }

        public String getName() {
            return name;
        }
    }
}

