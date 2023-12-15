package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 子クラスのインスタンスを作成する
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		//たろうさん
		taro.setGivenName();
		taro.execIntroduce();
		System.out.println("");

		//いちろうさん
		ichiro.setGivenName();
		ichiro.execIntroduce();
		System.out.println("");

		//はなこさん
		hanako.setGivenName();
		hanako.execIntroduce();
		System.out.println("");
	}

}
