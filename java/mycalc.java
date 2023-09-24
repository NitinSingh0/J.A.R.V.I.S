import java.awt.*;
import java.awt.event.*;

public class mycalc extends WindowAdapter implements ActionListener {
    Frame f;
    Label l1,p;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button badd, bsub, bmul, bdiv, bmod, bcalc, bback, bclr, bpts, bneg, bc, bsqr, bd, bsroot;
    double xd;
    double num1, num2, check;

    mycalc() {
        Frame f = new Frame("My Calculator");
        p = new Label(null,Label.RIGHT);
        p.setBounds(50, 35, 280, 50);
        f.add(p);
        p.setBackground(Color.BLACK);
        p.setForeground(Color.WHITE);

        l1 = new Label("0", Label.RIGHT);
        Font myFont = new Font(null, Font.BOLD, 12);
        f.setFont(myFont);
        Font m2 = new Font(null, Font.BOLD, 50);
        l1.setFont(m2);
        l1.setForeground(Color.WHITE);

        l1.setBackground(Color.BLACK);
        // l1.setForeground(Color.red);
        l1.setBounds(50, 80, 280, 70);
        bc = new Button("C");
        bsqr = new Button("x^2");
        bsroot = new Button("Sq.Root");
        bd = new Button("1/x");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        bneg = new Button("+/-");
        bpts = new Button(".");
        bback = new Button("back");
        badd = new Button("+");
        bsub = new Button("-");
        bmul = new Button("*");
        bdiv = new Button("/");
        bmod = new Button("%");
        bcalc = new Button("=");
        bclr = new Button("CE");

        f.setBackground(Color.BLACK);
        b1.setBounds(50, 440, 67, 50);
        b2.setBounds(120, 440, 67, 50);
        b3.setBounds(190, 440, 67, 50);
        b4.setBounds(50, 370, 67, 50);
        badd.setBounds(260, 440, 67, 50);
        b5.setBounds(120, 370, 67, 50);
        b6.setBounds(190, 370, 67, 50);
        bsub.setBounds(260, 370, 67, 50);
        b7.setBounds(50, 300, 67, 50);
        b8.setBounds(120, 300, 67, 50);
        b9.setBounds(190, 300, 67, 50);
        bmul.setBounds(260, 300, 67, 50);
        bdiv.setBounds(260, 230, 67, 50);
        bclr.setBounds(120, 160, 67, 50);
        b0.setBounds(120, 510, 67, 50);
        bneg.setBounds(50, 510, 67, 50);
        bpts.setBounds(190, 510, 67, 50);
        bcalc.setBounds(260, 510, 67, 50);
        bback.setBounds(260, 160, 67, 50);
        bmod.setBounds(50, 160, 67, 50);
        bc.setBounds(190, 160, 67, 50);
        bd.setBounds(50, 230, 67, 50);
        bsqr.setBounds(120, 230, 67, 50);
        bsroot.setBounds(190, 230, 67, 50);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(bsub);
        f.add(bpts);
        f.add(bmul);
        f.add(bdiv);
        f.add(bmod);
        f.add(bback);
        f.add(bneg);
        f.add(l1);
        f.add(bcalc);
        f.add(badd);
        f.add(bclr);
        f.add(bc);
        f.add(bsqr);
        f.add(bsroot);
        f.add(bd);
        bcalc.setBackground(Color.blue);
        bcalc.setForeground(Color.BLACK);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(380, 600);
        f.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bcalc.addActionListener(this);
        bclr.addActionListener(this);
        bneg.addActionListener(this);
        bback.addActionListener(this);
        bpts.addActionListener(this);
        bc.addActionListener(this);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        String s1,s2;
        if (e.getSource() == b1) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("1");
            } else {
                s1 = s1 + "1";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b2) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("2");
            } else {
                s1 = s1 + "2";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b3) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("3");
            } else {
                s1 = s1 + "3";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b4) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("4");
            } else {
                s1 = s1 + "4";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b5) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("5");
            } else {
                s1 = s1 + "5";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b6) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("6");
            } else {
                s1 = s1 + "6";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b7) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("7");
            } else {
                s1 = s1 + "7";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b8) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("8");
            } else {
                s1 = s1 + "8";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b9) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("9");
            } else {
                s1 = s1 + "9";
                l1.setText(s1);
            }
        }
        if (e.getSource() == b0) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText("0");
            } else {
                s1 = s1 + "0";
                l1.setText(s1);
            }
        }
        if (e.getSource() == bpts) {
            s1 = l1.getText();
            if (s1 == "0") {
                l1.setText(".");
            } else {
                s1 = s1 + ".";
                l1.setText(s1);
            }
        }
        if(e.getSource()==bneg){
            s1=l1.getText();
            l1.setText("-"+s1);
        }
        if (e.getSource() == badd) {
            s1 = l1.getText();
            if(num1==0){
            num1=Double.parseDouble(s1);
            p.setText(s1+"+");
            l1.setText("");
            }
            else{
                s1=p.getText();
                s2=l1.getText();
                //num1=num1+Double.parseDouble(s1);
                p.setText(s1+s2+"+");
                l1.setText("");
            }
        }
        if (e.getSource() == bsub) {
            s1 = l1.getText();
            if(num1==0){
            num1=Double.parseDouble(s1);
            p.setText(s1+"-");
            l1.setText("");
            }
            else{
                num1=num1-Double.parseDouble(s1);
                p.setText(num1+"+");
                l1.setText("");
            }
        }
        if (e.getSource() == bclr) {
            l1.setText("0");
        }
        if (e.getSource() == bc) {
            l1.setText("0");
            p.setText("");
            num1=num2=0;
        }
    }

    public static void main(String[] args) {
        new mycalc();
    }
}
