package Behaviors;

import Entities.login.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Login<E> {
    static List<User> users = new ArrayList<>();

    public static void Login1(String userName , String password){
        for (User user : users) {
        if(user.getName().equals(userName)){
            if(user.getPassword().equals(password)){
                return;
            }
        }else {
            System.out.println("Bạn đã nhập sai :");
        }
        }
    }
    public static void register (User user){
        for (User u : users) {
        if(u.getName().equals(user.getName())){
            System.out.println("vui lòng nhập lại");
        }
        }
        users.add(user);
    }

    public static void show (){
        for (User u : users) {
            System.out.println("Account:"+ "\n UserName" + u.getName() + "\n Password" + u.getPassword());
        }
    }
}
