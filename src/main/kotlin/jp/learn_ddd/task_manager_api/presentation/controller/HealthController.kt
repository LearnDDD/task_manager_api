package jp.learn_ddd.task_manager_api.presentation.controller

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HealthController {
    @GetMapping
    fun get(): ResponseEntity<String> {
        val headers = HttpHeaders()
        return ResponseEntity("Application Running.", headers, HttpStatus.OK)
    }
}
