public class Main {
  public static void main(String[] args) {
  }

  private static CoolingTower createCoolingTower(double height, double diameter) {
    return new CoolingTower(height, diameter);
  }

  private static Generator createGenerator(double electricPower, int numberOfTurbineBlades) {
    return new Generator(electricPower, numberOfTurbineBlades);
  }

  private static NuclearReactor createNuclearReactor(double heatOutput, boolean requiresHeavyWater) {
    return new NuclearReactor(heatOutput, requiresHeavyWater);
  }

  private static NuclearPowerPlant createNuclearPowerPlant(String name, String description, CoolingTower coolingTower, Generator generator, NuclearReactor nuclearReactor) {
    return new NuclearPowerPlant(name, description, coolingTower, generator, nuclearReactor);
  }

}