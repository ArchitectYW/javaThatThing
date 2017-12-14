package autobox;
public class TestBox {
    public static void main(String[] args) {
        Integer integer1 = 100;   //声明变量为Integer对象类型，并赋值为基本数据类型
        int int1 = integer1;      //声明变量为int值类型，并赋值为对象类型

        Long long1 = 100L;		  //声明变量为Long对象类型，并赋值为基本数据类型
        long l1 = long1;          //声明变量为long值类型，并赋值为对象类型

        Boolean aBoolean = true;  //声明变量为Boolean对象类型，并赋值为基本数据类型
        boolean bool = aBoolean;  //声明变量为boolean值类型，并赋值为对象类型
    }
}
