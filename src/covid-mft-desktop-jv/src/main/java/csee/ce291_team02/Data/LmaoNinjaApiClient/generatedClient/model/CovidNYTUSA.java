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

/**
 * CovidNYTUSA
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-12T19:32:54.804Z[Europe/London]")
public class CovidNYTUSA extends java.util.ArrayList<CovidNYTUSAInner> {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovidNYTUSA {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
