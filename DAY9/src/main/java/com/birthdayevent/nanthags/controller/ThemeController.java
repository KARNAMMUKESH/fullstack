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
import com.birthdayevent.nanthags.modal.Theme;
import com.birthdayevent.nanthags.service.ThemeService;



@RestController
public class ThemeController {

     @Autowired
    ThemeService service;

      @PostMapping("/add/theme")
public String addDetails(@RequestBody Theme m) {
    service.add(m);
    return "theme Added" ;
}

@GetMapping("/get/theme")
public List<Theme> showDetails() {
    return service.getDetails();

}
@GetMapping("/get/theme/{id}")
public Theme showDetail(@PathVariable int id) {
    return service.getDetail(id);

}
@PutMapping("/update/theme/{id}")
public Theme Details(@RequestBody Theme newUser ,@PathVariable int id)
{
     return service.updateDetails(newUser,id);
}

@DeleteMapping("/delete/theme/{id}")
public String delete(@PathVariable int id )
{
    service.deleteDetails(id);
    return "your theme id "+id+ " is deleted";
}

}
