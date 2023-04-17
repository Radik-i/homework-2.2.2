public abstract class WheleedTransport implements Transport {
   private final String modelName;
   private final int wheelsCount;

   protected WheleedTransport(String modelName, int  wheelCount) {
      this.modelName = modelName;
      this.wheelsCount = wheelCount;
   }
   public String getModelName(){
      return modelName;
   }
   public int getWheelsCount(){
      return wheelsCount;
   }
   public void updateTyre() {
      System.out.println("Меняем покрышку");
   }
}
