import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static Pizza[] menu = new Pizza[50];
	static Pizza p = new Pizza(null, null, 0);

	public static void inserisciPizza() {
		System.out.println("Vuoi inserire una pizza o superpizza?");
		String sel = sc.nextLine();
		if (sel.equals("pizza")) {
			System.out.println("Nome pizza: ");
			p.nome = sc.nextLine();
			System.out.println("Ingredienti (massimo 10): ");
			for (int i = 0; i < menu.length; i++) {
				System.out.println(i + Pizza.ing[i]);
			}
		}

	}

}
