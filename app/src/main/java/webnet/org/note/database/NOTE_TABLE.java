package webnet.org.note.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "NOTE__TABLE".
 */
@Entity
public class NOTE_TABLE {

    @Id(autoincrement = true)
    private Long id;
    private String TITLE;
    private String IMAGE;
    private String DESCRIPTION;
    private String DATE;

    @Generated
    public NOTE_TABLE() {
    }

    public NOTE_TABLE(Long id) {
        this.id = id;
    }

    @Generated
    public NOTE_TABLE(Long id, String TITLE, String IMAGE, String DESCRIPTION, String DATE) {
        this.id = id;
        this.TITLE = TITLE;
        this.IMAGE = IMAGE;
        this.DESCRIPTION = DESCRIPTION;
        this.DATE = DATE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

}
