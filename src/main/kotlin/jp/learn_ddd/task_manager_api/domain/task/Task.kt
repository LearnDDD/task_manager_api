package jp.learn_ddd.task_manager_api.domain.task

class TaskId(value: Int) {
    val value = value
}

class Task(id: TaskId) {
    val id = id
}

class Tasks(list: List<Task>) {
    val list = list
}
