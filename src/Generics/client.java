package Generics;

public class client {

	public static void main(String[] args) throws Exception {
		HashTable<String, Integer> map = new HashTable<>(4);
		map.put("USA", 200);
		map.put("UK", 150);
		map.put("India", 300);
		map.display();
		map.put("China", 350);
		map.put("Sweden", 100);
		map.display();
//		map.put("Sweden", 100);
//		map.display();
//        map.put("Nepal", 325);
//        map.put("JK", 250);
//        map.put("kerala" , 110);
//        map.put("himachal" , 310);
//        map.put("tamil" , 275);
//        map.display();
		System.out.println("****************************");
//        
//        System.out.println(map.get("India"));
//        System.out.println(map.get("RSA"));
//        
//        System.out.println(map.remove("India"));
//        map.display();
	}

}
