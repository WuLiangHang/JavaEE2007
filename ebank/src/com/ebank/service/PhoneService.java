package com.ebank.service;

import com.ebank.entity.Phone;

public interface PhoneService {
    Phone queryByPhone(String phoneNum);

    int update(Phone phone);
}
