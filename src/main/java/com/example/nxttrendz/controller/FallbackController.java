package com.example.nxttrendz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller to handle all non-API routes and forward them to the 
 * React application's index.html file for client-side routing.
 */
@Controller
public class FallbackController {

    /**
     * Forwards any request that doesn't match an API endpoint or a static file 
     * to the React index.html file.
     */
    @GetMapping(value = {"/", "/{path:[^\\.]*}", "/{path:.*}/{path2:[^\\.]*}"})
    public String forwardNonApiRoutes() {
        // This tells Spring to load the index.html file from the static folder
        return "forward:/index.html"; 
    }
}