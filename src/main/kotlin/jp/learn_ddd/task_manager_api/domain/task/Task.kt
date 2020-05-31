package jp.learn_ddd.task_manager_api.domain.task

data class TaskId(val value: Int) {
}

data class Task(val id: TaskId) {
}

data class Tasks(val list: List<Task>) {
}

interface TaskRepository {
    fun getAll(): Tasks
}
