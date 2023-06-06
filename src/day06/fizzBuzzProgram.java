package day06;

public class fizzBuzzProgram {

    public void printfizzbuzz(int number){

        for(int i=1;i<=number;i++)
        {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

        }


    }

    public static void main(String args[]){
        fizzBuzzProgram obj =new fizzBuzzProgram();
        obj.printfizzbuzz(100);

    }

}
