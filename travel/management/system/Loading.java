package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run(){
        try{
            for(int i =1;i<=101;i++){
                int max =bar.getMaximum(); //100
                int value=bar.getValue();
                
                if(value<max){ //101<100
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    Loading(String username){
        this.username=username;
        t=new Thread(this);
        
        setBounds(370,190,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel loading= new JLabel("Loading,Please wait....");
        loading.setBounds(210,130,210,30);
        loading.setForeground(Color.RED);
        loading.setFont (new Font("Raleway",Font.BOLD,16));
        add(loading);
        
        JLabel lblusername= new JLabel("Welcome "+ username);
        lblusername.setBounds(50,310,400,40);
        lblusername.setForeground(Color.RED);
        lblusername.setFont (new Font("Raleway",Font.BOLD, 16));
        add(lblusername);
        
        JLabel text= new JLabel("One Stop Destination");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.BLUE);
        text.setFont (new Font("Raleway",Font.BOLD, 20));
        add(text);
        
        bar= new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        t.start();
        setVisible(true);
    }
    
    public static void main(String[] args){
        
        new Loading("");
        
    }
    
}
