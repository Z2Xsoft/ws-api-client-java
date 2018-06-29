/*
 * Wheel Fitment API
 * The Wheel Fitment API allows for programmatic access to the database of www.wheel-size.com and its services. Use this API to retrieve information about vehicle fitment database for rims and tires, including OE and option fitments, and plus/minus sizing fitment information. A variety of country and language specific options are available. The coverage of fitment data for vehicles manufactured since 2000 is nearly 100%.  The information about fitment data is updated on a daily basis.
 *
 * OpenAPI spec version: v1
 * Contact: info@wheel-size.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wheelsize.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Tire
 */

public class Tire {
  @SerializedName("tire")
  private String tire = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("aspect_ratio")
  private Integer aspectRatio = null;

  @SerializedName("rim_diameter")
  private BigDecimal rimDiameter = null;

  @SerializedName("count")
  private Integer count = null;

  public Tire tire(String tire) {
    this.tire = tire;
    return this;
  }

   /**
   * Formatted tire size (e.g. &#x60;225/55R18&#x60;)
   * @return tire
  **/
  @ApiModelProperty(value = "Formatted tire size (e.g. `225/55R18`)")
  public String getTire() {
    return tire;
  }

  public void setTire(String tire) {
    this.tire = tire;
  }

  public Tire width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Tire section width, mm (e.g. &#x60;195&#x60;)
   * @return width
  **/
  @ApiModelProperty(value = "Tire section width, mm (e.g. `195`)")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Tire aspectRatio(Integer aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * Tire aspect ratio, % (e.g. &#x60;55&#x60;)
   * @return aspectRatio
  **/
  @ApiModelProperty(value = "Tire aspect ratio, % (e.g. `55`)")
  public Integer getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(Integer aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public Tire rimDiameter(BigDecimal rimDiameter) {
    this.rimDiameter = rimDiameter;
    return this;
  }

   /**
   * Rim diameter, in (e.g. &#x60;16&#x60;)
   * @return rimDiameter
  **/
  @ApiModelProperty(value = "Rim diameter, in (e.g. `16`)")
  public BigDecimal getRimDiameter() {
    return rimDiameter;
  }

  public void setRimDiameter(BigDecimal rimDiameter) {
    this.rimDiameter = rimDiameter;
  }

  public Tire count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of vehicles matching tire size
   * @return count
  **/
  @ApiModelProperty(value = "Number of vehicles matching tire size")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tire tire = (Tire) o;
    return Objects.equals(this.tire, tire.tire) &&
        Objects.equals(this.width, tire.width) &&
        Objects.equals(this.aspectRatio, tire.aspectRatio) &&
        Objects.equals(this.rimDiameter, tire.rimDiameter) &&
        Objects.equals(this.count, tire.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tire, width, aspectRatio, rimDiameter, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tire {\n");
    
    sb.append("    tire: ").append(toIndentedString(tire)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    rimDiameter: ").append(toIndentedString(rimDiameter)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

