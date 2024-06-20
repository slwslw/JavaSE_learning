package Main_code.Duotai_API.Test2;

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
