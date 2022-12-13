/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_perpustakaan;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author ABHINAYA
 */
public class Home implements ActionListener{
    JFrame form = new JFrame ("Aplikasi Perpustakaan");
    JButton btnReset = new JButton("Reset");
    JButton btnSimpan = new JButton("Simpan");
    JLabel labelUser = new JLabel("");
    JLabel labelKodeBuku = new JLabel("Kode Buku    :");
    JLabel labelJudulBuku = new JLabel("Judul Buku  :");
    JLabel labelMember = new JLabel("Member         :");
    JLabel labelPinjam = new JLabel("Tanggal Pinjam :");
    JLabel labelDurasi = new JLabel("Tanggal Kembali:");
    JLabel labelTotal = new JLabel("Total Biaya     :");
    JLabel labelBayar = new JLabel("Jumlah Bayar    :");
    JLabel labelKembalian = new JLabel("Kembalian   :");
    String[] member = {"Gold", "Silver", "Bronze"};
    JComboBox boxMember = new JComboBox(member);
    JTextField txtKodeBuku = new JTextField();
    JTextField txtBayar = new JTextField();
    JTextField txtJudulBuku = new JTextField();
    JTextField txtTotal = new JTextField();
    JTextField txtTanggal = new JTextField();
    JTextField txtKembalian = new JTextField();
    JTextField txtDurasi = new JTextField();
    JTextField txtMember = new JTextField();
    
