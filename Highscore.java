import java.util.ArrayList;
import java.util.List;


public class Highscore {
	public int getRank(int[] scores, int newscore, int places){
		List<Integer> store = new ArrayList<Integer>();
		int Rank=0;		
		for(int i=0;i<scores.length;i++){
			store.add(i,scores[i]);
		    }
        if(scores.length<places){
        	
        for(int i=0;i<store.size();i++){
        if(newscore>=store.get(i)){
        	store.add(i,newscore);
        	Rank=store.indexOf(newscore);
        
          break; 
        }
        
        else if (newscore<store.get(i)){
        	Rank=scores.length;
        	
        }
        }
        Rank+=1;
        }
        else if(scores.length==places) {
        
        	  for(int i=0;i<scores.length;i++){
        	        if(newscore>store.get(i)){
        	        int k=store.get(i);
        	        	k=newscore;
        	        	store.add(i,k);
        	        	Rank=store.indexOf(newscore)+1;
        	        break;
        	        }
        	        else {Rank=-1;
        	        
        	        }
        	        }
        
}
		return Rank;
}
}
