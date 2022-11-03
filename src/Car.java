public class Car implements AutoCloseable{
    public void drive(){
        System.out.println("Car running");
    }

    @Override
    public void close() throws Exception {
        System.out.println("The car will close");
    }

}
