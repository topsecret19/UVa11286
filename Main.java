import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s;
	while((s=br.readLine())!=null && !s.isEmpty()) {
		Scanner sc = new Scanner(s);
		int froshs = sc.nextInt();
		if(froshs==0) {
			break;
		}
		HashMap<ArrayList<Integer>,Integer> hm = new HashMap<ArrayList<Integer>,Integer>();
		for(int i=0; i<froshs; i++) {
			String line=br.readLine();
			Scanner sc2 = new Scanner(line);
			ArrayList<Integer> set = new ArrayList<Integer>();
			while(sc2.hasNextInt()) {
				int course = sc2.nextInt();
				set.add(course);
			}
			Collections.sort(set);
			if(hm.containsKey(set)) {
				int value = hm.get(set);
				value++;
				hm.put(set, value);
			}else {
				hm.put(set, 1);
			}
		}

     ArrayList<Integer>list = new ArrayList<>(hm.values());  
     Collections.sort(list,Collections.reverseOrder());  
     int v = list.remove(0); 
     int students = v;  
     for (int integer : list) {  
            if (integer == v) {
            	students+=v;  
            }else {
            	break;  
            }
           }  

		System.out.println(students);
	}
	
}
}
