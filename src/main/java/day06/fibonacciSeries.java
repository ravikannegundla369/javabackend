package day06;

public class fibonacciSeries {

    public void fibonaccinumbers(int number) {


        int a=0,b=1;
        System.out.println(a +" ");
        System.out.println(b +" ");
        for(int i=2;i<number;i++){

            int  nextnum =a+b;
            System.out.println(nextnum +" ");
            a=b;
            b=nextnum;
        }

    }

    public static void main(String args[]){
        fibonacciSeries obj =new fibonacciSeries();
        obj.fibonaccinumbers(10);

    }
    }
