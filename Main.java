import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    JFrame frame = new JFrame("ATM ");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    JButton btnlanfa = new JButton("فارسی");
    JButton btnlanen = new JButton("English");
    JButton btnsuben = new JButton("Submit");
    JButton btnsubfa = new JButton("ثبت");
    JButton btnbaren = new JButton("Withdrawal");
    JButton btnbarfa = new JButton("برداشت وجه");
    JButton btnchanen = new JButton("Change password");
    JButton btnchanfa = new JButton("تغییر رمز");
    JButton btnwiren = new JButton("Wire money");
    JButton btnwirfa = new JButton("کارت به کارت");
    JButton btnbalancen = new JButton("Balance");
    JButton btnbalancfa = new JButton("اعلام موجودی");
    JButton btnreten = new JButton("Return");
    JButton btnretfa = new JButton("بازگشت");
    JButton btncash1 = new JButton("10,000");
    JButton btncash2 = new JButton("50,000");
    JButton btncash3 = new JButton("100,000");
    JButton btncash4 = new JButton("200,000");
    JButton btnsub1en = new JButton("Submit");
    JButton btnsub1fa = new JButton("ثبت");




    JPasswordField password = new JPasswordField();
    JTextField wireamount = new JTextField();
    JTextField wirereceiver = new JTextField();
    JLabel selectlan1 = new JLabel("Select your language.");
    JLabel selectlan2 = new JLabel("زبان خود را انتخاب کنید.");
    JLabel entpass1 = new JLabel("Enter your password: ");
    JLabel entpass2 = new JLabel("رمز خود را وارد کنید: ");
    JLabel newentpass1 = new JLabel("Enter new password: ");
    JLabel newentpass2 = new JLabel("رمز جدید را وارد کنید: ");
    JLabel balancen = new JLabel("Balance: 10,000 Toman");
    JLabel balancfa = new JLabel("موجودی: 10,000 تومان");
    JLabel baren = new JLabel("Select the amount of cash.");
    JLabel barfa = new JLabel("مبلغ مورد نظر را انتخاب کنید.");
    JLabel wiraen = new JLabel("Enter the amount of cash:");
    JLabel wirafa = new JLabel("مبلغ مورد نظر را وارد کنید:");
    JLabel wirren = new JLabel("Enter receiver card number:");
    JLabel wirrfa = new JLabel("شماره کارت مقصد را وارد کنید:");
    JLabel successen = new JLabel("Mission accomplished.");
    JLabel successfa = new JLabel("عملیات با موفقیت انجام شد.");





    Font myfontfa = new Font("B koodak",Font.BOLD,20);
    Font myfonten = new Font("Times new roman",Font.BOLD,20);


    Main(){
        Dimension frameSize = new Dimension(1920,1080);
        frame.setSize(frameSize);
        frame.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        selectlan1.setFont(myfonten);
        selectlan2.setFont(myfontfa);
        selectlan1.setFont(myfonten);
        selectlan2.setFont(myfontfa);

        btnlanen.addActionListener(this);
        btnlanfa.addActionListener(this);
        btnsuben.addActionListener(this);
        btnsubfa.addActionListener(this);
        btnbaren.addActionListener(this);
        btnbarfa.addActionListener(this);
        btnchanen.addActionListener(this);
        btnchanfa.addActionListener(this);
        btnbalancen.addActionListener(this);
        btnbalancfa.addActionListener(this);
        btnwiren.addActionListener(this);
        btnwirfa.addActionListener(this);
        btnreten.addActionListener(this);
        btnretfa.addActionListener(this);
        btncash1.addActionListener(this);
        btncash2.addActionListener(this);
        btncash3.addActionListener(this);
        btncash4.addActionListener(this);
        btnsub1en.addActionListener(this);
        btnsub1fa.addActionListener(this);

        btnlanen.setFont(myfonten);
        btnlanfa.setFont(myfontfa);
        btnsuben.setFont(myfonten);
        btnsubfa.setFont(myfontfa);
        btnbaren.setFont(myfonten);
        btnbarfa.setFont(myfontfa);
        btnchanen.setFont(myfonten);
        btnchanfa.setFont(myfontfa);
        btnbalancen.setFont(myfonten);
        btnbalancfa.setFont(myfontfa);
        btnwiren.setFont(myfonten);
        btnwirfa.setFont(myfontfa);
        btnreten.setFont(myfonten);
        btnretfa.setFont(myfontfa);
        newentpass1.setFont(myfonten);
        newentpass2.setFont(myfontfa);
        balancen.setFont(myfonten);
        balancfa.setFont(myfontfa);
        baren.setFont(myfonten);
        barfa.setFont(myfontfa);
        btncash1.setFont(myfonten);
        btncash2.setFont(myfonten);
        btncash3.setFont(myfonten);
        btncash4.setFont(myfonten);
        wiraen.setFont(myfonten);
        wirafa.setFont(myfontfa);
        wirren.setFont(myfonten);
        wirrfa.setFont(myfontfa);
        successen.setFont(myfonten);
        successfa.setFont(myfontfa);
        btnsub1en.setFont(myfonten);
        btnsub1fa.setFont(myfontfa);






        panel1.add(btnlanen);
        panel1.setBounds(10,350,200,450);
        panel1.setLayout(new GridLayout(5,1,10,50));
        frame.add(panel1);

        panel2.add(selectlan1);
        panel2.add(selectlan2);
        panel2.setBounds(620,320,500,200);
        panel2.setLayout(new GridLayout(4,1,10,10));
        frame.add(panel2);

        panel3.add(btnlanfa);
        panel3.setBounds(1320,350,200,450);
        panel3.setLayout(new GridLayout(5,1,10,50));
        frame.add(panel3);

        panel4.setBounds(620,650,200,80);
        panel4.setLayout(new GridLayout(1,1,10,10));


        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnlanfa){
            panel3.remove(btnlanfa);
            panel1.remove(btnlanen);
            panel2.remove(selectlan1);
            panel2.remove(selectlan2);
            entpass2.setFont(myfontfa);
            panel2.add(entpass2);
            password.setText("");
            panel2.add(password);
            panel4.add(btnsubfa);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnlanen){
            panel3.remove(btnlanfa);
            panel1.remove(btnlanen);
            panel2.remove(selectlan1);
            panel2.remove(selectlan2);
            entpass1.setFont(myfonten);
            panel2.add(entpass1);
            password.setText("");
            panel2.add(password);
            panel4.add(btnsuben);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnsuben){
            panel4.removeAll();
            panel4.add(btnreten);
            panel2.removeAll();
            panel1.add(btnbaren);
            panel1.add(btnwiren);
            panel3.add(btnchanen);
            panel3.add(btnbalancen);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnsubfa){
            panel4.removeAll();
            panel4.add(btnretfa);
            panel2.removeAll();
            panel1.add(btnbarfa);
            panel1.add(btnwirfa);
            panel3.add(btnchanfa);
            panel3.add(btnbalancfa);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnsub1en){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel2.add(successen);
            panel4.add(btnreten);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnsub1fa){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel2.add(successfa);
            panel4.add(btnretfa);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnchanen){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnsub1en);
            panel2.add(newentpass1);
            password.setText("");
            panel2.add(password);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnchanfa){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnsub1fa);
            panel2.add(newentpass2);
            password.setText("");
            panel2.add(password);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnbalancen){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnreten);
            panel2.add(balancen);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnbalancfa){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnretfa);
            panel2.add(balancfa);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnbaren){
            int a=0;
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnreten);
            panel2.add(baren);
            panel1.add(btncash1);
            panel1.add(btncash2);
            panel3.add(btncash3);
            panel3.add(btncash4);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnbarfa){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnretfa);
            panel2.add(barfa);
            panel1.add(btncash1);
            panel1.add(btncash2);
            panel3.add(btncash3);
            panel3.add(btncash4);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnwiren){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnsub1en);
            panel2.add(wiraen);
            wireamount.setText("");
            panel2.add(wireamount);
            panel2.add(wirren);
            wirereceiver.setText("");
            panel2.add(wirereceiver);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnwirfa){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel4.add(btnsub1fa);
            panel2.add(wirafa);
            wireamount.setText("");
            panel2.add(wireamount);
            panel2.add(wirrfa);
            wirereceiver.setText("");
            panel2.add(wirereceiver);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnreten){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel1.add(btnlanen);
            panel2.add(selectlan1);
            panel2.add(selectlan2);
            panel3.add(btnlanfa);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btnretfa){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel1.add(btnlanen);
            panel2.add(selectlan1);
            panel2.add(selectlan2);
            panel3.add(btnlanfa);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource() == btncash1 || e.getSource() == btncash2 || e.getSource() == btncash3 || e.getSource() == btncash4){
            panel1.removeAll();
            panel2.removeAll();
            panel3.removeAll();
            panel4.removeAll();
            panel2.add(successen);
            panel4.add(btnreten);
            frame.revalidate();
            frame.repaint();
        }


    }


    public static void main(String[] args) {
        Main calc =new Main();

    }}
