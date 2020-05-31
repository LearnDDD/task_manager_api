package jp.learn_ddd.task_manager_api.interfaces

import jp.learn_ddd.task_manager_api.infrastructure.data.Task
import jp.learn_ddd.task_manager_api.infrastructure.data.TaskRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/task")
class CharacterController (private val taskRepository: TaskRepository) {

    @GetMapping("")
    fun findAll(): List<Task> {
        return taskRepository.findAll()
    }
}