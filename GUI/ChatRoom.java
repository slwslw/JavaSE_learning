package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
1:把文本框的内容发送到文本域中
2:每次发送的文本内容不带前后空格
3:多次发送的内容在文本域以追加的方式呈现
4:清空聊天就是把文本域的内容设置为空
*/
public class ChatRoom {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("聊天室");
        jf.setSize(400, 300); //设置窗体大小
        jf.setDefaultCloseOperation(3); //设置窗体关闭时默认操作(整数3表示:窗口关闭时退 出应用程序)
        jf.setLocationRelativeTo(null); //设置位置，值为null，则窗体位于屏幕中央
        jf.setAlwaysOnTop(true); //设置此窗口是否应始终位于其他窗口之上
        jf.setLayout(null);
        //显示聊天信息的文本域
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(10, 10, 360, 200); //创建位置和大小
        jf.add(messageArea);
        //输入聊天信息的文本框
        JTextField messageField = new JTextField();
        messageField.setBounds(10, 230, 180, 20);
        jf.add(messageField);
        //发送按钮
        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200, 230, 70, 20);
        jf.add(sendButton);
        //清空聊天按钮
        JButton clearButton = new JButton("清空聊天");
        clearButton.setBounds(280, 230, 100, 20);
        jf.add(clearButton);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框的内容
                // String message = messageField.getText();
                // messageField.setText("");
                //每次发送的文本内容不带前后空格
                // String message = messageField.getText();
                // message = message.trim();
                String message = messageField.getText().trim(); //链式调用
                messageField.setText("");
                //把文本框的内容发送到文本域中
                // messageArea.setText(message);
                //多次发送的内容在文本域以追加的方式呈现
                messageArea.append(message + "\n");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //清空聊天就是把文本域的内容设置为空
                messageArea.setText("");
            }
        });
        jf.setVisible(true); ////设置窗体可见
    }
}
