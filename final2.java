class Parent {
    final void show() {
        System.out.println("This is a final method");
    }
}

class Child extends Parent {
    // void show() {   ❌ Error: cannot override final method
    //     System.out.println("Trying to override");
    // }
}

public class final2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
