package com.example.engineering_process_tools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class item_controller {

    @GetMapping
    public String getItem()
    {
        return "http GET reqeust was sent";
    }

    @PostMapping
    public String createItem()
    {
        return "http POST reqeust was sent";
    }

    @PutMapping
    public String updateItem()
    {
        return "http PUT reqeust was sent";
    }

    @DeleteMapping
    public String deleteItem()
    {
        return "http DELETE reqeust was sent";
    }
}