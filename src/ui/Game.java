package ui;

import javax.swing.*;
import java.util.Random;

public class Game extends JFrame {

    int[][]arr2=new int[4][4];
    public Game(){
        //框
        windowset();
        //菜单栏
        menubar();
        //打乱图片索引
        daluanImage();
        //添加图片
        initImage();

        //添加按钮

        this.setVisible(true);
    }

    private void daluanImage() {
        int[] arr=new int[16];
        for (int i = 0; i < 16; i++) {
            arr[i]=i;
        }
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int rand=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[rand];
            arr[rand]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            arr2[i/4][i%4]=arr[i];
        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arr2[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    private void initImage() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ImageIcon imageIcon=new ImageIcon("image/"+arr2[i][j]+".jpg");
                JLabel jLabel=new JLabel(imageIcon);
                jLabel.setBounds(150*i,150*j,150,150);
                this.add(jLabel);
            }
        }
    }

    private void windowset() {
        this.setSize(600,600);
        this.setTitle("v1.0");
        this.setAlwaysOnTop(true);
        //将框放在中间
        this.setLocationRelativeTo(null);
        //Jlabel取消默认居中放置
        setLayout(null);
        this.setDefaultCloseOperation(3);
    }

    private void menubar() {
        JMenuBar jMenuBar=new JMenuBar();
        JMenu functionMenu=new JMenu("功能");
        JMenu aboutMenu=new JMenu("关于我们");
        JMenuItem changeItem=new JMenuItem("更换图片");
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem registerItem=new JMenuItem("登录");
        JMenuItem exitItem=new JMenuItem("关闭");
        JMenuItem messageItem=new JMenuItem("公众号");
        functionMenu.add(changeItem);
        functionMenu.add(replayItem);
        functionMenu.add(registerItem);
        functionMenu.add(exitItem);
        aboutMenu.add(messageItem);
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);
        this.setJMenuBar(jMenuBar);
    }
}
