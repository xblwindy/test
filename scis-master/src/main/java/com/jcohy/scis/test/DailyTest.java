package com.jcohy.scis.test;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DailyTest {

    @Test
    public void testMany() throws InterruptedException {
        /**
         * 该线程池的最大线程数等于核心线程数，所以在默认情况下，该线程池的线程不会因为闲置状态超时而被销毁。
         * 如果当前线程数小于核心线程数，并且也有闲置线程的时候提交了任务，这时也不会去复用之前的闲置线程，
         * 会创建新的线程去执行任务。如果当前执行任务数大于了核心线程数，大于的部分就会进入队列等待。等着有闲置的线程来执行这个任务。
         */
        ExecutorService mFixedThreadPool= Executors.newFixedThreadPool(5);
        /**
         * 这种线程池内部没有核心线程，线程的数量是有没限制的。
         * 在创建任务时，若有空闲的线程时则复用空闲的线程，若没有则新建线程。
         * 没有工作的线程（闲置状态）在超过了60S还不做事，就会销毁。
         */
        ExecutorService mCachedThreadPool = Executors.newCachedThreadPool();

        /**
         * DEFAULT_KEEPALIVE_MILLIS就是默认10L，这里就是10秒。这个线程池有点像是吧CachedThreadPool和FixedThreadPool 结合了一下。
         *
         * 不仅设置了核心线程数，最大线程数也是Integer.MAX_VALUE。
         * 这个线程池是上述4个中为唯一个有延迟执行和周期执行任务的线程池。
         */
        ExecutorService mScheduledThreadPool = Executors.newScheduledThreadPool(5);
        for(int i=0;i<10;i++){
//            mCachedThreadPool.execute(()->test());
            mFixedThreadPool.execute(()->test());
            Thread.sleep(1000);
        }
    }

    private void test() {
        System.out.println("threadName++++++"+Thread.currentThread().getName());
    }
}
