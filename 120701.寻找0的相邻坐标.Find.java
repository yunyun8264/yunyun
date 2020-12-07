package pac;

public class Find {
	void findzero(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("坐标是：R_zero("+column+","+row+")");
				}
			}
		}
		
	}
	void findleft(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int leftX=column-1;
					System.out.println("坐标是：R_left("+leftX+","+row+")");
				}
			}
		}
		
	}
	void findright(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int leftX=column+1;
					System.out.println("坐标是：R_right("+leftX+","+row+")");
				}
			}
		}
		
	}
	void finddown(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int leftY=row-1;
					System.out.println("坐标是：R_down("+column+","+leftY+")");
				}
		}
		
	}
}
	void findup(int array2d[][]) {
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					int leftY=row+1;
					System.out.println("坐标是：R_up("+column+","+leftY+")");
			}
		}
		
	}
}
	
}
