/**
 * Rearrange an array so that arr[i] becomes arr[arr[i]] with O(1) extra space
 */
package Arrays;


/**
 * @author VijayAllagi
 *
 */
public class RearrangeArray {
public static void main(String[] args) {
	int arr[] ={4, 0, 2, 1, 3};
     RearrangeArray rrObj = new RearrangeArray();
	//Input Array 
     System.out.println("Input array is as below");

     rrObj.printArr(arr, arr.length);
 
     rrObj.rearrange(arr, arr.length);
 
    System.out.println("Modified array is as below");
    rrObj.printArr(arr, arr.length);
}

/**
 * @param arr
 * @param length
 */
private  void rearrange(int[] arr, int length) {
	// TODO Auto-generated method stub
	// First step: Increase all values by (arr[arr[i]]%n)*n
    for (int i=0; i < length; i++)
        arr[i] += (arr[arr[i]]%length)*length;
 
    // Second Step: Divide all values by n
    for (int i=0; i<length; i++)
        arr[i] /= length;
	
}

/**
 * @param arr
 * @param length
 */
private void printArr(int[] arr, int length) {
	// TODO Auto-generated method stub
	for (int i=0; i<length; i++)
        System.out.print(arr[i]+" ");
	System.out.println();
	
}
}
