package factory;

import entity.Categories;
import entity.Views;
import entity.News;
import java.util.List;

public abstract class FP1 implements IProvider {
    @Override
    public abstract List<News> getNews();
    @Override
    public abstract List<Views> getViews();
    @Override
    public abstract List<Categories> getCategories();
}
