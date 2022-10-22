public class NuclearReactor {
  private double heatOutput;
  private boolean requiresHeavyWater;
  public NuclearReactor(double heatOutput, boolean requiresHeavyWater) {
    this.heatOutput = heatOutput;
    this.requiresHeavyWater = requiresHeavyWater;
  }

  public double getHeatOutput() {
    return heatOutput;
  }
  public boolean getRequiresHeavyWater() {
    return requiresHeavyWater;
  }
}
