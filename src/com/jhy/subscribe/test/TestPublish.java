package com.jhy.subscribe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jhy.subscribe.RedisMsgPubSubListener;

import redis.clients.jedis.Jedis;

/**
 * 发布消息测试类
 * 
 * @author PhantomJiang
 *
 */
public class TestPublish {

	@Test
	public void test() {
		Jedis jedis = null;
		try {
			String jsonMessage = "";
			jedis = new Jedis("localhost", 6379);
			RedisMsgPubSubListener listener = new RedisMsgPubSubListener();
			jedis.publish("redisChatTest", "hello!");
			// other code
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (jedis != null) {
				jedis.disconnect();
			}
		}
	}

}
