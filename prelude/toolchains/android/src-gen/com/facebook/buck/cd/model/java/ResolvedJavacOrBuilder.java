// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: javacd.proto

// Protobuf Java Version: 3.25.6
package com.facebook.buck.cd.model.java;

@javax.annotation.Generated(value="protoc", comments="annotations:ResolvedJavacOrBuilder.java.pb.meta")
public interface ResolvedJavacOrBuilder extends
    // @@protoc_insertion_point(interface_extends:javacd.api.v1.ResolvedJavac)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.javacd.api.v1.ResolvedJavac.ExternalJavac externalJavac = 1;</code>
   * @return Whether the externalJavac field is set.
   */
  boolean hasExternalJavac();
  /**
   * <code>.javacd.api.v1.ResolvedJavac.ExternalJavac externalJavac = 1;</code>
   * @return The externalJavac.
   */
  com.facebook.buck.cd.model.java.ResolvedJavac.ExternalJavac getExternalJavac();
  /**
   * <code>.javacd.api.v1.ResolvedJavac.ExternalJavac externalJavac = 1;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavac.ExternalJavacOrBuilder getExternalJavacOrBuilder();

  /**
   * <code>.javacd.api.v1.ResolvedJavac.JSR199Javac jsr199Javac = 2;</code>
   * @return Whether the jsr199Javac field is set.
   */
  boolean hasJsr199Javac();
  /**
   * <code>.javacd.api.v1.ResolvedJavac.JSR199Javac jsr199Javac = 2;</code>
   * @return The jsr199Javac.
   */
  com.facebook.buck.cd.model.java.ResolvedJavac.JSR199Javac getJsr199Javac();
  /**
   * <code>.javacd.api.v1.ResolvedJavac.JSR199Javac jsr199Javac = 2;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavac.JSR199JavacOrBuilder getJsr199JavacOrBuilder();

  com.facebook.buck.cd.model.java.ResolvedJavac.JavacCase getJavacCase();
}
