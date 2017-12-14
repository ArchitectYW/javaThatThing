
public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 100;  // Integer i3 = Integer.valueOf(100); 这其实是装箱的过程
		Integer i2 = 100;
		
//		这个加上valueOf方法的过程，就是Java中经常说的装箱过程。
		System.out.println(i1==i2);
		
		Integer i3 = 1000;
		Integer i4 = 1000;
		
		System.out.println(i3==i4);
		
		
		Integer i5 = Integer.valueOf(100);//

		System.out.println(i1==i5);
		
		
		Integer i6 = new Integer(100);
		Integer i7 = new Integer(100);

		System.out.println(i6==i7);
		
		System.out.println(i6.equals(i7));
		
//		 public boolean equals(Object obj) {
//        if (obj instanceof Integer) {
//            return value == ((Integer)obj).intValue();
//        }
//        return false;
//    }
		
		
	}

}
