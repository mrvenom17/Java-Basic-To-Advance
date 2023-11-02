import java.util.Scanner;
class sumofarray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of array");
		int a = sc.nextInt();
		int[] arr = new int[a];
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
            		sum += arr[i];
        	}

        	System.out.println("Sum of the array elements: " + sum);
	}
}
