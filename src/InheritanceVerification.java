
abstract class Animal {
    void run() {
        System.out.println("Running");
    }

    abstract void bark();

}

 abstract class Dog extends Animal {

}

 class Puppy extends Dog {
    void play(){
        System.out.println("P p p ");
    }


     @Override
     void bark() {

     }
 }


public class InheritanceVerification {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.bark();
        Puppy puppy = new Puppy();
        puppy.play();
        puppy.run();
        puppy.bark();
    }
}
