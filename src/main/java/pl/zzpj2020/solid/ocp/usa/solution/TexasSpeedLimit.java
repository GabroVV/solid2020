package pl.zzpj2020.solid.ocp.usa.solution;

public class TexasSpeedLimit implements StateSpeedLimit {
    private static final int MAX_SPEED = 50;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        double fine =0;
        if(speed > MAX_SPEED){
            fine = 100 + (speed - MAX_SPEED) * 2;
        }
        return fine;
    }
}
