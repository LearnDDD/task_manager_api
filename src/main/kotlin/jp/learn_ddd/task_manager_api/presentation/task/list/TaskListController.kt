package jp.learn_ddd.task_manager_api.presentation.task.list

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
    var taskListResponseFactory: TaskListResponseFactory

    @CrossOrigin
    @GetMapping
    fun get(): ResponseEntity<TaskListResponse> {
        val tasks = getAllTaskService.execute()
        val taskListResponse = this.taskListResponseFactory.create(tasks)
        val headers = HttpHeaders()
        return ResponseEntity(taskListResponse, headers, HttpStatus.OK)
    }

    constructor(getAllTaskService: GetAllTaskService, taskListResponseFactory: TaskListResponseFactory) {
        this.getAllTaskService = getAllTaskService
        this.taskListResponseFactory = taskListResponseFactory
    }
}
