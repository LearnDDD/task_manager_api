package jp.learn_ddd.task_manager_api.presentation.controller

import jp.learn_ddd.task_manager_api.application.usecase.GetAllTaskService
import jp.learn_ddd.task_manager_api.domain.task.Task
import jp.learn_ddd.task_manager_api.domain.task.TaskId
import jp.learn_ddd.task_manager_api.domain.task.Tasks
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/task/list")
class TaskListController {
    var getAllTaskService: GetAllTaskService

    @CrossOrigin
    @GetMapping
    fun get(): ResponseEntity<Tasks> {
        val tasks = getAllTaskService.execute()
        val headers = HttpHeaders()
        return ResponseEntity(tasks, headers, HttpStatus.OK)
    }

    constructor(getAllTaskService: GetAllTaskService) {
        this.getAllTaskService = getAllTaskService
    }
}
