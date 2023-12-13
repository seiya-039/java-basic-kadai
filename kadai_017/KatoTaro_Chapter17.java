package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	String taroIntroduce = "";

	public void setGivenName(String name) {
		givenName = name;
	}

	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		eachIntroduce(); // eachIntroduce()メソッドを呼び出す
		System.out.println(taroIntroduce);
	}

	public void eachIntroduce() {
		taroIntroduce = "Javaが得意です";
	}
}
