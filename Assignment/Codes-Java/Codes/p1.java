import java.util.*;

class TreeMapMethod{
	public static void main(String[] args){
		TreeMap tm = new TreeMap();
		tm.put(18,"Virat");
		tm.put(1,"Virat");
		tm.put(19,"Virat");
		tm.put(32,"Virat");
		tm.put(37,"Virat");
		System.out.println(tm);


		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.getCeilingEntry(19));
		System.out.println(tm.getFloorEntry(19));
		System.out.println(tm.getHigherEntry(19));
		System.out.println(tm.getLowerEnter(19));
	}
}

