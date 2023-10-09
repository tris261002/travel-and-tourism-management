package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
   
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,bookhotel;
    JButton viewpackage,viewhotels,destination,viewbookedhotel,payments,calculators,notepad;
    JButton about,deletePersonalDetails;
            
    Dashboard(String username){
        this.username=username;
        //setBounds(0,0,1600,1100);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
       
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
       
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,1000);
        add(p2);
        
        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,40,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        updatePersonalDetails.setMargin(new Insets(0,0,0,40));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails=new JButton("View Details");
        viewPersonalDetails.setBounds(0,80,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewPersonalDetails.setMargin(new Insets(0,0,0,120));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,120,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        deletePersonalDetails.setMargin(new Insets(0,0,0,50));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
       
        checkpackages=new JButton("Check Packages");
        checkpackages.setBounds(0,160,300,50);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,15));
        checkpackages.setMargin(new Insets(0,0,0,100));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage=new JButton("Book Packages");
        bookpackage.setBounds(0,200,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        bookpackage.setMargin(new Insets(0,0,0,110));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage=new JButton("View Packages");
        viewpackage.setBounds(0,240,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewpackage.setMargin(new Insets(0,0,0,110));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,280,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,320,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,15));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,360,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewbookedhotel.setMargin(new Insets(0,0,0,80));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destination=new JButton("Destination");
        destination.setBounds(0,400,300,50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.PLAIN,15));
        destination.setMargin(new Insets(0,0,0,125));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments=new JButton("Payments");
        payments.setBounds(0,440,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,15));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
       
        calculators=new JButton("Calculator");
        calculators.setBounds(0,480,300,50);
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.WHITE);
        calculators.setFont(new Font("Tahoma",Font.PLAIN,15));
        calculators.setMargin(new Insets(0,0,0,145));
        calculators.addActionListener(this);
        p2.add(calculators);
        
        notepad=new JButton("Notepad");
        notepad.setBounds(0,520,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,15));
        notepad.setMargin(new Insets(0,0,0,150));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about=new JButton("About");
        about.setBounds(0,560,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,15));
        about.setMargin(new Insets(0,0,0,155));
        about.addActionListener(this);
        p2.add(about);
      
        ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text=new JLabel("One Stop Destination");
        text.setBounds(600,70,1400,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,40));
        image.add(text);
        
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()==checkpackages){
            new CheckPackage();
        }else if(ae.getSource()==bookpackage){
            new BookPackage(username);
        }else if(ae.getSource()==viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }else if(ae.getSource()==destination){
            new Destinations();
        }else if(ae.getSource()==bookhotel){
            new BookHotel(username);
        }else if(ae.getSource()==viewbookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==payments){
            new Payments();
        }else if(ae.getSource()==calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==about){
            new About();
        }else if(ae.getSource()==deletePersonalDetails){
            new DeleteDetails(username);
        }
        
    }
    
    public static void main(String[]args){
        new Dashboard("");
    }
}
