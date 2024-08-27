package DecoraterDesignPattern.Pizza;

public class Mushroom extends BasePizza{
	
	
	BasePizza basepizza;
	
	public Mushroom (BasePizza pizza) {
		this.basepizza =pizza;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basepizza.cost()+15;
	}

}
