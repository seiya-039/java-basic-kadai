package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	String ichiroIntroduce = "";

	public void setGivenName() {
		this.givenName = "一郎";
	}

	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce(); // eachIntroduce()メソッドを呼び出す
		System.out.println(ichiroIntroduce);
	}

	public void eachIntroduce() {
		ichiroIntroduce = "好きな食べ物はリンゴです";
	}
}
