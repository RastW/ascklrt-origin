package com.ascklrt.config;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author goumang
 * @description
 * @date 2022/6/16 17:51
 */
@Configuration
public class ProcessEngineConfig {

    @Bean
    public ProcessEngine injectionProcessEngine() {
        // 获取config
        ProcessEngineConfiguration configuration = new StandaloneProcessEngineConfiguration();

        // 数据库配置
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("ascklrt0");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/flowable?useUnicode=true&characterEncoding=utf8&useSSL=false");

        // 如果数据库表结构不存在则新建
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        ProcessEngine processEngine = configuration.buildProcessEngine();
        System.out.println("process: " + processEngine);
        return processEngine;
    }

    @Bean
    public RepositoryService injectionRepositoryService(ProcessEngine processEngine) {
        // 流程部署service
        return processEngine.getRepositoryService();
    }

    @Bean
    public RuntimeService injectionRuntimeService(ProcessEngine processEngine) {
        // 运行Service
        return processEngine.getRuntimeService();
    }
}
