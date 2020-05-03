package com.example.workflow.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class PrintTask implements JavaDelegate {
    private final Logger log = Logger.getLogger(this.getClass().getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Print Task called by " +
                " getProcessDefinitionId : {}"+delegateExecution.getProcessDefinitionId()+
                " getCurrentActivityId : {}"+delegateExecution.getCurrentActivityId()+
                " getCurrentActivityName : {}"+delegateExecution.getCurrentActivityName()+
                " getProcessInstanceId : {}"+delegateExecution.getProcessInstanceId()+
                " getId : {}"+delegateExecution.getId()+
                " var "+delegateExecution.getVariables()

        );
    }
}
