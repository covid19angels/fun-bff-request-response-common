package com.bdlbsc.common.user;


import com.bdlbsc.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisteredPhonenumberRequestVerifocationCodeRequest  extends BaseRequest {

    private String phone_number;

}
