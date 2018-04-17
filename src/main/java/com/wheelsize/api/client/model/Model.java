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
 * Model
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-17T19:57:08.897+06:00")
public class Model {
  @SerializedName("slug")
  private String slug = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("name_en")
  private String nameEn = null;

  public Model slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Model slug name (e.g. &#x60;outlander&#x60;)
   * @return slug
  **/
  @ApiModelProperty(required = true, value = "Model slug name (e.g. `outlander`)")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Model name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Model name (e.g. &#x60;Outlander&#x60;)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Model name (e.g. `Outlander`)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Model nameEn(String nameEn) {
    this.nameEn = nameEn;
    return this;
  }

   /**
   *  Original english name. Use it along with _**&#x60;lang&#x60;**_ query parameter  
   * @return nameEn
  **/
  @ApiModelProperty(required = true, value = " Original english name. Use it along with _**`lang`**_ query parameter  ")
  public String getNameEn() {
    return nameEn;
  }

  public void setNameEn(String nameEn) {
    this.nameEn = nameEn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(this.slug, model.slug) &&
        Objects.equals(this.name, model.name) &&
        Objects.equals(this.nameEn, model.nameEn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name, nameEn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
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

