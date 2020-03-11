package pl.zzpj2020.solid.ocp.usa.solution;

public class GA  implements FineCounter {

    private static final int GA_MAX_SPEED = 0;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if(GA_MAX_SPEED - speed > 10){
            return 200;
        }
        else{
            return 0;
        }
    }
}
