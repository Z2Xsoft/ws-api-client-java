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
import com.wheelsize.api.client.model.Pressure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Wheel
 */

public class Wheel {
  @SerializedName("tire_pressure")
  private Pressure tirePressure = null;

  @SerializedName("rim")
  private String rim = null;

  @SerializedName("rim_diameter")
  private BigDecimal rimDiameter = null;

  @SerializedName("rim_width")
  private BigDecimal rimWidth = null;

  @SerializedName("rim_offset")
  private BigDecimal rimOffset = null;

  @SerializedName("tire")
  private String tire = null;

  /**
   * Tire sizing system (e.g. &#x60;metric&#x60;, can be __*&#x60;null&#x60;*__)
   */
  @JsonAdapter(TireSizingSystemEnum.Adapter.class)
  public enum TireSizingSystemEnum {
    METRIC("metric"),
    
    FLOTATION("flotation"),
    
    LT_METRIC("lt-metric"),
    
    LT_NUMERIC("lt-numeric");

    private String value;

    TireSizingSystemEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TireSizingSystemEnum fromValue(String text) {
      for (TireSizingSystemEnum b : TireSizingSystemEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TireSizingSystemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TireSizingSystemEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TireSizingSystemEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TireSizingSystemEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tire_sizing_system")
  private TireSizingSystemEnum tireSizingSystem = null;

  /**
   * Tire constriction code (e.g. &#x60;R&#x60;, can be __*&#x60;null&#x60;*__)
   */
  @JsonAdapter(TireConstructionEnum.Adapter.class)
  public enum TireConstructionEnum {
    R("R"),
    
    B("B"),
    
    D("D");

    private String value;

    TireConstructionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TireConstructionEnum fromValue(String text) {
      for (TireConstructionEnum b : TireConstructionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TireConstructionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TireConstructionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TireConstructionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TireConstructionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tire_construction")
  private TireConstructionEnum tireConstruction = null;

  @SerializedName("tire_width")
  private BigDecimal tireWidth = null;

  @SerializedName("tire_aspect_ratio")
  private BigDecimal tireAspectRatio = null;

  @SerializedName("tire_diameter")
  private BigDecimal tireDiameter = null;

  @SerializedName("tire_section_width")
  private BigDecimal tireSectionWidth = null;

  @SerializedName("tire_is_82series")
  private Boolean tireIs82series = null;

  @SerializedName("load_index")
  private Integer loadIndex = null;

  @SerializedName("speed_index")
  private String speedIndex = null;

  public Wheel tirePressure(Pressure tirePressure) {
    this.tirePressure = tirePressure;
    return this;
  }

   /**
   * Get tirePressure
   * @return tirePressure
  **/
  @ApiModelProperty(value = "")
  public Pressure getTirePressure() {
    return tirePressure;
  }

  public void setTirePressure(Pressure tirePressure) {
    this.tirePressure = tirePressure;
  }

  public Wheel rim(String rim) {
    this.rim = rim;
    return this;
  }

   /**
   * Formatter rim size (e.g. &#x60;7Jx18 ET38&#x60;, can be __*&#x60;\&quot;\&quot;&#x60;*__)
   * @return rim
  **/
  @ApiModelProperty(value = "Formatter rim size (e.g. `7Jx18 ET38`, can be __*`\"\"`*__)")
  public String getRim() {
    return rim;
  }

  public void setRim(String rim) {
    this.rim = rim;
  }

  public Wheel rimDiameter(BigDecimal rimDiameter) {
    this.rimDiameter = rimDiameter;
    return this;
  }

   /**
   * Rim diameter, in (e.g. &#x60;18.0&#x60;, can be __*&#x60;null&#x60;*__)
   * @return rimDiameter
  **/
  @ApiModelProperty(value = "Rim diameter, in (e.g. `18.0`, can be __*`null`*__)")
  public BigDecimal getRimDiameter() {
    return rimDiameter;
  }

  public void setRimDiameter(BigDecimal rimDiameter) {
    this.rimDiameter = rimDiameter;
  }

  public Wheel rimWidth(BigDecimal rimWidth) {
    this.rimWidth = rimWidth;
    return this;
  }

   /**
   * Rim width, in (e.g. &#x60;7.0&#x60;, can be __*&#x60;null&#x60;*__)
   * @return rimWidth
  **/
  @ApiModelProperty(value = "Rim width, in (e.g. `7.0`, can be __*`null`*__)")
  public BigDecimal getRimWidth() {
    return rimWidth;
  }

  public void setRimWidth(BigDecimal rimWidth) {
    this.rimWidth = rimWidth;
  }

  public Wheel rimOffset(BigDecimal rimOffset) {
    this.rimOffset = rimOffset;
    return this;
  }

   /**
   * Rim offset, mm (e.g. &#x60;38.0&#x60;, can be __*&#x60;null&#x60;*__)
   * @return rimOffset
  **/
  @ApiModelProperty(value = "Rim offset, mm (e.g. `38.0`, can be __*`null`*__)")
  public BigDecimal getRimOffset() {
    return rimOffset;
  }

  public void setRimOffset(BigDecimal rimOffset) {
    this.rimOffset = rimOffset;
  }

  public Wheel tire(String tire) {
    this.tire = tire;
    return this;
  }

   /**
   * Formatted tire size (e.g. &#x60;225/55R18&#x60;, can be __*&#x60;\&quot;\&quot;&#x60;*__)
   * @return tire
  **/
  @ApiModelProperty(value = "Formatted tire size (e.g. `225/55R18`, can be __*`\"\"`*__)")
  public String getTire() {
    return tire;
  }

  public void setTire(String tire) {
    this.tire = tire;
  }

  public Wheel tireSizingSystem(TireSizingSystemEnum tireSizingSystem) {
    this.tireSizingSystem = tireSizingSystem;
    return this;
  }

   /**
   * Tire sizing system (e.g. &#x60;metric&#x60;, can be __*&#x60;null&#x60;*__)
   * @return tireSizingSystem
  **/
  @ApiModelProperty(value = "Tire sizing system (e.g. `metric`, can be __*`null`*__)")
  public TireSizingSystemEnum getTireSizingSystem() {
    return tireSizingSystem;
  }

  public void setTireSizingSystem(TireSizingSystemEnum tireSizingSystem) {
    this.tireSizingSystem = tireSizingSystem;
  }

  public Wheel tireConstruction(TireConstructionEnum tireConstruction) {
    this.tireConstruction = tireConstruction;
    return this;
  }

   /**
   * Tire constriction code (e.g. &#x60;R&#x60;, can be __*&#x60;null&#x60;*__)
   * @return tireConstruction
  **/
  @ApiModelProperty(value = "Tire constriction code (e.g. `R`, can be __*`null`*__)")
  public TireConstructionEnum getTireConstruction() {
    return tireConstruction;
  }

  public void setTireConstruction(TireConstructionEnum tireConstruction) {
    this.tireConstruction = tireConstruction;
  }

  public Wheel tireWidth(BigDecimal tireWidth) {
    this.tireWidth = tireWidth;
    return this;
  }

   /**
   * Tire width, mm (e.g. &#x60;225.0&#x60;, can be __*&#x60;null&#x60;*__)
   * @return tireWidth
  **/
  @ApiModelProperty(value = "Tire width, mm (e.g. `225.0`, can be __*`null`*__)")
  public BigDecimal getTireWidth() {
    return tireWidth;
  }

  public void setTireWidth(BigDecimal tireWidth) {
    this.tireWidth = tireWidth;
  }

  public Wheel tireAspectRatio(BigDecimal tireAspectRatio) {
    this.tireAspectRatio = tireAspectRatio;
    return this;
  }

   /**
   * Aspect ratio, % (e.g. &#x60;55.0&#x60;, can be __*&#x60;null&#x60;*__)
   * @return tireAspectRatio
  **/
  @ApiModelProperty(value = "Aspect ratio, % (e.g. `55.0`, can be __*`null`*__)")
  public BigDecimal getTireAspectRatio() {
    return tireAspectRatio;
  }

  public void setTireAspectRatio(BigDecimal tireAspectRatio) {
    this.tireAspectRatio = tireAspectRatio;
  }

  public Wheel tireDiameter(BigDecimal tireDiameter) {
    this.tireDiameter = tireDiameter;
    return this;
  }

   /**
   * High flotation tire diameter, in (e.g. &#x60;31.0&#x60;, can be __*&#x60;null&#x60;*__)
   * @return tireDiameter
  **/
  @ApiModelProperty(value = "High flotation tire diameter, in (e.g. `31.0`, can be __*`null`*__)")
  public BigDecimal getTireDiameter() {
    return tireDiameter;
  }

  public void setTireDiameter(BigDecimal tireDiameter) {
    this.tireDiameter = tireDiameter;
  }

  public Wheel tireSectionWidth(BigDecimal tireSectionWidth) {
    this.tireSectionWidth = tireSectionWidth;
    return this;
  }

   /**
   * High flotation section width, in (e.g. &#x60;10.5&#x60;, can be __*&#x60;null&#x60;*__)
   * @return tireSectionWidth
  **/
  @ApiModelProperty(value = "High flotation section width, in (e.g. `10.5`, can be __*`null`*__)")
  public BigDecimal getTireSectionWidth() {
    return tireSectionWidth;
  }

  public void setTireSectionWidth(BigDecimal tireSectionWidth) {
    this.tireSectionWidth = tireSectionWidth;
  }

  public Wheel tireIs82series(Boolean tireIs82series) {
    this.tireIs82series = tireIs82series;
    return this;
  }

   /**
   * Is an old tire with assumed aspect ratio 82%
   * @return tireIs82series
  **/
  @ApiModelProperty(value = "Is an old tire with assumed aspect ratio 82%")
  public Boolean isTireIs82series() {
    return tireIs82series;
  }

  public void setTireIs82series(Boolean tireIs82series) {
    this.tireIs82series = tireIs82series;
  }

  public Wheel loadIndex(Integer loadIndex) {
    this.loadIndex = loadIndex;
    return this;
  }

   /**
   * Load index (e.g. &#x60;98&#x60;, can be __*&#x60;null&#x60;*__)
   * @return loadIndex
  **/
  @ApiModelProperty(value = "Load index (e.g. `98`, can be __*`null`*__)")
  public Integer getLoadIndex() {
    return loadIndex;
  }

  public void setLoadIndex(Integer loadIndex) {
    this.loadIndex = loadIndex;
  }

  public Wheel speedIndex(String speedIndex) {
    this.speedIndex = speedIndex;
    return this;
  }

   /**
   * Speed rating (e.g. &#x60;H&#x60;, can be __*&#x60;null&#x60;*__)
   * @return speedIndex
  **/
  @ApiModelProperty(value = "Speed rating (e.g. `H`, can be __*`null`*__)")
  public String getSpeedIndex() {
    return speedIndex;
  }

  public void setSpeedIndex(String speedIndex) {
    this.speedIndex = speedIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wheel wheel = (Wheel) o;
    return Objects.equals(this.tirePressure, wheel.tirePressure) &&
        Objects.equals(this.rim, wheel.rim) &&
        Objects.equals(this.rimDiameter, wheel.rimDiameter) &&
        Objects.equals(this.rimWidth, wheel.rimWidth) &&
        Objects.equals(this.rimOffset, wheel.rimOffset) &&
        Objects.equals(this.tire, wheel.tire) &&
        Objects.equals(this.tireSizingSystem, wheel.tireSizingSystem) &&
        Objects.equals(this.tireConstruction, wheel.tireConstruction) &&
        Objects.equals(this.tireWidth, wheel.tireWidth) &&
        Objects.equals(this.tireAspectRatio, wheel.tireAspectRatio) &&
        Objects.equals(this.tireDiameter, wheel.tireDiameter) &&
        Objects.equals(this.tireSectionWidth, wheel.tireSectionWidth) &&
        Objects.equals(this.tireIs82series, wheel.tireIs82series) &&
        Objects.equals(this.loadIndex, wheel.loadIndex) &&
        Objects.equals(this.speedIndex, wheel.speedIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tirePressure, rim, rimDiameter, rimWidth, rimOffset, tire, tireSizingSystem, tireConstruction, tireWidth, tireAspectRatio, tireDiameter, tireSectionWidth, tireIs82series, loadIndex, speedIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wheel {\n");
    
    sb.append("    tirePressure: ").append(toIndentedString(tirePressure)).append("\n");
    sb.append("    rim: ").append(toIndentedString(rim)).append("\n");
    sb.append("    rimDiameter: ").append(toIndentedString(rimDiameter)).append("\n");
    sb.append("    rimWidth: ").append(toIndentedString(rimWidth)).append("\n");
    sb.append("    rimOffset: ").append(toIndentedString(rimOffset)).append("\n");
    sb.append("    tire: ").append(toIndentedString(tire)).append("\n");
    sb.append("    tireSizingSystem: ").append(toIndentedString(tireSizingSystem)).append("\n");
    sb.append("    tireConstruction: ").append(toIndentedString(tireConstruction)).append("\n");
    sb.append("    tireWidth: ").append(toIndentedString(tireWidth)).append("\n");
    sb.append("    tireAspectRatio: ").append(toIndentedString(tireAspectRatio)).append("\n");
    sb.append("    tireDiameter: ").append(toIndentedString(tireDiameter)).append("\n");
    sb.append("    tireSectionWidth: ").append(toIndentedString(tireSectionWidth)).append("\n");
    sb.append("    tireIs82series: ").append(toIndentedString(tireIs82series)).append("\n");
    sb.append("    loadIndex: ").append(toIndentedString(loadIndex)).append("\n");
    sb.append("    speedIndex: ").append(toIndentedString(speedIndex)).append("\n");
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

