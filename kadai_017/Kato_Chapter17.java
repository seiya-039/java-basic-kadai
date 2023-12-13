package kadai_017;

abstract public class Kato_Chapter17 {

	public String familyName = "加藤"; //性を表すフィールド

	public String givenName = ""; //名を表すフィールド

	public String address = "住所は東京都中野区〇×です"; //住所を表すフィールド

	//共通の紹介を出力するメソッド
	public void commonIntroduce() {

		System.out.println(familyName);

	}

	//個別の紹介を出力するメソッド
	abstract public void eachIntroduce();

	//紹介を実行するメソッド
	public void execIntroduce() {
	}

}
