package bank.management.system;
import com.toedter.calendar.JDateChooser;
import  javax.swing.*;
import java.awt.*;
import java.lang.String;
import java.awt.Color;
import javax.swing.JTextField;
//import java.awt.Image;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SignUp extends JFrame implements ActionListener{

    JRadioButton r1,r2,m1,m2,m3;
    JTextField textName,textFname,textEmail,textMS,textAdd,textCity,textPin,textState;

    JButton next;

    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L) + 1000L;

    String first = " "+Math.abs(first4);

    SignUp(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form Number."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name  ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfname = new JLabel("Father's Name ");
        labelfname.setFont(new Font("Raleway",Font.BOLD,20));
        labelfname.setBounds(100,240,200,30);
        add(labelfname);


        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);


        JLabel DOB = new JLabel(" Date of Birth :  ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel labelG = new JLabel("Gender ");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 =new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.GREEN); // Set background color of r1 to red
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 =new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.GREEN); // Set background color of r1 to re
        r2.setBounds(450,290,80,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel labelEmail = new JLabel("Email address");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,20));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMS = new JLabel("Married Status");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(Color.RED);
        add(m1);

        m2 = new JRadioButton("Un-Married");
        m2.setBounds(450,440,130,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(Color.WHITE);
        add(m2);

        m3 = new JRadioButton("Divorce");
        m3.setBounds(635,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(Color.PINK);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,20));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,20));
        textCity.setBounds(300,540,400,30);
        add(textCity);


        JLabel labelPin = new JLabel("PinCode ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,20));
        textPin.setBounds(300,590,400,30);
        add(textPin);


        JLabel labelState = new JLabel("State");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,20));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String  formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender ="Male";
        }else if(r2.isSelected()){
            gender ="Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }if(m2.isSelected()){
            marital = "Un-married";
        }else if(m3.isSelected()){
            marital = "Divorce";
        }
        String address = textAdd.getText();
        String city =  textCity.getText();
        String pincode = textPin.getText();
        String state  =  textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else{
                Con con1 = new Con();

                String q = "insert into SignUp values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new SignUp2(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new SignUp();
    }
}
