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

package com.google.api.services.drive.model;

/**
 * A key-value pair attached to a file that is either public or private to an application. The
 * following limits apply to file properties: * Maximum of 100 properties total per file * Maximum
 * of 30 private properties per app * Maximum of 30 public properties * Maximum of 124 bytes size
 * limit on (key + value) string in UTF-8 encoding for a single property
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Property extends com.google.api.client.json.GenericJson {

  /**
   * Output only. ETag of the property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The key of this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Output only. This is always `drive#property`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Output only. The link back to this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The value of this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The visibility of this property. Allowed values are PRIVATE (default) and PUBLIC. Private
   * properties can only be retrieved using an authenticated request. An authenticated request uses
   * an access token obtained with a OAuth 2 client ID. You cannot use an API key to retrieve
   * private properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visibility;

  /**
   * Output only. ETag of the property.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. ETag of the property.
   * @param etag etag or {@code null} for none
   */
  public Property setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The key of this property.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The key of this property.
   * @param key key or {@code null} for none
   */
  public Property setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Output only. This is always `drive#property`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. This is always `drive#property`.
   * @param kind kind or {@code null} for none
   */
  public Property setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Output only. The link back to this property.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. The link back to this property.
   * @param selfLink selfLink or {@code null} for none
   */
  public Property setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The value of this property.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The value of this property.
   * @param value value or {@code null} for none
   */
  public Property setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * The visibility of this property. Allowed values are PRIVATE (default) and PUBLIC. Private
   * properties can only be retrieved using an authenticated request. An authenticated request uses
   * an access token obtained with a OAuth 2 client ID. You cannot use an API key to retrieve
   * private properties.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisibility() {
    return visibility;
  }

  /**
   * The visibility of this property. Allowed values are PRIVATE (default) and PUBLIC. Private
   * properties can only be retrieved using an authenticated request. An authenticated request uses
   * an access token obtained with a OAuth 2 client ID. You cannot use an API key to retrieve
   * private properties.
   * @param visibility visibility or {@code null} for none
   */
  public Property setVisibility(java.lang.String visibility) {
    this.visibility = visibility;
    return this;
  }

  @Override
  public Property set(String fieldName, Object value) {
    return (Property) super.set(fieldName, value);
  }

  @Override
  public Property clone() {
    return (Property) super.clone();
  }

}
