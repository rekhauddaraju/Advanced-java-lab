package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class  HashMapDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,contact> contacts=new HashMap<String,contact>();
		//adding objects
		contacts.put("xyz@gmail.com",new contact("xyz@gmail.com","xyz","9876543210"));
		contacts.put("abc@gmail.com",new contact("abc@gmail.com","abc","9876543234"));
		
		//printing with size
		System.out.println(contacts);
		System.out.println(contacts.size());
		
		//contains
		System.out.println(contacts.containsKey("xyz@gmail.com"));
		System.out.println(contacts.containsValue("xyz@gmail.com"));
		
		//iterating
		Set keys=contacts.keySet();
		Iterator keysit=keys.iterator();
		while(keysit.hasNext()) {
			String key=keysit.next().toString();
			contact c=contacts.get(key);
			System.out.println("email: "+c.getEmail());
			System.out.println("name: "+c.getName());
			System.out.println(" ph.no: "+c.getMobile());
		}
	}

}
