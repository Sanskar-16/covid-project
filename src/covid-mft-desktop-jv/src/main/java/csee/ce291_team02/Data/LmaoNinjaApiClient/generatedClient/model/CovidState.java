/*
 * disease.sh Docs - An open API for disease-related statistics
 * Third Party API for reliable global disease information
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
/**
 * CovidState
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-12T19:32:54.804Z[Europe/London]")
public class CovidState {
  @SerializedName("state")
  private String state = null;

  @SerializedName("updated")
  private BigDecimal updated = null;

  @SerializedName("cases")
  private BigDecimal cases = null;

  @SerializedName("todayCases")
  private BigDecimal todayCases = null;

  @SerializedName("deaths")
  private BigDecimal deaths = null;

  @SerializedName("todayDeaths")
  private BigDecimal todayDeaths = null;

  @SerializedName("active")
  private BigDecimal active = null;

  @SerializedName("casesPerOneMillion")
  private BigDecimal casesPerOneMillion = null;

  @SerializedName("deathsPerOneMillion")
  private BigDecimal deathsPerOneMillion = null;

  @SerializedName("tests")
  private BigDecimal tests = null;

  @SerializedName("testsPerOneMillion")
  private BigDecimal testsPerOneMillion = null;

  @SerializedName("population")
  private BigDecimal population = null;

  public CovidState state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CovidState updated(BigDecimal updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @Schema(description = "")
  public BigDecimal getUpdated() {
    return updated;
  }

  public void setUpdated(BigDecimal updated) {
    this.updated = updated;
  }

  public CovidState cases(BigDecimal cases) {
    this.cases = cases;
    return this;
  }

   /**
   * Get cases
   * @return cases
  **/
  @Schema(description = "")
  public BigDecimal getCases() {
    return cases;
  }

  public void setCases(BigDecimal cases) {
    this.cases = cases;
  }

  public CovidState todayCases(BigDecimal todayCases) {
    this.todayCases = todayCases;
    return this;
  }

   /**
   * Get todayCases
   * @return todayCases
  **/
  @Schema(description = "")
  public BigDecimal getTodayCases() {
    return todayCases;
  }

  public void setTodayCases(BigDecimal todayCases) {
    this.todayCases = todayCases;
  }

  public CovidState deaths(BigDecimal deaths) {
    this.deaths = deaths;
    return this;
  }

   /**
   * Get deaths
   * @return deaths
  **/
  @Schema(description = "")
  public BigDecimal getDeaths() {
    return deaths;
  }

  public void setDeaths(BigDecimal deaths) {
    this.deaths = deaths;
  }

  public CovidState todayDeaths(BigDecimal todayDeaths) {
    this.todayDeaths = todayDeaths;
    return this;
  }

   /**
   * Get todayDeaths
   * @return todayDeaths
  **/
  @Schema(description = "")
  public BigDecimal getTodayDeaths() {
    return todayDeaths;
  }

  public void setTodayDeaths(BigDecimal todayDeaths) {
    this.todayDeaths = todayDeaths;
  }

  public CovidState active(BigDecimal active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(description = "")
  public BigDecimal getActive() {
    return active;
  }

  public void setActive(BigDecimal active) {
    this.active = active;
  }

  public CovidState casesPerOneMillion(BigDecimal casesPerOneMillion) {
    this.casesPerOneMillion = casesPerOneMillion;
    return this;
  }

   /**
   * Get casesPerOneMillion
   * @return casesPerOneMillion
  **/
  @Schema(description = "")
  public BigDecimal getCasesPerOneMillion() {
    return casesPerOneMillion;
  }

  public void setCasesPerOneMillion(BigDecimal casesPerOneMillion) {
    this.casesPerOneMillion = casesPerOneMillion;
  }

  public CovidState deathsPerOneMillion(BigDecimal deathsPerOneMillion) {
    this.deathsPerOneMillion = deathsPerOneMillion;
    return this;
  }

   /**
   * Get deathsPerOneMillion
   * @return deathsPerOneMillion
  **/
  @Schema(description = "")
  public BigDecimal getDeathsPerOneMillion() {
    return deathsPerOneMillion;
  }

  public void setDeathsPerOneMillion(BigDecimal deathsPerOneMillion) {
    this.deathsPerOneMillion = deathsPerOneMillion;
  }

  public CovidState tests(BigDecimal tests) {
    this.tests = tests;
    return this;
  }

   /**
   * Get tests
   * @return tests
  **/
  @Schema(description = "")
  public BigDecimal getTests() {
    return tests;
  }

  public void setTests(BigDecimal tests) {
    this.tests = tests;
  }

  public CovidState testsPerOneMillion(BigDecimal testsPerOneMillion) {
    this.testsPerOneMillion = testsPerOneMillion;
    return this;
  }

   /**
   * Get testsPerOneMillion
   * @return testsPerOneMillion
  **/
  @Schema(description = "")
  public BigDecimal getTestsPerOneMillion() {
    return testsPerOneMillion;
  }

  public void setTestsPerOneMillion(BigDecimal testsPerOneMillion) {
    this.testsPerOneMillion = testsPerOneMillion;
  }

  public CovidState population(BigDecimal population) {
    this.population = population;
    return this;
  }

   /**
   * Get population
   * @return population
  **/
  @Schema(description = "")
  public BigDecimal getPopulation() {
    return population;
  }

  public void setPopulation(BigDecimal population) {
    this.population = population;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CovidState covidState = (CovidState) o;
    return Objects.equals(this.state, covidState.state) &&
        Objects.equals(this.updated, covidState.updated) &&
        Objects.equals(this.cases, covidState.cases) &&
        Objects.equals(this.todayCases, covidState.todayCases) &&
        Objects.equals(this.deaths, covidState.deaths) &&
        Objects.equals(this.todayDeaths, covidState.todayDeaths) &&
        Objects.equals(this.active, covidState.active) &&
        Objects.equals(this.casesPerOneMillion, covidState.casesPerOneMillion) &&
        Objects.equals(this.deathsPerOneMillion, covidState.deathsPerOneMillion) &&
        Objects.equals(this.tests, covidState.tests) &&
        Objects.equals(this.testsPerOneMillion, covidState.testsPerOneMillion) &&
        Objects.equals(this.population, covidState.population);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, updated, cases, todayCases, deaths, todayDeaths, active, casesPerOneMillion, deathsPerOneMillion, tests, testsPerOneMillion, population);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    todayCases: ").append(toIndentedString(todayCases)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
    sb.append("    todayDeaths: ").append(toIndentedString(todayDeaths)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    casesPerOneMillion: ").append(toIndentedString(casesPerOneMillion)).append("\n");
    sb.append("    deathsPerOneMillion: ").append(toIndentedString(deathsPerOneMillion)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    testsPerOneMillion: ").append(toIndentedString(testsPerOneMillion)).append("\n");
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
