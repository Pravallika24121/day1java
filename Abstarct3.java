
abstract class Animal {
    String color;
    Animal() {
        color = "White";
    }
    abstract void sounds();
    void color() {
        System.out.println("Animal color: " + color);
    }
}
class Dog extends Animal {
    Dog() {
        color = "Black";
    }
    void sounds() {
        System.out.println("Dog barks");
    }
    void behaviour() {
        System.out.println("Dog is a loyal animal");
    }
}
class Abstarct3{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sounds();
        d.behaviour();
        d.color();
    }
}
