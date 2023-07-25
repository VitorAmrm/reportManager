package com.amorim;

import io.micronaut.http.annotation.*;

@Controller("/reportManager")
public class ReportManagerController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}