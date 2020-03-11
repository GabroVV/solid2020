package pl.zzpj2020.solid.ocp.usa.solution;

public class VirginiaSpeedLimit implements StateSpeedLimit {
    private static final int MAX_SPEED = 60;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        double fine = 0;
        if(speed > MAX_SPEED){
            fine = 50 + (speed - MAX_SPEED) * 5;
        }
        return fine;
    }
}