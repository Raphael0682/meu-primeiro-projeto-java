import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner TextoDigitado = new Scanner(System.in);
        System.out.println("Digite um texto qualquer: ");
        final String texto = TextoDigitado.nextLine();
        System.out.println("Você digitou: " + texto);
    }
}
