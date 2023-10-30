//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Solution obj = new Solution();
		    long res = obj.sumXOR(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
        long result = 0;

        int max_element = Integer.MIN_VALUE;
        for (int num : arr) {
            max_element = Math.max(max_element, num);
        }

        int bits = 0;
        while (max_element > 0) {
            max_element >>= 1;
            bits++;
        }

        for (int i = 0; i < bits; i++) {
            int count_set_bits = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    count_set_bits++;
                }
            }
            int count_unset_bits = n - count_set_bits;
            result += (long) count_set_bits * count_unset_bits * (1 << i);
        }

        return result;
    }
    
    
}


