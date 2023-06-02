public class Student
{

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String args[]){
        Student std =new Student();
      std.setName("ravi kannegundla");
        System.out.println(std.getName());

    }






}
