package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	String taroIntroduce = "";

	public void setGivenName() {
		this.givenName = "太郎";
	}

	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce(); // eachIntroduce()メソッドを呼び出す
		System.out.println(taroIntroduce);
	}

	public void eachIntroduce() {
		taroIntroduce = "Javaが得意です";
	}
}
