package javacoursePractice.Lecture2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] elements= {9,3,5,1,2};
		computeDifference(elements);

	}
	 public static void computeDifference(int [] elements){
	        int max=1;
	        int min=100;
	        int maximumDifference=0;
	        
	        for(int i=0;i<elements.length;i++){
	            if(elements[i]<min){
	                min=elements[i];
	            }
	            
	            if(elements[i]>max){
	                max=elements[i];
	            }
	        }
	        
	        maximumDifference=Math.abs(max-min);
	        System.out.println(maximumDifference);
	    }
}
