package jp.learn_ddd.task_manager_api.presentation.task.list

import jp.learn_ddd.task_manager_api.application.usecase.ComposingTask
import jp.learn_ddd.task_manager_api.domain.task.Details
import jp.learn_ddd.task_manager_api.domain.task.TaskId
import jp.learn_ddd.task_manager_api.domain.task.TaskTypeId
import jp.learn_ddd.task_manager_api.domain.task.Title
import org.springframework.stereotype.Component

// TODO バリデーション追加
data class TaskRegisterRequest (
        var title: String,
        var details: String,
        var taskTypeId: String,
        var parentTaskId: String) {
}

@Component
class TaskRegisterConverter() {
    fun convert(request: TaskRegisterRequest): ComposingTask {
        val title = Title(request.title)
        val details = Details(request.details)
        val taskTypeId = TaskTypeId(request.taskTypeId)
        val parentTaskId = TaskId(request.parentTaskId)
        return ComposingTask(title, details, taskTypeId, parentTaskId)
    }
}
