package Main_code.GUI;

/*要求：
1. 已知的用户名和密码
   用户名：itheima
   密码：123456
2.用户名和密码的长度都是6-12位
3.点击登录按钮
先判断输入的用户名和密码是否符合要求
再判断用户登录是否成功
知道了用户登录案例的需求和要求后，下面我们到IDEA中去实现一下：*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("用户登录");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);
        //显示用户名文本
        JLabel usernameLable = new JLabel("用户名");
        usernameLable.setBounds(50, 50, 50, 20);
        jf.add(usernameLable);
        //用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 20);
        jf.add(usernameField);
        //显示密码文本
        JLabel passwordLable = new JLabel("密码");
        passwordLable.setBounds(50, 100, 50, 20);
        jf.add(passwordLable);
        //密码输入框
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        jf.add(passwordField);
        //登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50, 200, 280, 20);
        jf.add(loginButton);
        //已知的用户名和密码
        String name = "itheima";
        String pwd = "123456";
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取用户输入的用户名和密码
                String username = usernameField.getText();
                String password = passwordField.getText();
                //先判断输入的用户名和密码是否符合要求
                //用户名和密码的长度都是6-12位
                if (username.length() < 6 || username.length() > 12) {
                    // System.out.println("用户名的长度是6-12位，请重新输入");
                    //静态的成员方法和成员变量是可以通过类名访问的
                    JOptionPane.showMessageDialog(jf, "用户名的长度是6-12位，请重新输入");
                    usernameField.setText("");
                    return;
                }
                //再判断用户登录是否成功
                if (username.equals(name) && password.equals(pwd)) {
                    // System.out.println("登录成功");
                    JOptionPane.showMessageDialog(jf, "登录成功");
                    usernameField.setText("");
                    passwordField.setText("");
                } else {
                    // System.out.println("用户名或者密码有误");
                    JOptionPane.showMessageDialog(jf, "用户名或者密码有误");
                }
            }
        });
        jf.setVisible(true);
    }
}

