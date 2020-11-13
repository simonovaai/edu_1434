/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/
public class Main{
    public static void main(String[] args) {
        Horse mustang = new Horse(true, "Игого", (byte) 4,
                "Рысак", "Белый");
        Pegasus ares = new Pegasus(true, "игого", (byte) 4,
                "Рысак", "Белый");
        mustang.run();
        ares.fly();
    }
}

abstract class Animal {
    boolean vegetarian;
    String speak;
    byte paws;

    Animal(boolean veg, String speak, byte paws){
        this.vegetarian = veg;
        this.speak = speak;
        this.paws = paws;
    }
    boolean getVegetarian() { return this.vegetarian; }
    String getSpeak() { return this.speak; }
    byte getPaws() { return this.paws; }
}

class Horse extends Animal{
    String breed;
    String color;

    Horse(boolean veg, String speak, byte paws, String breed, String color){
        super(veg, speak, paws);
        this.breed = breed;
        this.color = color;
    }

    void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}

class Pegasus extends Horse{
    Pegasus(boolean veg, String speak, byte paws, String breed, String color){
        super(veg, speak, paws, breed, color);
    }
    void fly(){
        System.out.println("Игого, я полетел(а)");
    }
}
