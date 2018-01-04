package ru.mail.urbanovichalexandr.dao_impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.mail.urbanovichalexandr.connection.SessionUtil;
import ru.mail.urbanovichalexandr.dao_api.IUserDao;
import ru.mail.urbanovichalexandr.datamodel.User;

import javax.inject.Inject;
import java.util.List;

@Repository
public class UserDaoImpl extends SessionUtil implements IUserDao {

    @Inject
    private SessionFactory sessionFactory;

    @Override
    public List get(Integer userId) {
        openTransactionSession();

        String sql = "SELECT * FROM users WHERE ID = :id";

        Session session = getSession();
        Query query = session.createSQLQuery(sql).addEntity(User.class);
        query.setParameter("id", userId);

        List user = query.list();

        closeTransactionSesstion();

        return user;
    }

    @Override
    public void add(User user) {
        openTransactionSession();
        Session session = getSession();
        session.save(user);
        closeTransactionSesstion();

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void dalete(Integer userId) {

    }
}
