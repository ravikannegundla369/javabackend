package day06;
public class reverseOfTheNumber {

    public int reverseNo(int num)
    {
    int n=num;
    int revNumber=0;

    while(n !=0)
    {
        int a =n%10;
        revNumber= revNumber*10 +a ;
        n=n/10;

    }
        return revNumber;
    }

    public static void main(String args[]){
        reverseOfTheNumber obj =new reverseOfTheNumber();

        System.out.println(obj.reverseNo(100));
        System.out.println(obj.reverseNo(123456));
        System.out.println(obj.reverseNo(0));

    }



}








