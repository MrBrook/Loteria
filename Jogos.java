import java.util.ArrayList;

/**
 * Created by aluno on 04/05/17.
 */
public class Jogos {


    private static ArrayList <ArrayList <Integer>> jogo  = new ArrayList <ArrayList <Integer>>();

    public Jogos(){

    }

    Jogos(ArrayList<Integer> jogo){

        this.jogo.add(jogo);

    }

    public boolean addJogo(ArrayList<Integer> jogo){

        int[] teste = new int[60];

        for (int i=0;i<jogo.size();i++){
            if(jogo.get(i)>=1 && jogo.get(i)<=60){
                if(teste[jogo.get(i)]==0) teste[jogo.get(i)]=jogo.get(i);
                else return false;
            }else return false;
        }

        try{
            new Jogos(jogo);
        }catch (Exception a){
            System.out.println("''"+a);
        }
        return true;
    }

    public static ArrayList <ArrayList <Integer>> getJogo() {
        return jogo;
    }
}