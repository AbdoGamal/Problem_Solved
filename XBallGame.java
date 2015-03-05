public class XBallGame {
	static public String[] newStatistics(String[] placeboard){
		
         String sp[] = new String [placeboard.length];
         String k="";
         String str="";    
for(int i=0;i<placeboard.length;i++){
            String main[]=placeboard[i].split("-");
for(int j=0;j<placeboard.length;j++){
       if(i==j)continue;
	          
       String b[]=placeboard[j].split("-");
 	   
      if(main[0].equals(b[0])){
 	  str+=b[1]+",";
}
}
      k=sort(str);
      main[0]+="-";
      if(k.length()>0){
      main[0]+=main[1]+","+k;
      }
      else main[0]+=main[1]+k;
     sp[i]=main[0]+"";
     k="";
     str="";
	}
for(int i=0;i<sp.length;i++){
    if(sp[i].charAt(sp[i].length()-1)==',')
	sp[i]=sp[i].substring(0,sp[i].length()-1);	
    }
		return sp;
	}
	static public String  sort(String str){
		int co=0;
for(int i=0;i<str.length();i++){
			if(str.charAt(i)==',')
				co++;
		}

		String spliter[]=str.split(",");
        String k="";
        int m=0;
for(int j=0; j<spliter.length;j++){
for (int i=j+1 ; i<spliter.length; i++){
 if(spliter[i].compareTo(spliter[j])<0){
                   String temp= spliter[j];
                   spliter[j]= spliter[i]; 
                   spliter[i]=temp;
}
}
    if(m<co){
        	 k+=spliter[j]+",";
             m++;
             }
        	 else
        	 k+=spliter[j];
             }
		return k;
	}
}