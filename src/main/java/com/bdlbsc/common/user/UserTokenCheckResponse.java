package com.bdlbsc.common.user;




import com.bdlbsc.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 检查token
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokenCheckResponse  extends BaseResponse {
    private Boolean expired;
}
