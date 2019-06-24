
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.PrintWriter;

public class InterfaceMask implements ActionListener {
	
	

	private JFrame f=new JFrame("Progetto SuperEnalotto");
    private JPanel p=new JPanel(new BorderLayout());

    private JPanel nord=new JPanel(new BorderLayout());

    private JPanel cred=new JPanel(new FlowLayout());
    private JLabel lnome=new JLabel("Nome");
    private JTextField nome=new JTextField(5);
    private JLabel lcogn=new JLabel("Cognome");
    private JTextField cogn=new JTextField(5);
    // .....

    private JPanel scommessa=new JPanel(new FlowLayout());
    private JLabel lcash=new JLabel("Ammontare che si vuole Scommettere");
    private JTextField cash=new JTextField(5);

    private JPanel numbers=new JPanel(new FlowLayout());
    private JLabel l1=new JLabel("N1");
    private JTextField n1=new JTextField(1);
    private JLabel l2=new JLabel("N2");
    private JTextField n2=new JTextField(1);
    private JLabel l3=new JLabel("N3");
    private JTextField n3=new JTextField(1);
    private JLabel l4=new JLabel("N4");
    private JTextField n4=new JTextField(1);
    private JLabel l5=new JLabel("N5");
    private JTextField n5=new JTextField(1);
    private JLabel l6=new JLabel("N6");
    private JTextField n6=new JTextField(1);

    private JPanel show=new JPanel(new FlowLayout());
    private JLabel view1=new JLabel("Numeri Estratti");
    private JLabel view2=new JLabel("Esito");


    private JPanel buttons=new JPanel(new FlowLayout());
    private JButton V=new JButton("Verifica");
    private JButton E=new JButton("Estrazione");

    //private PrintWriter out;
    //private BufferedReader in;
    private MyWindow w=new MyWindow();
    private Utente u;

    public InterfaceMask() {
        cred.add(lnome);
        cred.add(nome);
        cred.add(lcogn);
        cred.add(cogn);
        nord.add(cred, BorderLayout.NORTH);
        scommessa.add(lcash);
        scommessa.add(cash);
        nord.add(scommessa, BorderLayout.CENTER);
        numbers.add(l1);
        numbers.add(n1);
        numbers.add(l2);
        numbers.add(n2);
        numbers.add(l3);
        numbers.add(n3);
        numbers.add(l4);
        numbers.add(n4);
        numbers.add(l5);
        numbers.add(n5);
        numbers.add(l6);
        numbers.add(n6);
        nord.add(numbers, BorderLayout.SOUTH);
        p.add(nord, BorderLayout.NORTH);
        p.add(view1, BorderLayout.WEST);
        p.add(view2, BorderLayout.EAST);
        buttons.add(V);
        buttons.add(E);
        p.add(buttons, BorderLayout.SOUTH);
        f.add(p);
        //
        V.addActionListener(this);
        E.addActionListener(this);
        V.setActionCommand("verify");
        E.setActionCommand("extraction");
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(w);
        //
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        E.setEnabled(false);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        String x=ev.getActionCommand();
        if (x.equals("verify")) {
        	if(Utilities.setNome(nome.getText())) {
        		
        	}
            //checkUtente && checkNumeri && checkAmmontareScommesso
            //then
            //u=new Utente(nome.getText(), cogn.getText(), ...... );
            E.setEnabled(true);
            //else NOTHING
        }
        else if (x.equals("extraction")) {
            //istanza di Estrazione..
            //checkVincita
            //then
            //calcolaAmmontareVinto
            //[..]
            //else
            //[..]

            //E.setEnabled(false);  ??
        }
    }
}
