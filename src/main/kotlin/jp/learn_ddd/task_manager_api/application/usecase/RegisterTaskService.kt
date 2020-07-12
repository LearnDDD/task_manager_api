package jp.learn_ddd.task_manager_api.application.usecase

import jp.learn_ddd.task_manager_api.domain.task.TaskRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class RegisterTaskService {
    var taskRepository: TaskRepository

    @Transactional
    fun execute(composingTask: ComposingTask) {
        taskRepository.register(composingTask)
    }

    constructor(taskRepository: TaskRepository) {
        this.taskRepository = taskRepository
    }
}
