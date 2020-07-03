package jp.learn_ddd.task_manager_api.presentation.task.list

import jp.learn_ddd.task_manager_api.domain.task.Task
import jp.learn_ddd.task_manager_api.domain.task.Tasks
import org.springframework.stereotype.Component

data class TaskListResponse(val tasks: List<TaskView>) {
}

data class TaskView (
        val id: String,
        val title: String,
        val details: String,
        val taskTypeId: String,
        val parentTaskId: String) {
}

@Component
class TaskListResponseFactory {
    fun create(tasks: Tasks): TaskListResponse {
        val taskList = tasks.tasks.map { task -> this.create(task) }
        return TaskListResponse(taskList)
    }

    private fun create(task: Task): TaskView {
        val id = task.id.value.toString()
        val title = task.title.value.toString()
        val details = task.details.value.toString()
        val taskTypeId = task.taskTypeId.value.toString()
        val parentTaskId = task.parentTaskId.value.toString()
        return TaskView(id, title, details, taskTypeId, parentTaskId)
    }
}
