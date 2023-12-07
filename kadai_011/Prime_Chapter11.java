package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int start = 2;
		int end = 100;

		for (int i = start; i <= end; i++) {
		boolean isPrime = true; // 素数かどうかを判定する変数

		// 2からi-1までの数で割り切れるかを判定
		for (int j = 2; j < i; j++) {
		if (i % j == 0) { // 割り切れたら素数でない
		isPrime = false;
		break; // 素数でないことがわかったら探索を中断
		}
		}

		if (isPrime) { // 素数の場合はカウントを増やし、結果を表示
		System.out.println( i );
		
		}
		}
		}
}

		