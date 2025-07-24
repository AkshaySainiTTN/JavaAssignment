package com.restfulapi2.restfulapi2;
import io.swagger.v3.oas.annotations.media.Schema;
@Schema(description = "This shows user")
public class User {
    @Schema(description = "Unique")
    private int id;
    private String name;
    private String email;
    public User() {}
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
