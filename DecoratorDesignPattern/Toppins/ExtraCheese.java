package DecoraterDesignPattern.Pizza;

public class ExtraCheese extends Toppins{
	
	BasePizza basepizza;
	
	public ExtraCheese(BasePizza pizza) {
		this.basepizza = pizza;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basepizza.cost()+10;
	}
	
}
