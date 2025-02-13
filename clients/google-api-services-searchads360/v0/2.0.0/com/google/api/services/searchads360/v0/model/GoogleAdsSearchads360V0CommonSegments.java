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

package com.google.api.services.searchads360.v0.model;

/**
 * Segment only fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0CommonSegments extends com.google.api.client.json.GenericJson {

  /**
   * Resource name of the conversion action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversionAction;

  /**
   * Conversion action category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversionActionCategory;

  /**
   * Conversion action name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversionActionName;

  /**
   * Date to which metrics apply. yyyy-MM-dd format, for example, 2018-04-17.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String date;

  /**
   * Day of the week, for example, MONDAY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dayOfWeek;

  /**
   * Device to which metrics apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String device;

  /**
   * Keyword criterion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAdsSearchads360V0CommonKeyword keyword;

  /**
   * Month as represented by the date of the first day of a month. Formatted as yyyy-MM-dd.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String month;

  /**
   * Quarter as represented by the date of the first day of a quarter. Uses the calendar year for
   * quarters, for example, the second quarter of 2018 starts on 2018-04-01. Formatted as yyyy-MM-
   * dd.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quarter;

  /**
   * Week as defined as Monday through Sunday, and represented by the date of Monday. Formatted as
   * yyyy-MM-dd.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String week;

  /**
   * Year, formatted as yyyy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer year;

  /**
   * Resource name of the conversion action.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversionAction() {
    return conversionAction;
  }

  /**
   * Resource name of the conversion action.
   * @param conversionAction conversionAction or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setConversionAction(java.lang.String conversionAction) {
    this.conversionAction = conversionAction;
    return this;
  }

  /**
   * Conversion action category.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversionActionCategory() {
    return conversionActionCategory;
  }

  /**
   * Conversion action category.
   * @param conversionActionCategory conversionActionCategory or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setConversionActionCategory(java.lang.String conversionActionCategory) {
    this.conversionActionCategory = conversionActionCategory;
    return this;
  }

  /**
   * Conversion action name.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversionActionName() {
    return conversionActionName;
  }

  /**
   * Conversion action name.
   * @param conversionActionName conversionActionName or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setConversionActionName(java.lang.String conversionActionName) {
    this.conversionActionName = conversionActionName;
    return this;
  }

  /**
   * Date to which metrics apply. yyyy-MM-dd format, for example, 2018-04-17.
   * @return value or {@code null} for none
   */
  public java.lang.String getDate() {
    return date;
  }

  /**
   * Date to which metrics apply. yyyy-MM-dd format, for example, 2018-04-17.
   * @param date date or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setDate(java.lang.String date) {
    this.date = date;
    return this;
  }

  /**
   * Day of the week, for example, MONDAY.
   * @return value or {@code null} for none
   */
  public java.lang.String getDayOfWeek() {
    return dayOfWeek;
  }

  /**
   * Day of the week, for example, MONDAY.
   * @param dayOfWeek dayOfWeek or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setDayOfWeek(java.lang.String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Device to which metrics apply.
   * @return value or {@code null} for none
   */
  public java.lang.String getDevice() {
    return device;
  }

  /**
   * Device to which metrics apply.
   * @param device device or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setDevice(java.lang.String device) {
    this.device = device;
    return this;
  }

  /**
   * Keyword criterion.
   * @return value or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonKeyword getKeyword() {
    return keyword;
  }

  /**
   * Keyword criterion.
   * @param keyword keyword or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setKeyword(GoogleAdsSearchads360V0CommonKeyword keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Month as represented by the date of the first day of a month. Formatted as yyyy-MM-dd.
   * @return value or {@code null} for none
   */
  public java.lang.String getMonth() {
    return month;
  }

  /**
   * Month as represented by the date of the first day of a month. Formatted as yyyy-MM-dd.
   * @param month month or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setMonth(java.lang.String month) {
    this.month = month;
    return this;
  }

  /**
   * Quarter as represented by the date of the first day of a quarter. Uses the calendar year for
   * quarters, for example, the second quarter of 2018 starts on 2018-04-01. Formatted as yyyy-MM-
   * dd.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuarter() {
    return quarter;
  }

  /**
   * Quarter as represented by the date of the first day of a quarter. Uses the calendar year for
   * quarters, for example, the second quarter of 2018 starts on 2018-04-01. Formatted as yyyy-MM-
   * dd.
   * @param quarter quarter or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setQuarter(java.lang.String quarter) {
    this.quarter = quarter;
    return this;
  }

  /**
   * Week as defined as Monday through Sunday, and represented by the date of Monday. Formatted as
   * yyyy-MM-dd.
   * @return value or {@code null} for none
   */
  public java.lang.String getWeek() {
    return week;
  }

  /**
   * Week as defined as Monday through Sunday, and represented by the date of Monday. Formatted as
   * yyyy-MM-dd.
   * @param week week or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setWeek(java.lang.String week) {
    this.week = week;
    return this;
  }

  /**
   * Year, formatted as yyyy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * Year, formatted as yyyy.
   * @param year year or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonSegments setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0CommonSegments set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0CommonSegments) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0CommonSegments clone() {
    return (GoogleAdsSearchads360V0CommonSegments) super.clone();
  }

}