    public void tampiltanggal(){
        Date tgl = new Date();
        SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
        txtTanggal.setText(aa.format(tgl));
        
//        long tglmasuk = Long.parseLong(txtTanggal.getText());
//               long tgldurasi = Long.parseLong(txtDurasi.getText());
//               long timeDiff = Math.abs(tglmasuk + tgldurasi);
//               long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
//               JLabel tk2 = new JLabel("" + daysDiff);
    }
    
    
    public Home(String Username){
        tampiltanggal();
        form.setSize (420, 700);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        form.setVisible(true);
        
        labelUser.setBounds(100, 35, 110, 30);
        form.add(labelUser);
        labelUser.setText("Hi " + Username);
        
        labelKodeBuku.setBounds(30, 120, 110, 30);
        form.add(labelKodeBuku);
        
        labelJudulBuku.setBounds(30, 180, 110, 30);
        form.add(labelJudulBuku);
        
        labelMember.setBounds(30, 240, 110, 30);
        form.add(labelMember);
        
        labelPinjam.setBounds(30, 300, 110, 30);
        form.add(labelPinjam);
        
        labelDurasi.setBounds(30, 360, 110, 30);
        form.add(labelDurasi);
        
        labelTotal.setBounds(30, 420, 110, 30);
        form.add(labelTotal);
        
        labelBayar.setBounds(30, 480, 110, 30);
        form.add(labelBayar);
        
        labelKembalian.setBounds(30, 540, 110, 30);
        form.add(labelKembalian);
        
        btnSimpan.setBounds(110, 600, 80, 30);
        form.add(btnSimpan);
        btnSimpan.addActionListener(this);
        btnSimpan.setFocusable(false);
        
        btnReset.setBounds(240, 600, 80, 30);
        form.add(btnReset);
        btnReset.addActionListener(this);
        btnReset.setFocusable(false);
        
        txtBayar.setBounds(180, 480, 200, 30);
        form.add(txtBayar);
        form.add(txtKodeBuku);
        form.add(txtJudulBuku);
        form.add(txtTotal);
        form.add(txtDurasi);
        form.add(txtTanggal);
        form.add(txtKembalian);
        txtKodeBuku.setBounds(180, 120, 200, 30);
        txtTotal.setBounds(180, 420, 200, 30);
        txtJudulBuku.setBounds(180, 180, 200, 30);
        txtDurasi.setBounds(180, 360, 200, 30);
        txtTanggal.setBounds(180, 300, 200, 30);
        txtKembalian.setBounds(180, 540, 200, 30);
        
        boxMember.setBounds(180, 240, 200, 30);
        form.add(boxMember);
        boxMember.addActionListener(this);
        
        txtDurasi.disable();
        txtJudulBuku.disable();
        txtTotal.disable();
        txtKembalian.disable();
        
        txtKodeBuku.addKeyListener(new KeyListener(){
            
            
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_ENTER){
                    ArrayList<String> judulbuku = new ArrayList();
                    judulbuku.add("Chainsawman");
                    judulbuku.add("Attack On Titan");
                    judulbuku.add("SpyxFamily");
                    judulbuku.add("Blue Lock");
                    judulbuku.add("One Piece");
                    
                    ArrayList<String> kodebuku = new ArrayList();
                    kodebuku.add("B001");
                    kodebuku.add("B002");
                    kodebuku.add("B003");
                    kodebuku.add("B004");
                    kodebuku.add("B005");
                    String x = "no";
                    for(int i = 0; i<kodebuku.size(); i++){
                        if(txtKodeBuku.getText().equals(kodebuku.get(i))){
                            txtJudulBuku.setText(judulbuku.get(i));
                            txtTotal.setText("2000");
                            x = "yes";
                            break;
                        }
                    }
                    if(x.equals("no")){
                        JOptionPane.showMessageDialog(null, "Tidak dapat menemukan buku");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        });
        
        txtBayar.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_ENTER){
                    int cektotal = Integer.parseInt(txtTotal.getText());
                    int cekbayar = Integer.parseInt(txtBayar.getText());
                    
                    if(cekbayar < cektotal){
                        JOptionPane.showMessageDialog(null, "Uang tidak cukup");
                    }else{
                        int kembali;
                        kembali = cekbayar - cektotal;
                        txtKembalian.setText(Integer.valueOf(kembali).toString());
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int hrgbuku = Integer.parseInt(txtTotal.getText());
        int total;
        if(e.getSource()==boxMember){
            String s = boxMember.getSelectedItem().toString();
            txtMember.setText(s);
            if(boxMember.getSelectedItem()=="Gold"){
                 Calendar cal = Calendar.getInstance();
                 String dateBefore = txtTanggal.getText();
                 SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
                 try{  
                    cal.setTime(aa.parse(dateBefore));  
                }catch(ParseException k){  
                    k.printStackTrace();  
                }
                ```Casting
                cal.add(Calendar.DAY_OF_MONTH, 7);  
                String dateAfter = aa.format(cal.getTime());  
                txtDurasi.setText("" + dateAfter);
                int hargagold = 10000;
                total = (hargagold + hrgbuku);
                txtTotal.setText(Integer.valueOf(total).toString());
                ```
            }else if(boxMember.getSelectedItem()=="Silver") {
                 Calendar cal = Calendar.getInstance();
                 String dateBefore = txtTanggal.getText();
                 SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
                 try{  
                    cal.setTime(aa.parse(dateBefore));  
                }catch(ParseException k){  
                    k.printStackTrace();  
                }
                cal.add(Calendar.DAY_OF_MONTH, 5);  
                String dateAfter = aa.format(cal.getTime());  
                txtDurasi.setText("" + dateAfter);
                int hargasilver = 7000;
                total = (hargasilver + hrgbuku);
                txtTotal.setText(Integer.valueOf(total).toString());
            } else if(boxMember.getSelectedItem()=="Bronze"){
                 Calendar cal = Calendar.getInstance();
                 String dateBefore = txtTanggal.getText();
                 SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
                 try{  
                    cal.setTime(aa.parse(dateBefore));  
                }catch(ParseException k){  
                    k.printStackTrace();  
                }
                cal.add(Calendar.DAY_OF_MONTH, 3);  
                String dateAfter = aa.format(cal.getTime());  
                txtDurasi.setText("" + dateAfter);
                int hargabronze = 5000;
                total = (hargabronze + hrgbuku);
                txtTotal.setText(Integer.valueOf(total).toString()); // casting
            }
        }
        
        if(e.getSource()== btnReset){
            txtBayar.setText("");
            txtDurasi.setText("");
            txtJudulBuku.setText("");
            txtKembalian.setText("");
            txtKodeBuku.setText("");
            txtTanggal.setText("");
            txtTotal.setText("");
        }
        
        if(e.getSource()== btnSimpan){
           int respon = JOptionPane.showConfirmDialog(null, "Apakah data sudah benar ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           
           // Exception Hadling
           if(respon == JOptionPane.YES_OPTION){
               try{
                    BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\PrintPerpus\\output.txt"));
                    writer.write("Perpustakaan X");
                    writer.write("\nUsername Pelanggan  :   " + labelUser.getText());
                    writer.write("\nMember Pelanggan    :   " + txtMember.getText());
                    writer.write("\nBuku Yang Dipinjam  :   " + txtJudulBuku.getText());
                    writer.write("\nTanggal Pinjam      :   " + txtTanggal.getText());
                    writer.write("\nTanggal Kembali     :   " + txtDurasi.getText());
                    writer.write("\nTotal Harga         :   " + txtTotal.getText());
                    writer.write("\nUang Bayar          :   " + txtBayar.getText());
                    writer.write("\nKembalian           :   " + txtKembalian.getText());
                    writer.close();
               }catch(IOException z){
                   z.printStackTrace();
               }
               form.dispose();
               JFrame form2 = new JFrame ("Aplikasi Perpustakaan");
               JLabel jdl = new JLabel("Perpustakaan X");
               JLabel up = new JLabel("Username Pelanggan  :");
               JLabel mp = new JLabel("Member Pelanggan    :");
               JLabel bd = new JLabel("Buku Yang Dipinjam  :");
               JLabel tp = new JLabel("Tanggal Pinjam      :");
               JLabel tk = new JLabel("Tanggal Kembali     :");
               JLabel th = new JLabel("Total Harga         :");
               JLabel ub = new JLabel("Uang Bayar          :");
               JLabel k = new JLabel("Kembalian            :");
               JLabel up2 = new JLabel(labelUser.getText());
               JLabel mp2 = new JLabel(txtMember.getText());
               JLabel bd2 = new JLabel(txtJudulBuku.getText());
               JLabel tp2 = new JLabel(txtTanggal.getText());
               JLabel th2 = new JLabel(txtTotal.getText());
               JLabel ub2 = new JLabel(txtBayar.getText());
               JLabel k2 = new JLabel(txtKembalian.getText());
               JLabel tk2 = new JLabel(txtDurasi.getText());
               JLabel x = new JLabel("----------------------------------------------------------------------------------------------");
               JLabel y = new JLabel("----------------------------------------------------------------------------------------------");
               JLabel z = new JLabel("----------------------------------------------------------------------------------------------");
               
               form2.setSize (380, 700);
               form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               form2.setLocationRelativeTo(null);
               form2.setLayout(null);
               form2.setVisible(true);
               
               jdl.setBounds(135, 20, 110, 30);
               form2.add(jdl);
               form2.add(x);
               form2.add(y);
               form2.add(z);
               form2.add(th);
               form2.add(ub);
               form2.add(up);
               form2.add(mp);
               form2.add(bd);
               form2.add(tp);
               form2.add(tk);
               form2.add(k);
               form2.add(th2);
               form2.add(ub2);
               form2.add(up2);
               form2.add(mp2);
               form2.add(bd2);
               form2.add(tp2);
               form2.add(tk2);
               form2.add(k2);
               
               x.setBounds(0, 60, 380, 30);
               y.setBounds(0, 340, 380, 30);
               z.setBounds(0, 470, 380, 30);
               th.setBounds(0, 380, 140, 30);
               k.setBounds(0, 510, 140, 30);
               ub.setBounds(0, 430, 140, 30);
               up.setBounds(0, 100, 140, 30);
               mp.setBounds(0, 150, 140, 30);
               bd.setBounds(0, 200, 140, 30);
               tp.setBounds(0, 250, 140, 30);
               tk.setBounds(0, 300, 140, 30);
               th2.setBounds(230, 380, 140, 30);
               k2.setBounds(230, 510, 140, 30);
               ub2.setBounds(230, 430, 140, 30);
               up2.setBounds(230, 100, 140, 30);
               mp2.setBounds(230, 150, 140, 30);
               bd2.setBounds(230, 200, 140, 30);
               tp2.setBounds(230, 250, 140, 30);
               tk2.setBounds(230, 300, 140, 30);
           }
           
        }
    }
}
