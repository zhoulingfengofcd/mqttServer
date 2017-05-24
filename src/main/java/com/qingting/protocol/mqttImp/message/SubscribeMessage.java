package com.qingting.protocol.mqttImp.message;

/**
 * MQTT协议Subscribe消息类型实现类，用于订阅topic，订阅了消息的客户端，可以接受对应topic的信息
 * 
 * @author zer0
 * @version 1.0
 * @date 2015-3-5
 */
public class SubscribeMessage extends Message {

	public SubscribeMessage(FixedHeader fixedHeader, PackageIdVariableHeader variableHeader,
			SubscribePayload payload) {
		super(fixedHeader, variableHeader, payload);
	}
	
	@Override
	public PackageIdVariableHeader getVariableHeader() {
		return (PackageIdVariableHeader)super.getVariableHeader();
	}
	
	@Override
	public SubscribePayload getPayload() {
		return (SubscribePayload)super.getPayload();
	}
	
}
