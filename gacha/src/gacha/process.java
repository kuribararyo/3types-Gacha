package gacha;

import java.util.Random;

//import java.util.Random;
//import gacha.character;
public class process {

	public static void gachaLogic(int num) {
		for (int i = 0; i <= num-1; i++) {
			Random r = new Random();
			int d = r.nextInt(100);
			//int d = Math.random()
			String rarity = "";
			if(d < 70){
				rarity = "N";
			} 
			else if ( d < 90) {
				rarity = "R";
			}
			else if ( d < 98) {
				rarity = "SR";
			}
			else{
				rarity = "SE \r\nAoi";
			}
			//System.out.println(rarity);
			if(d >= 99) {
				System.out.println(rarity);
			}
			else{
				System.out.println(rarity);
				String[] name = {"Ryo", "Ryoma", "Jyo", "Kouki"};
				int a = (int)(Math.random() * 3 + 1);
				System.out.println(name[a]);
			}
		}
	//character.charaLogic(num);

		//character.main(args);
		// TODO 自動生成されたメソッド・スタブ
	}

}
