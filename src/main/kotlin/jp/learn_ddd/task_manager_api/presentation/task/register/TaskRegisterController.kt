package jp.learn_ddd.task_manager_api.presentation.task.register

import jp.learn_ddd.task_manager_api.application.usecase.RegisterTaskService
import jp.learn_ddd.task_manager_api.domain.task.ComposingTaskFactory
import jp.learn_ddd.task_manager_api.presentation.task.list.TaskRegisterRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/task/register")
class TaskRegisterController {
    var composingTaskFactory: ComposingTaskFactory
    var registerTaskService: RegisterTaskService

    @CrossOrigin
    @PostMapping
    fun post(@RequestBody request: TaskRegisterRequest) {
        val composingTask = this.composingTaskFactory.create(request)
        registerTaskService.execute(composingTask)
    }

    constructor(composingTaskFactory: ComposingTaskFactory, registerTaskService: RegisterTaskService) {
        this.composingTaskFactory = composingTaskFactory
        this.registerTaskService = registerTaskService
    }
}
