package pl.zzpj2020.solid.ocp.usa.solution;

public class SC implements FineCounter {

    private static final int SC_MAX_SPEED = 0;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        return (speed - SC_MAX_SPEED) * 2;
    }
}
