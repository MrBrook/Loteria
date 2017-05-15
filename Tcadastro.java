import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by lucas on 14/05/17.
 */
public class Tcadastro extends JFrame {

    Tela tela = new Tela();

    private JPanel painel;
    private JFrame janela;

    private JButton salvar;
    private JButton sair;

    private JTextField texDez1;
    private JTextField texDez2;
    private JTextField texDez3;
    private JTextField texDez4;
    private JTextField texDez5;
    private JTextField texDez6;


    public Tcadastro(){

        painel = new JPanel();
        painel.setLayout(null);

        janela = new JFrame("Cadastro de Jogo");
        janela.setBounds(0, 15,300, 130);
        janela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        salvar = new JButton("Salvar");
        salvar.setBounds(60,90, 80,20);

        sair = new JButton("Sair");
        sair.setBounds(150,90, 80,20);

        texDez1 = new JTextField(2);
        texDez1.setBounds(50,30, 20,20);

        texDez2 = new JTextField(2 );
        texDez2.setBounds(70,30, 20,20);

        texDez3 = new JTextField( 2);
        texDez3.setBounds(90,30, 20,20);

        texDez4 = new JTextField( 2);
        texDez4.setBounds(110,30, 20,20);

        texDez5 = new JTextField(2 );
        texDez5.setBounds(130,30, 20,20);

        texDez6 = new JTextField(2 );
        texDez6.setBounds(150,30, 20,20);

        painel.add(texDez1);
        painel.add(texDez2);
        painel.add(texDez3);
        painel.add(texDez4);
        painel.add(texDez5);
        painel.add(texDez6);

        painel.add( salvar);
        painel.add( sair );

        janela.setContentPane(painel);
        //janela.setContentPane(painel2);
        janela.setVisible(true);

        sair.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setVisible( false );
            }
        } );

        salvar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validar();
            }
        } );

    }

    public void validar(){
        String d1 = texDez1.getText();
        String d2 = texDez2.getText();
        String d3 = texDez3.getText();
        String d4 = texDez4.getText();
        String d5 = texDez5.getText();
        String d6 = texDez6.getText();

        if(!d1.isEmpty() && !d2.isEmpty() && !d3.isEmpty() && !d4.isEmpty() && !d5.isEmpty() && !d6.isEmpty()){

            ArrayList<Integer> teste = new ArrayList <Integer>();
            try{
                teste.add(Integer.parseInt(d1));
                teste.add(Integer.parseInt(d2));
                teste.add(Integer.parseInt(d3));
                teste.add(Integer.parseInt(d4));
                teste.add(Integer.parseInt(d5));
                teste.add(Integer.parseInt(d6));

                Jogos jogo;
                jogo = new Jogos();
                if(jogo.addJogo(teste)) {
                    JOptionPane.showMessageDialog(null, "Jogo Cadastrado" );
                    tela.setNjogos();
                }
                else JOptionPane.showMessageDialog(null, "Jogo Inválido!!" );

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Jogo Inválido!!" );
            }
        }else{
            JOptionPane.showMessageDialog(null, "Jogo Inválido!!" );
        }

        texDez1.setText( "" );
        texDez2.setText( "" );
        texDez3.setText( "" );
        texDez4.setText( "" );
        texDez5.setText( "" );
        texDez6.setText( "" );

    }

}
