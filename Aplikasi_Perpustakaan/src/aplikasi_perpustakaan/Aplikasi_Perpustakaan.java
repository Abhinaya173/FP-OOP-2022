/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi_perpustakaan;

/**
 *
 * @author ABHINAYA
 */
public class Aplikasi_Perpustakaan{

    public static void main(String[] args) {
        Akun account = new Akun();
        
        Login loginpage = new Login(account.getLoginInfo());
        
    }
    
}
