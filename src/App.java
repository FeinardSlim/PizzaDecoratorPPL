import com.designpattern.pizza.AmericanPizza;
import com.designpattern.pizza.NewYorkerPizza;
import com.designpattern.pizza.Pizza;
import com.designpattern.pizza.Pizza.Size;
import com.designpattern.topping.Bacon;
import com.designpattern.topping.Cheese;
import com.designpattern.topping.Chicken;
import com.designpattern.topping.Olives;
import com.designpattern.topping.Pepperoni;
import com.designpattern.topping.Peppers;
import com.designpattern.topping.Tuna;

public class App {
    public static void main(String[] args) throws Exception {
        Size standard = Size.STANDARD;
        Size deluxe = Size.DELUXE;
        Size jumbo = Size.JUMBO;
        Pizza pizza = new NewYorkerPizza();
        pizza.setSize(standard);

        System.out.println("Description: " + pizza.getDescription() + ", Cost : " + pizza.cost() + "p");

        Pizza newYorkPizza = new NewYorkerPizza();
        newYorkPizza.setSize(deluxe);
        newYorkPizza = new Chicken(newYorkPizza);
        newYorkPizza = new Tuna(newYorkPizza);
        newYorkPizza = new Peppers(newYorkPizza);
        System.out.println("Description: " + newYorkPizza.getDescription() + ", Cost : " + newYorkPizza.cost() + "p");

        Pizza americanPizza = new AmericanPizza();
        americanPizza.setSize(jumbo);
        americanPizza = new Olives(americanPizza);
        americanPizza = new Pepperoni(americanPizza);
        americanPizza = new Cheese(americanPizza);
        americanPizza = new Bacon(americanPizza);
        System.out.println("Description: " + americanPizza.getDescription() + ", Cost : " + americanPizza.cost() + "p");
    }
}