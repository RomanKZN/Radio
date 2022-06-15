public class Radio {

    public int currentStation;
    public int currentVolume;

    public void nextStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= -1) {
            currentStation = 9;
        }
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;

        }

    }

    public void turnDownTheVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= -1) {
            currentVolume = 0;

        }

    }


}





