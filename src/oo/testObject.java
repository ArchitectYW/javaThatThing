package oo;


public class testObject {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Monkey("小猴");//小猴1以Animal的形态出现
		Animal animal2 = new Person("张三", "男", 21);// 张三以Animal的形态出现
		
		Primat primat = new Person("李四", "男", 22);// person2以Primat的形态出现
		Person person3 = new Person("王小花", "女", 18);// person3以Person的形态出现
		Person person4 = new Person("王五", "男", 26);// person3以Person的形态出现
		
		animal1.eat();// 以Animal的形态出现，只能调用Animal里的eat()方法，该方法虽然什么也没写，但能打印出我们期望的结果。
		animal2.eat();// 以Animal的形态出现，只能调用Animal里的eat()方法，该方法虽然什么也没写，但能打印出我们期望的结果。
//		person1.move();// 报错，编译不过，以Animal形态出现时只能调用Animal里的方法;
		//person1.getAge();//报错，编译不过，以Animal形态出现时只能调用Animal里的方法;
		primat.eat();//以Primat的形态出现，由于继承了Animal类，可以调用Animal类里的eat()方法
		primat.move();//以Primat的形态出现,可以调用自身的move()方法。
		//person2.getAge();//报错，编译不过，以Primat形态出现时只能调用Primat里及其父类的方法。
		
		person3.eat();//以Person类的形态出现，可以调用继承的方法。
		person3.move();//以Person类的形态出现，可以调用继承的方法。
		person3.printAge();//以Person类的形态出现，调用自身方法。
		person4.printAge();//以Person类的形态出现，调用自身方法。
		
		((Person)animal2).printAge();//把Animal形态强制转型成Person形态,可以调用Person里的方法
		
		
	}
	
	
}


