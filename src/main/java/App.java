import ru.mail.urbanovichalexandr.connection.HibernateUtil;
import ru.mail.urbanovichalexandr.dao_impl.LinkDaoImpl;
import ru.mail.urbanovichalexandr.datamodel.Link;

public class App {
    public static void main(String[] args){

        LinkDaoImpl linkDao = new LinkDaoImpl();

        Link link = new Link();
        link.setLinkId(1);
        link.setLink("ABC");

        linkDao.add(link);

        HibernateUtil.shutdown();
    }
}
