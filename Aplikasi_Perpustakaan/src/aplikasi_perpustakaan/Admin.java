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
public class Admin {
    JFrame form = new JFrame ("Aplikasi Perpustakaan");
    JLabel labelJudul = new JLabel("Data Transaksi");
    JLabel us1 = new JLabel("");
    JLabel judul101 = new JLabel("");
    JLabel judul201 = new JLabel("");
    JLabel tglawal1 = new JLabel("");
    JLabel tglakhir1 = new JLabel("");
    JLabel us2 = new JLabel("");
    JLabel judul102 = new JLabel("");
    JLabel judul202 = new JLabel("");
    JLabel tglawal2 = new JLabel("");
    JLabel tglakhir2 = new JLabel("");
    JLabel us3 = new JLabel("");
    JLabel judul103 = new JLabel("");
    JLabel judul203 = new JLabel("");
    JLabel tglawal3 = new JLabel("");
    JLabel tglakhir3 = new JLabel("");
    JLabel us4 = new JLabel("");
    JLabel judul104 = new JLabel("");
    JLabel judul204 = new JLabel("");
    JLabel tglawal4 = new JLabel("");
    JLabel tglakhir4 = new JLabel("");
    
    public Admin(){
        form.setSize (810, 360);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        form.setVisible(true);
        
        labelJudul.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 30));
        labelJudul.setBounds(135, 10, 360, 30);
        form.add(labelJudul);
        
        us1.setBounds(0, 100, 360, 30);
        form.add(us1);
        judul101.setBounds(160, 100, 360, 30);
        form.add(judul101);
        judul201.setBounds(320, 100, 360, 30);
        form.add(judul201);
        tglawal1.setBounds(480, 100, 360, 30);
        form.add(tglawal1);
        tglakhir1.setBounds(640, 100, 360, 30);
        form.add(tglakhir1);
        
        us2.setBounds(0, 150, 360, 30);
        form.add(us2);
        judul102.setBounds(160, 150, 360, 30);
        form.add(judul102);
        judul202.setBounds(320, 150, 360, 30);
        form.add(judul202);
        tglawal2.setBounds(480, 150, 360, 30);
        form.add(tglawal2);
        tglakhir2.setBounds(640, 150, 360, 30);
        form.add(tglakhir2);
        
        us3.setBounds(0, 200, 360, 30);
        form.add(us3);
        judul103.setBounds(160, 200, 360, 30);
        form.add(judul103);
        judul203.setBounds(320, 200, 360, 30);
        form.add(judul203);
        tglawal3.setBounds(480, 200, 360, 30);
        form.add(tglawal3);
        tglakhir3.setBounds(640, 200, 360, 30);
        form.add(tglakhir3);
        
        us4.setBounds(0, 250, 360, 30);
        form.add(us4);
        judul104.setBounds(160, 250, 360, 30);
        form.add(judul104);
        judul204.setBounds(320, 250, 360, 30);
        form.add(judul204);
        tglawal4.setBounds(480, 250, 360, 30);
        form.add(tglawal4);
        tglakhir4.setBounds(640, 250, 360, 30);
        form.add(tglakhir4);
        
        DataTransaksi data = new DataTransaksi("Joko","One Piece", "01-09-2022", "08-09-2022");
        DataTransaksi data2 = new DataTransaksi("Joko","Chainsawman", "23-10-2022", "26-10-2022");
        DataTransaksi data3 = new DataTransaksi("Joko","Chainsawman","Blue Lock", "14-11-2022", "19-11-2022");
        DataTransaksi data4 = new DataTransaksi("Joko","Belajar OOP","Silent", "14-11-2022", "17-11-2022");
        
        us1.setText(data.nama);
        us2.setText(data2.nama);
        us3.setText(data3.nama);
        us4.setText(data4.nama);
        
        judul101.setText(data.judul);
        judul102.setText(data2.judul);
        judul103.setText(data3.judul);
        judul104.setText(data4.judul);
        
        judul203.setText(data3.judul2);
        judul204.setText(data4.judul2);
        
        tglawal1.setText(data.tanggalawal);
        tglawal2.setText(data2.tanggalawal);
        tglawal3.setText(data3.tanggalawal);
        tglawal4.setText(data4.tanggalawal);
        
        tglakhir1.setText(data.tanggalkembali);
        tglakhir2.setText(data2.tanggalkembali);
        tglakhir3.setText(data3.tanggalkembali);
        tglakhir4.setText(data4.tanggalkembali);
    }
}
