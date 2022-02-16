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
 * InfluenzaUSPHL
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-12T19:32:54.804Z[Europe/London]")
public class InfluenzaUSPHL {
  @SerializedName("updated")
  private BigDecimal updated = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("data")
  private Object data = null;

  public InfluenzaUSPHL updated(BigDecimal updated) {
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

  public InfluenzaUSPHL source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public InfluenzaUSPHL data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfluenzaUSPHL influenzaUSPHL = (InfluenzaUSPHL) o;
    return Objects.equals(this.updated, influenzaUSPHL.updated) &&
        Objects.equals(this.source, influenzaUSPHL.source) &&
        Objects.equals(this.data, influenzaUSPHL.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updated, source, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfluenzaUSPHL {\n");
    
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
