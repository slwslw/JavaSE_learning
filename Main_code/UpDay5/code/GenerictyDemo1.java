package Main_code.UpDay5.code;

class Myclass<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}

class Person<H> {
    // 定义属性表达爱好
    private H hobby;

    public H getHobby() {
        return hobby;
    }

    public void setHobby(H hobby) {
        this.hobby = hobby;
    }
}

class Swim {
}

class PingPang {
}

class BasketBall {
}

class GenerictyDemo1 {
    public static void main(String[] args) {
        Myclass<String> mc = new Myclass<>();
        mc.setObj("黑马");
        System.out.println(mc.getObj());

        /*
    需求 : 定义一个人类，定义一个属性表示爱好，但是具体爱好是什么不清楚，可能是游泳，乒乓，篮球。
 */
        Person<BasketBall> person = new Person<>();
        person.setHobby(new BasketBall());

        Person<Swim> person2 = new Person<>();
        person2.setHobby(new Swim());

        Person person3 = new Person<>();// 如果没有指定泛型 , 那么默认使用Object数据类型
    }
}
