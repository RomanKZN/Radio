import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio cond = new Radio();

    @Test
    public void shouldSwitchToNextStation1() {
        cond.currentStation = 1;

        cond.setNextStation();

        int expected = 2;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSwitchToNextStation2() {
        cond.currentStation = 8;

        cond.setNextStation();

        int expected = 9;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSwitchToNextStation3() {

        cond.currentStation = 10;

        cond.setNextStation();

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSwitchToZeroStation() {

        cond.currentStation = 9;

        cond.setNextStation();

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void shouldChangeToThePreviousStation() {

        cond.currentStation = 1;

        cond.setPrevStation();

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldChangeToThePreviousStation1() {

        cond.currentStation = 10;

        cond.setPrevStation();

        int expected = 10;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldSwitchToStationNine() {

        cond.currentStation = 0;

        cond.setPrevStation();

        int expected = 9;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void mustSetTheStationNumber() {


        cond.setCurrentStation(3);

        int expected = 3;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void mustNotSetTheStationNumber() {


        cond.setCurrentStation(45);

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void mustNotSwitchToAStationWithAMinus() {


        cond.setCurrentStation(-2);

        int expected = 0;
        int actual = cond.currentStation;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void test (){

      //  Radio cond = new Radio();

        Assertions.assertEquals(0,cond.getMinStation());
        Assertions.assertEquals(9,cond.getMaxStation());
        Assertions.assertEquals(0,cond.getCurrentStation());
        Assertions.assertEquals(10,cond.getAmountStation());

    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio cond = new Radio();
        cond.currentVolume = 100;

        cond.setIncreaseVolume();

        int expected = 100;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseByOneDivision() {

        cond.currentVolume = 1;

        cond.setIncreaseVolume();
        int expected = 2;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseByOneDivision1() {

        cond.currentVolume = -103;

        cond.setIncreaseVolume();
        int expected = 0;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseByOneDivision() {

        cond.currentVolume = 1;

        cond.setTurnDownTheVolume();

        int expected = 0;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceTheVolumeBelowZero() {

        cond.currentVolume = -1;

        cond.setTurnDownTheVolume();

        int expected = 0;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreBottomRange() {

        cond.currentVolume = 102;

        cond.setTurnDownTheVolume();

        int expected = 102;
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }



}


//    @Test
//    public void test() {
//        cond.currentStation = 1;
//
//
//        Assertions.assertEquals(0, cond.getMinStation());
//        Assertions.assertEquals(9, cond.getMaxStation());
//        Assertions.assertEquals(2, cond.getCurrentStation());
//    }


//    }
