

/**
 * Created by Administrator on 2017/6/21 0021.
 */
public class TestString {
	
	public static void main(String[] args) {
        String s1 = "100";
        String s2 = "100";
        System.out.println(s1 == s2);
        
        String s3 = new String("100");
        String s4 = new String("100");
        System.out.println(s3 == s4);
        
//      System.out.println("s3.equals(s4)：" + s3.equals(s4));正确的比较方法是equlas
    }
    
}
