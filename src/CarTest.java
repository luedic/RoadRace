import org.junit.Assert;
import org.junit.jupiter.api.Test;



class CarTest {

	@Test
	void checkWinTest() {
		Car car = new Car(12, 20);
		car.finishX = 10;
		car.finishY = 10;
		car.round = 3;
		//Tests round
		Assert.assertTrue(car.checkWin());
		//Tests, if checkWin increase round-number
		Assert.assertNotEquals(car.round, 3);
		//Tests if checkWin only returns True when rounds >2
		car.round = 0;
		Assert.assertFalse(car.checkWin());
	}
	
	@Test
	void checkCheatWinTest() {
		Car car = new Car(20, 20);
		car.finishX = 10;
		car.finishY = 10;
		//Tests if checkCheatWin gets activated
		Assert.assertFalse(car.checkCheatWin());
	}
	
	@Test
	void checkCheat() {
		Car car = new Car(156, 186);
		//Tests if Car intersects with rectangle 1
		Assert.assertFalse(car.checkCheat());
	}
}