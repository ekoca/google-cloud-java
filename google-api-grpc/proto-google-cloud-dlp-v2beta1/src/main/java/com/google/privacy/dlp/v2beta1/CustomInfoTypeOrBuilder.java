// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/storage.proto

package com.google.privacy.dlp.v2beta1;

public interface CustomInfoTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.CustomInfoType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Info type configuration. All custom info types must have configurations
   * that do not conflict with built-in info types or other custom info types.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
   */
  boolean hasInfoType();
  /**
   * <pre>
   * Info type configuration. All custom info types must have configurations
   * that do not conflict with built-in info types or other custom info types.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoType getInfoType();
  /**
   * <pre>
   * Info type configuration. All custom info types must have configurations
   * that do not conflict with built-in info types or other custom info types.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   * <pre>
   * Dictionary-based custom info type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.CustomInfoType.Dictionary dictionary = 2;</code>
   */
  boolean hasDictionary();
  /**
   * <pre>
   * Dictionary-based custom info type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.CustomInfoType.Dictionary dictionary = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.CustomInfoType.Dictionary getDictionary();
  /**
   * <pre>
   * Dictionary-based custom info type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.CustomInfoType.Dictionary dictionary = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.CustomInfoType.DictionaryOrBuilder getDictionaryOrBuilder();

  public com.google.privacy.dlp.v2beta1.CustomInfoType.TypeCase getTypeCase();
}
