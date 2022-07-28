package com.goorm.t4.youtubeclone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDto {
    private String id;
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("picture")
    private String picture;
    private String email;

}
