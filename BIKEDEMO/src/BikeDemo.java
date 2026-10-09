public class BikeDemo {
    
    public static void main(String[] args) {
        Bike mountaineBike1 = new Bike();
        Bike mountaineBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountaineBike1.setBrand("Trek");
        mountaineBike1.speedAcceleration(10);
        mountaineBike1.gearChanges(2);
        mountaineBike1.printInfo();

        mountaineBike2.setBrand("Giant");
        mountaineBike2.speedAcceleration(20);
        mountaineBike2.gearChanges(3);  
        mountaineBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);     
        roadBike1.speedAcceleration(5);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
        
    }
}

