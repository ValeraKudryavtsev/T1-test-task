package com.t1.test.controller;

import com.t1.test.service.impl.LineHandlerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1")
public class LineHandlerController {
    private final LineHandlerServiceImpl lineHandlerService;

    public LineHandlerController(LineHandlerServiceImpl lineHandlerService) {
        this.lineHandlerService = lineHandlerService;
    }

    @GetMapping("/{line}")
    public Map<Character, Integer> handleLine (@PathVariable("line") String line) {
        return lineHandlerService.handleLine(line);
    }
}
