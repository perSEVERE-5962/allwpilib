// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./ntcore/generate_topics.py. DO NOT MODIFY

package edu.wpi.first.networktables;

/** NetworkTables Double implementation. */
@SuppressWarnings("PMD.ArrayIsStoredDirectly")
final class DoubleEntryImpl extends EntryBase implements DoubleEntry {
  /**
   * Constructor.
   *
   * @param topic Topic
   * @param handle Native handle
   * @param defaultValue Default value for get()
   */
  DoubleEntryImpl(DoubleTopic topic, int handle, double defaultValue) {
    super(handle);
    m_topic = topic;
    m_defaultValue = defaultValue;
  }

  @Override
  public DoubleTopic getTopic() {
    return m_topic;
  }

  @Override
  public double get() {
    return NetworkTablesJNI.getDouble(m_handle, m_defaultValue);
  }

  @Override
  public double get(double defaultValue) {
    return NetworkTablesJNI.getDouble(m_handle, defaultValue);
  }

  @Override
  public TimestampedDouble getAtomic() {
    return NetworkTablesJNI.getAtomicDouble(m_handle, m_defaultValue);
  }

  @Override
  public TimestampedDouble getAtomic(double defaultValue) {
    return NetworkTablesJNI.getAtomicDouble(m_handle, defaultValue);
  }

  @Override
  public TimestampedDouble[] readQueue() {
    return NetworkTablesJNI.readQueueDouble(m_handle);
  }

  @Override
  public double[] readQueueValues() {
    return NetworkTablesJNI.readQueueValuesDouble(m_handle);
  }

  @Override
  public void set(double value, long time) {
    NetworkTablesJNI.setDouble(m_handle, time, value);
  }

  @Override
  public void setDefault(double value) {
    NetworkTablesJNI.setDefaultDouble(m_handle, 0, value);
  }

  @Override
  public void unpublish() {
    NetworkTablesJNI.unpublish(m_handle);
  }

  private final DoubleTopic m_topic;
  private final double m_defaultValue;
}