package app;

import redis.clients.jedis.Jedis;

public class test {
public static void main(String[] args) throws Exception{
	try {
		Jedis jedis = new Jedis("localhost");
		System.out.println("Kết nối thành công");
		System.out.println("Server Ping"+jedis.ping());
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
