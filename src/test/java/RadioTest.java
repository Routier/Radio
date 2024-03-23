import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;;


public class RadioTest {

    @Test
    public void radioStationNextFromZero() {
        Radio station = new Radio();

        station.next();
        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioStationPrevFromZero() {
        Radio station = new Radio();
        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNextFromMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrevFromMax() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.prev();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSet() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSetOverMax() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSetLessThenZero() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeIncreaseFromZero() {
        Radio volume = new Radio();
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeDecreaseFromZero() {
        Radio volume = new Radio();
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeIncreaseFromMax() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeDecreaseFromMax() {
        Radio volume = new Radio();
        volume.currentVolume=100;
        volume.decreaseVolume();

        int expected = 99;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
