package ru.mail.urbanovichalexandr.datamodel;

import javax.persistence.*;

@Entity
@Table(name = "links")
public class Link {

    @Id
    @Column(name = "link_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer linkId;

    @Column(name = "link")
    private String link;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
