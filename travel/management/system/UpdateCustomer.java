package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername,labelname;
    JRadioButton rmale,rfemale;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone,tfid,tfgender;
    JButton update,back;
    
    
    UpdateCustomer(String username){
        
        setBounds(300,100,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid=new JLabel("Id");
        lblid.setBounds(30,90,150,25);
        add(lblid);
        
        tfid=new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid); 
        
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber=new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname=new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        tfgender=new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender); 
        
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
        JLabel lblemail=new JLabel("Email Id");
        lblemail.setBounds(30,330,150,25);
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(220,330,150,25);
        add(tfemail);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(30,370,150,25);
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(220,370,150,25);
        add(tfphone);
        
        update=new JButton("Update");
        update.setBounds(70,430,100,25);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        back=new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,100,450,500);
        add(image);
        
        
        try{
           Conn c=new Conn();
           ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelname.setText(rs.getString("name"));
               tfid.setText(rs.getString("id"));
               tfnumber.setText(rs.getString("number"));
               tfgender.setText(rs.getString("gender"));
               tfcountry.setText(rs.getString("country"));
               tfaddress.setText(rs.getString("address"));
               tfemail.setText(rs.getString("email"));
               tfphone.setText(rs.getString("phone"));

           }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== update){
            String username=labelusername.getText();
            String id=(String)tfid.getText();
            String number=tfnumber.getText();
            String name=labelname.getText();
            String gender=tfgender.getText();
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String email=tfemail.getText();
            String phone=tfphone.getText();
            
            
            String query="update customer set username= '"+username+"' ,id= '"+id+"' ,number= '"+number+"' ,name= '"+name+"' ,gender= '"+gender+"' ,country= '"+country+"',address= '"+address+"' ,email= '"+email+"' ,phone= '"+phone+"'";
            try{
               Conn c=new Conn();
               
               c.s.executeUpdate(query);
               
               JOptionPane.showMessageDialog(null, "Customer Details Updated Sucessfully");
               setVisible(false);
               
            }catch(Exception e){
               e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateCustomer("trisha");
    }
}
