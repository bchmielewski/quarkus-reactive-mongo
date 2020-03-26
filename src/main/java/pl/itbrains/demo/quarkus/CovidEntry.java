package pl.itbrains.demo.quarkus;

public class CovidEntry {
  private String countryRegion;
  private String confirmed;

  public CovidEntry(String countryRegion, String confirmed) {
    this.countryRegion = countryRegion;
    this.confirmed = confirmed;
  }

  public String getCountryRegion() {
    return countryRegion;
  }

  public void setCountryRegion(String countryRegion) {
    this.countryRegion = countryRegion;
  }

  public String getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(String confirmed) {
    this.confirmed = confirmed;
  }
}
