import java.util.Random;

public class dadoAleatorio {
    
    public static void main(String[] args) {
    
        Random rnd = new Random();

        int cara_dado = rnd.nextInt(7);
        System.out.println(cara_dado);
    }  
}
