package codeforce;

public class ACM_Q8_SRM_643_div2_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str[]={"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"HSSSHSSSS", 
			"SSSSSSHSS", 
			"SSHSSSSSS", 
			"SSHSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"HSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSHSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSHSSSS", 
			"SSSSSSSSS", 
			"SSSSSSSSS", 
			"SSSSSSHSS", 
			"SSSSSSSSS", 
			"SSSSSSSHS"};
	 char arr[][]=new char[str.length][str[0].length()];
       for(int i=0;i<str.length;i++){
    	   for(int j=0;j<str[i].length();j++){
    		  arr[i][j]=str[i].charAt(j);
    	   }
       }
         
       
       boolean t=false;
       boolean tt=false;
       for(int i=0;i<str.length;i++){
    	//   System.out.println();
      	   for(int j=0;j<str[0].length();j++){
      	//	   System.out.print(arr[i][j]+" ");
      		if(arr[i][j]=='H'){
      			System.out.println(arr[i][j]+" "+i+" "+j);
      			tt=true;
      			if(i>0&&i<str[0].length()-1&&j>0&&j<str[0].length()-1){
      				System.out.println("yesbb"+arr[i][j]+" "+i+" "+j+" "+arr[6][3]);
      				if(arr[i][j-1]=='H'|
      					arr[i][j+1]=='H'|
      					arr[i-1][j]=='H'|arr[i+1][j]=='H'){
      				System.out.println("yes1");
      				t=true;
      			//	break;
      			}
      			}
      			else if(i==0&&j==0){
          			System.out.println("yes2"); 
          			if(arr[i][j+1]=='H'||arr[i+1][j]=='H'){
          				 t=true;
          			//	 break;
          	          
          			 }
          			 }
      			else if(i==0&&j>0&&j<str[0].length()-1){
          			System.out.println("yes3");
          			if(arr[i][j-1]=='H'||arr[i][j+1]=='H' ||arr[i+1][j]=='H'){
         				 t=true;
         				 System.out.println("yes3");
         				// break;
         	          
         			 }
          		     }
      			else if(i>0&&i<str[0].length()-1&&j==0){
      				System.out.println("yes4");
      				if(arr[i][j+1]=='H'
         					 ||arr[i-1][j]=='H'){
         				     t=true;
         				     System.out.println("yes4");
         				  //   break; 
         			 }
          		     }
      			else if(i>0&&i<str[0].length()-1&&j==str[0].length()-1){
      				System.out.println("yes5");
      				if(arr[i][j-1]=='H'
         					||arr[i-1][j]=='H'){
         				 t=true;
         				 System.out.println("yes5");
         				 //break;
         	          
         			 }
          		     }
      			else if(i==str[0].length()-1&&j==0){
      				System.out.println("yes6");
      				if(arr[i-1][j]=='H'
         					 ||arr[i][j+1]=='H'){
         				 t=true;
         				 System.out.println("yes6");
         				// break;
         	          
         			 }
          		     }
      			else if(i==str[0].length()-1&&j==str[0].length()-1){
      				System.out.println("yes7");
      				if(arr[i-1][j]=='H'
         					 ||arr[i][j-1]=='H'){
         				 t=true;
         				 System.out.println("yes7");
         				 //break;
         	          
         			 }
          		     }
      			else if(i==str[0].length()-1&&j>0&&j<str[0].length()-1){
      				System.out.println("yesn8");
      				System.out.println("yesbb"+arr[i][j]+" "+i+" "+j+" "+arr[6][3]);
      				if(arr[i][j-1]=='H'
         					 ||arr[i][j+1]=='H'||arr[i-1][j]=='H'||arr[i+1][j]=='H'){
         				 t=true;

         				 System.out.println("T "+t);
         				 System.out.println("yes8");
         				// break;
         	          
         			 }
          		}
      			else{
      				if(
        					 arr[i][j+1]=='H'||
        					 arr[i-1][j]=='H')
        					{
        				 t=true;
      				}
      				
      			}
      		
      		}
      		
      	   }
        
       }
       
       
       System.out.println(t+" "+tt);
      
