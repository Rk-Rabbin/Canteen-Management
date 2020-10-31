package javaapplication6;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LogIn_form extends JFrame{
    //declaring variables
    private Container c,c1,c2,c3,c4,c5;
    private JFrame jf,jf1,jf2,jf3,jf4;
    private JLabel lb1,lb2,lb3,l1,l2,l3,l4;
    private JPanel p1,p2,p3;
    private JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,
                   jl19,jl20,jl21;
    private JTextField tf1,tf2,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;;
    private JPasswordField pf,pf1,pf2;
    private JButton b1,b2,b3,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12;
    private Font f5,f,f1,f2,f3;;
    private ImageIcon img1,img2;
    private Cursor cur,cur1;
    private JScrollPane jsp;
    private File file1,file2,file3,file4,file5,file6,file7,file8,file9,file10,file11,file12,file13,file14,
            file15,file16,file17,file18,file19,file20,file21,file22,file23,file24,file25,file26;
    private JComboBox jcb;
    private JTextArea ta1,ta;
    private static double coffeeP,milkshakeP,upP,pepsiP,waterP,teaP;
    private static double cbP,bbP,pizzaP,pastaP,friceP,sandwichP;
    private static double tp = 0;
    private static int cb,bb,pi,pa,fr,sn,wa,up,pe,co,te,ms,tcb,tbb,tpi,tpa,tfr,tsn,twa,tup,tpe,tco,tte,tms;
    private JLabel[] jl;
    private JTextField[] tf;
    
    //setters and getters for some variables

    public static int getTcb() {
        return tcb;
    }

    public static void setTcb(int tcb) {
        
        LogIn_form.tcb = tcb;
    }

    public static int getTbb() {
        return tbb;
    }

    public static void setTbb(int tbb) {
        LogIn_form.tbb = tbb;
    }

    public static int getTpi() {
        return tpi;
    }

    public static void setTpi(int tpi) {
        LogIn_form.tpi = tpi;
    }

    public static int getTpa() {
        return tpa;
    }

    public static void setTpa(int tpa) {
        LogIn_form.tpa = tpa;
    }

    public static int getTfr() {
        return tfr;
    }

    public static void setTfr(int tfr) {
        LogIn_form.tfr = tfr;
    }

    public static int getTsn() {
        return tsn;
    }

    public static void setTsn(int tsn) {
        LogIn_form.tsn = tsn;
    }

    public static int getTwa() {
        return twa;
    }

    public static void setTwa(int twa) {
        LogIn_form.twa = twa;
    }

    public static int getTup() {
        return tup;
    }

    public static void setTup(int tup) {
        LogIn_form.tup = tup;
    }

    public static int getTpe() {
        return tpe;
    }

    public static void setTpe(int tpe) {
        LogIn_form.tpe = tpe;
    }

    public static int getTco() {
        return tco;
    }

    public static void setTco(int tco) {
        LogIn_form.tco = tco;
    }

    public static int getTte() {
        return tte;
    }

    public static void setTte(int tte) {
        LogIn_form.tte = tte;
    }

    public static int getTms() {
        return tms;
    }

    public static void setTms(int tms) {
        LogIn_form.tms = tms;
    }
    
    public static int getCb() {
        return cb;
    }

    public static void setCb(int cb) {
        LogIn_form.cb = cb;
    }

    public static int getBb() {
        return bb;
    }

    public static void setBb(int bb) {
        LogIn_form.bb = bb;
    }

    public static int getPi() {
        return pi;
    }

    public static void setPi(int pi) {
        LogIn_form.pi = pi;
    }

    public static int getPa() {
        return pa;
    }

    public static void setPa(int pa) {
        LogIn_form.pa = pa;
    }

    public static int getFr() {
        return fr;
    }

    public static void setFr(int fr) {
        LogIn_form.fr = fr;
    }

    public static int getSn() {
        return sn;
    }

    public static void setSn(int sn) {
        LogIn_form.sn = sn;
    }

    public static int getWa() {
        return wa;
    }

    public static void setWa(int wa) {
        LogIn_form.wa = wa;
    }

    public static int getUp() {
        return up;
    }

    public static void setUp(int up) {
        LogIn_form.up = up;
    }

    public static int getPe() {
        return pe;
    }

    public static void setPe(int pe) {
       LogIn_form.pe = pe;
    }

    public static int getCo() {
        return co;
    }

    public static void setCo(int co) {
        LogIn_form.co = co;
    }

    public static int getTe() {
        return te;
    }

    public static void setTe(int te) {
       LogIn_form.te = te;
    }

    public static int getMs() {
        return ms;
    }

    public static void setMs(int ms) {
        LogIn_form.ms = ms;
    }
    
    public static double getCoffeeP() {
        return coffeeP;
    }

    public static void setCoffeeP(double coffeeP) {
        LogIn_form.coffeeP = coffeeP;
    }

    public static double getMilkshakeP() {
        return milkshakeP;
    }

    public static void setMilkshakeP(double milkshakeP) {
        LogIn_form.milkshakeP = milkshakeP;
    }

    public static double getUpP() {
        return upP;
    }

    public static void setUpP(double upP) {
        LogIn_form.upP = upP;
    }

    public static double getPepsiP() {
        return pepsiP;
    }

    public static void setPepsiP(double pepsiP) {
       LogIn_form.pepsiP = pepsiP;
    }

    public static double getWaterP() {
        return waterP;
    }

    public static void setWaterP(double waterP) {
        LogIn_form.waterP = waterP;
    }

    public static double getTeaP() {
        return teaP;
    }

    public static void setTeaP(double teaP) {
        LogIn_form.teaP = teaP;
    }

    public static double getCbP() {
        return cbP;
    }

    public static void setCbP(double cbP) {
        LogIn_form.cbP = cbP;
    }

    public static double getBbP() {
        return bbP;
    }

    public static void setBbP(double bbP) {
        LogIn_form.bbP = bbP;
    }

    public static double getPizzaP() {
        return pizzaP;
    }

    public static void setPizzaP(double pizzaP) {
        LogIn_form.pizzaP = pizzaP;
    }

    public static double getPastaP() {
        return pastaP;
    }

    public static void setPastaP(double pastaP) {
        LogIn_form.pastaP = pastaP;
    }

    public static double getFriceP() {
        return friceP;
    }

    public static void setFriceP(double friceP) {
        LogIn_form.friceP = friceP;
    }

    public static double getSandwichP() {
        return sandwichP;
    }

    public static void setSandwichP(double sandwichP) {
        LogIn_form.sandwichP = sandwichP;
    }
    
    
    LogIn_form(){
        //setting javaframe properties
        c = this.getContentPane();
        cur = new Cursor(Cursor.HAND_CURSOR);
        lb1 = new JLabel("Username :");
        lb2 = new JLabel("Password :");
        lb3 = new JLabel();
        tf1 = new JTextField();
        pf = new JPasswordField();
        b1 = new JButton("LOGIN");
        b2 = new JButton("NEW ACCOUNT");
        f5 = new Font("Arial",Font.BOLD+Font.ITALIC,22);
        img1 = new ImageIcon(getClass().getResource("user.png"));
        img2 = new ImageIcon(getClass().getResource("log-in11.png"));
        
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        this.setIconImage(img1.getImage());
        
        lb3.setBounds(155,30,img2.getIconWidth(),img2.getIconHeight());
        lb3.setIcon(img2);
        c.add(lb3);
        
        lb1.setBounds(30,150,150,40); 
        tf1.setBounds(180,150,140,40);
        tf1.setBackground(Color.DARK_GRAY);
        tf1.setForeground(Color.WHITE);
        tf1.setFont(f5);
        lb1.setFont(f5);
        c.add(lb1); c.add(tf1);
        
        lb2.setBounds(30,210,140,40);
        pf.setBounds(180,210,140,40);
        pf.setBackground(Color.DARK_GRAY);
        pf.setForeground(Color.WHITE);
        pf.setFont(f5);
        pf.setEchoChar('*');
        lb2.setFont(f5);
        c.add(lb2);c.add(pf);
        
        b1.setBounds(20,270,130,40);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.BLACK);
        b1.setFont(f5);
        b1.setCursor(cur);
        c.add(b1);
        
        b2.setBounds(160,270,220,40);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.BLACK);
        b2.setFont(f5);
        b2.setCursor(cur);
        c.add(b2);
        
        
    //adding actionlistener to buttons    
        pro p = new pro();
        b1.addActionListener(p);
        b2.addActionListener(p);
    }
    
    class pro implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource().equals(b1)){
                //getting username and password
                String user = tf1.getText();
                String pass = pf.getText();
                String up = user+" , "+pass;
                int c = 0;
                //trying to compare the data with the data already stored in file
                try{
                    Scanner s = new Scanner(file1);
                    while(s.hasNext()){
                        String p = s.nextLine();
                        if(p.equals(up))
                        {//if the user name and password matches "c" will increase and the loop will break
                          c++;
                          break;
                        }
                                      }
                    //if "c" remains 0 it means no user name and password matched so log in unsuccessful
                    if(c==0)
                        {
                            JOptionPane.showMessageDialog(null,"LogIn unsuccessfull !\n   Try Again\n     or\n Create New Account!","Log In",JOptionPane.WARNING_MESSAGE);
                            tf1.setText("");
                            pf.setText("");
                        }
                    //if "c" is greater than 0 it means user name and password matched and log in successful
            else if(c>0)
                    {
                    //after login the login window will dispose and we will get a confirmation message    
                       dispose();    
                       JOptionPane.showMessageDialog(null,"Successfully logged in","Log In",JOptionPane.CLOSED_OPTION);
                       jf3 = new JFrame();
                    //getting the remaining food items from the files   
                       try{
                    Scanner sc = new Scanner(file3);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setCb(Integer.parseInt(p));
                        LogIn_form.setTcb(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file4);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setBb(Integer.parseInt(p));
                        LogIn_form.setTbb(Integer.parseInt(p));
                    }
                    sc = new Scanner(file5);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setPi(Integer.parseInt(p));
                        LogIn_form.setTpi(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file6);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setPa(Integer.parseInt(p));
                        LogIn_form.setTpa(Integer.parseInt(p));
                    }
                     sc = new Scanner(file7);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setFr(Integer.parseInt(p));
                        LogIn_form.setTfr(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file8);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setSn(Integer.parseInt(p));
                        LogIn_form.setTsn(Integer.parseInt(p));
                    }
                     sc = new Scanner(file9);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setWa(Integer.parseInt(p));
                        LogIn_form.setTwa(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file10);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setUp(Integer.parseInt(p));
                        LogIn_form.setTup(Integer.parseInt(p));
                    }
                     sc = new Scanner(file11);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setPe(Integer.parseInt(p));
                        LogIn_form.setTpe(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file12);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setMs(Integer.parseInt(p));
                        LogIn_form.setTms(Integer.parseInt(p));
                    }
                    sc = new Scanner(file13);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setCo(Integer.parseInt(p));
                        LogIn_form.setTco(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file14);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setTe(Integer.parseInt(p));
                        LogIn_form.setTte(Integer.parseInt(p));
                    }
                    //getting food prices from the files
                    sc = new Scanner(file15);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setCbP(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file16);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setBbP(Integer.parseInt(p));
                    }
                    sc = new Scanner(file17);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setPizzaP(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file18);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setPastaP(Integer.parseInt(p));
                    }
                     sc = new Scanner(file19);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setFriceP(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file20);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setSandwichP(Integer.parseInt(p));
                    }
                     sc = new Scanner(file21);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setWaterP(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file22);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setUpP(Integer.parseInt(p));
                    }
                     sc = new Scanner(file23);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setPepsiP(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file24);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setMilkshakeP(Integer.parseInt(p));
                    }
                    sc = new Scanner(file25);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setCoffeeP(Integer.parseInt(p));
                                      }
                    sc = new Scanner(file26);
                    while(sc.hasNext()){
                        String p = sc.nextLine();
                        LogIn_form.setTeaP(Integer.parseInt(p));
                    }
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"sorry had some problem");
                    }
        //setting javaframe properties               
        jf3.setBounds(30,10,900,800);
        jf3.setVisible(true);
        jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf3.setResizable(false);
        jf3.setTitle("Canteen Manager");
        c4 = jf3.getContentPane();
        c4.setLayout(null);
        
        jb1 = new JButton("Total");
        jb2 = new JButton("Receipt");
        jb3 = new JButton("Clear");
        jb4 = new JButton("Log out");
        jb5 = new JButton("Storage");
        jb6 = new JButton("Add Items");
        jb9 = new JButton("Information");
        jb10 = new JButton("SearchWindow");
        jb12 = new JButton("Change Price");
        
        ta = new JTextArea();
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        jl1 = new JLabel("Food Items");
        jl2 = new JLabel("Informations");
        jl3 = new JLabel("Receipt");
        jl4 = new JLabel("Meal");
        jl5 = new JLabel("Drinks");
        jl6 = new JLabel("Chicken burger");
        jl7 = new JLabel("Beef burger");
        jl8 = new JLabel("Pizza");
        jl9 = new JLabel("Pasta");
        jl10 = new JLabel("Fried rice");
        jl11 = new JLabel("Sandwich");
        jl12 = new JLabel("Total Items");
        jl13 = new JLabel("Water");
        jl14 = new JLabel("7Up");
        jl15 = new JLabel("Pepsi");
        jl16 = new JLabel("Milkshake");
        jl17 = new JLabel("Coffee");
        jl18 = new JLabel("Tea");
        jl19 = new JLabel("Total Price");
        jl20 = new JLabel();
        jl21 = new JLabel();
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        t10 = new JTextField();
        t11 = new JTextField();
        t12 = new JTextField();
                
        f = new Font("Arial",Font.BOLD,24);
        f1 = new Font("Arial",Font.BOLD+Font.ITALIC,16);
        f2 = new Font("Arial",Font.BOLD+Font.ITALIC,14);
        f3 = new Font("Monaco",Font.BOLD+Font.ITALIC,14);
        
        jl1.setFont(f);
        jl2.setFont(f);
        jl3.setFont(f);
        jl4.setFont(f);
        jl5.setFont(f);
        jl6.setFont(f2);
        jl7.setFont(f2);
        jl8.setFont(f2);
        jl9.setFont(f2);
        jl10.setFont(f2);
        jl11.setFont(f2);
        jl12.setFont(f2);
        jl13.setFont(f2);
        jl14.setFont(f2);
        jl15.setFont(f2);
        jl16.setFont(f2);
        jl17.setFont(f2);
        jl18.setFont(f2);
        jl19.setFont(f2);
        
        ta.setFont(f3);
        ta.setEditable(false);
        
        jl1.setBounds(0,0,600,50);
        jl2.setBounds(0,500,600,50);
        jl3.setBounds(600,0,300,50);
        jl4.setBounds(100,50,100,40);
        jl5.setBounds(360,50,100,40);
        jl6.setBounds(10,100,110,40);t1.setBounds(120,100,110,30);t1.setFont(f2);t1.setText("0");
        jl7.setBounds(10,150,110,40);t2.setBounds(120,150,110,30);t2.setFont(f2);t2.setText("0");
        jl8.setBounds(10,200,110,40);t3.setBounds(120,200,110,30);t3.setFont(f2);t3.setText("0");
        jl9.setBounds(10,250,110,40);t4.setBounds(120,250,110,30);t4.setFont(f2);t4.setText("0");
        jl10.setBounds(10,300,110,40);t5.setBounds(120,300,110,30);t5.setFont(f2);t5.setText("0");
        jl11.setBounds(10,350,110,40);t6.setBounds(120,350,110,30);t6.setFont(f2);t6.setText("0");
        jl12.setBounds(10,400,110,40);jl20.setBounds(120,400,110,30);jl20.setFont(f2);
        jl13.setBounds(300,100,110,40);t7.setBounds(420,100,110,30);t7.setFont(f2);t7.setText("0");
        jl14.setBounds(300,150,110,40);t8.setBounds(420,150,110,30);t8.setFont(f2);t8.setText("0");
        jl15.setBounds(300,200,110,40);t9.setBounds(420,200,110,30);t9.setFont(f2);t9.setText("0");
        jl16.setBounds(300,250,110,40);t10.setBounds(420,250,110,30);t10.setFont(f2);t10.setText("0");
        jl17.setBounds(300,300,110,40);t11.setBounds(420,300,110,30);t11.setFont(f2);t11.setText("0");
        jl18.setBounds(300,350,110,40);t12.setBounds(420,350,110,30);t12.setFont(f2);t12.setText("0");
        jl19.setBounds(300,400,110,40);jl21.setBounds(420,400,110,30);jl21.setFont(f2);
        
        ta.setBounds(604,50,292,706);
        
        jl20.setOpaque(true);jl20.setBackground(Color.white);
        jl21.setOpaque(true);jl21.setBackground(Color.white);
        
        
        jl1.setForeground(Color.BLACK);
        jl2.setForeground(Color.BLACK);
        jl3.setForeground(Color.BLACK);
        jl4.setForeground(Color.BLACK);
        jl5.setForeground(Color.BLACK);
        jl6.setForeground(Color.BLACK);
        jl7.setForeground(Color.BLACK);
        jl8.setForeground(Color.BLACK);
        jl9.setForeground(Color.BLACK);
        jl10.setForeground(Color.BLACK);
        jl11.setForeground(Color.BLACK);
        jl12.setForeground(Color.BLACK);
        jl13.setForeground(Color.BLACK);
        jl14.setForeground(Color.BLACK);
        jl15.setForeground(Color.BLACK);
        jl16.setForeground(Color.BLACK);
        jl17.setForeground(Color.BLACK);
        jl18.setForeground(Color.BLACK);
        jl19.setForeground(Color.BLACK);
        jl20.setForeground(Color.BLACK);
        jl21.setForeground(Color.BLACK);
        
        ta.setForeground(Color.BLACK);
        ta.setBackground(Color.GRAY);
        
        jl1.setHorizontalAlignment(JLabel.CENTER);
        jl2.setHorizontalAlignment(JLabel.CENTER);
        jl3.setHorizontalAlignment(JLabel.CENTER);
        jl4.setHorizontalAlignment(JLabel.CENTER);
        jl5.setHorizontalAlignment(JLabel.CENTER);
        jl20.setHorizontalAlignment(JLabel.CENTER);
        jl21.setHorizontalAlignment(JLabel.CENTER);
        
        t1.setHorizontalAlignment(JLabel.CENTER);
        t2.setHorizontalAlignment(JLabel.CENTER);
        t3.setHorizontalAlignment(JLabel.CENTER);
        t4.setHorizontalAlignment(JLabel.CENTER);
        t5.setHorizontalAlignment(JLabel.CENTER);
        t6.setHorizontalAlignment(JLabel.CENTER);
        t7.setHorizontalAlignment(JLabel.CENTER);
        t8.setHorizontalAlignment(JLabel.CENTER);
        t9.setHorizontalAlignment(JLabel.CENTER);
        t10.setHorizontalAlignment(JLabel.CENTER);
        t11.setHorizontalAlignment(JLabel.CENTER);
        t12.setHorizontalAlignment(JLabel.CENTER);
        

        
        jl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jl2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jl3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jl4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jl5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        p1.setBounds(0,0,600,450);
        p1.setBackground(Color.gray);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        p1.add(jl1);
        p2.setBounds(0,450,600,310);
        p2.setBackground(Color.gray);
        p2.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        p2.add(jl2);
        jb1.setFont(f1);
        jb2.setFont(f1);
        jb3.setFont(f1);
        jb4.setFont(f1);
        jb5.setFont(f1);
        jb6.setFont(f1);
        jb9.setFont(f1);
        jb10.setFont(f1);
        jb12.setFont(f1);
        jb1.setBackground(Color.DARK_GRAY);
        jb2.setBackground(Color.DARK_GRAY);
        jb3.setBackground(Color.DARK_GRAY);
        jb4.setBackground(Color.DARK_GRAY);
        jb5.setBackground(Color.DARK_GRAY);
        jb6.setBackground(Color.DARK_GRAY);
        jb9.setBackground(Color.DARK_GRAY);
        jb10.setBackground(Color.DARK_GRAY);
        jb12.setBackground(Color.DARK_GRAY);
        jb1.setForeground(Color.WHITE);
        jb2.setForeground(Color.WHITE);
        jb3.setForeground(Color.WHITE);
        jb4.setForeground(Color.WHITE);
        jb5.setForeground(Color.WHITE);
        jb6.setForeground(Color.WHITE);
        jb9.setForeground(Color.WHITE);
        jb10.setForeground(Color.WHITE);
        jb12.setForeground(Color.WHITE);
        jb1.setBounds(90,510,120,50);
        jb2.setBounds(250,510,120,50);
        jb3.setBounds(410,510,120,50);
        jb4.setBounds(90,580,120,50);
        jb5.setBounds(250,580,120,50);
        jb6.setBounds(410,580,120,50);
        jb9.setBounds(80,650,150,50);
        jb10.setBounds(240,650,150,50);
        jb12.setBounds(400,650,150,50);
        jb2.setEnabled(false);
        jb3.setEnabled(false);
        c4.add(jb1);c4.add(jb2);c4.add(jb3);c4.add(jb4);c4.add(jb5);c4.add(jb6);c4.add(jb9);c4.add(jb10);
        c4.add(jb12);
        p3.setBounds(600,0,300,760);
        p3.setBackground(Color.gray);
        p3.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        p3.add(jl3);
        c4.add(jl4);c4.add(jl5);c4.add(jl6);c4.add(jl7);c4.add(jl8);c4.add(jl9);c4.add(jl10);c4.add(jl11);
        c4.add(jl12);c4.add(jl13);c4.add(jl14);c4.add(jl15);c4.add(jl16);c4.add(jl17);c4.add(jl18);c4.add(jl19);
        c4.add(t1);c4.add(t2);c4.add(t3);c4.add(t4);c4.add(t5);c4.add(t6);c4.add(t7);c4.add(t8);
        c4.add(t9);c4.add(t10);c4.add(t11);c4.add(t12);c4.add(jl20);c4.add(jl21);c4.add(ta);
        c4.add(p1);c4.add(p2);c4.add(p3);
        //adding action listeners for button to update food price
        jb12.addActionListener(new ActionListener(){

                           @Override
                           public void actionPerformed(ActionEvent e) {
                    //setting javaframe properties
                    jf1 = new JFrame();
                    jf1.setVisible(true);
                    jf1.setBounds(300,50,400,700);
                    jf1.setResizable(false);
                    jf1.setTitle("Price");
                    c2 = jf1.getContentPane();
                    c2.setBackground(Color.GRAY);
                    c2.setLayout(null);
                
                JButton b = new JButton("Update");
                b.setBounds(150, 550,110,40);
                b.setFont(f1);
                b.setBackground(Color.DARK_GRAY);
                b.setForeground(Color.white);
                c2.add(b);
                jl = new JLabel[14];
                tf = new JTextField[12];
                for (int i = 0; i < 12; i++) {
                    tf[i] = new JTextField();
                    tf[i].setHorizontalAlignment(JLabel.CENTER);
                    tf[i].setFont(f2);
                } 
                jl[12] = new JLabel("   Items");jl[12].setBounds(30,20,110,30);
                jl[13] = new JLabel(" Price");jl[13].setBounds(170,20,110,30);
                jl[0] = new JLabel("Chicken burger");jl[0].setBounds(30,60,110,30);tf[0].setBounds(170,60,110,30);
                jl[1] = new JLabel("Beef burger");jl[1].setBounds(30,100,110,30);tf[1].setBounds(170,100,110,30);
                jl[2] = new JLabel("Pizza");jl[2].setBounds(30,140,110,30);tf[2].setBounds(170,140,110,30);         
                jl[3] = new JLabel("Pasta");jl[3].setBounds(30,180,110,30);tf[3].setBounds(170,180,110,30);
                jl[4] = new JLabel("Fried rice");jl[4].setBounds(30,220,110,30);tf[4].setBounds(170,220,110,30);
                jl[5] = new JLabel("Sandwich");jl[5].setBounds(30,260,110,30);tf[5].setBounds(170,260,110,30);
                jl[6] = new JLabel("Water");jl[6].setBounds(30,300,110,30);tf[6].setBounds(170,300,110,30);
                jl[7] = new JLabel("7up");jl[7].setBounds(30,340,110,30);tf[7].setBounds(170,340,110,30);
                jl[8] = new JLabel("Pepsi");jl[8].setBounds(30,380,110,30);tf[8].setBounds(170,380,110,30);
                jl[9] = new JLabel("Milkshake");jl[9].setBounds(30,420,110,30);tf[9].setBounds(170,420,110,30);
                jl[10] = new JLabel("Coffee");jl[10].setBounds(30,460,110,30);tf[10].setBounds(170,460,110,30);
                jl[11] = new JLabel("Tea");jl[11].setBounds(30,500,110,30);tf[11].setBounds(170,500,110,30);
                
                for (int i = 0; i < 14; i++) {
                    jl[i].setFont(f2);
                    c2.add(jl[i]);
                }
                //getting previous food price
                for (int i = 0; i < 12; i++) {
                    if(i==0){
                        tf[i].setText(""+LogIn_form.getCbP());
                    }
                    if(i==1){
                        tf[i].setText(""+LogIn_form.getBbP());
                    }
                    if(i==2){
                        tf[i].setText(""+LogIn_form.getPizzaP());
                    }
                    if(i==3){
                        tf[i].setText(""+LogIn_form.getPastaP());
                    }
                    if(i==4){
                        tf[i].setText(""+LogIn_form.getFriceP());
                    }
                    if(i==5){
                        tf[i].setText(""+LogIn_form.getSandwichP());
                    }
                    if(i==6){
                        tf[i].setText(""+LogIn_form.getWaterP());
                    }
                    if(i==7){
                        tf[i].setText(""+LogIn_form.getUpP());
                    }
                    if(i==8){
                        tf[i].setText(""+LogIn_form.getPepsiP());
                    }
                    if(i==9){
                        tf[i].setText(""+LogIn_form.getMilkshakeP());
                    }
                    if(i==10){
                        tf[i].setText(""+LogIn_form.getCoffeeP());
                    }
                    if(i==11){
                        tf[i].setText(""+LogIn_form.getTeaP());
                    }
                }
                
                for (int i = 0; i < 12; i++) {
                    c2.add(tf[i]);
                }
                //adding actionlistener to button to update food price and save it in files
                b.addActionListener(new ActionListener(){

                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       try{
                    FileWriter fw = new FileWriter(file15);
                    fw.write(tf[0].getText());
                    fw.close();
                    LogIn_form.setCbP(Integer.parseInt(tf[0].getText()));
                    
                    fw = new FileWriter(file16);
                    fw.write(tf[1].getText());
                    fw.close();
                    LogIn_form.setBbP(Integer.parseInt(tf[1].getText()));
                    
                    fw = new FileWriter(file17);
                    fw.write(tf[2].getText());
                    fw.close();
                    LogIn_form.setPizzaP(Integer.parseInt(tf[2].getText()));
                    
                    fw = new FileWriter(file18);
                    fw.write(tf[3].getText());
                    fw.close();
                    LogIn_form.setPastaP(Integer.parseInt(tf[3].getText()));
                    
                    fw = new FileWriter(file19);
                    fw.write(tf[4].getText());
                    fw.close();
                    LogIn_form.setFriceP(Integer.parseInt(tf[4].getText()));
                    
                    fw = new FileWriter(file20);
                    fw.write(tf[5].getText());
                    fw.close();
                    LogIn_form.setSandwichP(Integer.parseInt(tf[5].getText()));
                    
                    fw = new FileWriter(file21);
                    fw.write(tf[6].getText());
                    fw.close();
                    LogIn_form.setWaterP(Integer.parseInt(tf[6].getText()));
                    
                    fw = new FileWriter(file22);
                    fw.write(tf[7].getText());
                    fw.close();
                    LogIn_form.setUpP(Integer.parseInt(tf[7].getText()));
                    
                    fw = new FileWriter(file23);
                    fw.write(tf[8].getText());
                    fw.close();
                    LogIn_form.setPepsiP(Integer.parseInt(tf[8].getText()));
                    
                    fw = new FileWriter(file24);
                    fw.write(tf[9].getText());
                    fw.close();
                    LogIn_form.setMilkshakeP(Integer.parseInt(tf[9].getText()));
                    
                    fw = new FileWriter(file25);
                    fw.write(tf[10].getText());
                    fw.close();
                    LogIn_form.setCoffeeP(Integer.parseInt(tf[10].getText()));
                    
                    fw = new FileWriter(file26);
                    fw.write(tf[11].getText());
                    fw.close();
                    LogIn_form.setTeaP(Integer.parseInt(tf[11].getText()));
                    JOptionPane.showMessageDialog(null,"Updated");
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Had some issues");
                    }
                                       
                                   }
                    
                });
                           }
                           
        });
        //adding action listener to get total value of purchased foods
        jb1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int a[] = new int[12];
                //user must input either 0 or any positive integer
                
                if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||
                        t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||
                        t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")||
                        t10.getText().equals("")||t11.getText().equals("")||t12.getText().equals(""))
                {
                  JOptionPane.showMessageDialog(null,"Enter number of items\neither 0 or any positive integer");
                }
                
                a[0] = Integer.parseInt(t1.getText());
                a[1] = Integer.parseInt(t2.getText());
                a[2] = Integer.parseInt(t3.getText());
                a[3] = Integer.parseInt(t4.getText());
                a[4] = Integer.parseInt(t5.getText());
                a[5] = Integer.parseInt(t6.getText());
                a[6] = Integer.parseInt(t7.getText());
                a[7] = Integer.parseInt(t8.getText());
                a[8] = Integer.parseInt(t9.getText());
                a[9] = Integer.parseInt(t10.getText());
                a[10] = Integer.parseInt(t11.getText());
                a[11] = Integer.parseInt(t12.getText());
                
                //user must input either 0 or any positive integer
                if(a[0]<0||a[1]<0||a[2]<0||a[3]<0||a[4]<0||a[5]<0||a[6]<0||a[7]<0||a[8]<0||a[9]<0||
                        a[10]<0||a[11]<0){
                JOptionPane.showMessageDialog(null,"Enter number of items\neither 0 or any positive integer");
                }
                //if user input is greater than availaable items then a message will appear
                else if(a[0]>LogIn_form.getCb()){
                            JOptionPane.showMessageDialog(null,a[0]+" "+jl6.getText()+" is not available");
                            t1.setText("0");
                        }
                else if(a[1]>LogIn_form.getBb()){
                            JOptionPane.showMessageDialog(null,a[1]+" "+jl7.getText()+" is not available");
                            t2.setText("0");
                        }
                else if(a[2]>LogIn_form.getPi()){
                            JOptionPane.showMessageDialog(null,a[2]+" "+jl8.getText()+" is not available");
                            t3.setText("0");
                        }
                else if(a[3]>LogIn_form.getPa()){
                            JOptionPane.showMessageDialog(null,a[3]+" "+jl9.getText()+" is not available");
                            t4.setText("0");
                        }
                else if(a[4]>LogIn_form.getFr()){
                            JOptionPane.showMessageDialog(null,a[4]+" "+jl10.getText()+" is not available");
                            t5.setText("0");
                        }
                else if(a[5]>LogIn_form.getSn()){
                            JOptionPane.showMessageDialog(null,a[5]+" "+jl11.getText()+" is not available");
                            t6.setText("0");
                        }
                else if(a[6]>LogIn_form.getWa()){
                            JOptionPane.showMessageDialog(null,a[6]+" "+jl13.getText()+" is not available");
                            t7.setText("0");
                        }
                else if(a[7]>LogIn_form.getUp()){
                            JOptionPane.showMessageDialog(null,a[7]+" "+jl14.getText()+" is not available");
                            t8.setText("0");
                        }
                else if(a[8]>LogIn_form.getPe()){
                            JOptionPane.showMessageDialog(null,a[8]+" "+jl15.getText()+" is not available");
                            t9.setText("0");
                        }
                else if(a[9]>LogIn_form.getMs()){
                            JOptionPane.showMessageDialog(null,a[9]+" "+jl16.getText()+" is not available");
                            t10.setText("0");
                        }
                else if(a[10]>LogIn_form.getCo()){
                            JOptionPane.showMessageDialog(null,a[10]+" "+jl17.getText()+" is not available");
                            t11.setText("0");
                        }
                else if(a[11]>LogIn_form.getTe()){
                            JOptionPane.showMessageDialog(null,a[11]+" "+jl18.getText()+" is not available");
                            t12.setText("0");
                        }
    //if all goes well then the total will be calculated and the purchased items will be deducted from total items
                else{
                            jb1.setEnabled(false);
                            jb2.setEnabled(true);
                            jb3.setEnabled(true);
                            if(a[0]<LogIn_form.getCb()){
                            LogIn_form.setCb(LogIn_form.getCb()-a[0]);
                        }
                        if(a[1]<LogIn_form.getBb()){
                            LogIn_form.setBb(LogIn_form.getBb()-a[1]);
                        }
                        if(a[2]<LogIn_form.getPi()){
                            LogIn_form.setPi(LogIn_form.getPi()-a[2]);
                        }
                        if(a[3]<LogIn_form.getPa()){
                            LogIn_form.setPa(LogIn_form.getPa()-a[3]);
                        }
                        if(a[4]<LogIn_form.getFr()){
                            LogIn_form.setFr(LogIn_form.getFr()-a[4]);
                        }
                        if(a[5]<LogIn_form.getSn()){
                            LogIn_form.setSn(LogIn_form.getSn()-a[5]);
                        }
                        if(a[6]<LogIn_form.getWa()){
                            LogIn_form.setWa(LogIn_form.getWa()-a[6]);
                        }
                        if(a[7]<LogIn_form.getUp()){
                            LogIn_form.setUp(LogIn_form.getUp()-a[7]);
                        }
                        if(a[8]<LogIn_form.getPe()){
                            LogIn_form.setPe(LogIn_form.getPe()-a[8]);
                        }
                        if(a[9]<LogIn_form.getMs()){
                            LogIn_form.setMs(LogIn_form.getMs()-a[9]);
                        }
                        if(a[10]<LogIn_form.getCo()){
                            LogIn_form.setCo(LogIn_form.getCo()-a[10]);
                        }
                        if(a[11]<LogIn_form.getTe()){
                            LogIn_form.setTe(LogIn_form.getTe()-a[11]);
                        }
                //set the value of "ti" as total items purchased            
                 double ti = Double.parseDouble(t1.getText())+Double.parseDouble(t2.getText())+Double.parseDouble(t3.getText())+
                            Double.parseDouble(t4.getText())+Double.parseDouble(t5.getText())+Double.parseDouble(t6.getText())+
                         Double.parseDouble(t7.getText())+Double.parseDouble(t8.getText())+Double.parseDouble(t9.getText())+
                         Double.parseDouble(t10.getText())+Double.parseDouble(t11.getText())+Double.parseDouble(t12.getText());
                //set the value of "tp" as total price of the purchased items
                 tp = Double.parseDouble(t1.getText())*cbP+Double.parseDouble(t2.getText())*bbP+Double.parseDouble(t3.getText())*pizzaP+
                      Double.parseDouble(t4.getText())*pastaP+Double.parseDouble(t5.getText())*friceP+Double.parseDouble(t6.getText())*sandwichP+
                      Double.parseDouble(t7.getText())*waterP+Double.parseDouble(t8.getText())*upP+Double.parseDouble(t9.getText())*pepsiP+
                      Double.parseDouble(t10.getText())*milkshakeP+Double.parseDouble(t11.getText())*coffeeP+Double.parseDouble(t12.getText())*teaP;
                       
                      jl20.setText(""+ti);
                      jl21.setText(""+tp);
                      
                }
                
            }
        });
        //actionlistener for getting the receipt
        jb2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //setting javaframe properties
                jb2.setEnabled(false);
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy    HH:mm:ss");
                Date dateobj = new Date();
                Calendar calobj = Calendar.getInstance();
                //appending info of purchase to the text area 
                ta.append("   Items\t                 Price\n");
                
                if(Double.parseDouble(t1.getText())>0){
                    ta.append(jl6.getText()+"               "+cbP+" x "+t1.getText());
                }
                if(Double.parseDouble(t2.getText())>0){
                    ta.append("\n"+jl7.getText()+"                    "+bbP+" x "+t2.getText());
                }
                if(Double.parseDouble(t3.getText())>0){
                    ta.append("\n"+jl8.getText()+"                              "+pizzaP+" x "+t3.getText());
                }
                if(Double.parseDouble(t4.getText())>0){
                    ta.append("\n"+jl9.getText()+"                              "+pastaP+" x "+t4.getText());
                }
                if(Double.parseDouble(t5.getText())>0){
                    ta.append("\n"+jl10.getText()+"                       "+friceP+" x "+t5.getText());
                }
                if(Double.parseDouble(t6.getText())>0){
                    ta.append("\n"+jl11.getText()+"                        "+sandwichP+" x "+t6.getText());
                }
                if(Double.parseDouble(t7.getText())>0){
                    ta.append("\n"+jl13.getText()+"                             "+waterP+" x "+t7.getText());
                }
                if(Double.parseDouble(t8.getText())>0){
                    ta.append("\n"+jl14.getText()+"                                 "+upP+" x "+t8.getText());
                }
                if(Double.parseDouble(t9.getText())>0){
                    ta.append("\n"+jl15.getText()+"                             "+pepsiP+" x "+t9.getText());
                }
                if(Double.parseDouble(t10.getText())>0){
                    ta.append("\n"+jl16.getText()+"                       "+milkshakeP+" x "+t10.getText());
                }
                if(Double.parseDouble(t11.getText())>0){
                    ta.append("\n"+jl17.getText()+"                             "+coffeeP+" x "+t11.getText());
                }
                if(Double.parseDouble(t12.getText())>0){
                    ta.append("\n"+jl18.getText()+"                                 "+teaP+" x "+t12.getText());
                }
                ta.append("\n.......................................................................");
                ta.append("\n  Item :"+jl20.getText()+"         "+"Subtotal :"+jl21.getText());
                double t = tp+tp*15/100;
                ta.append("\n  VAT : 15%");
                ta.append("\t       VAT    : "+tp*15/100);
                ta.append("\n\t     Total  : "+t);
                ta.append("\n\n"+df.format(calobj.getTime()));
                //trying to save the receipt in file
                try{
                    FileWriter fw = new FileWriter(file2,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(ta.getText());
                    bw.newLine();
                    bw.close();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Could not save the receipt");
                }
                
                
            }
        });
        //actionlistener for clear button to clear all the fields
        jb3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //setting javaframe properties
                jb1.setEnabled(true);
                jb3.setEnabled(false);
                jb2.setEnabled(false);
                t1.setText("0");
                t2.setText("0");
                t3.setText("0");
                t4.setText("0");
                t5.setText("0");
                t6.setText("0");
                t7.setText("0");
                t8.setText("0");
                t9.setText("0");
                t10.setText("0");
                t11.setText("0");
                t12.setText("0");
                ta.setText(null);
                jl20.setText(null);
                jl21.setText(null);
            }
        });
        //actionlistener for adding new items to the store
        jb6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //setting javaframe properties    
                    jf = new JFrame();
                    jf.setVisible(true);
                    jf.setResizable(false);
                    jf.setBounds(300,50,400,600);
                    jf.setTitle("Add Items");
                    c1 = jf.getContentPane();
                    c1.setBackground(Color.GRAY);
                    c1.setLayout(null);
                    
                    jb7 = new JButton("Add");
                    jb7.setFont(f1);
                    jb7.setBackground(Color.DARK_GRAY);
                    jb7.setForeground(Color.WHITE);
                    jb7.setBounds(150,500,100,50);
                    
                jl = new JLabel[12];
                tf = new JTextField[12];
                for (int i = 0; i < 12; i++) {
                    tf[i] = new JTextField("0");
                    tf[i].setHorizontalAlignment(JLabel.CENTER);
                    tf[i].setFont(f2);
                } 
                jl[0] = new JLabel("Chicken burger");jl[0].setBounds(30,20,110,30);tf[0].setBounds(150,20,110,30);
                jl[1] = new JLabel("Beef burger");jl[1].setBounds(30,60,110,30);tf[1].setBounds(150,60,110,30);
                jl[2] = new JLabel("Pizza");jl[2].setBounds(30,100,110,30);tf[2].setBounds(150,100,110,30);         
                jl[3] = new JLabel("Pasta");jl[3].setBounds(30,140,110,30);tf[3].setBounds(150,140,110,30);
                jl[4] = new JLabel("Fried rice");jl[4].setBounds(30,180,110,30);tf[4].setBounds(150,180,110,30);
                jl[5] = new JLabel("Sandwich");jl[5].setBounds(30,220,110,30);tf[5].setBounds(150,220,110,30);
                jl[6] = new JLabel("Water");jl[6].setBounds(30,260,110,30);tf[6].setBounds(150,260,110,30);
                jl[7] = new JLabel("7up");jl[7].setBounds(30,300,110,30);tf[7].setBounds(150,300,110,30);
                jl[8] = new JLabel("Pepsi");jl[8].setBounds(30,340,110,30);tf[8].setBounds(150,340,110,30);
                jl[9] = new JLabel("Milkshake");jl[9].setBounds(30,380,110,30);tf[9].setBounds(150,380,110,30);
                jl[10] = new JLabel("Coffee");jl[10].setBounds(30,420,110,30);tf[10].setBounds(150,420,110,30);
                jl[11] = new JLabel("Tea");jl[11].setBounds(30,460,110,30);tf[11].setBounds(150,460,110,30);
                
                for (int i = 0; i < 12; i++) {
                    jl[i].setFont(f2);
                    c1.add(jl[i]);
                    c1.add(tf[i]);
                }
                c1.add(jb7);
                //actionlistener to update the items in store
                jb7.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int[] a = new int[12];
                            int x=0;
                            for (int i = 0; i < 12; i++) {
                                if(tf[i].getText().equals(""))
                                   x++; 
                            }
                            //if any textfield is empty the a message will appear
                            if(x>0){
                                JOptionPane.showMessageDialog(null,"Add 0 or positive integer on textfields");
                            }
                            //if textfields are filled properly then the data will be updated
                            for (int i = 0; i < 12; i++) {
                                a[i] = Integer.parseInt(tf[i].getText());
                                if(i==0 && a[i]>=0){
                                    int p = LogIn_form.getCb()+a[i];
                                    LogIn_form.setCb(p);
                                    LogIn_form.setTcb(p);
                                }
                                if(i==1 && a[i]>=0){
                                    int p = LogIn_form.getBb()+a[i];
                                    LogIn_form.setBb(p);
                                    LogIn_form.setTbb(p);
                                }
                                if(i==2 && a[i]>=0){
                                    int p = LogIn_form.getPi()+a[i];
                                    LogIn_form.setPi(p);
                                    LogIn_form.setTpi(p);
                                }
                                if(i==3 && a[i]>=0){
                                    int p = LogIn_form.getPa()+a[i];
                                    LogIn_form.setPa(p);
                                    LogIn_form.setTpa(p);
                                }
                                if(i==4 && a[i]>=0){
                                    int p = LogIn_form.getFr()+a[i];
                                    LogIn_form.setFr(p);
                                    LogIn_form.setTfr(p);
                                }
                                if(i==5 && a[i]>=0){
                                    int p = LogIn_form.getSn()+a[i];
                                    LogIn_form.setSn(p);
                                    LogIn_form.setTsn(p);
                                }
                                if(i==6 && a[i]>=0){
                                    int p = LogIn_form.getWa()+a[i];
                                    LogIn_form.setWa(p);
                                    LogIn_form.setTwa(p);
                                }
                                if(i==7 && a[i]>=0){
                                    int p = LogIn_form.getUp()+a[i];
                                    LogIn_form.setUp(p);
                                    LogIn_form.setTup(p);
                                }
                                if(i==8 && a[i]>=0){
                                    int p = LogIn_form.getPe()+a[i];
                                    LogIn_form.setPe(p);
                                    LogIn_form.setTpe(p);
                                }
                                if(i==9 && a[i]>=0){
                                    int p = LogIn_form.getMs()+a[i];
                                    LogIn_form.setMs(p);
                                    LogIn_form.setTms(p);
                                }
                                if(i==10 && a[i]>=0){
                                    int p = LogIn_form.getCo()+a[i];
                                    LogIn_form.setCo(p);
                                    LogIn_form.setTco(p);
                                }
                                if(i==11 && a[i]>=0){
                                    int p = LogIn_form.getTe()+a[i];
                                    LogIn_form.setTe(p);
                                    LogIn_form.setTte(p);
                                }
                            }
                            jf.dispose();
                            }
                    });
                    
            }
        });
        //action listener to show storage 
        jb5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                    //setting javaframe properties
                    jf1 = new JFrame();
                    jf1.setVisible(true);
                    jf1.setResizable(false);
                    jf1.setBounds(300,50,400,700);
                    jf1.setTitle("Storage");
                    c2 = jf1.getContentPane();
                    c2.setBackground(Color.GRAY);
                    c2.setLayout(null);
                    
                    jb8 = new JButton("OK");
                    jb8.setFont(f1);
                    jb8.setBackground(Color.DARK_GRAY);
                    jb8.setForeground(Color.WHITE);
                    jb8.setBounds(150,600,100,50);
                    
                jl = new JLabel[14];
                tf = new JTextField[12];
                for (int i = 0; i < 12; i++) {
                    tf[i] = new JTextField();
                    tf[i].setHorizontalAlignment(JLabel.CENTER);
                    tf[i].setFont(f2);
                    tf[i].setEditable(false);
                } 
                jl[12] = new JLabel("   Items");jl[12].setBounds(30,20,110,30);
                jl[13] = new JLabel(" Remaining");jl[13].setBounds(150,20,110,30);
                jl[0] = new JLabel("Chicken burger");jl[0].setBounds(30,60,110,30);tf[0].setBounds(150,60,110,30);
                jl[1] = new JLabel("Beef burger");jl[1].setBounds(30,100,110,30);tf[1].setBounds(150,100,110,30);
                jl[2] = new JLabel("Pizza");jl[2].setBounds(30,140,110,30);tf[2].setBounds(150,140,110,30);         
                jl[3] = new JLabel("Pasta");jl[3].setBounds(30,180,110,30);tf[3].setBounds(150,180,110,30);
                jl[4] = new JLabel("Fried rice");jl[4].setBounds(30,220,110,30);tf[4].setBounds(150,220,110,30);
                jl[5] = new JLabel("Sandwich");jl[5].setBounds(30,260,110,30);tf[5].setBounds(150,260,110,30);
                jl[6] = new JLabel("Water");jl[6].setBounds(30,300,110,30);tf[6].setBounds(150,300,110,30);
                jl[7] = new JLabel("7up");jl[7].setBounds(30,340,110,30);tf[7].setBounds(150,340,110,30);
                jl[8] = new JLabel("Pepsi");jl[8].setBounds(30,380,110,30);tf[8].setBounds(150,380,110,30);
                jl[9] = new JLabel("Milkshake");jl[9].setBounds(30,420,110,30);tf[9].setBounds(150,420,110,30);
                jl[10] = new JLabel("Coffee");jl[10].setBounds(30,460,110,30);tf[10].setBounds(150,460,110,30);
                jl[11] = new JLabel("Tea");jl[11].setBounds(30,500,110,30);tf[11].setBounds(150,500,110,30);
                
                for (int i = 0; i < 14; i++) {
                    jl[i].setFont(f2);
                    c2.add(jl[i]);
                }
                
                for (int i = 0; i < 12; i++) {
                    if(i==0){
                        tf[i].setText(""+LogIn_form.getCb());
                    }
                    if(i==1){
                        tf[i].setText(""+LogIn_form.getBb());
                    }
                    if(i==2){
                        tf[i].setText(""+LogIn_form.getPi());
                    }
                    if(i==3){
                        tf[i].setText(""+LogIn_form.getPa());
                    }
                    if(i==4){
                        tf[i].setText(""+LogIn_form.getFr());
                    }
                    if(i==5){
                        tf[i].setText(""+LogIn_form.getSn());
                    }
                    if(i==6){
                        tf[i].setText(""+LogIn_form.getWa());
                    }
                    if(i==7){
                        tf[i].setText(""+LogIn_form.getUp());
                    }
                    if(i==8){
                        tf[i].setText(""+LogIn_form.getPe());
                    }
                    if(i==9){
                        tf[i].setText(""+LogIn_form.getMs());
                    }
                    if(i==10){
                        tf[i].setText(""+LogIn_form.getCo());
                    }
                    if(i==11){
                        tf[i].setText(""+LogIn_form.getTe());
                    }
                }
                
                for (int i = 0; i < 12; i++) {
                    c2.add(tf[i]);
                }
                
                
                c2.add(jb8);
                jb8.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            jf1.dispose();
                        }
                });
            }
        });
        //actionlistener to logout
        jb4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //confirmation message to logout
               int r = JOptionPane.showConfirmDialog(null,"Are you sure ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               //if yes option selected then all the remaing food items will be saved in file 
               if(r==JOptionPane.YES_OPTION){
                    try{
                    FileWriter fw = new FileWriter(file3);
                    fw.write(Integer.toString(LogIn_form.getCb()));
                    fw.close();
                    
                    fw = new FileWriter(file4);
                    fw.write(Integer.toString(LogIn_form.getBb()));
                    fw.close();
                    
                    fw = new FileWriter(file5);
                    fw.write(Integer.toString(LogIn_form.getPi()));
                    fw.close();
                    
                    fw = new FileWriter(file6);
                    fw.write(Integer.toString(LogIn_form.getPa()));
                    fw.close();
                    
                    fw = new FileWriter(file7);
                    fw.write(Integer.toString(LogIn_form.getFr()));
                    fw.close();
                    
                    fw = new FileWriter(file8);
                    fw.write(Integer.toString(LogIn_form.getSn()));
                    fw.close();
                    
                    fw = new FileWriter(file9);
                    fw.write(Integer.toString(LogIn_form.getWa()));
                    fw.close();
                    
                    fw = new FileWriter(file10);
                    fw.write(Integer.toString(LogIn_form.getUp()));
                    fw.close();
                    
                    fw = new FileWriter(file11);
                    fw.write(Integer.toString(LogIn_form.getPe()));
                    fw.close();
                    
                    fw = new FileWriter(file12);
                    fw.write(Integer.toString(LogIn_form.getMs()));
                    fw.close();
                    
                    fw = new FileWriter(file13);
                    fw.write(Integer.toString(LogIn_form.getCo()));
                    fw.close();
                    
                    fw = new FileWriter(file14);
                    fw.write(Integer.toString(LogIn_form.getTe()));
                    fw.close();
                    
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Had some issues");
                    }
                    
                    
                    jf3.dispose();
                }
            }
        });
        //actionlistener to show the information window
        jb9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //setting javaframe properties
                    jf1 = new JFrame();
                    jf1.setVisible(true);
                    jf1.setResizable(false);
                    jf1.setBounds(300,50,600,700);
                    jf1.setTitle("Information");
                    c2 = jf1.getContentPane();
                    c2.setBackground(Color.GRAY);
                    c2.setLayout(null);
                    
                    jb8 = new JButton("OK");
                    jb8.setFont(f1);
                    jb8.setBackground(Color.DARK_GRAY);
                    jb8.setForeground(Color.WHITE);
                    jb8.setBounds(270,550,100,50);
                    
                jl = new JLabel[16];
                tf = new JTextField[36];
                for (int i = 0; i < 36; i++) {
                    tf[i] = new JTextField();
                    tf[i].setHorizontalAlignment(JLabel.CENTER);
                    tf[i].setFont(f2);
                    tf[i].setEditable(false);
                } 
                jl[12] = new JLabel("   Items");jl[12].setBounds(30,20,110,30);
                jl[13] = new JLabel(" Remaining");jl[13].setBounds(150,20,110,30);
                jl[14] = new JLabel("   Sold");jl[14].setBounds(270,20,110,30);
                jl[15] = new JLabel("   Total");jl[15].setBounds(390,20,110,30);
                jl[0] = new JLabel("Chicken burger");jl[0].setBounds(30,60,110,30);tf[0].setBounds(150,60,110,30);tf[12].setBounds(270,60,110,30);tf[24].setBounds(390,60,110,30);
                jl[1] = new JLabel("Beef burger");jl[1].setBounds(30,100,110,30);tf[1].setBounds(150,100,110,30);tf[13].setBounds(270,100,110,30);tf[25].setBounds(390,100,110,30);
                jl[2] = new JLabel("Pizza");jl[2].setBounds(30,140,110,30);tf[2].setBounds(150,140,110,30);tf[14].setBounds(270,140,110,30);tf[26].setBounds(390,140,110,30);         
                jl[3] = new JLabel("Pasta");jl[3].setBounds(30,180,110,30);tf[3].setBounds(150,180,110,30);tf[15].setBounds(270,180,110,30);tf[27].setBounds(390,180,110,30);
                jl[4] = new JLabel("Fried rice");jl[4].setBounds(30,220,110,30);tf[4].setBounds(150,220,110,30);tf[16].setBounds(270,220,110,30);tf[28].setBounds(390,220,110,30);
                jl[5] = new JLabel("Sandwich");jl[5].setBounds(30,260,110,30);tf[5].setBounds(150,260,110,30);tf[17].setBounds(270,260,110,30);tf[29].setBounds(390,260,110,30);
                jl[6] = new JLabel("Water");jl[6].setBounds(30,300,110,30);tf[6].setBounds(150,300,110,30);tf[18].setBounds(270,300,110,30);tf[30].setBounds(390,300,110,30);
                jl[7] = new JLabel("7up");jl[7].setBounds(30,340,110,30);tf[7].setBounds(150,340,110,30);tf[19].setBounds(270,340,110,30);tf[31].setBounds(390,340,110,30);
                jl[8] = new JLabel("Pepsi");jl[8].setBounds(30,380,110,30);tf[8].setBounds(150,380,110,30);tf[20].setBounds(270,380,110,30);tf[32].setBounds(390,380,110,30);
                jl[9] = new JLabel("Milkshake");jl[9].setBounds(30,420,110,30);tf[9].setBounds(150,420,110,30);tf[21].setBounds(270,420,110,30);tf[33].setBounds(390,420,110,30);
                jl[10] = new JLabel("Coffee");jl[10].setBounds(30,460,110,30);tf[10].setBounds(150,460,110,30);tf[22].setBounds(270,460,110,30);tf[34].setBounds(390,460,110,30);
                jl[11] = new JLabel("Tea");jl[11].setBounds(30,500,110,30);tf[11].setBounds(150,500,110,30);tf[23].setBounds(270,500,110,30);tf[35].setBounds(390,500,110,30);
                
                for (int i = 0; i < 16; i++) {
                    jl[i].setFont(f2);
                    c2.add(jl[i]);
                }
                //showing total,sold and remaining food items
                for (int i = 0; i < 36; i++) {
                    if(i==0){
                        tf[i].setText(""+LogIn_form.getCb());
                    }
                    if(i==1){
                        tf[i].setText(""+LogIn_form.getBb());
                    }
                    if(i==2){
                        tf[i].setText(""+LogIn_form.getPi());
                    }
                    if(i==3){
                        tf[i].setText(""+LogIn_form.getPa());
                    }
                    if(i==4){
                        tf[i].setText(""+LogIn_form.getFr());
                    }
                    if(i==5){
                        tf[i].setText(""+LogIn_form.getSn());
                    }
                    if(i==6){
                        tf[i].setText(""+LogIn_form.getWa());
                    }
                    if(i==7){
                        tf[i].setText(""+LogIn_form.getUp());
                    }
                    if(i==8){
                        tf[i].setText(""+LogIn_form.getPe());
                    }
                    if(i==9){
                        tf[i].setText(""+LogIn_form.getMs());
                    }
                    if(i==10){
                        tf[i].setText(""+LogIn_form.getCo());
                    }
                    if(i==11){
                        tf[i].setText(""+LogIn_form.getTe());
                    }
                    if(i==12){
                        tf[i].setText(""+(LogIn_form.getTcb()-LogIn_form.getCb()));
                    }
                    if(i==13){
                        tf[i].setText(""+(LogIn_form.getTbb()-LogIn_form.getBb()));
                    }
                    if(i==14){
                        tf[i].setText(""+(LogIn_form.getTpi()-LogIn_form.getPi()));
                    }
                    if(i==15){
                        tf[i].setText(""+(LogIn_form.getTpa()-LogIn_form.getPa()));
                    }
                    if(i==16){
                        tf[i].setText(""+(LogIn_form.getTfr()-LogIn_form.getFr()));
                    }
                    if(i==17){
                        tf[i].setText(""+(LogIn_form.getTsn()-LogIn_form.getSn()));
                    }
                    if(i==18){
                        tf[i].setText(""+(LogIn_form.getTwa()-LogIn_form.getWa()));
                    }
                    if(i==19){
                        tf[i].setText(""+(LogIn_form.getTup()-LogIn_form.getUp()));
                    }
                    if(i==20){
                        tf[i].setText(""+(LogIn_form.getTpe()-LogIn_form.getPe()));
                    }
                    if(i==21){
                        tf[i].setText(""+(LogIn_form.getTms()-LogIn_form.getMs()));
                    }
                    if(i==22){
                        tf[i].setText(""+(LogIn_form.getTco()-LogIn_form.getCo()));
                    }
                    if(i==23){
                        tf[i].setText(""+(LogIn_form.getTte()-LogIn_form.getTe()));
                    }
                    if(i==24){
                        tf[i].setText(""+LogIn_form.getTcb());
                    }
                    if(i==25){
                        tf[i].setText(""+LogIn_form.getTbb());
                    }
                    if(i==26){
                        tf[i].setText(""+LogIn_form.getTpi());
                    }
                    if(i==27){
                        tf[i].setText(""+LogIn_form.getTpa());
                    }
                    if(i==28){
                        tf[i].setText(""+LogIn_form.getTfr());
                    }
                    if(i==29){
                        tf[i].setText(""+LogIn_form.getTsn());
                    }
                    if(i==30){
                        tf[i].setText(""+LogIn_form.getTwa());
                    }
                    if(i==31){
                        tf[i].setText(""+LogIn_form.getTup());
                    }
                    if(i==32){
                        tf[i].setText(""+LogIn_form.getTpe());
                    }
                    if(i==33){
                        tf[i].setText(""+LogIn_form.getTms());
                    }
                    if(i==34){
                        tf[i].setText(""+LogIn_form.getTco());
                    }
                    if(i==35){
                        tf[i].setText(""+LogIn_form.getTte());
                    }
                    
                }
                
                for (int i = 0; i < 36; i++) {
                    c2.add(tf[i]);
                }
                
                
                c2.add(jb8);
                jb8.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            jf1.dispose();
                        }
                });
            }
        });
        //actionlistener for search window
        jb10.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                    //setting javaframe properties
                    jf2 = new JFrame();
                    jf2.setVisible(true);
                    jf2.setBounds(300,50,600,600);
                    jf2.setTitle("Search Window");
                    c3 = jf2.getContentPane();
                    c3.setBackground(Color.GRAY);
                    c3.setLayout(null);
                    
                    ta1 = new JTextArea();
                    ta1.setBackground(Color.GRAY);
                    ta1.setBorder(BorderFactory.createLineBorder(Color.black,2));
                    ta1.setForeground(Color.black);
                    ta1.setFont(f3);
                    ta1.setEditable(false);
                    
                    jsp = new JScrollPane(ta1);
                    jsp.setBounds(0,120,600, 550);
                    jsp.setEnabled(false);
                    
                    jb11 = new JButton("Show");
                    jb11.setFont(f1);
                    jb11.setBackground(Color.DARK_GRAY);
                    jb11.setForeground(Color.WHITE);
                    jb11.setBounds(280,50,200,50);
                    
                    //combobox items for search window
                    String s[] = {"Information","Storage","Employee","Price","Sell Info"}; 
                    jcb = new JComboBox(s);
                    jcb.setBounds(50,50,200,50);
                    jcb.setFont(f1);
                    jcb.setBackground(Color.DARK_GRAY);
                    jcb.setForeground(Color.WHITE);
                    c3.add(jcb);c3.add(jb11);c3.add(jsp);
                    
                    jb11.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent e){
                    //show information
                    if(jcb.getSelectedIndex()==0){
                    jf2.dispose();
                    jf1 = new JFrame();
                    jf1.setVisible(true);
                    jf1.setResizable(false);
                    jf1.setBounds(300,50,600,700);
                    jf1.setTitle("Information");
                    c2 = jf1.getContentPane();
                    c2.setBackground(Color.GRAY);
                    c2.setLayout(null);
                    
                    
                jl = new JLabel[16];
                tf = new JTextField[36];
                for (int i = 0; i < 36; i++) {
                    tf[i] = new JTextField();
                    tf[i].setHorizontalAlignment(JLabel.CENTER);
                    tf[i].setFont(f2);
                    tf[i].setEditable(false);
                } 
                jl[12] = new JLabel("   Items");jl[12].setBounds(30,20,110,30);
                jl[13] = new JLabel(" Remaining");jl[13].setBounds(150,20,110,30);
                jl[14] = new JLabel("   Sold");jl[14].setBounds(270,20,110,30);
                jl[15] = new JLabel("   Total");jl[15].setBounds(390,20,110,30);
                jl[0] = new JLabel("Chicken burger");jl[0].setBounds(30,60,110,30);tf[0].setBounds(150,60,110,30);tf[12].setBounds(270,60,110,30);tf[24].setBounds(390,60,110,30);
                jl[1] = new JLabel("Beef burger");jl[1].setBounds(30,100,110,30);tf[1].setBounds(150,100,110,30);tf[13].setBounds(270,100,110,30);tf[25].setBounds(390,100,110,30);
                jl[2] = new JLabel("Pizza");jl[2].setBounds(30,140,110,30);tf[2].setBounds(150,140,110,30);tf[14].setBounds(270,140,110,30);tf[26].setBounds(390,140,110,30);         
                jl[3] = new JLabel("Pasta");jl[3].setBounds(30,180,110,30);tf[3].setBounds(150,180,110,30);tf[15].setBounds(270,180,110,30);tf[27].setBounds(390,180,110,30);
                jl[4] = new JLabel("Fried rice");jl[4].setBounds(30,220,110,30);tf[4].setBounds(150,220,110,30);tf[16].setBounds(270,220,110,30);tf[28].setBounds(390,220,110,30);
                jl[5] = new JLabel("Sandwich");jl[5].setBounds(30,260,110,30);tf[5].setBounds(150,260,110,30);tf[17].setBounds(270,260,110,30);tf[29].setBounds(390,260,110,30);
                jl[6] = new JLabel("Water");jl[6].setBounds(30,300,110,30);tf[6].setBounds(150,300,110,30);tf[18].setBounds(270,300,110,30);tf[30].setBounds(390,300,110,30);
                jl[7] = new JLabel("7up");jl[7].setBounds(30,340,110,30);tf[7].setBounds(150,340,110,30);tf[19].setBounds(270,340,110,30);tf[31].setBounds(390,340,110,30);
                jl[8] = new JLabel("Pepsi");jl[8].setBounds(30,380,110,30);tf[8].setBounds(150,380,110,30);tf[20].setBounds(270,380,110,30);tf[32].setBounds(390,380,110,30);
                jl[9] = new JLabel("Milkshake");jl[9].setBounds(30,420,110,30);tf[9].setBounds(150,420,110,30);tf[21].setBounds(270,420,110,30);tf[33].setBounds(390,420,110,30);
                jl[10] = new JLabel("Coffee");jl[10].setBounds(30,460,110,30);tf[10].setBounds(150,460,110,30);tf[22].setBounds(270,460,110,30);tf[34].setBounds(390,460,110,30);
                jl[11] = new JLabel("Tea");jl[11].setBounds(30,500,110,30);tf[11].setBounds(150,500,110,30);tf[23].setBounds(270,500,110,30);tf[35].setBounds(390,500,110,30);
                
                for (int i = 0; i < 16; i++) {
                    jl[i].setFont(f2);
                    c2.add(jl[i]);
                }
                
                for (int i = 0; i < 36; i++) {
                    if(i==0){
                        tf[i].setText(""+LogIn_form.getCb());
                    }
                    if(i==1){
                        tf[i].setText(""+LogIn_form.getBb());
                    }
                    if(i==2){
                        tf[i].setText(""+LogIn_form.getPi());
                    }
                    if(i==3){
                        tf[i].setText(""+LogIn_form.getPa());
                    }
                    if(i==4){
                        tf[i].setText(""+LogIn_form.getFr());
                    }
                    if(i==5){
                        tf[i].setText(""+LogIn_form.getSn());
                    }
                    if(i==6){
                        tf[i].setText(""+LogIn_form.getWa());
                    }
                    if(i==7){
                        tf[i].setText(""+LogIn_form.getUp());
                    }
                    if(i==8){
                        tf[i].setText(""+LogIn_form.getPe());
                    }
                    if(i==9){
                        tf[i].setText(""+LogIn_form.getMs());
                    }
                    if(i==10){
                        tf[i].setText(""+LogIn_form.getCo());
                    }
                    if(i==11){
                        tf[i].setText(""+LogIn_form.getTe());
                    }
                    if(i==12){
                        tf[i].setText(""+(LogIn_form.getTcb()-LogIn_form.getCb()));
                    }
                    if(i==13){
                        tf[i].setText(""+(LogIn_form.getTbb()-LogIn_form.getBb()));
                    }
                    if(i==14){
                        tf[i].setText(""+(LogIn_form.getTpi()-LogIn_form.getPi()));
                    }
                    if(i==15){
                        tf[i].setText(""+(LogIn_form.getTpa()-LogIn_form.getPa()));
                    }
                    if(i==16){
                        tf[i].setText(""+(LogIn_form.getTfr()-LogIn_form.getFr()));
                    }
                    if(i==17){
                        tf[i].setText(""+(LogIn_form.getTsn()-LogIn_form.getSn()));
                    }
                    if(i==18){
                        tf[i].setText(""+(LogIn_form.getTwa()-LogIn_form.getWa()));
                    }
                    if(i==19){
                        tf[i].setText(""+(LogIn_form.getTup()-LogIn_form.getUp()));
                    }
                    if(i==20){
                        tf[i].setText(""+(LogIn_form.getTpe()-LogIn_form.getPe()));
                    }
                    if(i==21){
                        tf[i].setText(""+(LogIn_form.getTms()-LogIn_form.getMs()));
                    }
                    if(i==22){
                        tf[i].setText(""+(LogIn_form.getTco()-LogIn_form.getCo()));
                    }
                    if(i==23){
                        tf[i].setText(""+(LogIn_form.getTte()-LogIn_form.getTe()));
                    }
                    if(i==24){
                        tf[i].setText(""+LogIn_form.getTcb());
                    }
                    if(i==25){
                        tf[i].setText(""+LogIn_form.getTbb());
                    }
                    if(i==26){
                        tf[i].setText(""+LogIn_form.getTpi());
                    }
                    if(i==27){
                        tf[i].setText(""+LogIn_form.getTpa());
                    }
                    if(i==28){
                        tf[i].setText(""+LogIn_form.getTfr());
                    }
                    if(i==29){
                        tf[i].setText(""+LogIn_form.getTsn());
                    }
                    if(i==30){
                        tf[i].setText(""+LogIn_form.getTwa());
                    }
                    if(i==31){
                        tf[i].setText(""+LogIn_form.getTup());
                    }
                    if(i==32){
                        tf[i].setText(""+LogIn_form.getTpe());
                    }
                    if(i==33){
                        tf[i].setText(""+LogIn_form.getTms());
                    }
                    if(i==34){
                        tf[i].setText(""+LogIn_form.getTco());
                    }
                    if(i==35){
                        tf[i].setText(""+LogIn_form.getTte());
                    }
                    
                }
                
                for (int i = 0; i < 36; i++) {
                    c2.add(tf[i]);
                }
                
                
                        }          
                            else if(jcb.getSelectedIndex()==1){
                            //show storage
                                jf2.dispose();
                              jf1 = new JFrame();
                    jf1.setVisible(true);
                    jf1.setResizable(false);
                    jf1.setBounds(300,50,400,600);
                    jf1.setTitle("Storage");
                    c2 = jf1.getContentPane();
                    c2.setBackground(Color.GRAY);
                    c2.setLayout(null);
                    
                jl = new JLabel[14];
                tf = new JTextField[12];
                for (int i = 0; i < 12; i++) {
                    tf[i] = new JTextField();
                    tf[i].setHorizontalAlignment(JLabel.CENTER);
                    tf[i].setFont(f2);
                    tf[i].setEditable(false);
                } 
                jl[12] = new JLabel("   Items");jl[12].setBounds(30,20,110,30);
                jl[13] = new JLabel(" Remaining");jl[13].setBounds(150,20,110,30);
                jl[0] = new JLabel("Chicken burger");jl[0].setBounds(30,60,110,30);tf[0].setBounds(150,60,110,30);
                jl[1] = new JLabel("Beef burger");jl[1].setBounds(30,100,110,30);tf[1].setBounds(150,100,110,30);
                jl[2] = new JLabel("Pizza");jl[2].setBounds(30,140,110,30);tf[2].setBounds(150,140,110,30);         
                jl[3] = new JLabel("Pasta");jl[3].setBounds(30,180,110,30);tf[3].setBounds(150,180,110,30);
                jl[4] = new JLabel("Fried rice");jl[4].setBounds(30,220,110,30);tf[4].setBounds(150,220,110,30);
                jl[5] = new JLabel("Sandwich");jl[5].setBounds(30,260,110,30);tf[5].setBounds(150,260,110,30);
                jl[6] = new JLabel("Water");jl[6].setBounds(30,300,110,30);tf[6].setBounds(150,300,110,30);
                jl[7] = new JLabel("7up");jl[7].setBounds(30,340,110,30);tf[7].setBounds(150,340,110,30);
                jl[8] = new JLabel("Pepsi");jl[8].setBounds(30,380,110,30);tf[8].setBounds(150,380,110,30);
                jl[9] = new JLabel("Milkshake");jl[9].setBounds(30,420,110,30);tf[9].setBounds(150,420,110,30);
                jl[10] = new JLabel("Coffee");jl[10].setBounds(30,460,110,30);tf[10].setBounds(150,460,110,30);
                jl[11] = new JLabel("Tea");jl[11].setBounds(30,500,110,30);tf[11].setBounds(150,500,110,30);
                
                for (int i = 0; i < 14; i++) {
                    jl[i].setFont(f2);
                    c2.add(jl[i]);
                }
                
                for (int i = 0; i < 12; i++) {
                    if(i==0){
                        tf[i].setText(""+LogIn_form.getCb());
                    }
                    if(i==1){
                        tf[i].setText(""+LogIn_form.getBb());
                    }
                    if(i==2){
                        tf[i].setText(""+LogIn_form.getPi());
                    }
                    if(i==3){
                        tf[i].setText(""+LogIn_form.getPa());
                    }
                    if(i==4){
                        tf[i].setText(""+LogIn_form.getFr());
                    }
                    if(i==5){
                        tf[i].setText(""+LogIn_form.getSn());
                    }
                    if(i==6){
                        tf[i].setText(""+LogIn_form.getWa());
                    }
                    if(i==7){
                        tf[i].setText(""+LogIn_form.getUp());
                    }
                    if(i==8){
                        tf[i].setText(""+LogIn_form.getPe());
                    }
                    if(i==9){
                        tf[i].setText(""+LogIn_form.getMs());
                    }
                    if(i==10){
                        tf[i].setText(""+LogIn_form.getCo());
                    }
                    if(i==11){
                        tf[i].setText(""+LogIn_form.getTe());
                    }
                }
                
                for (int i = 0; i < 12; i++) {
                    c2.add(tf[i]);
                }
                            }
                            else if(jcb.getSelectedIndex()==3){
                                //show food price
                                jf1 = new JFrame();
                    jf1.setVisible(true);
                    jf1.setBounds(300,50,400,600);
                    jf1.setResizable(false);
                    jf1.setTitle("Price");
                    c2 = jf1.getContentPane();
                    c2.setBackground(Color.GRAY);
                    c2.setLayout(null);
                                     
                jl = new JLabel[14];
                tf = new JTextField[12];
                for (int i = 0; i < 12; i++) {
                    tf[i] = new JTextField();
                    tf[i].setHorizontalAlignment(JLabel.CENTER);
                    tf[i].setFont(f2);
                    tf[i].setEditable(false);
                } 
                jl[12] = new JLabel("   Items");jl[12].setBounds(30,20,110,30);
                jl[13] = new JLabel(" Remaining");jl[13].setBounds(150,20,110,30);
                jl[0] = new JLabel("Chicken burger");jl[0].setBounds(30,60,110,30);tf[0].setBounds(150,60,110,30);
                jl[1] = new JLabel("Beef burger");jl[1].setBounds(30,100,110,30);tf[1].setBounds(150,100,110,30);
                jl[2] = new JLabel("Pizza");jl[2].setBounds(30,140,110,30);tf[2].setBounds(150,140,110,30);         
                jl[3] = new JLabel("Pasta");jl[3].setBounds(30,180,110,30);tf[3].setBounds(150,180,110,30);
                jl[4] = new JLabel("Fried rice");jl[4].setBounds(30,220,110,30);tf[4].setBounds(150,220,110,30);
                jl[5] = new JLabel("Sandwich");jl[5].setBounds(30,260,110,30);tf[5].setBounds(150,260,110,30);
                jl[6] = new JLabel("Water");jl[6].setBounds(30,300,110,30);tf[6].setBounds(150,300,110,30);
                jl[7] = new JLabel("7up");jl[7].setBounds(30,340,110,30);tf[7].setBounds(150,340,110,30);
                jl[8] = new JLabel("Pepsi");jl[8].setBounds(30,380,110,30);tf[8].setBounds(150,380,110,30);
                jl[9] = new JLabel("Milkshake");jl[9].setBounds(30,420,110,30);tf[9].setBounds(150,420,110,30);
                jl[10] = new JLabel("Coffee");jl[10].setBounds(30,460,110,30);tf[10].setBounds(150,460,110,30);
                jl[11] = new JLabel("Tea");jl[11].setBounds(30,500,110,30);tf[11].setBounds(150,500,110,30);
                
                for (int i = 0; i < 14; i++) {
                    jl[i].setFont(f2);
                    c2.add(jl[i]);
                }
                
                for (int i = 0; i < 12; i++) {
                    if(i==0){
                        tf[i].setText(""+LogIn_form.getCbP());
                    }
                    if(i==1){
                        tf[i].setText(""+LogIn_form.getBbP());
                    }
                    if(i==2){
                        tf[i].setText(""+LogIn_form.getPizzaP());
                    }
                    if(i==3){
                        tf[i].setText(""+LogIn_form.getPastaP());
                    }
                    if(i==4){
                        tf[i].setText(""+LogIn_form.getFriceP());
                    }
                    if(i==5){
                        tf[i].setText(""+LogIn_form.getSandwichP());
                    }
                    if(i==6){
                        tf[i].setText(""+LogIn_form.getWaterP());
                    }
                    if(i==7){
                        tf[i].setText(""+LogIn_form.getUpP());
                    }
                    if(i==8){
                        tf[i].setText(""+LogIn_form.getPepsiP());
                    }
                    if(i==9){
                        tf[i].setText(""+LogIn_form.getMilkshakeP());
                    }
                    if(i==10){
                        tf[i].setText(""+LogIn_form.getCoffeeP());
                    }
                    if(i==11){
                        tf[i].setText(""+LogIn_form.getTeaP());
                    }
                }
                
                for (int i = 0; i < 12; i++) {
                    c2.add(tf[i]);
                }
                            }
                            else if(jcb.getSelectedIndex()==2){
                                //show user names
                                jsp.setEnabled(true);
                                ta1.setText(null);
                                try{
                                Scanner sc = new Scanner(file1);
                                while(sc.hasNext()){
                                    String n = sc.next();
                                       ta1.append(n+"\n");
                                       if(sc.next().endsWith(",")||sc.next().endsWith(";"))
                                               sc.nextLine();
                                }
                                
                                }
                                catch(Exception ex){
                                    JOptionPane.showMessageDialog(null,ex);
                                }
                            }
                            else if(jcb.getSelectedIndex()==4){
                                //show sell information
                                jsp.setEnabled(true);
                                ta1.setText(null);
                                try{
                                Scanner sc = new Scanner(file2);
                                while(sc.hasNext()){
                                    ta1.append(sc.nextLine()+"\n");
                                }
                                }
                                catch(Exception ex){
                                    JOptionPane.showMessageDialog(null,ex);
                                }
                            }
                        }
                    });
            }
                        });
        
            }
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex);
                }
            }
            //new frame for creating new account
                   if(ae.getSource().equals(b2))
            {
                //setting javaframe properties
                jf4 = new JFrame();
                jf4.setTitle("New Account Form");
                jf4.setBounds(400,50,400,500);
                jf4.setVisible(true);
                
                jf4.setResizable(false);
                c5 = jf4.getContentPane();
                c5.setLayout(null);
                c5.setBackground(Color.GRAY);
                cur1 = new Cursor(Cursor.HAND_CURSOR);
                l1 = new JLabel("Username :");
                l2 = new JLabel("Password :");
                l3 = new JLabel();
                l4 = new JLabel("Confirm Pass :");
                tf2 = new JTextField();
                pf1 = new JPasswordField();
                pf2 = new JPasswordField();
                b3 = new JButton("Create Account");
                f5 = new Font("Arial",Font.BOLD+Font.ITALIC,22);
                img1 = new ImageIcon(getClass().getResource("user.png"));
                img2 = new ImageIcon(getClass().getResource("log-in11.png"));

                jf4.setIconImage(img1.getImage());

                l3.setBounds(150,30,img2.getIconWidth(),img2.getIconHeight());
                l3.setIcon(img2);
        
        
        l1.setBounds(30,150,160,40); 
        tf2.setBounds(200,150,160,40);
        tf2.setBackground(Color.DARK_GRAY);
        tf2.setForeground(Color.WHITE);
        tf2.setFont(f5);
        l1.setFont(f5);
        
        
        l2.setBounds(30,210,160,40);
        pf1.setBounds(200,210,160,40);
        pf1.setBackground(Color.DARK_GRAY);
        pf1.setForeground(Color.WHITE);
        pf1.setFont(f5);
        pf1.setEchoChar('*');
        l2.setFont(f5);
        
        
        l4.setBounds(10,270,190,40);
        pf2.setBounds(200,270,160,40);
        pf2.setBackground(Color.DARK_GRAY);
        pf2.setForeground(Color.WHITE);
        pf2.setFont(f5);
        pf2.setEchoChar('*');
        l4.setFont(f5);
        
        
        b3.setBounds(60,330,250,40);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.BLACK);
        b3.setFont(f5);
        b3.setCursor(cur1);
        
        c5.add(l1); c5.add(tf2);c5.add(l2);c5.add(pf1);c5.add(l4);c5.add(pf2);c5.add(l3);c5.add(b3);
        
        b3.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //getting user name and password and confirmation
            String user = tf2.getText();
            String pass = pf1.getText();
            String conpass = pf2.getText();
            String up = user+" , "+pass;
            int c = 0;
            //if any textfields remains empty a warning message will appear
            if(user.isEmpty() || pass.isEmpty() || conpass.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fillup all fields !","Warning",JOptionPane.WARNING_MESSAGE);
            }
            //compare user input with saved file to know if any of the info matches or not
            else{
                try{
                Scanner sc = new Scanner(file1);
            while(sc.hasNext()){
                if(sc.next().endsWith(",") && sc.next().equals(user))
            {
                c++;
                break;
            }
                               }
            //if matches the a message will appear to try other username
            if(c>0){
                tf2.setText("");
                pf1.setText("");
                pf2.setText("");
                JOptionPane.showMessageDialog(null,"Username is already taken, try another name","Warning",JOptionPane.WARNING_MESSAGE);
            
            }
//if all fields are filled accordingly then the data will be saved in file and new account will be created
               else if(pass.equals(conpass)){
                try{
                    FileWriter fw = new FileWriter("LogInInfo.txt",true);
                    try (BufferedWriter bw = new BufferedWriter(fw)) {
                        bw.write(user+" , "+pass);
                        bw.newLine();
                    }
                    JOptionPane.showMessageDialog(null,"Account created","LogIn",JOptionPane.CLOSED_OPTION);
                    LogIn_form lf = new LogIn_form();
                    lf.setVisible(true);
                //    jf4.dispose();
                }
                
                catch(Exception ex){
                    System.out.println("File not found \n"+ex);
                }
                jf4.dispose();
            }
         //if password and confirm password is not same then a message will appear
            else
            {
                JOptionPane.showMessageDialog(null,"Password & Confirm Password is not same");
                pf1.setText("");
                pf2.setText("");
            }
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null,"na "+ex,"Warning",JOptionPane.WARNING_MESSAGE);
            }
        
    }
                             }
                }
            
);
            
        }
    
            }
            
        }
    

       
    
    
    public static void main(String[] args) {
        //creating object of the class
        LogIn_form f = new LogIn_form();
        //initializing files
        f.file1 = new File("LogInInfo.txt");
        f.file2 = new File("Information.txt");
        f.file3 = new File("ChickenB.txt");
        f.file4 = new File("BeefB.txt");
        f.file5 = new File("Pizza.txt");
        f.file6 = new File("Pasta.txt");
        f.file7 = new File("FriedR.txt");
        f.file8 = new File("Sandwich.txt");
        f.file9 = new File("Water.txt");
        f.file10 = new File("Up.txt");
        f.file11 = new File("Pepsi.txt");
        f.file12 = new File("MilkS.txt");
        f.file13 = new File("Coffee.txt");
        f.file14 = new File("Tea.txt");
        f.file15 = new File("ChickenBP.txt");
        f.file16 = new File("BeefBP.txt");
        f.file17 = new File("PizzaP.txt");
        f.file18 = new File("PastaP.txt");
        f.file19 = new File("FriedRP.txt");
        f.file20 = new File("SandwichP.txt");
        f.file21 = new File("WaterP.txt");
        f.file22 = new File("UpP.txt");
        f.file23 = new File("PepsiP.txt");
        f.file24 = new File("MilkSP.txt");
        f.file25 = new File("CoffeeP.txt");
        f.file26 = new File("TeaP.txt");
        //trying to create files 
        try{
            f.file1.createNewFile();
            f.file2.createNewFile();
            f.file3.createNewFile();
            f.file4.createNewFile();
            f.file5.createNewFile();
            f.file6.createNewFile();
            f.file7.createNewFile();
            f.file8.createNewFile();
            f.file9.createNewFile();
            f.file10.createNewFile();
            f.file11.createNewFile();
            f.file12.createNewFile();
            f.file13.createNewFile();
            f.file14.createNewFile();
            f.file15.createNewFile();
            f.file16.createNewFile();
            f.file17.createNewFile();
            f.file18.createNewFile();
            f.file19.createNewFile();
            f.file20.createNewFile();
            f.file21.createNewFile();
            f.file22.createNewFile();
            f.file23.createNewFile();
            f.file24.createNewFile();
            f.file25.createNewFile();
            f.file26.createNewFile();
            System.out.println("File Created");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Had some problem");
        }
        //settig up javaframe properties 
        f.setTitle("LogIn Form");
        f.setBounds(200,50,400,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}