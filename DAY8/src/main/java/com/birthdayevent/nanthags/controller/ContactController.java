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

import com.birthdayevent.nanthags.modal.Contact;
import com.birthdayevent.nanthags.service.ContactService;

@RestController
public class ContactController {

    @Autowired
    ContactService service;

     @PostMapping("/add/contact")
public String addDetails(@RequestBody Contact m) {
    service.add(m);
    return "query Added" ;
}

@GetMapping("/get/contact")
public List<Contact> showDetails() {
    return service.getDetails();

}
@GetMapping("/get/contact/{id}")
public Contact showDetail(@PathVariable int id) {
    return service.getDetail(id);

}
@PutMapping("/update/contact/{id}")
public Contact Details(@RequestBody Contact newUser ,@PathVariable int id)
{
     return service.updateDetails(newUser,id);
}


@DeleteMapping("/delete/contact/{id}")
public String delete(@PathVariable int id )
{
    service.deleteDetails(id);
    return "your contact id "+id+ " is deleted";
}
}
