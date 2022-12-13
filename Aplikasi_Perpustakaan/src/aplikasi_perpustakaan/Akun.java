/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_perpustakaan;

import java.util.HashMap;

/**
 *
 * @author ABHINAYA
 */
public class Akun {
    HashMap<String, String> logininfo= new HashMap<String, String>();
    
    public Akun(){
        logininfo.put("Joko", "1234");
        logininfo.put("Bagas", "sayurlodeh");
        logininfo.put("Amir", "manisan");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
