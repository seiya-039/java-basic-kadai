package kadai_017;

abstract public class Kato_Chapter17 {

	public String familyName = "加藤"; //性を表すフィールド

	public String givenName = ""; //名を表すフィールド

	public String address = "東京都中野区〇×です"; //住所を表すフィールド

	public void commonIntroduce() {

		System.out.println("名前は" +familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");

	}

	abstract public void eachIntroduce();

	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce(); // eachIntroduce()メソッドを呼び出す
		System.out.println();
	}

}
