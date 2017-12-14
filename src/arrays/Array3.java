package arrays;

public class Array3 {

	public static void main(String[] args) {
		char[] charArr = {'a','b','c'};    //声明数组的第一种写法
        char[] charArr2 = charArr;
        charArr[1] = 'x';
        
        System.out.println(charArr2);
    }

}