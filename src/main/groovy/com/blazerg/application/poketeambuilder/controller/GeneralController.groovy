package com.blazerg.application.poketeambuilder.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.view.RedirectView

@RestController
class GeneralController {

    @GetMapping(value = "/")
    RedirectView emptyUrlRedirect() {
        return new RedirectView("https://poketeam-builder.herokuapp.com/swagger-ui.html")
    }
}
