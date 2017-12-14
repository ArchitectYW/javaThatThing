package autobox;
/**
 * Created by Administrator on 2017/6/21 0021.
 */
public class TestBox2 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);        //打印int能表示的最大值
		System.out.println(Integer.MIN_VALUE);       //打印int能表示的最小值
		System.out.println(Integer.max(12, 13));     //找出传入参数的大的一个值
		System.out.println(Integer.min(12, 13));     //找出传入参数的h的一个值
		System.out.println(Integer.sum(12, 13));     //求两个参数的和
		System.out.println(Integer.valueOf("123"));  //转换字符串为Integer类型
		System.out.println(Integer.compare(12, 54)); //比较参数大小，返回-1，代表第1个参数小于第二个参数
		/**
		 * 这种方式是可以写的，因为会在编译是解包处理后比较值(new Integer(180)).intValue() < (new Integer(180)).intValue()
		 */
		System.out.println(new Integer(180) < new Integer(180));   
		System.out.println(new Integer(180).equals(new Integer(180))); //比较是否相等推荐写法equals。
		System.out.println(new Integer(180) == (new Integer(180))); 
		
	}	

}
