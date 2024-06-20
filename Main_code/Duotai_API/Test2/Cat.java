package Main_code.Duotai_API.Test2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String breed, String color) {
        super(breed, color);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
        System.out.println("抓老鼠...");
    }
}
