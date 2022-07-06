import java.awt.*;
import javax.swing.*;


public class calculadora extends JPanel {

    JButton[] btnNums= new JButton[10];
    JButton btnMais, btnMenos, btnMultiplicacao, btnDivisao, btnIgual, btnLimpar, btnVirgula;

    JTextField tfDisplay;

    String operacao;
    String auxn1, auxn2;
    Float n1, n2;

    int aux = 0;

    public calculadora() {
        inicializar();
        Eventos();
    }

    public void inicializar() {
        setLayout(null);
        setBackground(Color.WHITE);

        for (int i = 0;i <= btnNums.length -1 ; i++) {
            btnNums[i] = new JButton(""+i);
            add(btnNums[i]);
//            System.out.println("btn"+i);

        }

        btnNums[0].setBounds(95,408,50,50);
        btnNums[1].setBounds(30,151,50,50);
        btnNums[2].setBounds(95,151,50,50);
        btnNums[3].setBounds(160,151,50,50);
        btnNums[4].setBounds(30,240,50,50);
        btnNums[5].setBounds(95,240,50,50);
        btnNums[6].setBounds(160,240,50,50);
        btnNums[7].setBounds(30,329,50,50);
        btnNums[8].setBounds(95,329,50,50);
        btnNums[9].setBounds(160,329,50,50);
        //------------------------------------------------------

        tfDisplay = new JTextField("");
        tfDisplay.setEditable(false);
        tfDisplay.setBounds(30,36,240,45);
        add(tfDisplay);
        //-------------------------------------------------------

        btnMais = new JButton("+");
        btnMais.setFont(new Font("Arial", Font.PLAIN, 7));
        btnMenos = new JButton("-");
        btnMultiplicacao = new JButton("X");
        btnMultiplicacao.setFont(new Font("Arial", Font.PLAIN, 10));
        btnDivisao = new JButton("/");

        btnIgual = new JButton("=");

        btnMais.setBounds(241,140,40,40);
        btnMenos.setBounds(241,210,40,40);
        btnMultiplicacao.setBounds(241,280,40,40);
        btnDivisao.setBounds(241,350,40,40);

        btnMais.setEnabled(false);
        btnMenos.setEnabled(false);
        btnMultiplicacao.setEnabled(false);
        btnDivisao.setEnabled(false);

        add(btnMais);
        add(btnMenos);
        add(btnMultiplicacao);
        add(btnDivisao);
        //---------------------------------------------

        btnIgual= new JButton("=");
        btnIgual.setBounds(185,413,64,40);
        btnIgual.setEnabled(false);
        add(btnIgual);

        //----------------------------------------------------

        btnVirgula = new JButton(",");
        btnVirgula.setBounds(30,408,50,50);
        add(btnVirgula);

        //---------------------------------------------------

        btnLimpar = new JButton("C");
        btnLimpar.setBounds(30,101,40,40);
        btnLimpar.setFont(new Font("Arial",Font.PLAIN,8));
        add(btnLimpar);

    }

    public void Eventos() {

        btnNums[0].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"0");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[1].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"1");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[2].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"2");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[3].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"3");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[4].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"4");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[5].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"5");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[6].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"6");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[7].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"7");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[8].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"8");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });
        btnNums[9].addActionListener(e -> {
            tfDisplay.setText(tfDisplay.getText()+"9");
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);

            if (aux == 1){
                btnIgual.setEnabled(true);
            }
        });

        btnMais.addActionListener(e -> {
            operacao = "mais";
            auxn1 = tfDisplay.getText().replace(",",".");
            n1 = Float.parseFloat(auxn1);

            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);

            aux = 1;
            tfDisplay.setText("");

            System.out.println(""+n1+" "+n2);
            btnVirgula.setEnabled(true);
        });
        btnMenos.addActionListener(e -> {
            operacao = "menos";

            auxn1 = tfDisplay.getText().replace(",",".");
            n1 = Float.parseFloat(auxn1);

            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);

            aux = 1;
            tfDisplay.setText("");

            System.out.println(""+n1+" "+n2);
            btnVirgula.setEnabled(true);
        });
        btnMultiplicacao.addActionListener(e -> {
            operacao = "multiplicacao";

            auxn1 = tfDisplay.getText().replace(",",".");
            n1 = Float.parseFloat(auxn1);

            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);

            aux = 1;
            tfDisplay.setText("");

            System.out.println(""+n1+" "+n2);
            btnVirgula.setEnabled(true);
        });
        btnDivisao.addActionListener(e -> {
            operacao = "divisao";

            auxn1 = tfDisplay.getText().replace(",",".");
            n1 = Float.parseFloat(auxn1);

            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);

            aux = 1;
            tfDisplay.setText("");

            System.out.println(""+n1+" "+n2);
            btnVirgula.setEnabled(true);
        });


        btnIgual.addActionListener(e -> {
            n2 = 0f;
            auxn2 = tfDisplay.getText().replace(",",".");
            n2 = Float.parseFloat(auxn2);
            float resp = Calcular(n1,n2);

            tfDisplay.setText(""+resp);
            btnVirgula.setEnabled(true);
        });

        btnLimpar.addActionListener(e -> {
            tfDisplay.setText("");
            n1 = null;
            n2 = null;

            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);

            btnIgual.setEnabled(false);
            btnVirgula.setEnabled(true);
            Calcular(0f,0f);

        });

        btnVirgula.addActionListener(e -> {

            tfDisplay.setText(tfDisplay.getText()+",");
            btnVirgula.setEnabled(false);

        });

    }

    public float Calcular(Float num1, Float num2){
        float resposta = 0f;
        switch (operacao){
            case "mais":
                resposta =  num1 + num2; break;

            case "menos":
                resposta =  num1 - num2; break;

            case "multiplicacao":
                resposta =  num1 * num2; break;

            case "divisao":
                resposta =  num1 / num2; break;



        }
        return resposta;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora2");
        frame.getContentPane().add(new calculadora());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 300, 500);
        //frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }
}
