package com.ai.skysmart.service;

import org.springframework.stereotype.Service;

public interface OtpService {
    void saveOtp(String phoneNumber, String otpNumber);
    boolean verifyOtp(String phoneNumber, String otp);
}
