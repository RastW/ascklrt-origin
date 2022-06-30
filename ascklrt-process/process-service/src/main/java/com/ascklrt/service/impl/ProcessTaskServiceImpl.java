package com.ascklrt.service.impl;

import com.ascklrt.service.ProcessTaskService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author goumang
 * @description
 * @date 2022/6/24 15:39
 */
public class ProcessTaskServiceImpl implements ProcessTaskService {

    @Autowired
    private TaskService taskService;

    public List<Task> queryTaskList(String assignee) {
        // 查询任务
        List<Task> list = taskService.createTaskQuery()
                .taskAssignee(assignee)
                .list();
        return list;
    }

    public void completeTask(String taskId, Map<String, Object> variables) {
        // 完成任务
        taskService.complete(taskId, variables);
    }
}
