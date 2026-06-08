class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distance;
    private int NumberOfVictories;

    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return NumberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        NumberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return o.NumberOfVictories - this.NumberOfVictories;
    }
}
