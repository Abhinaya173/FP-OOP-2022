/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_perpustakaan;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ABHINAYA
 */
public class Login implements ActionListener{
    JButton btnReset = new JButton("Reset");
    JButton btnLogin = new JButton("Login");
    JButton btnAdmin = new JButton("Admin");
    JPasswordField txtPass = new JPasswordField();
    JTextField txtUser = new JTextField();
    JLabel labelPass = new JLabel("Password :");
    JLabel labelUser = new JLabel("Username :");
    JLabel labelWR = new JLabel("");
    JLabel labelJudul2 = new JLabel("Silahkan Masukan Username dan Password anda !");
    JLabel labelJudul = new JLabel("SELAMAT DATANG DI PERPUSTAKAAN X");
    JFrame form = new JFrame ("Aplikasi Perpustakaan");
    HashMap<String, String> logininfo= new HashMap<String, String>();
    
    public Login(HashMap <String, String> logininfooriginal){
        logininfo = logininfooriginal;
        
        // ukuran form
        form.setSize (630, 360);
        // mengatur fungsi close
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // form berada di tengah
        form.setLocationRelativeTo(null);
        // mengatur layout manual
        form.setLayout(null);
        // menampilkan form
        form.setVisible(true);
        
        labelJudul.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 30));
        labelJudul.setBounds(135, 10, 360, 30);
        form.add(labelJudul);
        
        labelWR.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 30));
        labelWR.setBounds(290, 270, 360, 30);
        form.add(labelWR);
        
        labelJudul2.setBounds(165, 40, 300, 30);
        form.add(labelJudul2);
        
        labelUser.setBounds(120, 110, 80, 30);
        form.add(labelUser);
        
        labelPass.setBounds(120, 180, 80, 30);
        form.add(labelPass);
        
        txtUser.setBounds(250, 110, 260, 30);
        form.add(txtUser);
        
        txtPass.setBounds(250, 180, 260, 30);
        form.add(txtPass);
        
        btnLogin.setBounds(460, 230, 80, 30);
        form.add(btnLogin);
        btnLogin.addActionListener(this);
        btnLogin.setFocusable(false);
        
        btnReset.setBounds(369, 230, 80, 30);
        form.add(btnReset);
        btnReset.addActionListener(this);
        btnReset.setFocusable(false);
        
        btnAdmin.setBounds(260, 230, 80, 30);
        form.add(btnAdmin);
        btnAdmin.addActionListener(this);
        btnAdmin.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnReset){
            txtUser.setText("");
            txtPass.setText("");
        }
        if(e.getSource()==btnAdmin){
            Admin admin = new Admin();
            form.dispose();
        }
        if(e.getSource()== btnLogin){
            try {
                String Username = txtUser.getText();
                String Password = String.valueOf(txtPass.getPassword());
            
            if(logininfo.containsKey(Username)){
                if(logininfo.get(Username).equals(Password)){
                    Home home = new Home(Username);
                    form.dispose();
                }
                else {
                    labelWR.setText("Your password is invalid");
                    labelWR.setBounds(240, 270, 360, 30);
                    labelWR.setForeground(Color.red);
                }
            }
            } catch (Exception a){
                System.err.println("Error " +a.getMessage());
            }
        }
    }
}
