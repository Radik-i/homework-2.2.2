public abstract class MotorTransport extends WheleedTransport {

    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
public void checkEngine() {
        System.out.println("Проверяем двигатель");
}
}
