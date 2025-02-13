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

package com.google.api.services.documentai.v1beta2.model;

/**
 * Response of the sample documents operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The result of the sampling process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponseSelectedDocument> selectedDocuments;

  /**
   * The result of the sampling process.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponseSelectedDocument> getSelectedDocuments() {
    return selectedDocuments;
  }

  /**
   * The result of the sampling process.
   * @param selectedDocuments selectedDocuments or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponse setSelectedDocuments(java.util.List<GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponseSelectedDocument> selectedDocuments) {
    this.selectedDocuments = selectedDocuments;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponse set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponse clone() {
    return (GoogleCloudDocumentaiUiv1beta3SampleDocumentsResponse) super.clone();
  }

}
