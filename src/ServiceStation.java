public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("=============");
        transport.service();
        System.out.println("=============");
    }
    public void check(Car car){
        car.service();
    }

}
