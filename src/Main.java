public class Main {
  public static void main(String[] args) {
    CoolingTower firstCoolingTower = createCoolingTower(80, 4);
    CoolingTower secondCoolingTower = createCoolingTower(100, 8);
    Generator firstGenerator = createGenerator(16000,12);
    Generator secondGenerator = createGenerator(18000,14);
    NuclearReactor firstNuclearReactor = createNuclearReactor(14000, true);
    NuclearReactor secondNuclearReactor = createNuclearReactor(24000, false);
    NuclearPowerPlant dukovany = createNuclearPowerPlant("Dukovany","Popis Dukovan...", firstCoolingTower, firstGenerator, firstNuclearReactor);
    NuclearPowerPlant temelin = createNuclearPowerPlant("Temelín","Popis Temelínu...", secondCoolingTower, secondGenerator, secondNuclearReactor);
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