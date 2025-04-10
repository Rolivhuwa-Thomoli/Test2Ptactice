class MyClass{
    private int dataMember = 0;
    public int getDataMember(){
        return dataMember;
    }
}
public class Main {
    public static void main(String[] args){

        MyClass obj = new MyClass();
        System.out.println("datamember is " + obj.getDataMember());
    }
}
