class Sensor{
    String name;
    int batterylevel;
    
    void charge(){
     batterylevel = 100;
     System.out.println("Sensor Full charged");
    }
}

public class Main{
     public static void main(String[] args){
         Sensor sensor = new Sensor();
          
          sensor.name = "Tempeperature sensor";
          sensor.batterylevel = 25;
          
          sensor.charge();
          System.out.println("Battery Level: " + sensor.batterylevel);
     }
}
