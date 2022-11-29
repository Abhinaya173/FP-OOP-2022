/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ABHINAYA
 */
import java.util.ArrayList;
public class DataMember {
    public static void main(String[] args) {
        ArrayList<String> MemberNames = new ArrayList();
        ArrayList<String> MemberLevels = new ArrayList();
        addMember(MemberNames);
        addMember(MemberLevels);
        displayMember(MemberNames);
        displayMember(MemberLevels);
}
    static void displayMember(ArrayList<String> MemberNames) {
        for(String member: MemberNames)    
            System.out.println("Member Name : " + member);
    }
    //static void displayMember(ArrayList<String> MemberLevels) {
      //  for(String level: MemberLevels)    
        //    System.out.println("Member Level : " + level);
   // }
    static void addMember(ArrayList<String> MemberNames){
        MemberNames.add("Mark");
        MemberNames.add("Andrew");
        MemberNames.add("Beth");
        MemberNames.add("John");
    }
}
