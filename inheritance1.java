class Vehicle {
    void vehicleDriver()
    {
        System.out.println("all vehicle can drive person.......");
    }
}
class Car extends Vehicle {
    void drive()
    {
        System.out.println("Repairing a car..........");
    }
}
class i10 extends Car {
    void driver()
    {
        System.out.println("driver can drive i10");
    }
}
class inheritance1{
    public static void main (String args[]){
       i10 a = new i10();
       a.vehicleDriver();
       a.drive();
       a.driver(); 
    }
}
