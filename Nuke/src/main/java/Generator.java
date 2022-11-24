public class Generator implements Controlable {
    private double totalYieldinKwh;

    public Generator(double totalYieldinKwh) {
        this.totalYieldinKwh = totalYieldinKwh;
    }

    public Generator() {
        this.totalYieldinKwh = 0;
    }

    public double getTotalYieldinKwh() {
        return this.totalYieldinKwh;
    }

    private void addGenPowerToTotal(double power) {
        this.totalYieldinKwh = this.totalYieldinKwh + power;
    }

    public double generateEnergy(double steam) {
        double kwh = steam * 7.0;

        //add to total
        addGenPowerToTotal(kwh);

        return kwh;
    }

    @Override
    public STATUS getStatus() {
        if(this.totalYieldinKwh > 560) {
            return STATUS.UNSTABLE;
        }

        return STATUS.STABLE;
    }
}