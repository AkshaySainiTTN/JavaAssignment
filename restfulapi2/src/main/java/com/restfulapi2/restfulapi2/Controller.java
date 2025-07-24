package com.restfulapi2.restfulapi2;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jdk.jfr.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
@Tag(name = "Assignment REST API 2",
        description = "Creating controllers")
@RestController
public class Controller {
    private MessageSource messageSource;
    @Autowired
    public Controller(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
//ans1
    @GetMapping("/Internationalization")
    public String Internationalization(@RequestParam String name) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(
                "hello.username", new Object[]{name}, "default message", locale
        );
    }
    //ans2
    private List<User> users = new ArrayList<>();
    @PostMapping(value="/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        users.add(user);
        return ResponseEntity.ok(user) ;
    }
    @Operation(
          description = "fetching all users"
    )
    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }
//Ans4
    private List<UserAns4> usersAns4 = new ArrayList<>();
    @PostMapping("/usersans4")
    public ResponseEntity<UserAns4> createUser(@RequestBody UserAns4 user) {
        usersAns4.add(user);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/usersans4")
    public List<UserAns4> getUserAns4() {
        return usersAns4;
    }
    @GetMapping("/answer4")
    public UserAns4 getmappings() {
        return new UserAns4(1,"val2","val3","val4");
    }
    @GetMapping("/userans4-filtered")
    public MappingJacksonValue getUserAns4Filtered() {
        List<UserAns4> usersList = usersAns4;
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("id", "name");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("UserAns4Filter", filter);
        MappingJacksonValue mapping = new MappingJacksonValue(usersList);
        mapping.setFilters(filters);
        return mapping;
    }
    //global exception handler
    @GetMapping("/user/{id}")
    public User getUserexception(@PathVariable Long id) {
        // Kabhi bhi custom exception throw ho sakta hai
        throw new UserNotFoundException("User Not Found with id: " + id);
    }

}


