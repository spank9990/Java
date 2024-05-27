class Vehicle {
    void display(){
        System.out.println("all vehicle are usable ");
    }
}
class car extends Vehicle {
    void caR(){
        System.out.println("car in vehicle category");
    }
}
class bike extends Vehicle{
    void bikE(){
        System.out.println("bike is also belong to vehicle category");
    }
}
class inhehierarchical {
    public static void main (String args []){
        car a = new car();
        a.display();
        a.caR();
        // a.bikE();
    }
}
