public class vehicleInheritanceHierarchy 
{
    public static class Vehicle
    {
        protected String make, model;
        protected int year;

        public Vehicle(String make, String model,int year)
        {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayInfo()
        {
            System.out.println("Vehicle Information\nMake: " + this.make + "\nModel: "+this.model+"\nYear: "+this.year);
        }

    }

    public static class Car extends Vehicle
    {
        private String fuelType;
        
        public Car(String make, String model, int year, String fuelType)
        {
            ////TOD: what the fuck is a super()?
            super(make,model,year);
            this.fuelType = fuelType;
        }

        public void startEngine()
        {
            if(fuelType == "Diesel")
            {
                System.out.println("Car fuel Type is "+fuelType+"\nCar engine is starting.\n");
            }

        }
    }

    public static class Bicycle extends Vehicle
    {
        private int numberOfGears;

        public Bicycle(String make, String model, int year, int numberOfGears)
        {
            super(make,model,year);
            this.numberOfGears = numberOfGears;
        }

        public void ride()
        {
            System.out.println("Bicycle is in gear " + numberOfGears);
            System.out.println("Riding the bicycle\n");
        }
    }

    public static class Boat extends Vehicle
    {
        private String waterType;

        public Boat(String make, String model, int year, String waterType)
        {
            super(make,model,year);
            this.waterType = waterType;
        }

        public void sail()
        {
            System.out.println("Sailing the boat\nCurrently sailing on "+waterType);
        }
    }

    public static void main(String[] args)
    {
        Car c = new Car("Ford","Shelby",1969,"Diesel");
        Bicycle b = new Bicycle("Tesla", "Y", 2015,2);
        Boat boat = new Boat("Boat", "Water", 2023, "Water");

        c.displayInfo();
        c.startEngine();
        b.displayInfo();
        b.ride();
        boat.displayInfo();
        boat.sail();
    }
}
