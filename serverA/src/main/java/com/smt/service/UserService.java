package com.smt.service;

import com.smt.bean.User;

public interface UserService {

	User getUserById(long id );

	User update(long l);

	User insert(long l);

}
