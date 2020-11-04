package com.dana.pig.demopractice.asyncTask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;


/**
 * ClassName: TaskAsync
 * Description:
 * date: 2020/10/30 20:42
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@Component
public class TaskAsync {
    @Async// 加在方法上表示此方法为异步方法，加载类上表示所有方法都是异步方法
    public void task_1 () {
        try{
            Thread.sleep(4000);
            System.out.println("task_1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Async
    public void task_2 () {
        try{
            Thread.sleep(4000);
            System.out.println("task_2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public Future<String> task_3 () {
        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task_3_Future");
        return new AsyncResult<String>("Future异步任务4");
    }

    // Future类用来包装返回结果，接收端用get方法获取结果，并可以指定等待时间，或者调用isDone()方法判断是否完成
    public Future<String> task_5 () {
        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task_5_Future");
        return new AsyncResult<String>("Future异步任务5");
    }


}
