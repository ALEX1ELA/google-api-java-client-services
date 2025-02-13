/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Proto used to represent rights for a field type. See go/geo-rights for more details. NOTE: Use
 * google3/geostore/provenance/public/rights.h or
 * google3/java/com/google/geostore/provenance/rights/Rights.java instead of accessing this proto
 * directly.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreFieldWithRightsProto extends com.google.api.client.json.GenericJson {

  /**
   * ** DEPRECATED ** If field_type is set to FEATURE_ATTRIBUTE or KNOWLEDGE_GRAPH_PROPERTY, the
   * attribute ID / KG property ID that makes this field with rights complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributeId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreFeaturePropertyIdProto featurePropertyId;

  /**
   * The field type for which the rights level are tracked on. The default value here has to match
   * the value of fieldtype::NONE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer fieldType;

  /**
   * The minimum rights level for all the current values on the field type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minRightsLevel;

  /**
   * ** DEPRECATED ** If field_type is set to FEATURE_ATTRIBUTE or KNOWLEDGE_GRAPH_PROPERTY, the
   * attribute ID / KG property ID that makes this field with rights complete.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributeId() {
    return attributeId;
  }

  /**
   * ** DEPRECATED ** If field_type is set to FEATURE_ATTRIBUTE or KNOWLEDGE_GRAPH_PROPERTY, the
   * attribute ID / KG property ID that makes this field with rights complete.
   * @param attributeId attributeId or {@code null} for none
   */
  public GeostoreFieldWithRightsProto setAttributeId(java.lang.String attributeId) {
    this.attributeId = attributeId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GeostoreFeaturePropertyIdProto getFeaturePropertyId() {
    return featurePropertyId;
  }

  /**
   * @param featurePropertyId featurePropertyId or {@code null} for none
   */
  public GeostoreFieldWithRightsProto setFeaturePropertyId(GeostoreFeaturePropertyIdProto featurePropertyId) {
    this.featurePropertyId = featurePropertyId;
    return this;
  }

  /**
   * The field type for which the rights level are tracked on. The default value here has to match
   * the value of fieldtype::NONE.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFieldType() {
    return fieldType;
  }

  /**
   * The field type for which the rights level are tracked on. The default value here has to match
   * the value of fieldtype::NONE.
   * @param fieldType fieldType or {@code null} for none
   */
  public GeostoreFieldWithRightsProto setFieldType(java.lang.Integer fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * The minimum rights level for all the current values on the field type.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinRightsLevel() {
    return minRightsLevel;
  }

  /**
   * The minimum rights level for all the current values on the field type.
   * @param minRightsLevel minRightsLevel or {@code null} for none
   */
  public GeostoreFieldWithRightsProto setMinRightsLevel(java.lang.String minRightsLevel) {
    this.minRightsLevel = minRightsLevel;
    return this;
  }

  @Override
  public GeostoreFieldWithRightsProto set(String fieldName, Object value) {
    return (GeostoreFieldWithRightsProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreFieldWithRightsProto clone() {
    return (GeostoreFieldWithRightsProto) super.clone();
  }

}
