  class adta extends department{

    @Override
    int getDepartmentSize(){
        return 10;
    }

    public static void main(String args[]){
        department obj = new adta();
        int n=obj.getDepartmentSize();
        System.out.println(n);
    }
}
