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

package com.google.api.services.gkebackup.v1.model;

/**
 * A transformation rule to be applied against Kubernetes resources as they are selected for
 * restoration from a Backup. A rule contains both filtering logic (which resources are subject to
 * substitution) and substitution logic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubstitutionRule extends com.google.api.client.json.GenericJson {

  /**
   * This is the new value to set for any fields that pass the filtering and selection criteria. To
   * remove a value from a Kubernetes resource, either leave this field unspecified, or set it to
   * the empty string ("").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newValue;

  /**
   * (Filtering parameter) This is a [regular expression]
   * (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched
   * by the target_json_path expression (and must also have passed the previous filters).
   * Substitution will not be performed against fields whose value does not match this expression.
   * If this field is NOT specified, then ALL fields matched by the target_json_path expression will
   * undergo substitution. Note that an empty (e.g., "", rather than unspecified) value for this
   * field will only match empty fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalValuePattern;

  /**
   * (Filtering parameter) Any resource subject to substitution must belong to one of the listed
   * "types". If this field is not provided, no type filtering will be performed (all resources of
   * all types matching previous filtering parameters will be candidates for substitution).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GroupKind> targetGroupKinds;

  static {
    // hack to force ProGuard to consider GroupKind used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GroupKind.class);
  }

  /**
   * Required. This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/)
   * expression that matches specific fields of candidate resources and it operates as both a
   * filtering parameter (resources that are not matched with this expression will not be candidates
   * for substitution) as well as a field identifier (identifies exactly which fields out of the
   * candidate resources will be modified).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetJsonPath;

  /**
   * (Filtering parameter) Any resource subject to substitution must be contained within one of the
   * listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace
   * filtering will be performed (all resources in all Namespaces, including all cluster-scoped
   * resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources
   * in the same rule, use an empty string ("") as one of the target namespaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetNamespaces;

  /**
   * This is the new value to set for any fields that pass the filtering and selection criteria. To
   * remove a value from a Kubernetes resource, either leave this field unspecified, or set it to
   * the empty string ("").
   * @return value or {@code null} for none
   */
  public java.lang.String getNewValue() {
    return newValue;
  }

  /**
   * This is the new value to set for any fields that pass the filtering and selection criteria. To
   * remove a value from a Kubernetes resource, either leave this field unspecified, or set it to
   * the empty string ("").
   * @param newValue newValue or {@code null} for none
   */
  public SubstitutionRule setNewValue(java.lang.String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * (Filtering parameter) This is a [regular expression]
   * (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched
   * by the target_json_path expression (and must also have passed the previous filters).
   * Substitution will not be performed against fields whose value does not match this expression.
   * If this field is NOT specified, then ALL fields matched by the target_json_path expression will
   * undergo substitution. Note that an empty (e.g., "", rather than unspecified) value for this
   * field will only match empty fields.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalValuePattern() {
    return originalValuePattern;
  }

  /**
   * (Filtering parameter) This is a [regular expression]
   * (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched
   * by the target_json_path expression (and must also have passed the previous filters).
   * Substitution will not be performed against fields whose value does not match this expression.
   * If this field is NOT specified, then ALL fields matched by the target_json_path expression will
   * undergo substitution. Note that an empty (e.g., "", rather than unspecified) value for this
   * field will only match empty fields.
   * @param originalValuePattern originalValuePattern or {@code null} for none
   */
  public SubstitutionRule setOriginalValuePattern(java.lang.String originalValuePattern) {
    this.originalValuePattern = originalValuePattern;
    return this;
  }

  /**
   * (Filtering parameter) Any resource subject to substitution must belong to one of the listed
   * "types". If this field is not provided, no type filtering will be performed (all resources of
   * all types matching previous filtering parameters will be candidates for substitution).
   * @return value or {@code null} for none
   */
  public java.util.List<GroupKind> getTargetGroupKinds() {
    return targetGroupKinds;
  }

  /**
   * (Filtering parameter) Any resource subject to substitution must belong to one of the listed
   * "types". If this field is not provided, no type filtering will be performed (all resources of
   * all types matching previous filtering parameters will be candidates for substitution).
   * @param targetGroupKinds targetGroupKinds or {@code null} for none
   */
  public SubstitutionRule setTargetGroupKinds(java.util.List<GroupKind> targetGroupKinds) {
    this.targetGroupKinds = targetGroupKinds;
    return this;
  }

  /**
   * Required. This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/)
   * expression that matches specific fields of candidate resources and it operates as both a
   * filtering parameter (resources that are not matched with this expression will not be candidates
   * for substitution) as well as a field identifier (identifies exactly which fields out of the
   * candidate resources will be modified).
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetJsonPath() {
    return targetJsonPath;
  }

  /**
   * Required. This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/)
   * expression that matches specific fields of candidate resources and it operates as both a
   * filtering parameter (resources that are not matched with this expression will not be candidates
   * for substitution) as well as a field identifier (identifies exactly which fields out of the
   * candidate resources will be modified).
   * @param targetJsonPath targetJsonPath or {@code null} for none
   */
  public SubstitutionRule setTargetJsonPath(java.lang.String targetJsonPath) {
    this.targetJsonPath = targetJsonPath;
    return this;
  }

  /**
   * (Filtering parameter) Any resource subject to substitution must be contained within one of the
   * listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace
   * filtering will be performed (all resources in all Namespaces, including all cluster-scoped
   * resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources
   * in the same rule, use an empty string ("") as one of the target namespaces.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetNamespaces() {
    return targetNamespaces;
  }

  /**
   * (Filtering parameter) Any resource subject to substitution must be contained within one of the
   * listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace
   * filtering will be performed (all resources in all Namespaces, including all cluster-scoped
   * resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources
   * in the same rule, use an empty string ("") as one of the target namespaces.
   * @param targetNamespaces targetNamespaces or {@code null} for none
   */
  public SubstitutionRule setTargetNamespaces(java.util.List<java.lang.String> targetNamespaces) {
    this.targetNamespaces = targetNamespaces;
    return this;
  }

  @Override
  public SubstitutionRule set(String fieldName, Object value) {
    return (SubstitutionRule) super.set(fieldName, value);
  }

  @Override
  public SubstitutionRule clone() {
    return (SubstitutionRule) super.clone();
  }

}
