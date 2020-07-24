package com.store.login.client;

import com.store.login.domain.user_registration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "register")
public interface RemoteCallService {
    @GetMapping("/pooya")
    public String get();
      @GetMapping("/pooya/login/{name}/{na}")
    public user_registration getlogininfo(@PathVariable String name,@PathVariable  String na);
}
