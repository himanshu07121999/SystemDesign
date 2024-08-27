package DecoraterDesignPattern.Pizza;

public class Main {

	public static void main(String[] args) {
		BasePizza pizza1= new PepperoniPizza();
		BasePizza pizza =new ExtraCheese(pizza1);
		System.out.println(pizza.cost());

	}

}
