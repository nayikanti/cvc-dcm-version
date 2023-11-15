package com.dcm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("msgDataHandle")
@Transactional
public class MsgDataHandle implements DataConsumerHandle<String> {
    private static final Logger logger = LoggerFactory.getLogger(MsgDataHandle.class);
    public void process(String inbound, String topic) {
        logger.debug("msd handle,topic:{},inbound:{}", topic, inbound);
try {
    logger.debug("inbound:"+ inbound);
    logger.debug("topic:"+ topic);
}catch (Exception e){
    logger.error("process Msg error.topic[{}], message:{}, error:", topic, inbound, e);
}
    }
}
