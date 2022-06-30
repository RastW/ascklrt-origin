package com.ascklrt.service.impl;

import com.ascklrt.service.ProcessTemplateService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author goumang
 * @description
 * @date 2022/6/24 11:15
 */
@Service
public class ProcessTemplateServiceImpl implements ProcessTemplateService {

    private static final Logger logger = LoggerFactory.getLogger(ProcessTemplateServiceImpl.class);

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;

    @Override
    public boolean deployProcess(String processName, String filePath) {
        // 定义部署流程操作
        Deployment deploy = repositoryService.createDeployment()
                // 关联部署流程文件
                .addClasspathResource(filePath)
                .name(processName)
                .deploy();

        return true;
    }

    @Override
    public void queryDefinitionProcess(String id) {
        // 根据id查询定义
        ProcessDefinition definition = repositoryService.createProcessDefinitionQuery()
                .deploymentId(id)
                .singleResult();

        System.out.println("DeploymentId: " + definition.getId());
        System.out.println("DeploymentName: " + definition.getName());
        System.out.println("DeploymentName: " + definition.getDescription());
    }

    public void deleteDeploy(String id) {
        // 根据id进行删除，true代表层连删除
        repositoryService.deleteDeployment(id, true);
    }

    public void startProcess(String processKey, Map variables) {
        // 启动流程实力
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processKey, variables);

        // 得到流程定义Id
        processInstance.getProcessDefinitionId();

        // 得到部署id
        processInstance.getDeploymentId();

        // 获取活跃id
        processInstance.getActivityId();
    }
}
