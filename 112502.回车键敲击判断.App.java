import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        //设置键盘监听器事件
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("美女")) {
                        textArea_B.setText("回答正确");
                    }
                }
                else{
                    textArea_B.append("丑拒");
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(100,100,300,100);//设置文本的长宽高
        textArea_B.setBounds(100,300,300,100);
        textArea_A.setBackground(Color.cyan);//设置文本框颜色
        textArea_B.setBackground(Color.yellow);

        textArea_A.setText("魔镜魔镜，谁是世界上最漂亮的人？");
        myPanel.add(textArea_A);//显示文本
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("TestGUI");//设置窗口名称
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
