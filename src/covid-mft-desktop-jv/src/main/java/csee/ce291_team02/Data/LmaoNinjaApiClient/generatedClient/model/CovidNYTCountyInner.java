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
import java.time.LocalDate;
/**
 * CovidNYTCountyInner
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-12T19:32:54.804Z[Europe/London]")
public class CovidNYTCountyInner {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("county")
  private String county = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("fips")
  private String fips = null;

  @SerializedName("cases")
  private BigDecimal cases = null;

  @SerializedName("deaths")
  private BigDecimal deaths = null;

  public CovidNYTCountyInner date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CovidNYTCountyInner county(String county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @Schema(description = "")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public CovidNYTCountyInner state(String state) {
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

  public CovidNYTCountyInner fips(String fips) {
    this.fips = fips;
    return this;
  }

   /**
   * Get fips
   * @return fips
  **/
  @Schema(description = "")
  public String getFips() {
    return fips;
  }

  public void setFips(String fips) {
    this.fips = fips;
  }

  public CovidNYTCountyInner cases(BigDecimal cases) {
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

  public CovidNYTCountyInner deaths(BigDecimal deaths) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CovidNYTCountyInner covidNYTCountyInner = (CovidNYTCountyInner) o;
    return Objects.equals(this.date, covidNYTCountyInner.date) &&
        Objects.equals(this.county, covidNYTCountyInner.county) &&
        Objects.equals(this.state, covidNYTCountyInner.state) &&
        Objects.equals(this.fips, covidNYTCountyInner.fips) &&
        Objects.equals(this.cases, covidNYTCountyInner.cases) &&
        Objects.equals(this.deaths, covidNYTCountyInner.deaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, county, state, fips, cases, deaths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidNYTCountyInner {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fips: ").append(toIndentedString(fips)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    deaths: ").append(toIndentedString(deaths)).append("\n");
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
