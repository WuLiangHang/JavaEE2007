package com.ebank.dao;

import com.ebank.entity.Phone;

public interface PhoneDao {
    Phone queryByPhone(String phoneNum);

    int update(Phone phone);
}
