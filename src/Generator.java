public class Generator {
  private double electricPower;
  private int numberOfTurbineBlades;
  public Generator(double electricPower, int numberOfTurbineBlades) {
    this.electricPower = electricPower;
    this.numberOfTurbineBlades = numberOfTurbineBlades;
  }

  public double getElectricPower() {
    return electricPower;
  }
  public int getNumberOfTurbineBlades() {
    return numberOfTurbineBlades;
  }
}
