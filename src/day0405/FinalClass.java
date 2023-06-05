package day0405;

public class FinalClass  {

    private final int finalVar = 2;

    final void finalMethod() {
        System.out.println("This is a final method in the Final Class");
    }

    public static void main(String args[]){
        System.out.println("This is a main method in the Final Class");
        FinalClass obj=new FinalClass();
        obj.finalMethod();

        System.out.println(obj.finalVar);

    }

}
