package day04_05;

public class StaticClass {

    private static int staticVar;

    static {
        staticVar = initStaticVar();
    }

    public static int initStaticVar() {
         return 100;
    }


    public static void main(String args[]){
        System.out.println(staticVar);
    }


}
