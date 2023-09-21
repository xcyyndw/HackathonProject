package org.hackathon.controller;

import org.hackathon.entity.Authentication;
import org.hackathon.response.SingleResponse;
import org.hackathon.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(value = "/sign-up", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleResponse<String>> login(@RequestParam("email") String email, @RequestParam("password") String password) {
        if (StringUtils.hasText(email) && StringUtils.hasText(password)) {
            String result = authenticationService.save(new Authentication(email, password));
            if (result.startsWith("Success")) {
                return ResponseEntity.ok(SingleResponse.success());
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(SingleResponse.failure(result));
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(SingleResponse.failure("RequestBody is empty"));
    }

    @PostMapping(value = "/sign-in", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SingleResponse<String>> validate(@RequestParam("email") String email, @RequestParam("password") String password) {
        if (StringUtils.hasText(email) && StringUtils.hasText(password)) {
            Authentication authentication = authenticationService.findByEmail(email);
            if (ObjectUtils.isEmpty(authentication)) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(SingleResponse.failure("User not exists"));
            }
            if (password.equals(authentication.getPassword())) {
                return ResponseEntity.ok(SingleResponse.success());
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(SingleResponse.failure("Login Failed"));
    }
}
