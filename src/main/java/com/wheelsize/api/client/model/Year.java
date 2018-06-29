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

/**
 * Year
 */

public class Year {
  @SerializedName("slug")
  private Integer slug = null;

  @SerializedName("name")
  private Integer name = null;

  public Year slug(Integer slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Same as *&#x60;name&#x60;*. Aimed to match general for this API slug-name format
   * @return slug
  **/
  @ApiModelProperty(value = "Same as *`name`*. Aimed to match general for this API slug-name format")
  public Integer getSlug() {
    return slug;
  }

  public void setSlug(Integer slug) {
    this.slug = slug;
  }

  public Year name(Integer name) {
    this.name = name;
    return this;
  }

   /**
   * Year (e.g. &#x60;2015&#x60;)
   * @return name
  **/
  @ApiModelProperty(value = "Year (e.g. `2015`)")
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Year year = (Year) o;
    return Objects.equals(this.slug, year.slug) &&
        Objects.equals(this.name, year.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Year {\n");
    
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

