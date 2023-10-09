package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
    
    BookHotel(String username){
        
        this.username=username;
        setBounds(100,100,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("BOOK HOTEL");
        text.setBounds(100,10,200,20);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,70,100,20);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblusername);
       
        labelusername=new JLabel();
        labelusername.setBounds(250,70,100,20);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(labelusername);
       
        JLabel lblpackage=new JLabel("Select Hotel");
        lblpackage.setBounds(30,110,110,20);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblpackage);
       
        chotel=new Choice();
        chotel.setBounds(250,110,100,20);
        add(chotel);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
                
        }catch(Exception e){
            e.printStackTrace();
        }
       
        JLabel lblperson=new JLabel("Total Persons");
        lblperson.setBounds(30,150,150,20);
        lblperson.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblperson);
       
        tfpersons=new JTextField("1");
        tfpersons.setBounds(250,150,100,25);
        add(tfpersons);
        
        JLabel lbldays=new JLabel("No. of Days");
        lbldays.setBounds(30,190,150,20);
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lbldays);
       
        tfdays=new JTextField("1");
        tfdays.setBounds(250,190,100,25);
        add(tfdays);
        
        JLabel lblroom=new JLabel("AC/ Non-AC");
        lblroom.setBounds(30,230,150,20);
        lblroom.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblroom);
        
        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,100,20);
        add(cac);
        
        JLabel lblfood=new JLabel("Food Included");
        lblfood.setBounds(30,270,150,20);
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblfood);
        
        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,100,20);
        add(cfood);
        
        JLabel lblid=new JLabel("Id");
        lblid.setBounds(30,310,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblid);
        
        labelid=new JLabel();
        labelid.setBounds(250,310,150,25);
        add(labelid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,350,100,20);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblnumber);
       
        labelnumber=new JLabel();
        labelnumber.setBounds(250,350,150,25);
        add(labelnumber);
        
        JLabel lblphone=new JLabel("Phone ");
        lblphone.setBounds(30,390,100,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblphone);
       
        labelphone=new JLabel();
        labelphone.setBounds(250,390,150,25);
        add(labelphone);
        
        JLabel lblprice=new JLabel("Total Price");
        lblprice.setBounds(30,430,100,20);
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(lblprice);
       
        labelprice=new JLabel();
        labelprice.setBounds(250,430,150,25);
        add(labelprice);
        
        
        try{
         String query="select * from customer where username= '"+username+"'";  
         Conn conn=new Conn();
         ResultSet rs=conn.s.executeQuery(query);
         while(rs.next()){
             labelusername.setText(rs.getString("username"));
             labelid.setText(rs.getString("id"));
             labelnumber.setText(rs.getString("number"));
             labelphone.setText(rs.getString("phone"));
        } 
        }catch(Exception e){
           e.printStackTrace();
        }
        
        
        checkprice=new JButton("Check Price");
        checkprice.setBounds(60,490,120,25);
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.addActionListener(this);
        add(checkprice);
        
        
        
        bookpackage=new JButton("Book Hotel");
        bookpackage.setBounds(200,490,120,25);
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back=new JButton("Back");
        back.setBounds(340,490,120,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550,50,600,400);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select * from hotel where name='"+chotel.getSelectedItem()+"'");
                while(rs.next()){
                    int cost=Integer.parseInt(rs.getString("costperperson"));
                    int ac=Integer.parseInt(rs.getString("acroom"));
                    int food=Integer.parseInt(rs.getString("foodincluded"));
                    
                    int persons=Integer.parseInt(tfpersons.getText());
                    int days=Integer.parseInt(tfdays.getText());
                    
                    String acselected=cac.getSelectedItem();
                    String foodselected=cfood.getSelectedItem();
                    
                    if(persons*days>0){
                        int total=0; 
                        
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("YES") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        labelprice.setText("Rs"+total);
                    }else{
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==bookpackage){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }catch(Exception e){
               e.printStackTrace();
            }
        }else{
            setVisible(true);
        }
    }
    
    public static void main (String[] args){
        new BookHotel("trisha");
    }
}

