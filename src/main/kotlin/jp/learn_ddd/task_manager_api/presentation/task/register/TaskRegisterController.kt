package jp.learn_ddd.task_manager_api.presentation.task.register

import jp.learn_ddd.task_manager_api.application.usecase.RegisterTaskService
import jp.learn_ddd.task_manager_api.presentation.task.list.TaskRegisterConverter
import jp.learn_ddd.task_manager_api.presentation.task.list.TaskRegisterRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/task/register")
class TaskRegisterController {
    var taskRegisterConverter: TaskRegisterConverter
    var registerTaskService: RegisterTaskService

    @CrossOrigin
    @PostMapping
    fun post(@RequestBody request: TaskRegisterRequest) {
        val composingTask = this.taskRegisterConverter.convert(request)
        registerTaskService.execute(composingTask)
    }

    constructor(taskRegisterConverter: TaskRegisterConverter, registerTaskService: RegisterTaskService) {
        this.taskRegisterConverter = taskRegisterConverter
        this.registerTaskService = registerTaskService
    }
}
