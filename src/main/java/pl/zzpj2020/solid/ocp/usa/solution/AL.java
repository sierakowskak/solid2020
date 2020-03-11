package pl.zzpj2020.solid.ocp.usa.solution;

public class AL implements FineCounter {


    private static final int AL_MAX_SPEED = 0;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        double difference = speed - this.AL_MAX_SPEED;
        if(difference < 20){
            return 100;
        }
        else {
            return 200;
        }
    }
}
