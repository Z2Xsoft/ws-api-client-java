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
import com.wheelsize.api.client.model.Generation;
import com.wheelsize.api.client.model.Make;
import com.wheelsize.api.client.model.Model;
import com.wheelsize.api.client.model.RimAgregation;
import com.wheelsize.api.client.model.TiresAggregation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ModelWithTires
 */

public class ModelWithTires {
  @SerializedName("make")
  private Make make = null;

  @SerializedName("model")
  private Model model = null;

  @SerializedName("year")
  private Integer year = null;

  @SerializedName("years")
  private List<Integer> years = null;

  @SerializedName("generations")
  private List<Generation> generations = null;

  @SerializedName("tires")
  private TiresAggregation tires = null;

  @SerializedName("rims")
  private Map<String, RimAgregation> rims = null;

  public ModelWithTires make(Make make) {
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(value = "")
  public Make getMake() {
    return make;
  }

  public void setMake(Make make) {
    this.make = make;
  }

  public ModelWithTires model(Model model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public ModelWithTires year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Selected year (e.g. &#x60;2015&#x60;, can be __*&#x60;null&#x60;*__)
   * @return year
  **/
  @ApiModelProperty(value = "Selected year (e.g. `2015`, can be __*`null`*__)")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public ModelWithTires years(List<Integer> years) {
    this.years = years;
    return this;
  }

  public ModelWithTires addYearsItem(Integer yearsItem) {
    if (this.years == null) {
      this.years = new ArrayList<Integer>();
    }
    this.years.add(yearsItem);
    return this;
  }

   /**
   * Model production years
   * @return years
  **/
  @ApiModelProperty(value = "Model production years")
  public List<Integer> getYears() {
    return years;
  }

  public void setYears(List<Integer> years) {
    this.years = years;
  }

  public ModelWithTires generations(List<Generation> generations) {
    this.generations = generations;
    return this;
  }

  public ModelWithTires addGenerationsItem(Generation generationsItem) {
    if (this.generations == null) {
      this.generations = new ArrayList<Generation>();
    }
    this.generations.add(generationsItem);
    return this;
  }

   /**
   * Get generations
   * @return generations
  **/
  @ApiModelProperty(value = "")
  public List<Generation> getGenerations() {
    return generations;
  }

  public void setGenerations(List<Generation> generations) {
    this.generations = generations;
  }

  public ModelWithTires tires(TiresAggregation tires) {
    this.tires = tires;
    return this;
  }

   /**
   * Get tires
   * @return tires
  **/
  @ApiModelProperty(value = "")
  public TiresAggregation getTires() {
    return tires;
  }

  public void setTires(TiresAggregation tires) {
    this.tires = tires;
  }

  public ModelWithTires rims(Map<String, RimAgregation> rims) {
    this.rims = rims;
    return this;
  }

  public ModelWithTires putRimsItem(String key, RimAgregation rimsItem) {
    if (this.rims == null) {
      this.rims = new HashMap<String, RimAgregation>();
    }
    this.rims.put(key, rimsItem);
    return this;
  }

   /**
   * Each key is bolt pattern, e.g. *&#x60;5x105&#x60;*
   * @return rims
  **/
  @ApiModelProperty(value = "Each key is bolt pattern, e.g. *`5x105`*")
  public Map<String, RimAgregation> getRims() {
    return rims;
  }

  public void setRims(Map<String, RimAgregation> rims) {
    this.rims = rims;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelWithTires modelWithTires = (ModelWithTires) o;
    return Objects.equals(this.make, modelWithTires.make) &&
        Objects.equals(this.model, modelWithTires.model) &&
        Objects.equals(this.year, modelWithTires.year) &&
        Objects.equals(this.years, modelWithTires.years) &&
        Objects.equals(this.generations, modelWithTires.generations) &&
        Objects.equals(this.tires, modelWithTires.tires) &&
        Objects.equals(this.rims, modelWithTires.rims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(make, model, year, years, generations, tires, rims);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelWithTires {\n");
    
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    years: ").append(toIndentedString(years)).append("\n");
    sb.append("    generations: ").append(toIndentedString(generations)).append("\n");
    sb.append("    tires: ").append(toIndentedString(tires)).append("\n");
    sb.append("    rims: ").append(toIndentedString(rims)).append("\n");
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

