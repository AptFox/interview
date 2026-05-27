package com.example.interview.controller

import com.example.interview.util.getLogger
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {
private val log = getLogger()

    @RequestMapping("/")
    fun root(request: HttpServletRequest): ResponseEntity<String> {
        log.info("Received {} request at root!", request.method)
        return ResponseEntity.ok("Hello World!")
    }
}
