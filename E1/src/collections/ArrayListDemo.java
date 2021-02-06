package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> stlist=new ArrayList<String>();
		//Adding string objects
		stlist.add("Anulekha");
		stlist.add("Jhansi");
		stlist.add("Bhargavi");
		stlist.add("Likhita");
		stlist.add("Hyndavi");
		System.out.println(stlist);
		System.out.println("Size of arr list: "+stlist.size());
		//Adding and setting obj in list
		stlist.add(5,"Rekha");
		System.out.println(stlist);
		stlist.add(0,"Lekha");
		System.out.println(stlist);
		stlist.set(3,"Bala Bhargavi");
		System.out.println(stlist);
		//indexof and getting specific index objects
		System.out.println("Index of Anulekha:"+stlist.indexOf("Anulekha"));
		System.out.println("Index of xyz:"+stlist.indexOf("Xyz"));
		String str=stlist.get(4);
		System.out.println(str);
		//contains operation
		System.out.println(stlist.contains("Anulekha"));
		System.out.println(stlist.contains("Abc"));
		//remove objects
		stlist.add("Lekha");
		stlist.remove(0);
		stlist.remove("Lekha");
		System.out.println(stlist);
		//Iterating list
		for(String s:stlist)
			System.out.println(s);
		//Sorting list
		Collections.sort(stlist);
		System.out.println(stlist);
		//whether the objects of one list contains in another list
		ArrayList <String> st=new ArrayList<String>(stlist);
		System.out.println(st.equals(stlist));
		
		ArrayList <String> al=new ArrayList<String>();
		al.add("Anulekha");
		System.out.println(stlist.containsAll(al));
		al.add("Janu");
		System.out.println(stlist.containsAll(al));
	}

}
