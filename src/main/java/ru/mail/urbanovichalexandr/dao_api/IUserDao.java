package ru.mail.urbanovichalexandr.dao_api;

import ru.mail.urbanovichalexandr.datamodel.User;

import java.util.List;

public interface IUserDao {

    List get(Integer userId);

    void add(User user);

    void update(User user);

    List<User> getAll();

    void dalete(Integer userId);
}
