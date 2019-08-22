package com.example.demo.quartz;

import org.springframework.scheduling.quartz.QuartzJobBean;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zzh
 * @create 2019-08-18 16:48
 * @desc 定时任务
 **/
public class TestTask1 extends QuartzJobBean{

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("TestQuartz01----" + sdf.format(new Date()));
    }
}


