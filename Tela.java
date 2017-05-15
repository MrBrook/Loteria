import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author lucas
 */
public class Tela extends JFrame {

    private JButton bCadastrarJogo;
    private JButton bSortear;
    private JPanel janela;
    private JLabel lNjogos;
    private JLabel lQuadra;
    private JLabel lQuina;
    private JLabel lResultado;
    private JLabel lSena;
    private JPanel painelResultado;
    private JTextField texNjogos;
    private JTextField texQuadra;
    private JTextField texQuina;
    private JTextField texResultado;
    private JTextField texSena;

    private boolean flag = true;

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    Maquina maquina = new Maquina();
    Jogos jogos = new Jogos();
    Sistema sistema = new Sistema();

    private void initComponents() {

        janela = new JPanel();
        bCadastrarJogo = new JButton();
        bSortear = new JButton();
        painelResultado = new JPanel();
        lNjogos = new JLabel();
        lSena = new JLabel();
        lQuina = new JLabel();
        lQuadra = new JLabel();
        lResultado = new JLabel();
        texResultado = new JTextField();
        texNjogos = new JTextField();
        texSena = new JTextField();
        texQuina = new JTextField();
        texQuadra = new JTextField();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bCadastrarJogo.setText("Cadastrar Jogo");


        bSortear.setText("Sortear");

        painelResultado.setDoubleBuffered(false);

        painelResultado.setName("resultado");
        lNjogos.setText("Nº Jogos:");
        lSena.setText("Sena:");
        lQuina.setText("Quina:");
        lQuadra.setText("Quadra:");
        lResultado.setText("Resultado:");

        GroupLayout painelResultadoLayout = new GroupLayout(painelResultado);
        painelResultado.setLayout(painelResultadoLayout);

        painelResultadoLayout.setHorizontalGroup(
                painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelResultadoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lResultado)
                                        .addComponent(lNjogos)
                                        .addComponent(lSena)
                                        .addComponent(lQuina)
                                        .addComponent(lQuadra))
                                .addGap(18, 18, 18)
                                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(texNjogos, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(texResultado, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(texQuadra)
                                        .addComponent(texQuina, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(texSena, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        painelResultadoLayout.setVerticalGroup(
                painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelResultadoLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lResultado)
                                        .addComponent(texResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lNjogos)
                                        .addComponent(texNjogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lSena)
                                        .addComponent(texSena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(texQuina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lQuina))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addGroup(painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(texQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lQuadra))
                                .addContainerGap())
        );

        GroupLayout janelaLayout = new GroupLayout(janela);
        janela.setLayout(janelaLayout);

        janelaLayout.setHorizontalGroup(
               janelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(janelaLayout.createSequentialGroup()
                               .addGap(6, 6, 6)
                                .addGroup(janelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bCadastrarJogo)
                                       .addComponent(bSortear))
                                //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                               .addComponent(painelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        janelaLayout.setVerticalGroup(
                janelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaLayout.createSequentialGroup()
                                .addComponent(painelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(janelaLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(bCadastrarJogo)
                                .addGap(18, 18, 18)
                                .addComponent(bSortear)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

       GroupLayout layout = new GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(janela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );
       layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(janela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();

       bCadastrarJogo.addActionListener(
               new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       try{
                           cadastrar();
                           texNjogos.setText(""+jogos.getJogo().size());
                           texNjogos.repaint();

                       }catch (Exception x){
                           System.out.println(x);
                       }
                   }
               }
       );

       bSortear.addActionListener( new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(jogos.getJogo().size()!=0 && flag){
                   maquina.addSorteio();
                   String result = "";
                   for (int i=0;i<maquina.getJogoVencedor().size();i++){
                       result += Integer.toString(maquina.getJogoVencedor().get(i));
                       if(i!=5) result += "-";
                   }
                   texResultado.setText(result);
                   sistema.vereficaGanhadores();

                   texNjogos.setText(""+jogos.getJogo().size());
                   texSena.setText( Integer.toString( sistema.getSena() ) );
                   texQuina.setText( Integer.toString( sistema.getQuina() ) );
                   texQuadra.setText( Integer.toString( sistema.getQuadra() ) );

                   flag = false;
               }else{
                   JOptionPane.showMessageDialog( null,"Nenhum Jogo Cadastrado!!" );
               }

           }
       } );
    }
    public void cadastrar(){

         new Tcadastro();
    }
    public void setNjogos(){
        texNjogos.setText(""+jogos.getJogo().size());
    }
}
