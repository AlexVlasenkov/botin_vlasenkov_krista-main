import bo.BONews;
import controller.NewsController;
import org.junit.Assert;
import org.junit.Test;

public class INewsControllerTest {

    NewsController newController = new NewsController();

    @Test
    public void getNewById() {
        BONews BONews = newController.getNewById("client1", 8);
        Assert.assertEquals(BONews.getNumberOfViews(), 80);
        BONews = newController.getNewById("client2", 8);
        Assert.assertEquals(BONews.getNumberOfViews(), 120);
    }
}
