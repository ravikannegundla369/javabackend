package day04_05;

public class InterfaceClass  implements  Interface1,Interface2{



    @Override
    public void samplemethod1() {
        System.out.println("samplemethod1 1 implementation");
    }

    @Override
    public void samplemethod2() {
        System.out.println("samplemethod1 2 implementation");
    }

        public static void main(String args[]){
            InterfaceClass obj = new InterfaceClass();
            obj.samplemethod1();
            obj.samplemethod2();
        }
    }



