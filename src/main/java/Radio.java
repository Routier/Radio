
public class Radio {
    private int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

   // public int getCurrentVolume() {
     //   return currentVolume;
    //}

    public void setCurrentStation(int station) {
        if (station > 9) {                      //выставление станции в пределах допустимого диапазона
            currentStation = 9;
        } else if (station < 0) {
            currentStation = 0;
        } else {
            currentStation = station;
        }
    }



    public void next() {
        if (currentStation == 9) {                  //проверяет изначальное значение станции;
            currentStation = 0;                     //если равно 9, то выставляет на 0
        } else {                                    //во всех остальных случаях увеличивает значение на 1
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation != 0) {                  //проверяет изначальное значение станции;
            currentStation = currentStation - 1;    //уменьшает значение на 1, если значение не 0;
        } else {                                    //если значение 0, то выставляет на 9
            currentStation = 9;
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

