package jp.learn_ddd.task_manager_api.domain.task

data class TaskId(var value: Int) {
}

data class Task(var id: TaskId) {
}

data class Tasks(var list: List<Task>) {
}

interface TaskRepository {
    fun getAll(): Tasks
}
