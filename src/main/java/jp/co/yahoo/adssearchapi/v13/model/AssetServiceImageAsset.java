/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v13.model.AssetServiceFileType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceImageAssetオブジェクトは、画像アセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがIMAGEの場合は必須です。&lt;br&gt; ※現在、こちらのフィールドは利用できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceImageAsset contains Asset value information for image options.&lt;br&gt; This field is optional in ADD operation. *If type is IMAGE, this field is required.&lt;br&gt; *Currently this field is not available.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceImageAssetオブジェクトは、画像アセット情報を格納します。<br> ADD時、このフィールドは省略可能となります。※typeがIMAGEの場合は必須です。<br> ※現在、こちらのフィールドは利用できません。</div> <div lang=\"en\">AssetServiceImageAsset contains Asset value information for image options.<br> This field is optional in ADD operation. *If type is IMAGE, this field is required.<br> *Currently this field is not available.</div> ")
@JsonPropertyOrder({
  AssetServiceImageAsset.JSON_PROPERTY_IMAGE_NAME,
  AssetServiceImageAsset.JSON_PROPERTY_DATA,
  AssetServiceImageAsset.JSON_PROPERTY_ASPECT_RATIO,
  AssetServiceImageAsset.JSON_PROPERTY_FILE_SIZE,
  AssetServiceImageAsset.JSON_PROPERTY_HEIGHT,
  AssetServiceImageAsset.JSON_PROPERTY_WIDTH,
  AssetServiceImageAsset.JSON_PROPERTY_FILE_TYPE
})
@JsonTypeName("AssetServiceImageAsset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetServiceImageAsset {
  public static final String JSON_PROPERTY_IMAGE_NAME = "imageName";
  private String imageName;

  public static final String JSON_PROPERTY_DATA = "data";
  private byte[] data;

  public static final String JSON_PROPERTY_ASPECT_RATIO = "aspectRatio";
  private String aspectRatio;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private Long fileSize;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  private AssetServiceFileType fileType;

  public AssetServiceImageAsset() { 
  }

  public AssetServiceImageAsset imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像名です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Image name.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return imageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像名です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Image name.<br> This field is required in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageName() {
    return imageName;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public AssetServiceImageAsset data(byte[] data) {
    
    this.data = data;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像ファイルのbase64エンコードです。ADD時、このフィールドは必須となります。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The image file in base64 encode. This field is required in ADD operation.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; 
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像ファイルのbase64エンコードです。ADD時、このフィールドは必須となります。<br> ※このフィールドは、レスポンスの際に返却されません。</div> <div lang=\"en\">The image file in base64 encode. This field is required in ADD operation.<br> * This field is not returned in the response.</div> ")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(byte[] data) {
    this.data = data;
  }


  public AssetServiceImageAsset aspectRatio(String aspectRatio) {
    
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 画像アスペクト比の種類です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The type of aspect ratio.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return aspectRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 画像アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The type of aspect ratio.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAspectRatio() {
    return aspectRatio;
  }


  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  public AssetServiceImageAsset fileSize(Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ファイルサイズです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The file size of image. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ファイルサイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The file size of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public AssetServiceImageAsset height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 縦の長さです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The height of image. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 縦の長さです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The height of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Long height) {
    this.height = height;
  }


  public AssetServiceImageAsset width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 横幅です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The width of image.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 横幅です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The width of image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Long width) {
    this.width = width;
  }


  public AssetServiceImageAsset fileType(AssetServiceFileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssetServiceFileType getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(AssetServiceFileType fileType) {
    this.fileType = fileType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceImageAsset assetServiceImageAsset = (AssetServiceImageAsset) o;
    return Objects.equals(this.imageName, assetServiceImageAsset.imageName) &&
        Arrays.equals(this.data, assetServiceImageAsset.data) &&
        Objects.equals(this.aspectRatio, assetServiceImageAsset.aspectRatio) &&
        Objects.equals(this.fileSize, assetServiceImageAsset.fileSize) &&
        Objects.equals(this.height, assetServiceImageAsset.height) &&
        Objects.equals(this.width, assetServiceImageAsset.width) &&
        Objects.equals(this.fileType, assetServiceImageAsset.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageName, Arrays.hashCode(data), aspectRatio, fileSize, height, width, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceImageAsset {\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

