package arrays;

public class Array2 {

	public static void main(String[] args) {
        char[][] x = new char[][]{{'a', 'b', 'c'}, {'c', 'd', 'e'}, {'f', 'g', 'h', 'i'}};
        char[][] y = new char[][]{{'1', '2', '3'}, {'3', '4', '5'}, {'7', '8', '9', 'a'}};
        char[][] z = new char[2][3];
        z[0][0] = 97;
        z[0][1] = 98;
        z[0][2] = 49;
        z[1][0] = 50;
        z[1][1] = 51;
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
    }

}