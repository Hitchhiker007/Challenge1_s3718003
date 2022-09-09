package com.example.engineering_process_tools.controller;

import com.example.engineering_process_tools.dao.item_service;
import com.example.engineering_process_tools.model.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class item_controller {

    @Autowired
    item_service item_service;


    @GetMapping()
    public List getAllItems()
    {
       return item_service.getAllItems();
    }

    @GetMapping("item/{id}")
    public item getItembyID(@PathVariable(value="id") int id)
    {
        return item_service.getItembyID(id);
    }

    @GetMapping("item/itemName")
    public item getItembyname(@PathVariable(value="name") String itemName)
    {
        return item_service.getItembyName(itemName);
    }

    @PostMapping()
    public item addItem(@RequestBody item item)
    {
        return item_service.addItem(item);
    }

    @PutMapping()
    public item updateitem(@RequestBody item item)
    {
        return item_service.updateitem(item);
    }

    @DeleteMapping("/deleteitem/{id}")
    public AddResponse deleteitem(@PathVariable(value = "id")int id)
    {
        return item_service.deleteitem(id);
    }


//   @GetMapping(path="/{itemID}")
//   public String getItem(@PathVariable String itemID)
//    {
//        return "http GET reqeust was sent for itemID:" + itemID;
//    }
//
//    @GetMapping
//    public String getItemList()
//    {
//        return "http GET reqeust was sent";
//    }
//
//    @PostMapping
//    public String createItem()
//    {
//        return "http POST reqeust was sent";
//    }
//
//    @PutMapping
//    public String updateItem()
//    {
//        return "http PUT reqeust was sent";
//    }
//
//    @DeleteMapping
//    public String deleteItem()
//    {
//        return "http DELETE reqeust was sent";
//    }
}