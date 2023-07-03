package day06;

public class personaAge {


    public void personcategory(int age){

        if (age >= 13 && age <= 19)
        {
            System.out.println("The given age belongs to 'teen' Category");
        }
        else if (age < 13)
        {
            System.out.println("The given age belongs to 'Kid' Category");
        }
        else
        {
            System.out.println("The given age belongs to 'adult' Category");
        }


    }



    public static void main(String args[]){
        personaAge obj =new personaAge();

        obj.personcategory(20);
        obj.personcategory(4);
        obj.personcategory(13);
        obj.personcategory(19);

    }


}
