import java.util.Scanner;

public class AppRelogio {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int hora, minuto,segundo;

        System.out.println("Digite o valor da hora atual:  (valor válido entre 0 e 23)");
        hora = in.nextInt();

        System.out.println("Digite o valor do minuto atual:  (valor válido entre 0 e 59)");
        minuto = in.nextInt();

        System.out.println("Digite o valor do segundo atual:  (valor válido entre 0 e 59)");
        segundo = in.nextInt();

        Relogio relog = new Relogio(hora,minuto,segundo);
       
        relog.mostrarHora();

        in.close();
    }
    
}