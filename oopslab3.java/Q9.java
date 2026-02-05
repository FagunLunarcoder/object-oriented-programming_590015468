 class child {
    String name;
    child(String n) {   
        name = n;
    }
}

public class Q9 {
    public static void main(String[] args) {
        child s = new child("RAM");  
        System.out.println("Name: " + s.name);
    }
}