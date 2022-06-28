package backend;

import entyti.ConnectionJDBC;
import entyti.Role;
import entyti.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDemo {
    public static User getemployee(int id1) {
        ConnectionJDBC connectionJDBC = new ConnectionJDBC() ;
        Connection connection = connectionJDBC.conNec();
        String sql = "select * from User where id = ? and role = 'Employee'" ;
        User user = new User() ;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id1);
            ResultSet resultSet = statement.executeQuery() ;
            if (resultSet.next()){
                int id = resultSet.getInt("id") ;
                String fullName = resultSet.getString("fullname");
                String email = resultSet.getString("email") ;
                String password = resultSet.getNString("password");
                String role = resultSet.getString("role") ;
                int ProjectId = resultSet.getInt("ProjectId") ;

              String ProSkill = resultSet.getString("ProSkill") ;

user = new User(id,fullName,email,password,Role.valueOf(role),ProjectId,ProSkill);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public static ArrayList<User> getallManager() {
        ConnectionJDBC connectionJDBC = new ConnectionJDBC() ;
        Connection connection = connectionJDBC.conNec();
        String sql = "select * from User where role = 'Manager'" ;
        ArrayList<User>list = new ArrayList<>() ;
        try {
            PreparedStatement statement = connection.prepareStatement(sql) ;
            ResultSet resultSet = statement.executeQuery() ;
            while ( resultSet.next()){
                int id = resultSet.getInt("id") ;
                String fullName = resultSet.getString("fullname");
                String email = resultSet.getString("email") ;
                String password = resultSet.getNString("password");
                String role = resultSet.getString("role") ;
                int ProjectId = resultSet.getInt("ProjectId") ;
                int ExpInYear = resultSet.getInt("ExpInYear") ;
                User user = new User(id,fullName,email,password,Role.valueOf(role),ProjectId,ExpInYear) ;
                list.add(user) ;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static User loginManager(String email, String password) throws Exception {
        ConnectionJDBC connectionJDBC = new ConnectionJDBC();
        Connection connection = connectionJDBC.conNec();
        String sql = " select * from User where email = ? and password = ?";
        User user;
        try {
            user = new User();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            if (!isEmailValid(email)){
//                throw new Exception(" khong đúng định dạng email. ") ;
//                System.out.println("ko dung");
            }
            statement.setString(2, password);
            if (password.length()< 6 || password.length()>12){
//                throw new Exception("độ dài pass không hợp lệ ký tự 6< || >12") ;
                System.out.println("ko du");
            }
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullName = resultSet.getString("fullname");
                String email1 = resultSet.getString("email");
                String password1 = resultSet.getNString("password");
                String role = resultSet.getString("role");
                int ProjectId = resultSet.getInt("ProjectId");
                int ExpInYear = resultSet.getInt("ExpInYear");
                user = new User(id, fullName, email, password, Role.valueOf(role), ProjectId, ExpInYear);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
    public static boolean isEmailValid(String email) {
        Pattern compileEmail = Pattern.compile("^[\\w\\-_.]+@[\\w\\-_]+(\\.[\\w\\-_]+){1,2}$");
        Matcher matcherEmail = compileEmail.matcher(email);
        return matcherEmail.find();
}
}
