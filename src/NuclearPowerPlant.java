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

  public void printInfo() {
    System.out.println("Informace o jaderné elektrárně " + this.name + ":");
    System.out.println(this.description);
    System.out.println("Chladící věž je " + this.coolingTower.getHeight() + " metrů vysoká a má průměr " + this.coolingTower.getDiameter() + " metrů.");
    System.out.println("Generátor generuje " + this.generator.getElectricPower() + " MW, má " + this.generator.getNumberOfTurbineBlades() + " turbín");
    System.out.println("Jaderný reaktor produkuje " + this.nuclearReactor.getHeatOutput() + " tepla a " + getHardWaterString() + " tvrdou vodu.");
    System.out.println();
  }

  private String getHardWaterString() {
    if (this.nuclearReactor.getRequiresHeavyWater()) {
      return "potřebuje";
    } else {
      return "nepotřebuje";
    }
  }
}
