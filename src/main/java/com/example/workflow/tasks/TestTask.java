package com.example.workflow.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.logging.Logger;

public class TestTask implements JavaDelegate {
    private final Logger log = Logger.getLogger(this.getClass().getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Random random = new Random();
        delegateExecution.setVariable("name","test");
        Boolean isOk = random.nextBoolean();
        log.info("isOk :"+isOk);
        delegateExecution.setVariable("isOK",isOk);
    }
}
