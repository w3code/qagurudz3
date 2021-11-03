public class Airplane {
    String airplaneName;
    String airplaneModel;
    double airplaneLength;
    double airplaneWingspan;
    int airplaneFuelCapacity;
    int airplaneTakeoffWeight;
    int airplaneRange;

    Airplane(String airplaneName, String airplaneModel, double airplaneLength, double airplaneWingspan, int airplaneFuelCapacity, int airplaneTakeoffWeight, int airplaneRange) {
        this.airplaneName = airplaneName;
        this.airplaneModel = airplaneModel;
        this.airplaneLength = airplaneLength;
        this.airplaneWingspan = airplaneWingspan;
        this.airplaneFuelCapacity = airplaneFuelCapacity;
        this.airplaneTakeoffWeight = airplaneTakeoffWeight;
        this.airplaneRange = airplaneRange;
    }

    void printTechnicalCharacteristics(){
        System.out.println(airplaneName + " " + airplaneModel + " technical characteristics:");
        System.out.println("Airplane length: " + airplaneLength + " m");
        System.out.println("Airplane wingspan: " + airplaneWingspan + " m");
        System.out.println("Airplane fuel capacity: " + airplaneFuelCapacity + " L");
        System.out.println("Airplane takeoff weight: " + airplaneTakeoffWeight + " kg");
        System.out.println("Airplane range: " + airplaneRange + " km");
    }






}
