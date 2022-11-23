public class Generator {
    private double totalYieldinKwh;

    public Generator(double totalYieldinKwh) {
        this.totalYieldinKwh = totalYieldinKwh;
    }

    public Generator() {
        this.totalYieldinKwh = 0;
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
}