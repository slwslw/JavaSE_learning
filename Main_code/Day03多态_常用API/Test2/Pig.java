package Main_code.Day03多态_常用API.Test2;

public class Pig extends Animal {
    public Pig() {
    }

    public Pig(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void eat() {
        System.out.println("猪拱白菜...");
    }

    public void sleep() {
        System.out.println("一直再睡...");
    }
}
