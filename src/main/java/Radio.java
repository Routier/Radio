public class Radio {
    private int stationSize;
    private int volumeMin = 0;
    private int volumeMax = 100;
    private int currentStation;
    private int currentVolume;

    public Radio(int stationSize) {
        this.stationSize = stationSize;
    }

    public Radio() {
        this.stationSize = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationSize() {
        return stationSize - 1;
    }

    public void setCurrentStation(int station) {
        if (station > stationSize - 1) {             //выставление станции в пределах допустимого диапазона
            currentStation = stationSize - 1;
        } else if (station < 0) {
            currentStation = 0;
        } else {
            currentStation = station;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume > 100) {                     // выставление громкости через прямое указание
            currentVolume = 100;
        } else if (volume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = volume;
        }
    }

    public void next() {
        if (currentStation == stationSize - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = stationSize - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}

