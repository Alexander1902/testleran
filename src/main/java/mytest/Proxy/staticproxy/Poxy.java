package mytest.Proxy.staticproxy;

public class Poxy implements Animal {

	Animal a;
	
	public Poxy(Animal a) {
		this.a=a;
	}
	
	@Override
	public String eat(String fool) {
		System.err.println("发现一头狮子，");
		String eat = a.eat(fool);
		return eat;
	}

}
