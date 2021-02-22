package view;

import Behaviors.Login;
import Behaviors.Management;
import Entities.Oto;
import Entities.PTGT;
import Entities.XeMay;
import Entities.XeTai;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static Management M = new Management();
    static Login logins = new Login();

    public static void main(String[] args) {
        startMenu:
     do{

         try{
             ShowMenu();
           int choose  = Integer.parseInt(sc.nextLine());
         switch (choose) {
             case 1:
                 do {
                     System.out.println("-------------------------Add Transport --------------------------");
                     System.out.println("1 : Add Oto");
                     System.out.println("2 : Add Xe Máy");
                     System.out.println("3 : Add Xe Tải");
                     System.out.println("0 : Ra màn hình chính");
                     int choise1 = Integer.parseInt(sc.nextLine());
                     switch (choise1) {
                         case 1:
                             Oto oto = (Oto) Menus.getInfo("Oto");
                             M.add(oto);
                             break;
                         case 2:
                             XeMay xeMay = (XeMay) Menus.getInfo("XeMay");
                             M.add(xeMay);
                             break;
                         case 3:
                             XeTai xeTai = (XeTai) Menus.getInfo("XeTai");
                             M.add(xeTai);
                             break;
                         case 0:
                             continue startMenu;
                         default:
                             System.err.println("Enter error");
                     }
                 } while (true);
             case 2:
                 do {
                     System.out.println("-------------------------Uppdate Transport --------------------------");
                     System.out.println("1 : Uppdate Oto");
                     System.out.println("2 : Uppdate Xe Máy");
                     System.out.println("3 : Uppdate Xe Tải");
                     System.out.println("0 : Ra màn hình chính");
                     int choise2 = Integer.parseInt(sc.nextLine());
                     switch (choise2) {
                         case 1:
                             Oto oto = (Oto) Menus.getInfo("Oto");
                             M.update(oto);
                             break;
                         case 2:
                             XeMay xeMay = (XeMay) Menus.getInfo("XeMay");
                             M.update(xeMay);
                             break;
                         case 3:
                             XeTai xeTai = (XeTai) Menus.getInfo("XeTai");
                             M.update(xeTai);
                             break;
                         case 0:
                             continue startMenu;
                         default:
                             System.err.println("Enter error");
                     }
                 } while (true);
             case 3:
                 do {
                     System.out.println("-------------------------Delete Transport --------------------------");
                     System.out.println("1 : Delete Oto");
                     System.out.println("2 : Delete Xe Máy");
                     System.out.println("3 : Delete Xe Tải");
                     System.out.println("0 : Ra màn hình chính");
                     int choise2 = Integer.parseInt(sc.nextLine());
                     switch (choise2) {
                         case 1:
                             System.out.println("Nhập id xe Oto cần xóa");
                             int id = Integer.parseInt(sc.nextLine());
                             M.delete(id);
                             break;
                         case 2:
                             System.out.println("Nhập id xe máy cần xóa");
                             int id1 = Integer.parseInt(sc.nextLine());
                             M.delete(id1);
                             break ;
                         case 3:
                             System.out.println("nhập id Xe Tải cần xóa");
                             int id2 = Integer.parseInt(sc.nextLine());
                             M.delete(id2);
                             break;
                         case 0:
                             continue startMenu;
                         default:
                             System.err.println("Enter error");
                     }
                 } while (true);
             case 4:
                 System.out.println("Nhập id để tìm ");
                 int id = Integer.parseInt(sc.nextLine());
                 M.search(id);
                 break;
             case 5:
                 M.show();
                 break;
         }
         }catch(Exception e){
             System.err.println("Bạn đã chọn sai :");
         }
    }while (true);
    }


    static void ShowMenu (){
        System.out.println("------------------------Management---------------------------------");
        System.out.println("1 : Add transport");
        System.out.println("2 : Update transport");
        System.out.println("3 : Delete transport");
        System.out.println("4 : Search transport");
        System.out.println("5 : Show transport");
    }

}
