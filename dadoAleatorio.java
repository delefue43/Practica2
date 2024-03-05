import java.util.Random;

public class dadoAleatorio {
    
    public static void main(String[] args) {
    
        Random rnd = new Random();

        int cara_dado1 = rnd.nextInt(7);
	int cara_dado2 = rnd.nextInt(7);
        System.out.println("Cara dado 1: " + cara_dado1);
	System.out.println("Cara dado 2: " +cara_dado2);

	System.out.println("Suma caras: " + (cara_dado1 + cara_dado2));
    }  
}
