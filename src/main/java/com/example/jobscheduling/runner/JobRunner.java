package com.example.jobscheduling.runner;

import com.google.common.collect.ImmutableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class JobRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0,30 * * * * *")
    public  void cronJob() {
        logger.info("> cron Job");
        ImmutableList<String> arl = ImmutableList.of("First", "Second", "Third");

        logger.info("run"+arl.size());

        logger.info("< cron Job");
    }

    @Scheduled(initialDelay = 5000, fixedDelay = 15000)
    public  void cronJobFixed() {
        logger.info("> cron Job");
        ImmutableList<String> arl = ImmutableList.of("First", "Second", "Third");

        logger.info("fixed run"+arl.size());

        logger.info("< cron Job");
    }
}
