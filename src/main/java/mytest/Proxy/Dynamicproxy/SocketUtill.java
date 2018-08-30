package mytest.Proxy.Dynamicproxy;

public class SocketUtill {

	/**这个方法模拟远程的方法，运行需要运行的类，运行的方法，运行需要的参数作为运行条件，
	 * 这个方法可以作为客户端，远端是服务端，此客户端的将运行条件传到服务端，服务端得到运行条件，根据需要到运行的类
	 * 反射出该类的对象，得到需要运行的方法，和运行需要的参数，运行方法得到结果，将结果传回客户端。
	 * @param objects
	 * @return
	 */
	public static Object sendMessg(String clazz,String method,Integer... objects){
		System.out.println("需要运行的类："+clazz+",运行的方法："+method);
		Integer sum = sum(objects);
		
		return Integer.toString(sum);
	}
	
	public static Integer sum(Integer... objects){
		int sum1 = 0;
		for(int i=0;i<objects.length;i++){
			sum1+=objects[i];
		}
		return sum1;
	}
}
