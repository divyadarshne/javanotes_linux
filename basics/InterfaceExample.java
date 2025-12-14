
interface Animal {
   
    void makeSound();
    
    void eat();
}


class Dog implements Animal {
    
    public void makeSound() {
        System.out.println("bark");
    }

    
    public void eat() {
        System.out.println("bone");
    }
}

class Cat implements Animal {
    
    public void makeSound() {
        System.out.println("Meow");
    }

    
    public void eat() {
        System.out.println("fish");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();       

        cat.makeSound(); 
        cat.eat();       
    }
}

