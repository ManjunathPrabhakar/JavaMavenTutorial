/**
 * @author Manjunath-PC
 * @created 25/07/2020
 * @project JavaTutorial_Day2
 */
public class LanguageFundamentals {

    public static void main(String[] args) {


        //Primitive DTs

        byte b = 5;
        short s = 3000;
        int i = 100000;
        long l = 892634525L;

        float f = 10.5f;
        double d = 7597.2452523d;

        //char

        char c = 'A';

        //boolean

        boolean b1 = true;

        //Wrapper Classes


        //Non Primitive Datatypes

        //Array Declaration
        int[] a;
        int[] a1;
        int a2[];

        //Array initilize
        int[] arr = new int[10]; //0 ... 9
        int[] zero = new int[0];

        // Array initilization with value
        int[] arrvalue = new int[]{1, 2, 3, 4, '5'};

        int firstindex = arrvalue[0];
        arrvalue[4] = 5;
        int arraysize = arrvalue.length;

        arrvalue = new int[10];

//        int row = 5;
//        int col = 5;

        int row, col;
        row = col = 5;

        int[][] matrix = new int[row][col];


        int ii = 10; //Priimitive Var
        Integer iii = new Integer(10); //Ref Var


    }
}
