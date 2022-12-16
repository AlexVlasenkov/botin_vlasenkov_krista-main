package dto;

import java.util.List;

public class AllCategoriesDTO {
    public List<DTOCategory> list;
    public AllCategoriesDTO() {}

    public AllCategoriesDTO(List<DTOCategory> list) {
        this.list = list;
    }
}
