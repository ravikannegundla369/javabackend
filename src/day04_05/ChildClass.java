package day04_05;

public class ChildClass extends ConstructorOverloading {
    private int childVariable;

    public ChildClass(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public ChildClass(int childVariable) {
        super(0);
        this.childVariable = childVariable;
    }

    public static void main(String args[]){

    }


}
