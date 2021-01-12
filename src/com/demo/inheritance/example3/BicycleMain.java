package com.demo.inheritance.example3;

public class BicycleMain {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(3,100,25);
        //do mountainBike + Bicycle functionality
        //Important!
        Bicycle bicycle = new Bicycle(5,50); // -> Has ONLY bicycle functionality
        MountainBike mb = new MountainBike(3,100,25); //-> Has bicycle + mountain bike features
        Bicycle anotherBicycle = new MountainBike(2,10,5); //-> Has ONLY bicycle features
        //And it is useful for polymorphism When bicycle can have many Forms.
        //Polymorphism works well when child class has the same name method
        anotherBicycle.commonBicycleBehavior();
        //but this calls parent class method
        bicycle.commonBicycleBehavior();
        boolean isBicycleIsABicycle = bicycle instanceof Bicycle;
        System.out.println("Bicycle is a Bicycle - " + isBicycleIsABicycle);
        boolean isMountainBikeABicycle = mb instanceof Bicycle;
        System.out.println("MountainBike is a Bicycle - " + isMountainBikeABicycle);
        boolean isAnotherBicycleABicycle = anotherBicycle instanceof Bicycle;
        System.out.println("anotherBicycle is a Bicycle - " + isAnotherBicycleABicycle);



        Bicycle bike = new MountainBike(1,2,3);
        //DownCasting, mbike can access Bicycle and MoutainBike
        //Requires type check and can Throw CLASS CAST EXCEPTION
        MountainBike mbike = (MountainBike) bike;

        //Upcasting not used
        MountainBike mountainBike1 = new MountainBike(1,2,3);
        Bicycle bicycle1 =  (Bicycle) mountainBike1;



    }
}
