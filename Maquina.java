import java.util.ArrayList;
import java.util.Random;


public class Maquina {

    private static ArrayList<Integer> jogoVencedor = new ArrayList <Integer>();

    public Maquina(){}

    Maquina(ArrayList<Integer> jVencedor){
        this.jogoVencedor =  jVencedor;
    }

    public Maquina addSorteio(){

        Random gerador = new Random();

        ArrayList<Integer> jogo = new ArrayList <Integer>();
        int dezena = 0;
        boolean flag;

        while (jogo.size()<6){
            flag = true;
            dezena = gerador.nextInt(59)+1;
            for (int i=0;i<jogo.size();i++){
                if(jogo.get(i) == dezena) flag = false;
            }
            if(flag) jogo.add(dezena);
        }
       /*jogo.add( 1 );
        jogo.add( 2 );
        jogo.add( 3 );
        jogo.add( 4 );
        jogo.add( 5 );
        jogo.add( 6 );*/

        Maquina a = new Maquina(jogo);

        return a;
    }

    public ArrayList <Integer> getJogoVencedor() {
        return jogoVencedor;
    }

    public void setJogoVencedor(ArrayList <Integer> jogoVencedor) {
        this.jogoVencedor = jogoVencedor;
    }
}