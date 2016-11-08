
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class CountDownLatchTest{
	
	private final static int COUNT = 10;
	private final static CountDownLatch count = new CountDownLatch(COUNT);

	private final static ExecutorService service = Executors.newFixedThreadPool(5);

	public static void main(String[] args) throws Exception{
		for(int i = 0;i < COUNT;i++){
			service.execute(() -> {
				try{
					int time = new Random().nextInt(5);
					TimeUnit.SECONDS.sleep(time);
					System.out.printf("Thread %s ## 耗时:%d\n",Thread.currentThread().getId(),time);
					count.countDown();
				} catch(InterruptedException e){
					e.printStackTrace();
				}

			});
		}
		count.await();
		service.shutdown();
		
		System.out.println("同步线程执行结束");

	}
}
