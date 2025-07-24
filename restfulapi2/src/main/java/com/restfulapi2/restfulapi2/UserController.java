package com.restfulapi2.restfulapi2;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
public class UserController {
    private static final long ID = 1;
    private static final String NAME = "Arun";
    private static final String EMAIL = "arun@ttn.com";
    private static final String PHONE = "+91-9090909090";
    @GetMapping("/user/basic")
    public UserBasicDTO getUserBasic() {
        return new UserBasicDTO(ID, "Akshay");
    }
    @GetMapping("/user/enhanced")
    public UserEnhancedDTO getUserEnhanced() {
        return new UserEnhancedDTO(ID, NAME , EMAIL,PHONE);
    }
//MimeType  content negotiation
    @GetMapping(value = "/user5", produces = "application/vnd.myapp.v1+xml")
    public UserBasicDTO getUserMimeTypeV1() {
        return new UserBasicDTO(ID, NAME);
    }
    @GetMapping(value = "/user5", produces = "application/vnd.myapp.v2+json")
    public UserEnhancedDTO getUserMimeTypeV2() {
        return new UserEnhancedDTO(ID, NAME, EMAIL, PHONE);
    }
//request param
 @GetMapping(value = "/user/requestParam", params = "version1")
 public UserBasicDTO getuserbyrequestparam(){
        return new UserBasicDTO(ID, "Akshay");
 }
 @GetMapping(value = "/user/requestparampart2" , params ="version2")
 public UserEnhancedDTO getuserbyrequestparam2(){
        return new UserEnhancedDTO(ID, NAME , EMAIL,PHONE);
 }
//uri versioning
    @GetMapping("/v1/user")
    public UserBasicDTO getUserURIV1() {
        return new UserBasicDTO(ID, NAME);
    }
    @GetMapping("/v2/user")
    public UserEnhancedDTO getUserURIV2() {
        return new UserEnhancedDTO(ID, NAME, EMAIL, PHONE);
    }
    //custom header
    @GetMapping(value = "/user/header", headers = "X-API-VERSION=1")
    public UserBasicDTO getUserHeaderV1() {
        return new UserBasicDTO(ID, NAME);
    }
    @GetMapping(value = "/user/header", headers = "X-API-VERSION=2")
    public UserEnhancedDTO getUserHeaderV2() {
        return new UserEnhancedDTO(ID, NAME, EMAIL, PHONE);
    }
    //ans6
    @GetMapping("/user/hateoas")
    public EntityModel<UserBasicDTO> getUserHateoas() {
        UserBasicDTO user = new UserBasicDTO(10L, "Akshay");
        Link topicsLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(UserController.class).getAllTopics()
        ).withRel("First");
        Link secondlink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(UserController
                        .class).getSecondLink()
        ).withRel("Second");
        return EntityModel.of( user, secondlink, topicsLink);
    }


@GetMapping("/subject1")
    public List<String> getSecondLink() {
        return List.of("secondjava","SecondPython");
    }
    @GetMapping("/subject")
    public List<String> getAllTopics() {
        return List.of("java", "python");
    }
}
