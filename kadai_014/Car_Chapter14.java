package kadai_014;

public class Car_Chapter14 {

	private int gear = 1;
	private int speed = 10;

	/*public Car_Chapter14(int gear, int speed) {
	this.gear = gear;
	this.speed = speed;
	
	//ギア1から3に切り替えました
	//速度は時速30kmです*/

	public void gearChange(int afterGear) {

		System.out.println("ギア" + gear + "から" + afterGear + "切り替えました");

		this.gear = afterGear;
		speed = switch (afterGear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};

	}

	public void run() {

		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
