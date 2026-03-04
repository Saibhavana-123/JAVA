 //Grandparent Class
class Grandparent {

    Grandparent() {
        System.out.println("Grandparent Constructor");
    }

    void displayGrandparentInfo() {
        System.out.println("This is the Grandparent class.");
    }
}

// Parent class (inherits from Grandparent)
class Parent extends Grandparent {

    Parent() {
        System.out.println("Parent Constructor");
    }

    void displayParentInfo() {
        System.out.println("This is the Parent class.");
    }
}

// Child class (inherits from Parent)
class Child extends Parent {

    Child() {
        System.out.println("Child Constructor");
    }

    void displayChildInfo() {
        System.out.println("This is the Child class.");
    }
}

// Main class
public class MultilevelInheritanceDemo {

    public static void main(String[] args) {

        Child child = new Child();

        child.displayGrandparentInfo();
        child.displayParentInfo();
        child.displayChildInfo();
    }
}
