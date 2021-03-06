/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anup-Xtha
 */
public class Tictactoegame implements ActionListener{

    JButton jb1, jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    String str = "X";
    int count = 0;
    Color color;
    boolean win=false;
    JFrame jf;
    
    public Tictactoegame() {
        jf = new JFrame("Tic Tac Toe Game");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridLayout(3,3));
        
        jb1 = new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jb2 = new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7 = new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Tictactoegame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count = count + 1;
        if(count%2==0)
        {
         str = "0";  
         color = Color.ORANGE;
        }
        
        else{
            str = "X";
            color = Color.YELLOW;
        }
        
        //Font font = new Font("Arial",1,50); //pass font variable in jb1.setFont(font);, ....etc
        
        if(e.getSource() == jb1){
            jb1.setText(str);
            jb1.setBackground(color);
            jb1.setFont(new Font("Arial",1,50));
            jb1.setEnabled(false);
        }
        
        if(e.getSource() == jb2){
            jb2.setText(str);
            jb2.setBackground(color);
            jb2.setFont(new Font("Arial",1,50));
            jb2.setEnabled(false);
        }
        
        if(e.getSource() == jb3){
            jb3.setText(str);
            jb3.setBackground(color);
            jb3.setFont(new Font("Arial",1,50));
            jb3.setEnabled(false);
        }
        
        if(e.getSource() == jb4){
            jb4.setText(str);
            jb4.setBackground(color);
            jb4.setFont(new Font("Arial",1,50));
            jb4.setEnabled(false);
        }
        
        if(e.getSource() == jb5){
            jb5.setText(str);
            jb5.setBackground(color);
            jb5.setFont(new Font("Arial",1,50));
            jb5.setEnabled(false);
        }
        
        if(e.getSource() == jb6){
            jb6.setText(str);
            jb6.setBackground(color);
            jb6.setFont(new Font("Arial",1,50));
            jb6.setEnabled(false);
        }
        
        if(e.getSource() == jb7){
            jb7.setText(str);
            jb7.setBackground(color);
            jb7.setFont(new Font("Arial",1,50));
            jb7.setEnabled(false);
        }
        
        if(e.getSource() == jb8){
            jb8.setText(str);
            jb8.setBackground(color);
            jb8.setFont(new Font("Arial",1,50));
            jb8.setEnabled(false);
        }
        
        if(e.getSource() == jb9){
            jb9.setText(str);
            jb9.setBackground(color);
            jb9.setFont(new Font("Arial",1,50));
            jb9.setEnabled(false);
        }
        
        winPossibilities();
    }
    
    void winPossibilities()
    {
        //rows winning possiblities
        if (jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText()!="") {
            win = true;
        }
        
        else if (jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText()!="") {
            win = true;
        }
        
        else if (jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText()!="") {
            win = true;
        }
        
        //column winning possiblities
        else if (jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText()!="") {
            win = true;
        }
        
        else if (jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText()!="") {
            win = true;
        }
        
        else if (jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText()!="") {
            win = true;
        }
        
        //diagonal winning possibilities
        else if (jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb1.getText()!="") {
            win = true;
        }
        
        else if (jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText()!="") {
            win = true;
        }
        
        else{
            win = false;
        }
       
        whoWins();
    }
    
    void whoWins()
    {
        if(win == true){
            JOptionPane.showMessageDialog(jf, str + "wins");
            restartGame();
        }
        
        else if(win == false && count==9){
            JOptionPane.showMessageDialog(jf, "Match Draw");
            restartGame();
        }
    }
    
    void restartGame(){
        int i = JOptionPane.showConfirmDialog(jf, "Do you want to play game again");
        
        if(i==0){
            str = "";
            count = 0;
            color = null;
            win = false;
            
            jb1.setText(str);
            jb1.setBackground(color);
            jb1.setEnabled(true);
            
            jb2.setText(str);
            jb2.setBackground(color);
            jb2.setEnabled(true);
            
            jb3.setText(str);
            jb3.setBackground(color);
            jb3.setEnabled(true);
            
            jb4.setText(str);
            jb4.setBackground(color);
            jb4.setEnabled(true);
            
            jb5.setText(str);
            jb5.setBackground(color);
            jb5.setEnabled(true);
            
            jb6.setText(str);
            jb6.setBackground(color);
            jb6.setEnabled(true);
            
            jb7.setText(str);
            jb7.setBackground(color);
            jb7.setEnabled(true);
            
            jb8.setText(str);
            jb8.setBackground(color);
            jb8.setEnabled(true);
            
            jb9.setText(str);
            jb9.setBackground(color);
            jb9.setEnabled(true);
            
        }
        
        else if (i==1){
            System.exit(0);
        }
        
        else{
            jb1.setEnabled(false);
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);
            
        }
        
    }
    
}
