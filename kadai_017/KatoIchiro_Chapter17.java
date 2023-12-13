package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	String ichiroIntroduce = "";

	public void setGivenName(String name) {
		givenName = name;
	}

	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		eachIntroduce(); // eachIntroduce()メソッドを呼び出す
		System.out.println(ichiroIntroduce);
	}

	public void eachIntroduce() {
		ichiroIntroduce = "好きな食べ物はリンゴです";
	}
}
