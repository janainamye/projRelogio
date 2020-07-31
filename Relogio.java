/**
 * Relogio
 */
public class Relogio {
    private int hora, minuto,segundo;

    public Relogio(int hora, int minuto, int segundo){
        this.hora = setHora(hora);
        this.minuto = setMinuto(minuto);
        this.segundo = setSegundo(segundo);
        }

    public void mostrarHora(){
        System.out.println(("A hora exta agora é: " +hora+":"+minuto+":"+segundo));
    }

    public int getHora() {
        return hora;
    }

    public int setHora(int hora) {
        if (hora >= 0 && hora< 23){
        this.hora = hora;
        return hora;

    } else {
        System.out.println("Esta hora não existe. O valor foi zerado. Insira um valor válido de 0 a 23");
        return hora = 0 ;

    }
}

    public int getMinuto() {
        return minuto;
    }

    public int setMinuto(int minuto) {
        if (minuto >=0 && minuto <59){
        this.minuto = minuto;
        return minuto;
    } else{
        System.out.println("Este minuto não existe. O valor foi zerado. Insira um valór válido de 0 a 59");
        return minuto = 0;

    }
    }

    public int getSegundo() {
        return segundo;
    }

    public int setSegundo(int segundo) {
        if (segundo >=0 && segundo <59){
            this.segundo = segundo;
            return segundo;
        } else{
            System.out.println("Este segundo não existe. O valor foi zerado. Insira um valor válido de 0 a 59");
            return segundo = 0;

        }
        }
    


}