package Simple_code;


import javax.swing.*;
import java.util.Random;

public class Array_04 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("图片展示");
        jf.setSize(380, 400);
        jf.setDefaultCloseOperation(3); //窗口关闭程序停止
        jf.setLocationRelativeTo(null); //窗口始终在屏幕中间
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //定义图片编号的数组
        int[][] datas = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //打乱图片，改变datas数组
        Random r = new Random();
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                int x = r.nextInt(datas.length);
                int y = r.nextInt(datas[x].length);
                int temp = datas[i][j];
                datas[i][j] = datas[x][y];
                datas[x][y] = temp;
            }
        }

        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel jLabel = new JLabel(new ImageIcon("File/itheima_array04/" + datas[i][j] + ".png"));
                jLabel.setBounds(j * 90, i * 90, 90, 90);
                jf.add(jLabel);
            }
        }

        jf.setVisible(true);
    }
}
