import java.util.Scanner;


public class SearchBox {
public int find(String text, String search, String wholeWord, int start){
	int k=0;
    boolean t=false;
 
    int count=0;

String str[]=text.split(" ");


if(wholeWord.charAt(0)=='N'){
if(text.contains(search)){

	count=text.indexOf(search, start);
	t=true;

	}

else 
	t=false;
	}

else if(wholeWord.charAt(0)=='Y'){
	
		for(int i=0;i<str.length;i++){
if(str[i].equals(search)){
              count=k;
if(text.indexOf(search, count)>=start){	 
	       	t=true;
	       	break;
}
else {
		k+=search.length()+1;	
	    t=false;

}
} 
	        
		 else {
			 k+=str[i].length()+1;
				t=false;
}
}
}		
if(t==true)return count;
else return -1;

}
}