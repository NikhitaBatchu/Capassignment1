public class SortArray {    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt(); 
        }       
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(arr[i] + " ");    
        }       
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();       
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    
