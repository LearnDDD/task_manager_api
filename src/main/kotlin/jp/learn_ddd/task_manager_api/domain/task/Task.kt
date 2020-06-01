package jp.learn_ddd.task_manager_api.domain.task

class TaskId {
    var value: Int

    constructor() {
        this.value = 0
    }
    constructor(value: Int) {
        this.value = value
    }
    constructor(value: String) {
        this.value = Integer.parseInt(value)
    }
}

class Task {
    var id: TaskId

    constructor() {
        this.id = TaskId()
    }

    constructor(id: TaskId) {
        this.id = id
    }
}

class Tasks {
    var list: List<Task>

    constructor() {
        this.list = ArrayList()
    }

    constructor(list: List<Task>) {
        this.list = list
    }
}

interface TaskRepository {
    fun getAll(): Tasks
}
