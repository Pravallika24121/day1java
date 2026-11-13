abstract class Parent{
    abstract void loan();
    void printing(){
        System.out.println("welcome to rbi");
    }
}
class Child extends Parent{
    void loan(){
        System.out.println("loan accepted");
    }
}
class Abstact{
    public static void main(String[] args){
        Child ch=new Child();
        ch.loan();
        ch.printing();
    }
}