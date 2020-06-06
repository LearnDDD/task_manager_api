package jp.learn_ddd.task_manager_api.infrastructure.datasource.task

import jp.learn_ddd.task_manager_api.domain.task.TaskRepository
import jp.learn_ddd.task_manager_api.domain.task.Tasks
import org.springframework.stereotype.Repository

@Repository
class TaskDataSource: TaskRepository {
    var mapper: TaskMapper

    override fun getAll(): Tasks {
        val taskList = mapper.getAll()
        return Tasks(taskList)
    }

    constructor(mapper: TaskMapper) {
        this.mapper = mapper
    }
}

