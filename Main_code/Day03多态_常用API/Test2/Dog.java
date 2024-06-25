package Main_code.Day03多态_常用API.Test2;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头!");
    }

    public void lookDoor(){
        System.out.println("狗看门...");
    }
}