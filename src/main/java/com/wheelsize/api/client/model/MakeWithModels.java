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
import com.wheelsize.api.client.model.Make;
import com.wheelsize.api.client.model.ModelWithTrims;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MakeWithModels
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-17T19:57:08.897+06:00")
public class MakeWithModels {
  @SerializedName("make")
  private Make make = null;

  @SerializedName("models")
  private List<ModelWithTrims> models = new ArrayList<ModelWithTrims>();

  public MakeWithModels make(Make make) {
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(required = true, value = "")
  public Make getMake() {
    return make;
  }

  public void setMake(Make make) {
    this.make = make;
  }

  public MakeWithModels models(List<ModelWithTrims> models) {
    this.models = models;
    return this;
  }

  public MakeWithModels addModelsItem(ModelWithTrims modelsItem) {
    this.models.add(modelsItem);
    return this;
  }

   /**
   * Get models
   * @return models
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ModelWithTrims> getModels() {
    return models;
  }

  public void setModels(List<ModelWithTrims> models) {
    this.models = models;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MakeWithModels makeWithModels = (MakeWithModels) o;
    return Objects.equals(this.make, makeWithModels.make) &&
        Objects.equals(this.models, makeWithModels.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(make, models);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MakeWithModels {\n");
    
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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

