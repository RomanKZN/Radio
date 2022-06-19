import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSwitchToNextStation1() {
        Radio cond = new Radio();
        cond.currentStation = 1;

        cond.setNextStation();

        int expected = 2;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSwitchToNextStation2() {
        Radio cond = new Radio();
        cond.currentStation = 10;

        cond.setNextStation();

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSwitchToNextStation3() {
        Radio cond = new Radio();
        cond.currentStation = 8;

        cond.setNextStation();

        int expected = 9;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSwitchToZeroStation() {
        Radio cond = new Radio();
        cond.currentStation = 9;

        cond.setNextStation();

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldChangeToThePreviousStation() {
        Radio cond = new Radio();
        cond.currentStation = 1;

        cond.setPrevStation();

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldChangeToThePreviousStation1() {
        Radio cond = new Radio();
        cond.currentStation = 10;

        cond.setPrevStation();

        int expected = 10;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSwitchToStationNine() {
        Radio cond = new Radio();
        cond.currentStation = 0;

        cond.setPrevStation();

        int expected = 9;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void mustSetTheStationNumber() {
        Radio cond = new Radio();

        cond.setCurrentStation(3);

        int expected = 3;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void mustNotSetTheStationNumber() {
        Radio cond = new Radio();

        cond.setCurrentStation(45);

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void mustNotSwitchToAStationWithAMinus() {
        Radio cond = new Radio();

        cond.setCurrentStation(-2);

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio cond = new Radio();
        cond.currentVolume = 11;

        cond.setIncreaseVolume();

        int expected = 10;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseByOneDivision() {
        Radio cond = new Radio();
        cond.currentVolume = 0;

        cond.setIncreaseVolume();
        int expected = 1;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseByOneDivision() {
        Radio cond = new Radio();
        cond.currentVolume = 1;

        cond.setTurnDownTheVolume();

        int expected = 0;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceTheVolumeBelowZero() {
        Radio cond = new Radio();
        cond.currentVolume = -1;

        cond.setTurnDownTheVolume();

        int expected = 0;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreBottomRange() {
        Radio cond = new Radio();
        cond.currentVolume = 12;

        cond.setTurnDownTheVolume();

        int expected = 12;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}