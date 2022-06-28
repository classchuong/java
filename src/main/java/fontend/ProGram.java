package fontend;

import backend.UserDemo;
import entyti.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ProGram {
    public static void main(String[] args) throws Exception {
//bai2(10);
//        bai3();
//        login("kmcguigan0@google.it","QVJM29");
        loginScanner();
    }
    public static  void bai2(int id1) throws Exception {
//        Viết function để user nhập vào id project, sau đó in ra tất cả các employee
//        trong project đó (in ra dạng table)
        User user = UserDemo.getemployee(id1) ;

if (user.getId()== 0) {
    throw new Exception("id employee not exist");
}
            System.out.println(user);
        }
        public static void bai3(){
//            Viết function để user có thể lấy ra tất cả Manager của các project (in ra dạng
//            table)
            ArrayList<User>list = UserDemo.getallManager() ;
            for (User danhsach:list
                 ) {
                System.out.println(danhsach);

            }
        }
         public static void login(String email,String password) throws Exception {


        User user = UserDemo.loginManager(email,password);
        if (email != user.getEmail()){
            throw new Exception(" email khong dung") ;
        }
        else if (password != user.getPassword()){
            throw new Exception(" pass khong dung") ;
        }
             System.out.println(user);
         }
    public static void loginScanner() throws Exception {
        User user = new User();
        Scanner scanner = new Scanner(System.in) ;
        while (true){
        System.out.println("moi nhap email");
        String email = scanner.nextLine() ;
        if (!(UserDemo.isEmailValid(email) || email.equals(user.getEmail()))){
            System.out.println(" email khong dung hoac ko dung dinh dang") ;
        } ;
            System.out.println("pass");
        String password = scanner.nextLine() ;
  if(!(password.equals(user.getPassword())|| password.length() <6 || password.length()>12)){
      System.out.println(" pass khong dung") ;}

              user  = UserDemo.loginManager(email,password);




        System.out.println(user);}
    }

    }

