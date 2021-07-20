package Week2;
//Javamatrixpro
import java.util.Scanner;

public class Matrix {
	int arr[][];
	int row,col;
	public static void main(String args[]) {
		Matrix matobj = new Matrix();
		matobj.accept();
		matobj.sum();
		matobj.display();
	}
	
	

	public void accept() {
		// TODO Auto-generated method stub
		Scanner scanobj= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = scanobj.nextInt();
		System.out.println("Enter the number of columns");
		col = scanobj.nextInt();
		arr= new int[row+1][col+1];
		
		//accepting the matrix
		System.out.println("Enter the values");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scanobj.nextInt();
			}
		}
		
		//displaying the matrix
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						System.out.print("  "+arr[i][j]);
					}
					System.out.println();
				}
		scanobj.close();
	}
	
	
	public void sum() {
		// TODO Auto-generated method stub
		//Row sum;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
			}
			arr[i][col]=sum;
		}
		
		//Col sum
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+arr[j][i];
			}
			arr[row][i]=sum;
		}
	}


	/*private void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<row+1;i++) {
			for(int j=0;j<col+1;j++) {
				System.out.print("   "+arr[i][j]);
			}
			System.out.println();
		}
		
	}*/
	private void display() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println();
		for(int i=0;i<row+1;i++) {
			for(int j=0;j<col+1;j++) {
				if(j==col) 
					System.out.println(" |"+arr[i][j]);
				
				else
					System.out.print("   "+arr[i][j]);	
			}
			System.out.println();
		}
		
	}
}
