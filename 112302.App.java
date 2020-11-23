package pac;

public class App {
    public static void main(String[] args) {
        while (true){
            try{
                Thread.sleep(1000);
                int x=(int)(Math.random()*100);
                int y=(int)(Math.random()*100);
                System.out.println("随机坐标：("+x+","+y+")");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
  }
}
