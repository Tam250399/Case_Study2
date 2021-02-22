package view;

import Behaviors.Login;
import Entities.Oto;
import Entities.PTGT;
import Entities.XeMay;
import Entities.XeTai;
import Entities.login.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {

     static ArrayList <PTGT> ds = new ArrayList<>();
     static Scanner sc = new Scanner(System.in);
     public  static PTGT getInfo(String str){
         System.out.println("Nhập id");
         int id = Integer.parseInt(sc.nextLine());
         System.out.println("Nhập hãng sản xuất :");
         String hangSX = sc.nextLine();
         System.out.println("Nhập năm SX");
         int namSX = Integer.parseInt(sc.nextLine());
         System.out.println("Nhập giá xe :");
         double giaxe = Double.parseDouble(sc.nextLine());
         System.out.println("Nhập màu xe :");
         String mauxe = sc.nextLine();
         switch (str){
             case "Oto":
                 System.out.println("Nhập số chỗ ngồi :");
                 int socho = Integer.parseInt(sc.nextLine());
                 System.out.println("Nhập kiểu động cơ");
                 String kdc = sc.nextLine();
                 return new Oto(hangSX , namSX , giaxe , mauxe , socho , kdc,id);
             case "XeMay":
                 System.out.println("Nhập công suất");
                 double congSuat = Double.parseDouble(sc.nextLine());
                 return new XeMay(id,hangSX , namSX , giaxe , mauxe , congSuat);
             case "XeTai":
                 System.out.println("Nhập tải trọng :");
                 double taitrong = Double.parseDouble(sc.nextLine());
                 return new XeTai(hangSX , namSX , giaxe , mauxe , taitrong, id);
         }
         return null;
     }


    public static void  login(){
         System.out.println("------------------login-----------------");
         System.out.println("Nhập UserName :");
         String userName = sc.nextLine();
         System.out.println("Nhập Password :");
         String Password = sc.nextLine();
         Login.Login1(userName , Password);
     }

    public static void  register(){
        System.out.println("----------------Register-----------------");
        System.out.println("Nhập UserName :");
        String userName = sc.nextLine();
        System.out.println("Nhập Password :");
        String Password = sc.nextLine();
        User user = new User(userName , Password);
        Login.register(user);
    }

}
