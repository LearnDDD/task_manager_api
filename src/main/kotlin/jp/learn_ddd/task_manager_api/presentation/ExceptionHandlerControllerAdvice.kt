package jp.learn_ddd.task_manager_api.presentation

import org.springframework.beans.propertyeditors.StringTrimmerEditor
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class ExceptionHandlerControllerAdvice: ResponseEntityExceptionHandler() {
    @InitBinder
    fun initBinder(binder: WebDataBinder) {
        binder.registerCustomEditor(String::class.java, StringTrimmerEditor(true))
    }

    @ExceptionHandler(Exception::class)
    fun exception(ex: Exception): ResponseEntity<Map<String, String>> {
        var body: Map<String, String> = mapOf("message" to ex.toString())
        return ResponseEntity(body, HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR)
    }
}
