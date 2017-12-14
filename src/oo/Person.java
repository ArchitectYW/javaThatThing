package oo;

public class Person implements Primat{
	//添加了name，sex，示加private修饰，同包类能访问
	String name;
	String sex;
	//年龄这个属性用了private来修饰，外部类看不到，这就是封装
	private Integer age;
	
	public Person(String name, String sex, Integer age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public boolean isSame(Person person){
		//如果名字相同返回true,其它情况返回false
		if(this.name.equals(person.name)){
			return true;
		}
		return false;
	}

	@Override
	public void eat() {//已经有了具体的行为，需要实现该行为
		System.out.println(name + "拿起碗开始吃饭");
	}

	@Override
	public void move() {//已经有了具体的行为，需要实现该行为
		System.out.println(name + "站起来走路");
	}
	/*
	 * 由于年龄这个属性我们已经加了private,外面的类访问不到，但我们可以提供一个public的方法让外部访问
	 * 这个方法我们内部进行了处理，不让对方看到我们女同志的年龄
	 */
	public void printAge(){
		if(isLady(sex)){//isLady这个方法是private的，外界访问不到，但我们内部是可以访问的
			System.out.println(name + "女士的年龄可是秘密，不告诉你");
			return;
		}
		System.out.println(name + age + "岁了");
	}
	
	//这个方法是private的，外界访问不到，这就是封装
	private boolean isLady(String sex2) {
		if(sex.equals("女")){
			return true;
		}
		return false;
	}
	
}