if(t==true&&tt==true)System.out.println("0");
else if(tt==true&&t==false)System.out.println("1");
else System.out.println("2");
     
	}
	
	public static int getNumber(String[] state){
	      String []str=state;
		char arr[][]=new char[str.length][str[0].length()];
	       for(int i=0;i<str.length;i++){
	    	   for(int j=0;j<str[i].length();j++){
	    		  arr[i][j]=str[i].charAt(j);
	    	   }
	       }
	         
	       
	       boolean t=false;
	       boolean tt=false;
	       for(int i=0;i<str.length;i++){
	    	//   System.out.println();
	      	   for(int j=0;j<str[0].length();j++){
	      	//	   System.out.print(arr[i][j]+" ");
	      		if(arr[i][j]=='H'){
	      			System.out.println(arr[i][j]+" "+i+" "+j);
	      			tt=true;
	      			if(i>0&&i<str[0].length()&&j>0&&j<str[0].length()-1){
	      				System.out.println("yes");
	      				if(arr[i][j-1]=='H'|
	      					arr[i][j+1]=='H'|
	      					arr[i-1][j]=='H'|arr[i+1][j]=='H'){
	      				System.out.println("yes");
	      				t=true;
	      			//	break;
	      			}
	      			}
	      			else if(i==0&&j==0){
	          			System.out.println("yes2"); 
	          			if(arr[i][j+1]=='H'||arr[i+1][j]=='H'){
	          				 t=true;
	          			//	 break;
	          	          
	          			 }
	          			 }
	      			else if(i==0&&j>0&&j<str[0].length()-1){
	          			System.out.println("yes3");
	          			if(arr[i][j-1]=='H'||arr[i][j+1]=='H' ||arr[i+1][j]=='H'){
	         				 t=true;
	         				 System.out.println("yes3");
	         				// break;
	         	          
	         			 }
	          		     }
	      			else if(i>0&&i<str[0].length()-1&&j==0){
	          			if(arr[i][j+1]=='H'
	         					 ||arr[i-1][j]=='H'){
	         				     t=true;
	         				     System.out.println("yes4");
	         				  //   break; 
	         			 }
	          		     }
	      			else if(i>0&&i<str[0].length()-1&&j==str[0].length()-1){
	          			if(arr[i][j-1]=='H'
	         					||arr[i-1][j]=='H'){
	         				 t=true;
	         				 System.out.println("yes5");
	         				 //break;
	         	          
	         			 }
	          		     }
	      			else if(i==str[0].length()-1&&j==0){
	          			if(arr[i-1][j]=='H'
	         					 ||arr[i][j+1]=='H'){
	         				 t=true;
	         				 System.out.println("yes6");
	         				// break;
	         	          
	         			 }
	          		     }
	      			else if(i==str[0].length()-1&&j==str[0].length()-1){
	          			if(arr[i-1][j]=='H'
	         					 ||arr[i][j-1]=='H'){
	         				 t=true;
	         				 System.out.println("yes7");
	         				 //break;
	         	          
	         			 }
	          		     }
	      			else if(i==str[0].length()-1&&j>0&&j<str[0].length()-1){
	          			if(arr[i][j-1]=='H'
	         					 ||arr[i][j+1]=='H'||arr[i-1][j]=='H'){
	         				 t=true;

	         				 System.out.println("T "+t);
	         				 System.out.println("yes8");
	         				// break;
	         	          
	         			 }
	          		}
	      		
	      		}
	      		
	      	   }
	        
	       }
	       
	       
	       
	      
	if(t==true&&tt==true)return 0;
	else if(tt==true&&t==false) return  1;
	else return 2;
	     
	}

}
