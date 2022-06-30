package com.ascklrt.service;

/**
 * @author goumang
 * @description 流程模版Service
 * @date 2022/6/24 11:14
 */
public interface ProcessTemplateService {

    /**
     * 流程部署
     *
     * @param processName 流程名
     * @param filePath    流程模版路径
     * @return boolean
     * @author wangjiawei
     * @date 2022/6/24 14:09
     */
    boolean deployProcess(String processName, String filePath);

    /**
     * 查询流程
     *
     * @param id 流程id
     * @return void
     * @author wangjiawei
     * @date 2022/6/24 14:10
     */
    void queryDefinitionProcess(String id);
}
