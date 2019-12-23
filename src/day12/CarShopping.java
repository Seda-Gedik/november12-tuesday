package day12;

public class CarShopping {
    public static void main(String[] args) {
    // Buy corolla or tesla (only if it's within the budget)
    // there is only one car covered with cloth
    // one we tahe out the cloth
    // we check whether its toyota,if its we buy it without checking the price
    // if its now we check if its a tesla and also whether it is within the budget
        String carBrand = "corolla";
        int carPrice = 90000;
        int budget = 40000;
           // || true                     false                        false
           //     true||false = true
        if(carBrand.equals("corolla") || carBrand.equals("tesla") && carPrice<=budget ){
            System.out.println("Car Aquired!!");
        }else {
            System.out.println(" Not What I am Looking For");
        }




    }
}
