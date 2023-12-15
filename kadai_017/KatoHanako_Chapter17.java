package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	String hanakoIntroduce = "";

	public void setGivenName() {
		this.givenName = "花子";
	}

	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce(); // eachIntroduce()メソッドを呼び出す
		System.out.println(hanakoIntroduce);
	}

	public void eachIntroduce() {
		hanakoIntroduce = "趣味は読書です";
	}
}
