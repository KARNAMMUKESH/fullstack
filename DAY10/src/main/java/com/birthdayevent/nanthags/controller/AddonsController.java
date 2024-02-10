package com.birthdayevent.nanthags.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.birthdayevent.nanthags.modal.Addons;
import com.birthdayevent.nanthags.service.AddonsService;

@RestController
public class AddonsController {

    @Autowired
    AddonsService service;

    @PostMapping("/add/addon")
public String addDetails(@RequestBody Addons m) {
    service.add(m);
    return "addon Added" ;
}
@GetMapping("/get/addon")
public List<Addons> showDetails() {
    return service.getDetails();
}
@GetMapping("/get/addon/{id}")
public Addons showDetail(@PathVariable int id) {
    return service.getDetail(id);
}
@PutMapping("/update/addon/{id}")
public Addons Details(@RequestBody Addons newUser ,@PathVariable int id)
{
     return service.updateDetails(newUser,id);
}
@DeleteMapping("/delete/addon/{id}")
public String delete(@PathVariable int id )
{
    service.deleteDetails(id);
    return "your addon id "+id+ " is deleted";
}
}
