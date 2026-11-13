abstract class Bank{
    abstract void money();
    void balance(){
        System.out.println("your balance is 1234");
    }
}
class Sbi extends Bank{
    void money(){
        System.out.println(" balance accepted");
    }
}
class Abstract2{
    public static void main(String[] args){
        Sbi s=new Sbi();
        s.money();
        s.balance();
    }
}