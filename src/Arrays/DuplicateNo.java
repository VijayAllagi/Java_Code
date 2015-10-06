/**
 * 
 */
package Arrays;


import java.util.ArrayList;
import java.util.List;

/**
 * @author VijayAllagi
 *
 */

/*
 * 
 * Problem Statment
 * We are given a list from 1 to 10(where series go from 1 to 10), with one added duplicate number in list.
 * Note: in below program as program suggests there must not be more than 1 duplicate number,
 * in below program we could change 10 to any other number as well.
 */
public class DuplicateNo {
 public static void main(String[] args) {
	List<Integer> inputArry = new ArrayList<Integer>();
	int noOfElm = 10;
	for(int i=1; i <noOfElm ; i++){
		inputArry.add(i);
	}
	inputArry.add(7);
	findDuplicate(inputArry,noOfElm-1);
}

/**
 * @param inputArry
 * @param noOfElm
 */
private static void findDuplicate(List<Integer> inputArry, int noOfElm) {
	// TODO Auto-generated method stub
	int sum = getSum(inputArry);
	int duplicateNo = sum - (noOfElm*(noOfElm+1)/2);
	System.out.println(duplicateNo);
	
}

/**
 * @param inputArry
 * @return
 */
private static int getSum(List<Integer> inputArry) {
	// TODO Auto-generated method stub
	int sum = 0;
	for(int n : inputArry){
		sum +=  n;
	}
	return sum;
}
}
