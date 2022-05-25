import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Integer arr[]= {1,11,2,45,23,34,5,4,56,56,67};
		
		for(int a:arr) {
			System.out.print(a+"\t");
		}
		System.out.println();
		Arrays.sort(arr,0,4,(e1,e2)->-e1.compareTo(e2));
		for(int a:arr) {
			System.out.print(a+"\t");
		}

	}

}
