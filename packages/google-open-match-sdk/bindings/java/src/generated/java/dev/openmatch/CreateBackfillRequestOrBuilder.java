// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/frontend.proto

// Protobuf Java Version: 3.25.0
package dev.openmatch;

public interface CreateBackfillRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:openmatch.CreateBackfillRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An empty Backfill object.
   * </pre>
   *
   * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
   * @return Whether the backfill field is set.
   */
  boolean hasBackfill();
  /**
   * <pre>
   * An empty Backfill object.
   * </pre>
   *
   * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
   * @return The backfill.
   */
  dev.openmatch.Backfill getBackfill();
  /**
   * <pre>
   * An empty Backfill object.
   * </pre>
   *
   * <code>.openmatch.Backfill backfill = 1 [json_name = "backfill"];</code>
   */
  dev.openmatch.BackfillOrBuilder getBackfillOrBuilder();
}