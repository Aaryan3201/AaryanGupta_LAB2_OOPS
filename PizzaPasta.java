package LAB2;
import java.util.* ;
public class PizzaPasta {
    static int sveg = 20, snveg = 25, svegan = 15;
    static int mveg = 40, mnveg = 50, mvegan = 30;
    static int lveg = 60, lnveg = 75, lvegan = 45;

    static Scanner sc = new Scanner(System.in);

    public static void showMENU() {
        System.out.println("|------------------ PIZZA----------------------");
        System.out.println("|   /-   |    SMALL   |   MEDIUM  |   LARGE   |");
        System.out.println("|VEG     |      20    |     40    |     60    |");
        System.out.println("|Non-VEG |      25    |     50    |     75    |");
        System.out.println("|VEGAN   |      15    |     30    |     45    |");
        System.out.println("Crust : THIN / THICK");
        System.out.println("------------------------------------------------");
        System.out.println("""
                |----Extra Toppings---|
                |1|Cheese (1.00 USD)  |
                |2|Mushroom (1.00 USD |
                |3|Tomato (1.00 USD)  |
                |4|Jalapeno (1.00 USD)|
                |5|Spinach (1.00 USD) |""");
        System.out.println("------------------------------------------------");
        System.out.println("-------------------PASTA------------------------");
        System.out.println("|           /-       |   WHITE   |       RED   |");
        System.out.println("|    Penne/DITALINI  |     10    |       20    |");
    }

    public static void Pizzaselection() {
        int Price , count=0 ;
        System.out.println("Select Size S/M/L");
        String Pizzasize = sc.next();
        System.out.println("Select crust : Thin / Thick ");
        String crust = sc.next();
        System.out.println("Select type Veg/Non-veg/Vegan AS '| 1 / 2 / 3 |' Resp.");
        int type = sc.nextInt();
        System.out.println("Topping to be added : 1 for cheese , 2 for mushroom , 3 for tomato, 4 for jalapeno , 5 for spinach , None : no topping");
        String top = sc.next();
        if(top.equals("None")){ count = 0;}
        else {
            count = top.length();
        }
        if ((Pizzasize.equals("S")) && (type == 1)) {
            Price = sveg +count;
            System.out.println("YOUR ORDER IS : "+"SMALL VEG PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        } else if ((Pizzasize.equals("S")) && (type == 2)) {
            Price = snveg+count;
            System.out.println("YOUR ORDER IS : "+"SMALL NON-VEG PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        } else if ((Pizzasize.equals("S")) && (type == 3)) {
            Price = svegan + count;
            System.out.println("YOUR ORDER IS : "+"SMALL VEGAN PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        } else if ((Pizzasize.equals("M")) && (type == 1)) {
            Price = mveg+count;
            System.out.println("YOUR ORDER IS : "+"MEDIUM VEG PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        } else if ((Pizzasize.equals("M")) && (type == 2)) {
            Price = mnveg+count;
            System.out.println("YOUR ORDER IS : "+"MEDIUM NON-VEG PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust ) ;
        } else if ((Pizzasize.equals("M")) && (type == 3)) {
            Price = mvegan + count;
            System.out.println("YOUR ORDER IS : "+"MEDIUM VEGAN PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        } else if ((Pizzasize.equals("L")) && (type == 1)) {
            Price = lveg + count;
            System.out.println("YOUR ORDER IS : "+"LARGE VEG PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        } else if ((Pizzasize.equals("L")) && (type == 2)) {
            Price = lnveg + count;
            System.out.println("YOUR ORDER IS : "+"LARGE NON-VEG PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        } else if ((Pizzasize.equals("L")) && (type == 3)) {
            Price = lvegan+count;
            System.out.println("YOUR ORDER IS : "+"LARGE VEGAN PIZZA" +"   PRICE:   " + Price + "    CRUST TYPE :    " + crust);
        }
        //else System.out.println("invalid");

    }

    public static void PastaSelcetion(){
        int price = 0;
        System.out.println(" Press 1 for White and 2 for Red : ");
        int flavour = sc.nextInt();
        System.out.println("Press 1 for Penne and 2 for Ditalini");
        int type = sc.nextInt();
        if(flavour == 1 && type == 1)
        {
            price = 10;
            System.out.println("YOUR ORDER IS : WHITE PENNE PASTA " +"   PRICE:   " +  price );
        }

        else if(flavour == 1 && type == 2)
        {
            price = 10;
            System.out.println("YOUR ORDER IS : WHITE DITALINI PASTA " +"   PRICE:   " +  price );
        }
        else if(flavour == 2 && type == 1){
            price = 20;
            System.out.println("YOUR ORDER IS : RED PENNE PASTA " +"   PRICE:   " +  price );
        }
        else if(flavour == 2 && type == 2){
            price = 20;}
        System.out.println("YOUR ORDER IS : RED DITALINI PASTA " +"   PRICE:   " +  price );
    }
    public static void main(String[] args) {
        System.out.println(" WELCOME TO THE PIZZA PASTA \n ");
        while(true) {

            System.out.println("""
                     Enter choice\s
                    1. Show Menu\s
                    2. Place Order for pizza\s
                    3. Place order for pasta\s
                    4. EXIT\s
                    """);

            int p = sc.nextInt();

            switch (p) {
                case 1 -> showMENU();
                case 2 -> Pizzaselection();
                case 3 -> PastaSelcetion();
                case 4 -> System.exit(0);
                default -> System.out.println("Ïnvalid");
            }
            //showMENU();
        }
    }
}