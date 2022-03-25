public class ReverseArray {  
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        System.out.println(arr[i]); 
        }   
        System.out.println("Array in reverse order: ");    
        for (int i = n-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }   
}
