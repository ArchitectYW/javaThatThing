

/**
 * Created by Administrator on 2017/6/21 0021.
 */
public class TestString5 {
    public static void main(String[] args) {
        String str = new String("abc");
        String str2 = new String("abc");

        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(2,3));
        System.out.println(str.equals(str2));
    }
}
