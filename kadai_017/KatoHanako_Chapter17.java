package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	String hanakoIntroduce = "";

	public void setGivenName(String name) {
		givenName = name;
	}

	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		eachIntroduce(); // eachIntroduce()メソッドを呼び出す
		System.out.println(hanakoIntroduce);
	}

	public void eachIntroduce() {
		hanakoIntroduce = "趣味は読書です";
	}
}
