package service;

import java.util.List;
import java.util.Random;

import entity.Character;
import repository.connect;

public class process {

	public static void syori(int num) {
		String kuhaku = " ";
		connect c = new connect();
		List<entity.Character> l = c.connection();
		//Character cg = new Character();
		
		
		for (int i = 0; i <= num-1; i++) {
			Random r = new Random();
			int d = r.nextInt(100);
			Character w = null;
			//int d = Math.random()
			//String rarity = "";
			if(d < 70){
				//List<Character> N = l.subList(0,9);
				int ran = r.nextInt(10);
				//System.out.println(l.get(ran).getId().toInt());
				w = l.get(ran);
			} 
			else if ( d < 90) {
				//List<Character> R = l.subList(10,16);
				int ran = r.nextInt(10,16);
				//System.out.println(l.get(ran).getId().toInt());
				w = l.get(ran);
			}
			else if ( d < 98) {
				//List<Character> SR = l.subList(17,19);
				int ran = r.nextInt(17,19);
				//System.out.println(l.get(ran).getId().toInt());
				w = l.get(ran);
			}
			else{
				//System.out.println(l.get(20));
				w = l.get(20);
			}
			if(d >= 99) {
				System.out.print(w.getId().toInt());
				System.out.print(w.getRerity().toString());
				System.out.println(w.getName().toString());
			}
			else{
				System.out.print(w.getId().toInt());
				System.out.print(w.getRerity().toString());
				System.out.println(w.getName().toString());
			}
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
