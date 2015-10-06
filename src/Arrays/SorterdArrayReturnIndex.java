package Arrays;
/*
 * Given a sorted array of integers, using the same array, shuffle the integers to have unique elements and return the index.
Sample input : [3, 3, 4, 5, 5, 6, 7, 7, 7]
Sample output : [3, 4, 5, 6, 7, X, X, X, X]
 */
public class SorterdArrayReturnIndex {
	public static void main(String[] args) {
		int[] array = {3, 3, 4, 5, 5, 6, 7, 7, 7};
		int totalIndex = shuffle(array);
		System.out.println("Index of the array:"+totalIndex);

		for(int i=0;i<totalIndex;i++)
			System.out.print(array[i]+" ");
		
	}
	public static int shuffle(int[] array)
	{
		int i=0;
		if (array.length == 1 || array.length == 0) {
			return i;
		}
	 for(int j=1;j<array.length;j++)
	 {
		 if(array[i]==array[j])
			continue;
		 else
		 {
			 i++;
			 array[i]=array[j];
			 //System.out.println(i);
		 }
	 }
	 return i;
	}
}
