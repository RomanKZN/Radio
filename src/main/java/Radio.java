public class Radio {

    protected int currentStation;
    protected int currentVolume;

    protected void setNextStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 10) {
            currentStation = 0;
        }
    }

    protected void setPrevStation() {
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= -1) {
            currentStation = 9;
        }
    }


    protected void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }


    protected void setIncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;

        }

    }

    protected void setTurnDownTheVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= -1) {
            currentVolume = 0;

        }

    }


}





