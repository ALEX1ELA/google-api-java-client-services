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

package com.google.api.services.cloudsearch.v1.model;

/**
 * A form action describes the behavior when the form is submitted. For example, an Apps Script can
 * be invoked to handle the form.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChatV1WidgetMarkupFormAction extends com.google.api.client.json.GenericJson {

  /**
   * The method name is used to identify which part of the form triggered the form submission. This
   * information is echoed back to the Chat app as part of the card click event. The same method
   * name can be used for several elements that trigger a common behavior if desired.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionMethodName;

  /**
   * List of action parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChatV1WidgetMarkupFormActionActionParameter> parameters;

  /**
   * The method name is used to identify which part of the form triggered the form submission. This
   * information is echoed back to the Chat app as part of the card click event. The same method
   * name can be used for several elements that trigger a common behavior if desired.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionMethodName() {
    return actionMethodName;
  }

  /**
   * The method name is used to identify which part of the form triggered the form submission. This
   * information is echoed back to the Chat app as part of the card click event. The same method
   * name can be used for several elements that trigger a common behavior if desired.
   * @param actionMethodName actionMethodName or {@code null} for none
   */
  public GoogleChatV1WidgetMarkupFormAction setActionMethodName(java.lang.String actionMethodName) {
    this.actionMethodName = actionMethodName;
    return this;
  }

  /**
   * List of action parameters.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChatV1WidgetMarkupFormActionActionParameter> getParameters() {
    return parameters;
  }

  /**
   * List of action parameters.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleChatV1WidgetMarkupFormAction setParameters(java.util.List<GoogleChatV1WidgetMarkupFormActionActionParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleChatV1WidgetMarkupFormAction set(String fieldName, Object value) {
    return (GoogleChatV1WidgetMarkupFormAction) super.set(fieldName, value);
  }

  @Override
  public GoogleChatV1WidgetMarkupFormAction clone() {
    return (GoogleChatV1WidgetMarkupFormAction) super.clone();
  }

}
