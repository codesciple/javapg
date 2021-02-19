public class Droid{

    int batteryLevel;
    String name;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
        return "Hello, I am the droid: "+ name;
    }

    public void performTask(String task){
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing: "+ task);
    }

    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Running");
        codey.performTask("Coding");

    }

}