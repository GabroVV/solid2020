package pl.zzpj2020.solid.ocp.usa.solution;

public class OhioSpeedLimit implements StateSpeedLimit{
    private static final int MAX_SPEED = 50;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        double fine = 0;
        if(speed > MAX_SPEED){
            fine = 100;
        }
        return fine;
    }
}
