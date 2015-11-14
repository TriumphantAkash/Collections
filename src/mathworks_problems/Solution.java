package mathworks_problems;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;

class CustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		if(i1>i2){
			return -1;
		} else if(i2>i1) {
			return 1;
		} else{
			return 0;
		}
	}
	
}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("employee1", 3234);
		map.put("employee2", 1234);
		map.put("employee3", 2234);
		map.put("employee4", 4234);
		
		
		ArrayList<String> emplyeeNames = new ArrayList<String>();
		emplyeeNames.addAll(map.keySet());
		
		ArrayList<Integer> employeeIds = new ArrayList<Integer>();
		for(int i =0; i<map.size();i++){
			employeeIds.add(map.get(emplyeeNames.get(i)));
		}
		
		Collections.sort(employeeIds, new CustomComparator());
		
		for(Integer id:employeeIds) {
			System.out.println(id);
		}
	}

}
