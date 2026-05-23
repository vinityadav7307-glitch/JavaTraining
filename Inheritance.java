 class Animal {
    void eats(){
        System.out.println("Animal eats food");
    }
 }
 class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks.");
    }
 }
 class Puppy extends Dog{
    void cute(){
        System.out.println("Puppy is cute!");
    }
 }
 //hirerichal 
 class cat extends Animal{
    void meow(){
        System.out.println("Cats meow.");
    }
 }

 public class Inheritance{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eats();

        Puppy p1 = new Puppy();
        p1.cute();
        p1.bark();
    
        cat c1 = new cat();
        c1.meow();
        c1.eats();
    }
 }