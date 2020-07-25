/**
 * @author Manjunath-PC
 * @created 25/07/2020
 * @project JavaTutorial_Day2
 */
public class Vars {

    String s = "str";
    static String s1 = "static";

}

class demo{

    public static void main(String[] args) {
        String s = "local";
        Vars v1 = new Vars();

        String ss = v1.s;
    }
}
