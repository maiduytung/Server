package com.example.server.model.payload;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;

@Schema(title = "Token refresh Request", description = "The jwt token refresh request payload")
public class TokenRefreshRequest {

    @NotBlank(message = "Refresh token cannot be blank")
    @Schema(title = "Valid refresh token passed during earlier successful authentications", required = true,
            allowableValues = "NonEmpty String")
    private String refreshToken;

    public TokenRefreshRequest(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public TokenRefreshRequest() {
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
