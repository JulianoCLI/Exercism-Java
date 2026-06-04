public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes) {
        int time = expectedMinutesInOven() - minutes;
        return time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        int prepTime = 2 * layers;
        return prepTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int lasagnaLayers, int minutesInOnven) {
        int totalTime = (preparationTimeInMinutes(lasagnaLayers)) + minutesInOnven;
        return totalTime;
    }
}
