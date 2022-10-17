public class NuclearPowerPlant {
  String name;
  String description;
  CoolingTower coolingTower;
  Generator generator;
    NuclearReactor nuclearReactor;
  public NuclearPowerPlant(String name, String description, CoolingTower coolingTower, Generator generator, NuclearReactor nuclearReactor) {
   this.name = name;
   this.description = description;
   this.coolingTower = coolingTower;
   this.generator = generator;
   this.nuclearReactor = nuclearReactor;
  }
}
