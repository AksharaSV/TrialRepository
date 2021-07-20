package Week2;

//Java array program.
import java.util.Scanner;
	
	public class LeftRotate {
		static int arr[]= new int[5];
		public static void main(String args[]) {
			Scanner scanobj= new Scanner(System.in);
			System.out.println("Enter five elements");
			
				for(int i=0;i< arr.length;i++) {
					arr[i]=scanobj.nextInt();
				}
				System.out.println("The original array is");
				for(int i=0;i< arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			leftshift(arr);
			display(arr);
			scanobj.close();
		}
		
		private static void leftshift(int[] arr2) {
			// TODO Auto-generated method stub
			
			int temp = arr[0];
			for(int i=0;i< arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			
		}

		private static void display(int[] arr2) {
			// TODO Auto-generated method stub
			System.out.println("\nThe array after rotating left once is");
			for(int i=0;i< arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}



