package mytest.Proxy.staticproxy;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Lion();
		Animal poxy =new Poxy(animal);
		String eat = poxy.eat("肥羊");
		System.out.println(eat);
	}
}
