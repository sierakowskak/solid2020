package pl.zzpj2020.solid.ocp.usa.solution;

public class StateFineCounter {

    public void countFine (FineCounter state, int speed){
        System.out.println(state.calcualateSpeedLimitFine(speed));
    }

}
