package com.jhy.subscribe;

import redis.clients.jedis.Client;
import redis.clients.jedis.JedisPubSub;

/**
 * 消息监听器类
 * 	该类需要继承JedisPubSub，并实现其抽象方法
 * 	这个监听器是用来订阅一个频道，在订阅该频道，取消订阅，收到消息等状态会对应调用相关的方法
 * 
 * @author PhantomJiang
 *
 */
public class RedisMsgPubSubListener extends JedisPubSub {

	public int getSubscribedChannels() {
		// TODO Auto-generated method stub
		return super.getSubscribedChannels();
	}

	public boolean isSubscribed() {
		// TODO Auto-generated method stub
		return super.isSubscribed();
	}

	public void onMessage(String channel, String message) {
		// TODO Auto-generated method stub
//		super.onMessage(channel, message);
		System.out.println("----channel:" + channel + "receives message :" + message);  
	}

	public void onPMessage(String pattern, String channel, String message) {
		// TODO Auto-generated method stub
//		super.onPMessage(pattern, channel, message);
		 System.out.println("onPMessage: channel["+channel+"], message["+message+"]");
	}

	public void onPSubscribe(String pattern, int subscribedChannels) {
		// TODO Auto-generated method stub
		super.onPSubscribe(pattern, subscribedChannels);
	}

	public void onPUnsubscribe(String pattern, int subscribedChannels) {
		// TODO Auto-generated method stub
		super.onPUnsubscribe(pattern, subscribedChannels);
	}

	public void onPong(String pattern) {
		// TODO Auto-generated method stub
		super.onPong(pattern);
	}

	public void onSubscribe(String channel, int subscribedChannels) {
		// TODO Auto-generated method stub
		super.onSubscribe(channel, subscribedChannels);
		System.out.println("channel:" + channel + "is been subscribed:" + subscribedChannels);  
	}

	public void onUnsubscribe(String channel, int subscribedChannels) {
		// TODO Auto-generated method stub
		super.onUnsubscribe(channel, subscribedChannels);
		System.out.println("channel:" + channel + "is been unsubscribed:" + subscribedChannels);  
	}

	public void ping() {
		// TODO Auto-generated method stub
		super.ping();
	}

	public void proceed(Client client, String[] channels) {
		// TODO Auto-generated method stub
		super.proceed(client, channels);
	}

	public void proceedWithPatterns(Client client, String[] patterns) {
		// TODO Auto-generated method stub
		super.proceedWithPatterns(client, patterns);
	}

	public void psubscribe(String[] patterns) {
		// TODO Auto-generated method stub
		super.psubscribe(patterns);
	}

	public void punsubscribe() {
		// TODO Auto-generated method stub
		super.punsubscribe();
	}

	public void punsubscribe(String[] patterns) {
		// TODO Auto-generated method stub
		super.punsubscribe(patterns);
	}

	public void subscribe(String[] channels) {
		// TODO Auto-generated method stub
		super.subscribe(channels);
	}

	public void unsubscribe() {
		// TODO Auto-generated method stub
		super.unsubscribe();
	}

	public void unsubscribe(String[] channels) {
		// TODO Auto-generated method stub
		super.unsubscribe(channels);
	}
	
	

	
}
