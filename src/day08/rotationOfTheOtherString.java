package day08;

public class rotationOfTheOtherString {

    public  boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String str3 = str1 + str1;


            return str3.contains(str2);

    }




    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        rotationOfTheOtherString obj= new rotationOfTheOtherString();

        if (obj.isRotation(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



