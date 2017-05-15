import java.util.ArrayList;

/**
 * Created by lucas on 11/05/17.
 */
public class Sistema {

    private  ArrayList<Integer> sena = new ArrayList <Integer>();
    private ArrayList<Integer> quina = new ArrayList <Integer>();
    private ArrayList<Integer> quadra = new ArrayList <Integer>();

    static Maquina maquina = new Maquina();
    static Jogos jogo = new Jogos();

    public void vereficaGanhadores(){

        int[] teste = new int[60];
        int cont = 0;
        ArrayList<Integer> jogo1 = new ArrayList <Integer>(  );


        for (int j = 0; j<6; j++) teste[ maquina.getJogoVencedor().get(j)] =  maquina.getJogoVencedor().get(j);

        maquina.getJogoVencedor().get( 1 );

        for(int i=0;i<jogo.getJogo().size();i++){
            jogo1 = jogo.getJogo().get(i);
            for(int s=0;s<6;s++){
                if(teste[jogo1.get(s)]==jogo1.get(s)){ cont++;}
            }
            if(cont == 6) sena.add(i);
            if (cont == 5) quina.add(i);
            if (cont == 4) quadra.add(i);

            cont =0;
        }
    }

    public int getSena(){
        return sena.size();
    }
    public ArrayList<Integer> getVsena(){
        return sena;
    }
    public int getQuina(){
        return quina.size();
    }
    public ArrayList<Integer> getVquina(){
        return quina;
    }
    public int getQuadra(){
        return quadra.size();
    }
    public ArrayList<Integer> getVQuadra(){
        return quadra;
    }
}
