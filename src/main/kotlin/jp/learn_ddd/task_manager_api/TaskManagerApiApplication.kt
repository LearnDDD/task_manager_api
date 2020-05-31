package jp.learn_ddd.task_manager_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskManagerApiApplication

fun main(args: Array<String>) {
    runApplication<TaskManagerApiApplication>(*args)
}
