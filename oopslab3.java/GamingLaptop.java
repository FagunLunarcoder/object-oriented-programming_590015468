
class Laptop {
    int price = 50000; 
}


class GamingLaptop extends Laptop {
    int price = 90000; 

    void showPrices() {
        int price = 120000; 

        System.out.println("Local price = " + price);          
        System.out.println("GamingLaptop price = " + this.price);     
        System.out.println("Laptop price = " + super.price); 
    }

    public static void main(String[] args) {
        GamingLaptop myLaptop = new GamingLaptop();
        myLaptop.showPrices();
    }
}
