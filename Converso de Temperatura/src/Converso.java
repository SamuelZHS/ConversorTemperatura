import java.util.Scanner;

public class Converso {
	public static void main(String[]args) {
		
		Scanner temperatura = new Scanner(System.in);
		
		//Legenda da página
		System.out.println("=============== CONVERSOR DE TEMPERATURA ===============");
		
		//Entrada de dados
		System.out.println("Digite a temperatura em celsius: ");
		double celsius = temperatura.nextDouble();
		double fahrenheit = celsius * 1.8  + 32;
		
		//Saída de dados
		System.out.println("Temperatura informada em celsius:" + celsius);
		System.out.println("Fahrenheit é: " + fahrenheit);
		
		temperatura.close();
	}
	

}
