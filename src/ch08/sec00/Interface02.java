package ch08.sec00;

public class Interface02 {
    public static void main(String[] args) {
        Cat02 cat02 = new Cat02();
        Tiger02 tiger02 = new Tiger02();
        GolfFish02 golfFish02 = new GolfFish02();

        Animal02 animal02;
        animal02 = cat02;
        animal02 = tiger02;
        animal02 = golfFish02;

        Pet02 pet02;
        pet02 = cat02;
        pet02 = golfFish02;
//    pet02 = tiger02 // X

        Aquatic02 aquatic02;
        aquatic02 = golfFish02;
    }

}

// @formatter:off
interface Pet02{}
interface Aquatic02{}
class Animal02 { }

class Cat02 extends Animal02 implements Pet02{ }

class GolfFish02 extends Animal02 implements Pet02,Aquatic02{ }

class Tiger02 extends Animal02{}




