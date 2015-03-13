package codeforce;

public class ACM_Q20_SRM_631_div2_250 {
//nameOfClass TaroGrid
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String []str={"BWBW",
				      "BBWB",
				      "WWWB",
				      "BWWW"};
		
		char arr[][]=new char[str.length][str[0].length()];
	          for(int i=0;i<str.length;i++){
	    	   for(int j=0;j<str[i].length();j++){
	    		  arr[i][j]=str[i].charAt(j);
	    	                                     }
	                                             }	
	          
	     
	int maxB=0;
	int maxW=0;
	boolean turn=false;
	int countB=0;
	int countW=0;
	int i=0,j=0;
	
	for( i=0;i<arr.length;i++){
		System.out.println();
		for( j=0;j<arr[0].length;j++){
			System.out.print(arr[j][i]+" ");
			if(arr[j][i]=='B'){
				countW=0;
				countB++;
				System.out.print(countB+" ");
			maxB=Math.max(maxB, countB);
			}
			else{
				countB=0;
				countW++;
				System.out.print(countW+" ");
			maxW=Math.max(maxW, countW);	
			}
		    }
		    countB=0;
		    countW=0;
            }
	
	System.out.println();	
	System.out.println(Math.max(maxB,maxW));
	
	
	}*/
	public static int getNumber(String[] grid){
		char arr[][]=new char[grid.length][grid[0].length()];
        for(int i=0;i<grid.length;i++){
  	   for(int j=0;j<grid[i].length();j++){
  		  arr[i][j]=grid[i].charAt(j);
  	                                     }
                                           }	
        
   
int maxB=0;
int maxW=0;
boolean turn=false;
int countB=0;
int countW=0;
int i=0,j=0;

for( i=0;i<arr.length;i++){
	System.out.println();
	for( j=0;j<arr[0].length;j++){
		System.out.print(arr[j][i]+" ");
		if(arr[j][i]=='B'){
			countW=0;
			countB++;
			System.out.print(countB+" ");
		maxB=Math.max(maxB, countB);
		}
		else{
			countB=0;
			countW++;
			System.out.print(countW+" ");
		maxW=Math.max(maxW, countW);	
		}
	    }
	    countB=0;
	    countW=0;
      }

	
int max=Math.max(maxB,maxW);
return max;
	}
	
	}
