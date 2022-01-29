package com.example.server.model.payload;

import com.example.server.validation.annotation.MatchPassword;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;

@MatchPassword
@Schema(title = "Password reset Request", description = "The password reset request payload")
public class PasswordResetRequest {

    @NotBlank(message = "The email for which the password needs to be reset can not be empty")
    @Schema(title = "The user email", required = true, allowableValues = "NonEmpty String")
    private String email;

    @NotBlank(message = "New password cannot be blank")
    @Schema(title = "New user password", required = true, allowableValues = "NonEmpty String")
    private String password;

    @NotBlank(message = "Confirm Password cannot be blank")
    @Schema(title = "Must match the new user password. Else exception will be thrown", required = true,
            allowableValues = "NonEmpty String matching the password")
    private String confirmPassword;

    @NotBlank(message = "Password reset token for the specified email has to be supplied")
    @Schema(title = "Reset token received in mail", required = true, allowableValues = "NonEmpty String")
    private String token;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
