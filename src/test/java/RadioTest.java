import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;;


public class RadioTest {
    Radio station = new Radio(0, 9, 0, 100);

    @Test
    public void radioStationNextFromZero() {


        station.next();
        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioStationPrevFromZero() {

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNextFromMax() {

        station.setCurrentStation(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrevFromMax() {


        station.setCurrentStation(9);
        station.prev();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSet() {

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSetOverMax() {

        station.setCurrentStation(10);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSetLessThenZero() {

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeIncreaseFromZero() {

        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeDecreaseFromZero() {

        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeIncreaseFromMax() {

        station.setCurrentVolume(100);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeDecreaseFromMax() {

        station.setCurrentVolume(100);
        station.decreaseVolume();

        int expected = 99;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeSetLessThenZero() {

        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeSetOverMax() {

        station.setCurrentVolume(101);

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
