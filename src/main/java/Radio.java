public class Radio {

    protected int amountStation = 10;
    protected int maxStation = 9;
    protected int minStation = 0;

    protected int currentStation = minStation;


    protected int maxVolume = 100;
    protected int minVolume = 0;
    protected int currentVolume = minVolume;


    public Radio() {
        maxStation = 9;

    }

    public Radio(int amountStation) {
        maxStation = amountStation - 1;
    }

    protected void setNextStation() {
        if (currentStation <= maxStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= amountStation) {
            currentStation = minStation;
        }
    }

    protected void setPrevStation() {
        if (currentStation <= maxStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
    }

    protected void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public int getMinStation() {

        return minStation;
    }

    protected void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;

        }

    }

    protected void setTurnDownTheVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;

        }
    }

}








