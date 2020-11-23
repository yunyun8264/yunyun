package pac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        while (true){
            int a=scanner.nextInt();
            int x=(int)(Math.random()*a*100%100);
            int y=(int)(Math.random()*a*100%100);
            System.out.println("生成的随机坐标为"+x+","+y);
        }
    }
}
