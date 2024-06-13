package Main_code.Extend_study.Extends_02;

public abstract class Grandfather {
    private String doing;

    public String getDoing() {
        return doing;
    }

    public void setDoing(String doing) {
        this.doing = doing;
    }

    /*  抽象类，不能实例化（不能创建对象）
        疑问：既然不能创建对象了，为什么还要有构造方法？
        抽象类通常是用于父类，创建子类对象时，需要先初始化父类（抽象方法中构造方法的作用就是用于父类初始化使用）*/
    public abstract void method();
}

/*
模板设计模式：

模板：就一个固定的格式
模板设计：把确定的内容，提前准备好，把不确定的内容，定义为抽象方法（由子类重写）*/
