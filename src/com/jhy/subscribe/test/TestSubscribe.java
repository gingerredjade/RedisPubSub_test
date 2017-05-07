package com.jhy.subscribe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jhy.subscribe.RedisMsgPubSubListener;

import redis.clients.jedis.Jedis;

/**
 * 订阅测试类
 * 	该类实现对频道redisChatTest的订阅监听，频道的订阅，取消订阅，收到消息都会调用listener对象的对应方法。
 * 注：subscribe是一个阻塞的方法，在取消订阅该频道前会一直阻塞在这里，只有当取消了订阅才会执行下面的other code.
 * 		参考上面代码在onMessage里面收到消息后调用了this.unsubscribe()来取消订阅，这样才会执行后面的other code。
 * 
 * @author PhantomJiang
 *
 */
public class TestSubscribe {

	@Test
	public void test() {
		
		/*
		 * 用RedisMsgPubSubListener对象来订阅，对象中的onXXX方法监听到相应事件
		 */
		Jedis jedis = null;
		try {
			jedis = new Jedis("localhost", 6379);
			RedisMsgPubSubListener listener = new RedisMsgPubSubListener();
			jedis.subscribe(listener, "redisChatTest");
			listener.unsubscribe();
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
