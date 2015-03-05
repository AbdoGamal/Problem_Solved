package codeforce;

import java.util.HashMap;
import java.util.Map;

public class fin_Freq_using_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> m = new HashMap<String, Integer>(); 
        m.put("a", null);
        m.put("a", null);
        m.put("a", null);
        m.put("a", null);
        m.put("a", null);
        m.put("b", null);
		// Initialize frequency table from command line 
		for (String a : args) { 
		Integer freq = m.get(a); 
		m.put(a, (freq == null) ? 1 : freq + 1); 
		} 

		System.out.println(m.size() + " distinct words:"); 
		System.out.println(m); 
	}

}
