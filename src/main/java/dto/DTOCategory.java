package dto;

import java.util.ArrayList;

public class DTOCategory {
    private final int newsCount;
    ArrayList<String> response;
    private Integer id;
    private String name;

    public DTOCategory (Integer id, String name, int newsCount) {
        this.id = id;
        this.name = name;
        this.newsCount = newsCount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Integer getId() {
        return this.id;
    }
}
