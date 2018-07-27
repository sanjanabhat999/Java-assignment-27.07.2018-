package JavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserMainCode {
	static boolean checkTripplets(int arr[]) {
		
		for (int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
			{
				break;
			}
			if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2]) {
				return true;
			}
			
		}
		return false;
	}
}
public class Problem3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int arr[]=new int[8];
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no's: ");
		for (int i = 0; i < arr.length; i++) {
		
			
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
//		int arr[]= {7,3,3,5,3,5,2,3};
		if(UserMainCode.checkTripplets(arr)) {
			System.out.println("TRUE");
		}
		else
			System.out.println("FALSE");
				


	}

}
