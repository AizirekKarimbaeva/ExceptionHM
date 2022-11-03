import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    try(Car car = new Car()){
        car.drive();
    } catch (Exception e) {
        System.out.println(e.getCause());
    } finally {
        System.out.println("Finish");
    }
    }
    }
