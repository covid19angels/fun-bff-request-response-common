package com.bdlbsc.common.user;


import com.bdlbsc.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 检查token
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokenCheckRequest  extends BaseRequest {

    private String access_token;

}
