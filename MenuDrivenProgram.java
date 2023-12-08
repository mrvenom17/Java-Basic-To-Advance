import java.util.Scanner;
import java.util.Arrays;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Array");
            System.out.println("2. Searching");
            System.out.println("3. Sorting");
            System.out.println("4. Recursion");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arrayOperations();
                    break;
                case 2:
                    searchingOperations();
                    break;
                case 3:
                    sortingOperations();
                    break;
                case 4:
                    recursionOperations();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void arrayOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nArray Operations:");
            System.out.println("1. Add Matrix");
            System.out.println("2. Matrix Multiplication");
            System.out.println("3. Sparse Matrix");
            System.out.println("4. Back to Main Menu");

            System.out.print("Enter your choice: ");
            int arrayChoice = scanner.nextInt();

            switch (arrayChoice) {
                case 1:
                    addMatrix();
                    break;
                case 2:
                    matrixMultiplication();
                    break;
                case 3:
                    sparseMatrix();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addMatrix() {
        // Implementation for adding matrices
        System.out.println("Adding Matrix...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns for the matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void matrixMultiplication() {
        // Implementation for matrix multiplication
        System.out.println("Matrix Multiplication...");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter the values for the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the values for the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void sparseMatrix() {
        // Implementation for sparse matrix
        System.out.println("Sparse Matrix Operations...");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        int zero = 0;

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) {
                    zero++;
                }
            }
        }

        if (zero > ((row + column) / 2)) {
            System.out.println("It is a sparse matrix");
        } else {
            System.out.println("It is not a sparse matrix");
        }
    }

    private static void searchingOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSearching Operations:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Back to Main Menu");

            System.out.print("Enter your choice: ");
            int searchChoice = scanner.nextInt();

            switch (searchChoice) {
                case 1:
                    linearSearch();
                    break;
                case 2:
                    binarySearch();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void linearSearch() {
        // Implementation for linear search
        System.out.println("Linear Search...");
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int x = sc.nextInt();
        int[] array = new int[x];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                System.out.println("Element is present at index " + i);
                return;
            }
        }

        System.out.println("Element not found in the array.");
    }

    private static void binarySearch() {
        // Implementation for binary search
        System.out.println("Binary Search...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int x = sc.nextInt();
        int[] array = new int[x];

        System.out.println("Enter the elements of the array (in sorted order): ");
        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int high = array.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                System.out.println("Element is present at index " + mid);
                return;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found in the array.");
    }

    private static void sortingOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSorting Operations:");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Back to Main Menu");

            System.out.print("Enter your choice: ");
            int sortChoice = scanner.nextInt();

            switch (sortChoice) {
                case 1:
                    insertionSort();
                    break;
                case 2:
                    bubbleSort();
                    break;
                case 3:
                    selectionSort();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void insertionSort() {
        // Implementation for insertion sort
        System.out.println("Insertion Sort...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int x = sc.nextInt();
        int[] array = new int[x];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 1; i < x; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }

        System.out.println("Sorted array using Insertion Sort:");
        for (int i = 0; i < x; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSort() {
        // Implementation for bubble sort
        System.out.println("Bubble Sort...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int x = sc.nextInt();
        int[] array = new int[x];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array using Bubble Sort:");
        for (int i = 0; i < x; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void selectionSort() {
        // Implementation for selection sort
        System.out.println("Selection Sort...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int x = sc.nextInt();
        int[] array = new int[x];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < x - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < x; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // swap arr[i] and arr[minIndex]
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("Sorted array using Selection Sort:");
        for (int i = 0; i < x; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void recursionOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nRecursion Operations:");
            System.out.println("1. Fibonacci");
            System.out.println("2. Factorial");
            System.out.println("3. Reverse String");
            System.out.println("4. Sum of Digits");
            System.out.println("5. Count Digits");
            System.out.println("6. Palindrome");
            System.out.println("7. Tower of Hanoi");
            System.out.println("8. Back to Main Menu");

            System.out.print("Enter your choice: ");
            int recursionChoice = scanner.nextInt();

            switch (recursionChoice) {
                case 1:
                    fibonacci();
                    break;
                case 2:
                    factorial();
                    break;
                case 3:
                    reverseString();
                    break;
                case 4:
                    sumOfDigits();
                    break;
                case 5:
                    countDigits();
                    break;
                case 6:
                    palindrome();
                    break;
                case 7:
                    towerOfHanoi();
                    break;
                case 8:
                    return;
                default:
		                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void fibonacci() {
        // Implementation for Fibonacci series using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    private static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    private static void factorial() {
        // Implementation for factorial using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + ": " + factorialRecursive(num));
    }

    private static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    private static void reverseString() {
        // Implementation for reversing a string using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        System.out.println("Reversed string: " + reverseStringRecursive(input));
    }

    private static String reverseStringRecursive(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    private static void sumOfDigits() {
        // Implementation for sum of digits using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits: " + sumOfDigitsRecursive(num));
    }

    private static int sumOfDigitsRecursive(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigitsRecursive(num / 10);
    }

    private static void countDigits() {
        // Implementation for counting digits using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int num = sc.nextInt();

        System.out.println("Number of digits: " + countDigitsRecursive(num));
    }

    private static int countDigitsRecursive(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigitsRecursive(num / 10);
    }

    private static void palindrome() {
        // Implementation for checking palindrome using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = sc.nextLine();

        if (isPalindromeRecursive(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    private static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) {
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1) && isPalindromeRecursive(str.substring(1, str.length() - 1));
    }

    private static void towerOfHanoi() {
        // Implementation for Tower of Hanoi using recursion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks for Tower of Hanoi: ");
        int disks = sc.nextInt();

        System.out.println("Steps to solve Tower of Hanoi with " + disks + " disks:");
        towerOfHanoiRecursive(disks, 'A', 'C', 'B');
    }

    private static void towerOfHanoiRecursive(int disks, char source, char destination, char auxiliary) {
        if (disks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoiRecursive(disks - 1, source, auxiliary, destination);
        System.out.println("Move disk " + disks + " from " + source + " to " + destination);
        towerOfHanoiRecursive(disks - 1, auxiliary, destination, source);
    }
}

