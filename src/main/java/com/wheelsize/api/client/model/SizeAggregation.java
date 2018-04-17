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
 * SizeAggregation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-17T19:57:08.897+06:00")
public class SizeAggregation {
  @SerializedName("min")
  private BigDecimal min = null;

  @SerializedName("max")
  private BigDecimal max = null;

  public SizeAggregation min(BigDecimal min) {
    this.min = min;
    return this;
  }

   /**
   * Size combined from minimum *&#x60;width&#x60;*, *&#x60;aspect_ratio&#x60;* and *&#x60;diameter&#x60;*
   * @return min
  **/
  @ApiModelProperty(required = true, value = "Size combined from minimum *`width`*, *`aspect_ratio`* and *`diameter`*")
  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public SizeAggregation max(BigDecimal max) {
    this.max = max;
    return this;
  }

   /**
   * Size combined from maximum *&#x60;width&#x60;*, *&#x60;aspect_ratio&#x60;* and *&#x60;diameter&#x60;*
   * @return max
  **/
  @ApiModelProperty(required = true, value = "Size combined from maximum *`width`*, *`aspect_ratio`* and *`diameter`*")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SizeAggregation sizeAggregation = (SizeAggregation) o;
    return Objects.equals(this.min, sizeAggregation.min) &&
        Objects.equals(this.max, sizeAggregation.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SizeAggregation {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

