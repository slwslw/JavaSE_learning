package Main_code.Extend_study_day2.Extends_03;

/*
接口的作用：制定规则
制定规则的两种方案：
1.定义类，类中书写抽象方法（不建议使用。 类只能单一继承）
2.定义接口， 接口中书写抽象方法（接口好处：可以多实现）

接口不能实例化（不能创建对象）
接口中没有构造方法（接口只能通过子类来实现对象创建）
*/
public interface Interface_01 {
    //接口中都是抽象方法
    public void name();
    public abstract boolean male(String name);

    //静态常量
    public static final int NUMBER = 10;
}
/*
接口和抽象类的相同之处：
1.都不能实例化（不能创建对象）
2.接口和抽象类，都具有抽象方法
3.接口和抽象类，都是做为父类型存在的

抽象类和接口的区别：
1.抽象类：除了抽象方法外，还具有成员变量、构造方法、非抽象方法
2.接口：除了抽象方法外，只有常量 （JDK8：默认方法、静态方法）（JDK9：私有方法）
* */