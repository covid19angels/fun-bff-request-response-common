package com.bdlbsc.common.user;




import com.bdlbsc.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisteredUsernameResponse   extends BaseResponse {

    private String access_token;
    private String refresh_token;

}
