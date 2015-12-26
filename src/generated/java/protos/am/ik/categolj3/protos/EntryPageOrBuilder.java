// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: am/ik/categolj3/protos/entry.proto

package am.ik.categolj3.protos;

public interface EntryPageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:am.ik.categolj3.protos.EntryPage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .am.ik.categolj3.protos.Entry content = 1;</code>
   */
  java.util.List<am.ik.categolj3.protos.Entry> 
      getContentList();
  /**
   * <code>repeated .am.ik.categolj3.protos.Entry content = 1;</code>
   */
  am.ik.categolj3.protos.Entry getContent(int index);
  /**
   * <code>repeated .am.ik.categolj3.protos.Entry content = 1;</code>
   */
  int getContentCount();
  /**
   * <code>repeated .am.ik.categolj3.protos.Entry content = 1;</code>
   */
  java.util.List<? extends am.ik.categolj3.protos.EntryOrBuilder> 
      getContentOrBuilderList();
  /**
   * <code>repeated .am.ik.categolj3.protos.Entry content = 1;</code>
   */
  am.ik.categolj3.protos.EntryOrBuilder getContentOrBuilder(
      int index);

  /**
   * <code>required int64 totalPages = 2;</code>
   */
  boolean hasTotalPages();
  /**
   * <code>required int64 totalPages = 2;</code>
   */
  long getTotalPages();

  /**
   * <code>required int64 totalElements = 3;</code>
   */
  boolean hasTotalElements();
  /**
   * <code>required int64 totalElements = 3;</code>
   */
  long getTotalElements();

  /**
   * <code>required bool first = 4;</code>
   */
  boolean hasFirst();
  /**
   * <code>required bool first = 4;</code>
   */
  boolean getFirst();

  /**
   * <code>required bool last = 5;</code>
   */
  boolean hasLast();
  /**
   * <code>required bool last = 5;</code>
   */
  boolean getLast();

  /**
   * <code>required int64 numberOfElements = 6;</code>
   */
  boolean hasNumberOfElements();
  /**
   * <code>required int64 numberOfElements = 6;</code>
   */
  long getNumberOfElements();

  /**
   * <code>required int32 size = 7;</code>
   */
  boolean hasSize();
  /**
   * <code>required int32 size = 7;</code>
   */
  int getSize();

  /**
   * <code>required int32 number = 8;</code>
   */
  boolean hasNumber();
  /**
   * <code>required int32 number = 8;</code>
   */
  int getNumber();
}