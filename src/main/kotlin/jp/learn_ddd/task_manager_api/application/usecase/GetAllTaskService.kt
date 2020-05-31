package jp.learn_ddd.task_manager_api.application.usecase

import jp.learn_ddd.task_manager_api.domain.task.TaskRepository
import jp.learn_ddd.task_manager_api.domain.task.Tasks
import org.springframework.stereotype.Service

@Service
class GetAllTaskService {
    var taskRepository: TaskRepository;

    fun execute(): Tasks {
        return taskRepository.getAll()
    }

    constructor(taskRepository: TaskRepository) {
        this.taskRepository = taskRepository
    }
}
