
public class GymTraining {
	/*public static void main(String[] args) {
		trainingTime(149, 89,170,79, 35);
	}*/
	
	
	 static public int trainingTime(int needToTrain,
	int minPulse, int maxPulse, int trainChange, int restChange){
		  boolean t=true;
		  int count=0;
		  int sum=minPulse;
		  int save = 0;
		  boolean tt=true;
		 boolean c=false;
		  while(needToTrain>0){
			  sum+=trainChange;
			  	if(sum>maxPulse) t=true;
			  	else t=false;
			  	if(t==false){
			  	
			  		needToTrain--;
			  		 c=true;
				  }
				  else {
				  	sum-=trainChange+restChange;
				  	
				  	if(sum<minPulse) sum=minPulse;
				  	
				  }
			    if(c==false&&needToTrain==needToTrain){
			  		tt=false;
			  		count=-1;
			  		break;
			  	} 	
			   	count++;
			  	
		  }

		if(tt==true)
			return count;
		else 
			return count;
			
		
		
			
	}
}
