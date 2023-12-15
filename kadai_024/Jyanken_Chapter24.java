package kadai_024;

import java.util.HashMap;
import java.util.Scanner;


public class Jyanken_Chapter24 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
				String input = scanner.next();
					if(!(input.equals("r") || input.equals("s") || input.equals("p"))) {
						System.out.println(input + "");
						continue;
					}else {
						scanner.close();
						return input;
					}
		}
	}
	
	public String getRandom() {
		String[] choice = {"r", "s", "p"};
		String Random = choice[(int) Math.floor(Math.random() * 3)];
		return Random;
	}
	
	public void PlayGame(String getMyChoice, String getRandom) {
		HashMap<String,String> choiceMap = new HashMap<String,String>();
		
		choiceMap.put("r", "グー");
		choiceMap.put("s", "チョキ");
		choiceMap.put("p", "パー");
		
		System.out.println("自分の手は" + choiceMap.get(getMyChoice));
		System.out.println("相手の手は" + choiceMap.get(getRandom));
		
		
		if ((getMyChoice.equals("r") && getRandom.equals("r")) || (getMyChoice.equals("s") && getRandom.equals("s")) || (getMyChoice.equals("p") && getRandom.equals("p"))){
			System.out.println("あいこです");
		}
		
		
		if ((getMyChoice.equals("r") && getRandom.equals("s")) || (getMyChoice.equals("s") && getRandom.equals("p")) || (getMyChoice.equals("p") && getRandom.equals("r"))){
			System.out.println("自分の勝ちです");
		}
		
		if ((getMyChoice.equals("r") && getRandom.equals("p")) || (getMyChoice.equals("s") && getRandom.equals("r")) || (getMyChoice.equals("p") && getRandom.equals("s"))){
			System.out.println("自分の負けです");		
		}
		

	/*	if(choiceMap.get(getMyChoice) == choiceMap.get(getRandom)) {
			System.out.println("あいこです");
		}
		if(choiceMap.get(getMyChoice) == "r" && choiceMap.get(getRandom) == "s") {
			System.out.println("自分の勝ちです");
		}
		if(choiceMap.get(getMyChoice) =="r" && choiceMap.get(getRandom) == "p") {
			System.out.println("自分の負けです");
		}
		if(choiceMap.get(getMyChoice) =="s" && choiceMap.get(getRandom) == "r") {
			System.out.println("自分の負けです");
		}
		if(choiceMap.get(getMyChoice) =="s" && choiceMap.get(getRandom) == "p") {
			System.out.println("自分の勝ちです");
		}
		if(choiceMap.get(getMyChoice) =="p" && choiceMap.get(getRandom) == "r") {
			System.out.println("自分の勝ちです");
		}
		if(choiceMap.get(getMyChoice) =="p" && choiceMap.get(getRandom) == "s") {
			System.out.println("自分の負けです");
		} */
	}
}