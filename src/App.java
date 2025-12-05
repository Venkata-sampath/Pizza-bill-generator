public class App {
    public static void main(String[] args) throws Exception {
        // Pizza basePizza = new Pizza(false);
        // basePizza.addExtraCheese();
        // basePizza.addExtraToppings();
        // basePizza.takeAway();
        // basePizza.getBill();

        DeluxePizza dp = new DeluxePizza(true);
        dp.takeAway();
        dp.getBill();
    }
}
