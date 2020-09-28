package com.ebank.dao.impl;

import com.ebank.dao.BaseDao;
import com.ebank.dao.PhoneDao;
import com.ebank.entity.Phone;

public class PhoneDaoImpl extends BaseDao implements PhoneDao {
    @Override
    public Phone queryByPhone(String phone) {
        String sql = "SELECT * FROM `Phone` WHERE `phoneNum` = ?";
        return queryForOne(Phone.class, sql, phone);
    }

    @Override
    public int update(Phone phone) {
        String sql = "UPDATE `Phone` SET `cost` = ?, `status` = ? WHERE `phoneNum` = ?";
        return update(sql, phone.getCost(), phone.getStatus(), phone.getPhoneNum());
    }
}
