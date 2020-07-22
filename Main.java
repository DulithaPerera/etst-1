
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.SortedSet;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


public class Main{

	public static void main (String[] args){
		
	//LinkedList lnkList = new LinkedList();
	List lnkList = new LinkedList();
		lnkList.add("e1");
		lnkList.add("e2");
		lnkList.add("e3");
		lnkList.add("e4");
		displayAll(lnkList);
		
	List aryList = new ArrayList();
		aryList.add("x");
		aryList.add("y");
		aryList.add("z");
		displayAll(aryList);

	Set hashSet = new HashSet();
		hashSet.add("s1");
		hashSet.add("s2");
		hashSet.add("s3");
		hashSet.add("s4");
		displayAll(hashSet);
	
	SortedSet treeSet = new TreeSet();
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("3");
		treeSet.add("4");
		displayAll(treeSet);

	LinkedHashSet lnkHashSet = new LinkedHashSet();
		lnkHashSet.add("one");
		lnkHashSet.add("two");
		lnkHashSet.add("three");
		lnkHashSet.add("four");
		displayAll(lnkHashSet);
		
	Map map1 = new HashMap();
		map1.put("k1","J");
		map1.put("k2","K");
		map1.put("k3","L");
		map1.put("k4","M");
	//displayAll(map1);
		displayAll(map1.keySet());
		displayAll(map1.values());

	SortedMap map2 = new TreeMap();
		map2.put("k1","jj");
		map2.put("k2","kk");
		map2.put("k3","ll");
		map2.put("k4","mm");
		displayAll(map2.keySet());
		displayAll(map2.values());
	//displayAll(map2);
		
	LinkedHashMap map3 = new LinkedHashMap();
		map3.put("k1","jjj");
		map3.put("k2","kkk");
		map3.put("k3","lll");
		map3.put("k4","mmm");
		displayAll(map3.keySet());
		displayAll(map3.values());
	//displayAll(map3);
		
	}
	
	static void displayAll(Collection col){
		Iterator i = col.iterator();
		
		while (i.hasNext()){
			String str = (String) i.next();
			System.out.print(str+" ");		
		}
		System.out.println();

	}

}
