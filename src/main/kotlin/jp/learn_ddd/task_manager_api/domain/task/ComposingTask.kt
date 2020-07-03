package jp.learn_ddd.task_manager_api.domain.task

import jp.learn_ddd.task_manager_api.presentation.task.list.TaskRegisterRequest
import org.springframework.stereotype.Component

class ComposingTask (
        val title: Title,
        val details: Details,
        val taskTypeId: TaskTypeId,
        val parentTaskId: TaskId) {
}

@Component
class ComposingTaskFactory {
    fun create(taskRegisterRequest: TaskRegisterRequest): ComposingTask {
        val title = taskRegisterRequest.title
        val details = taskRegisterRequest.details
        val taskRegisterRequestTypeId = taskRegisterRequest.taskTypeId
        val parentTaskRegisterRequestId = taskRegisterRequest.parentTaskId
        return ComposingTask(title, details, taskRegisterRequestTypeId, parentTaskRegisterRequestId)
    }
}
