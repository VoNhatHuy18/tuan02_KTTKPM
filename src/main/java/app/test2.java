package app;

import redis.clients.jedis.Jedis;

public class test2 {

	public static void main(String[] args) {
		try {
			Jedis jedis = new Jedis("localhost");
			System.out.println("Kết nối thành công");
			System.out.println("Server info"+jedis.info());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
