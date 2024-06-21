package Main_code.Duotai_API_day3.Test2;

public class Cat extends Animal {
    public int s = 10;
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
