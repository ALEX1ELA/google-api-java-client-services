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
 * Flexible multi-vertical classification output. The output for each vertical should be defined as
 * a proto extension to this proto. When defining an extension for a new vertical please follow the
 * format: message NewVertical { extend safesearch.VideoClassifierOutput { optional NewVertical
 * classifier_output_extension = ; } optional safesearch.VideoVerticalOutput vertical_output = 1; }
 * SafeSearch verticals only: Please also update this message with a new extension declaration. For
 * more details on extension declaration please refer to http://go/proto-proposals/extension-
 * declarations. Please refer to http://go/proto2-extensions for details on message extensions.
 * LINT.IfChange next extension id: 5
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
public final class SafesearchVideoClassifierOutput extends com.google.api.client.json.GenericJson {

  @Override
  public SafesearchVideoClassifierOutput set(String fieldName, Object value) {
    return (SafesearchVideoClassifierOutput) super.set(fieldName, value);
  }

  @Override
  public SafesearchVideoClassifierOutput clone() {
    return (SafesearchVideoClassifierOutput) super.clone();
  }

}
