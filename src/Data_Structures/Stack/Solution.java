package Data_Structures.Stack;

import java.util.*;

public class Solution {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	       Scanner scn=new Scanner(System.in);
	        String S=scn.nextLine();
	        String even=null;
	        String odd=null;
	        
	        for(int i=0;i<S.length()-1;i++){
	            if(i%2==0){
	                even+=S.charAt(i);
	            }else{
	                odd+=S.charAt(i);
	            }
	        }
	        System.out.println(even+"  "+odd);
	    }
	}