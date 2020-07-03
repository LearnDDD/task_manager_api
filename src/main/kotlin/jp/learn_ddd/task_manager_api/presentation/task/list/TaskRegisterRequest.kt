package jp.learn_ddd.task_manager_api.presentation.task.list

import com.fasterxml.jackson.annotation.JsonProperty
import jp.learn_ddd.task_manager_api.domain.task.Details
import jp.learn_ddd.task_manager_api.domain.task.TaskId
import jp.learn_ddd.task_manager_api.domain.task.TaskTypeId
import jp.learn_ddd.task_manager_api.domain.task.Title

data class TaskRegisterRequest (
        @JsonProperty("title") var title: Title,
        var details: Details,
        var taskTypeId: TaskTypeId,
        var parentTaskId: TaskId) {
    constructor() : this(Title(""), Details(""), TaskTypeId(0), TaskId(0))
}
