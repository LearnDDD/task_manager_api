package jp.learn_ddd.task_manager_api.application.usecase

import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import jp.learn_ddd.task_manager_api.domain.task.Details
import jp.learn_ddd.task_manager_api.domain.task.TaskId
import jp.learn_ddd.task_manager_api.domain.task.TaskTypeId
import jp.learn_ddd.task_manager_api.domain.task.Title

class ComposingTask (
        val title: Title,
        val details: Details,
        val taskTypeId: TaskTypeId,
        val parentTaskId: TaskId) {
}
