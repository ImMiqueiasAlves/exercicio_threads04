package view;
import controller.SapoThread;

public class ViewEx4 {
	public static void main(String [] args) {
		int distancia = 9;
		int pulo_maximo = 3;
		System.out.println("Dist?ncia da corrida: " + distancia + " cm. Pulo m?ximo: " + pulo_maximo + " cm.");
		for(int i=0; i < 5; i++)
			new SapoThread(pulo_maximo, distancia).start();
	}
}
