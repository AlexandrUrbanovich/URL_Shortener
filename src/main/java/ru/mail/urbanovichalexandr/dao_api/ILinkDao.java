package ru.mail.urbanovichalexandr.dao_api;

import ru.mail.urbanovichalexandr.datamodel.Link;
import java.util.List;

public interface ILinkDao {

    List get(Integer linkId);

    void add(Link link);

    void update(Link link);

    List<Link> getAll();

    void delete(Integer linkId);
}
