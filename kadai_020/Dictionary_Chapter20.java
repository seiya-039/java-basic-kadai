package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void referer(String[] word){
		
		String result = "";
		
		HashMap<String,String> DictionaryMap = new HashMap<String,String>();
		DictionaryMap.put("apple","りんご");
		DictionaryMap.put("peach","桃");
		DictionaryMap.put("banana","バナナ");
		DictionaryMap.put("lemon","レモン");
		DictionaryMap.put("pear","梨");
		DictionaryMap.put("kiwi","キウィ");
		DictionaryMap.put("strawberry","いちご");
		DictionaryMap.put("grape","ぶどう");
		DictionaryMap.put("muscat","マスカット");
		DictionaryMap.put("cherry","さくらんぼ");
		
		
		for (int i = 0; i < word.length; i++) {
			result = DictionaryMap.get(word[i]);
			
			if(result == null) {
				result = word[i] + "は辞書に存在しません";
			} else {
				result = word[i] + "の意味は" + result;
			}
			
			System.out.println(result);
		}
	}

}


