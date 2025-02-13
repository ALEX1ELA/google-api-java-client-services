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

package com.google.api.services.assuredworkloads.v1beta1.model;

/**
 * Violation exception detail. Next Id: 5
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp when the violation was acknowledged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String acknowledgementTime;

  /**
   * Business justification provided towards the acknowledgement of the violation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * Email address of the user (or service account) who acknowledged the violation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principalEmail;

  /**
   * Timestamp when the violation was acknowledged.
   * @return value or {@code null} for none
   */
  public String getAcknowledgementTime() {
    return acknowledgementTime;
  }

  /**
   * Timestamp when the violation was acknowledged.
   * @param acknowledgementTime acknowledgementTime or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext setAcknowledgementTime(String acknowledgementTime) {
    this.acknowledgementTime = acknowledgementTime;
    return this;
  }

  /**
   * Business justification provided towards the acknowledgement of the violation.
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Business justification provided towards the acknowledgement of the violation.
   * @param comment comment or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Email address of the user (or service account) who acknowledged the violation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipalEmail() {
    return principalEmail;
  }

  /**
   * Email address of the user (or service account) who acknowledged the violation.
   * @param principalEmail principalEmail or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext setPrincipalEmail(java.lang.String principalEmail) {
    this.principalEmail = principalEmail;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext clone() {
    return (GoogleCloudAssuredworkloadsV1beta1ViolationExceptionContext) super.clone();
  }

}
