import ru.mail.urbanovichalexandr.connection.HibernateUtil;
import ru.mail.urbanovichalexandr.dao_impl.LinkDaoImpl;
import ru.mail.urbanovichalexandr.dao_impl.UserDaoImpl;
import ru.mail.urbanovichalexandr.datamodel.Link;
import ru.mail.urbanovichalexandr.datamodel.User;
import ru.mail.urbanovichalexandr.datamodel.enu.UserRole;

public class App {
    public static void main(String[] args){

        LinkDaoImpl linkDao = new LinkDaoImpl();
        UserDaoImpl userDao = new UserDaoImpl();

        Link link = new Link();
        link.setLinkId(1);
        link.setLink("ABC");
        linkDao.add(link);

        User user = new User();
        user.setUserId(1);
        user.setUserFirstName("Alex");
        user.setUserLastName("Ivanov");
        user.setRole(UserRole.user);
        userDao.add(user);



        HibernateUtil.shutdown();
    }
}
