package com.birthdayevent.nanthags.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.birthdayevent.nanthags.utils.MyConstant.ADMIN;

import java.util.List;

import com.birthdayevent.nanthags.modal.Food;

import com.birthdayevent.nanthags.service.FoodService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(ADMIN)
public class FoodController {

    @Autowired
    FoodService service;

    @PostMapping("/addMenu")
    public String addMenu(@RequestBody Food f){
        service.add(f);
        return "Respective new Food added to menu";
    }

    @GetMapping("/getMenu")
    public List<Food> showMenu(){
        return service.getMenu();
    }

    
@PutMapping("/editMenu/{id}")
public Food Details(@RequestBody Food newFood ,@PathVariable int id)
{
     return service.updateMenu(newFood,id);
}
@DeleteMapping("/deleteMenu/{id}")
public String delete(@PathVariable int id )
{
    service.deleteMenu(id);
    return "Food Menu has been deleted";
}



}
