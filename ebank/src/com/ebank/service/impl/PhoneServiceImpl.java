package com.ebank.service.impl;

import com.ebank.dao.PhoneDao;
import com.ebank.dao.impl.PhoneDaoImpl;
import com.ebank.entity.Phone;
import com.ebank.service.PhoneService;

public class PhoneServiceImpl implements PhoneService {
    PhoneDao phoneDao = new PhoneDaoImpl();

    @Override
    public Phone queryByPhone(String phoneNum) {
        return phoneDao.queryByPhone(phoneNum);
    }

    @Override
    public int update(Phone phone) {
        phone.setCost(0.0);
        phone.setStatus((byte) 1);
        return phoneDao.update(phone);
    }
}
