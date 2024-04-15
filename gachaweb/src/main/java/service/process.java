package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entity.Character;
import repository.connect;

public class process {
	//static List<entity.Character> resultlist = new ArrayList<entity.Character>();
	
	@SuppressWarnings("static-access")
	public static List<Character> syori(String num) {
		connect c = new connect();
		List<entity.Character> l = c.connection();
		List<entity.Character> Resultlist = new ArrayList<entity.Character>();
		
		int numb  = Integer.parseInt(num);
		
		for (int i = 0; i <= numb-1; i++) {
			Random r = new Random();
			int d = r.nextInt(100);
			//Character w = null;
			//int d = Math.random()
			//String rarity = "";
			if(d < 70){
				//List<Character> N = l.subList(0,9);
				int ran = r.nextInt(10);
				//System.out.println(l.get(ran).getId().toInt());
				//Resultlist.add(l.get(ran));
				//w = l.get(ran);
				Resultlist.add(l.get(ran));
				Resultlist.get(i).getId().toInt();
				Resultlist.get(i).getRerity().toString();
				Resultlist.get(i).getName().toString();
				//resultlist.add(i,Resultlist);
				
				
			} 
			else if ( d < 90) {
				//List<Character> R = l.subList(10,16);
				int ran = r.nextInt(10,16);
				//System.out.println(l.get(ran).getId().toInt());
				//w = l.get(ran);
				Resultlist.add(l.get(ran));
				Resultlist.get(i).getId().toInt();
				Resultlist.get(i).getRerity().toString();
				Resultlist.get(i).getName().toString();
				//resultlist.addAll(i,Resultlist);
				
			}
			else if ( d < 98) {
				//List<Character> SR = l.subList(17,19);
				int ran = r.nextInt(17,19);
				//System.out.println(l.get(ran).getId().toInt());
				//w = l.get(ran);
				Resultlist.add(l.get(ran));
				Resultlist.get(i).getId().toInt();
				Resultlist.get(i).getRerity().toString();
				Resultlist.get(i).getName().toString();
				//resultlist.addAll(i,Resultlist);
				
			}
			else{
				//System.out.println(l.get(20));
				//w = l.get(20);
				Resultlist.add(l.get(20));
				Resultlist.get(1).getId().toInt();
				Resultlist.get(1).getRerity().toString();
				Resultlist.get(1).getName().toString();
				//resultlist.addAll(i,Resultlist);
				
			}
			//if(d >= 99) {
				//Resultlist.get(20).getId().toInt();
				//Resultlist.get(20).getRerity().toString();
				//Resultlist.get(20).getName().toString();
			//}
			//else{
				//Resultlist.get(ran).getId().toInt();
				//Resultlist.get(ran).getRerity().toString();
				//Resultlist.get(ran).getName().toString();
			//}
		}
		return Resultlist;
		// TODO 自動生成されたメソッド・スタブ
	}
	
	//public static void name() {
		//for (int i=0; i<resultlist.size(); i++) {
		    //System.out.println("Using for Index ["+i+"] : "+resultlist.get(i));
		//}	
	//}
}
