package java121401;

import java.util.Scanner;

public class App {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("请输入一个年份");
	        while (true) {
	        	 long year;
	 	        try
	 	        {
	 	            year = scan.nextLong();
	 	            if(year%4==0&&year%100!=0||year%400==0){
	 	                System.out.println(year+"是润年！");
	 	            }
	 	            else{
	 	                System.out.println(year+"不是润年！");
	 	            }
	 	        } catch(Exception e){
	 	            System.out.println("您输入的不是合法的年份");
	 	        }

	 	    }
				
			}
	       

}
