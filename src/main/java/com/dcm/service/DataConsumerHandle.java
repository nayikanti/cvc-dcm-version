package com.dcm.service;

public interface DataConsumerHandle<T> {
    void process(T inbound, String topic);
}
