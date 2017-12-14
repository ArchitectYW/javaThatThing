package basicStructAndRef;

public class TestRef {
	
/*
 *   Java中一共有四类八种基本数据类型
 *   
 *   整型：     byte short int long
 *   浮点型： double  float
 *   字符型 ： char
 *   逻辑型： boolean
 *   
 *   
 *   方法体里声明的基本数据类型在栈内存里，
 *   对于基本数据类型来说，赋值（=号）就相当于拷贝了一份值
 */
	
    public static void main(String[] args) {
        int int1 = 100;//声明了一个基本数据类型并赋值
        int int2 = int1;//声明int2,并赋值为int1 
        int1 = 500;//int1赋值为500
        System.out.println("打印int1的值：" + int1);
        System.out.println("打印int2的值：" + int2);
        
		int[] arr1 = new int[]{1,2,3,4,5};//声明一个数组并赋值
		int[] arr2 = arr1;//声明arr2,并赋值为arr1
		arr1[3] = 8;//修改数组下标为3
        System.out.println("打印arr1[3]的值：" + arr1[3]);
        System.out.println("打印arr2[3]的值：" + arr2[3]);
        
		Person per1 = new Person("张三",21);//声明一个对象并赋值
        Person per2 = per1;//声明per2,并赋值为per1
        per1.setName("李四");
        per1.setAge(35);
        System.out.println("打印per1.getName()：" + per1.getName());
        System.out.println("打印per1.getAge() ：" + per1.getAge());
        System.out.println("打印per2.getName()：" + per2.getName());
        System.out.println("打印per2.getAge() ：" + per2.getAge());
        
    }
}


