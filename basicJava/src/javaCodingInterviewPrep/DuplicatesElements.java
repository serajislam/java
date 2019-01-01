package javaCodingInterviewPrep;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesElements {

	public static void main(String[] args) {
		String names[] = {"Java","Ruby","C","Python","Java"};
		
		//Compare each element
		for(int a=0;a<names.length;a++)
		{
			for(int b =a+1;b<names.length;b++)
			{
				if(names[a].equals(names[b]))
				{
					System.out.println(names[a]);
				}
			}
		}
		
		
		//using HashSet 
		Set<String> store = new HashSet<String>();
		for(String name : names){
			if(store.add(name) == false){
				System.out.println(name);
			}
		}
		
		//Using HashMap
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String name :names){
			Integer count =storeMap.get(name);
			if(count==null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
		}
		
		//getting value from HashMap
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}
