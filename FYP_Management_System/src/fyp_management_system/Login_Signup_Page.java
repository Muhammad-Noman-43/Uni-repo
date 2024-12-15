/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fyp_management_system;
import java.awt.Color;
import javax.swing.*;
import java.awt.BorderLayout;
/**
 *
 * @author Muhammad Noman
 */
public class Login_Signup_Page {
    JFrame lsframe = new JFrame();
    Color c = new Color(0xADD8E6);
    JLabel role = new JLabel("Role");
    JLabel username = new JLabel("Username");
    JTextField userText = new JTextField();
    
    
    public Login_Signup_Page(){
        lsframe.setSize(500, 500);
        lsframe.setTitle("Login/Signup Form");
        
        lsframe.getContentPane().setBackground(c);
        
        lsframe.add(username);
        lsframe.setLayout(null);
        lsframe.setLocationRelativeTo(null);
        lsframe.setResizable(false);
        lsframe.add(role);
        lsframe.setDefaultCloseOperation(lsframe.EXIT_ON_CLOSE);
        
        lsframe.setVisible(true);
        
    }
}
