package jp.learn_ddd.task_manager_api.domain.task

data class TaskId(var value: Int)

data class Title(var value: String) {
    constructor(): this("")
}

data class Details(var value: String)

data class TaskTypeId(var value: Int)

class Task(
        val id: TaskId,
        val title: Title,
        val details: Details,
        val taskTypeId: TaskTypeId,
        val parentTaskId: TaskId) {
    constructor() : this(TaskId(0), Title(""), Details(""), TaskTypeId(0), TaskId(0))
}

class Tasks(val tasks: List<Task>) {
    constructor() : this(ArrayList())
}

interface TaskRepository {
    fun getAll(): Tasks
    fun register(task: ComposingTask)
}
