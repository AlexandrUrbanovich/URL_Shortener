package ru.mail.urbanovichalexandr.dao_impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.mail.urbanovichalexandr.connection.SessionUtil;
import ru.mail.urbanovichalexandr.dao_api.ILinkDao;
import ru.mail.urbanovichalexandr.datamodel.Link;

import javax.inject.Inject;
import java.util.List;

@Repository
public class LinkDaoImpl extends SessionUtil implements ILinkDao {

    @Inject
    private SessionFactory sessionFactory;

    @Override
    public List get(Integer linkId) {
       openTransactionSession();

       String sql = "SELECT * FROM links WHERE ID = :id";

       Session session = getSession();
       Query query = session.createSQLQuery(sql).addEntity(Link.class);
       query.setParameter("id", linkId);

       List link = query.list();

       closeTransactionSesstion();

       return link;
    }

    @Override
    public void add(Link link) {
        openTransactionSession();
        Session session = getSession();
        session.save(link);
        closeTransactionSesstion();
    }

    @Override
    public void update(Link link) {

    }

    @Override
    public List<Link> getAll() {
        return null;
    }

    @Override
    public void delete(Integer linkId) {

    }
}
