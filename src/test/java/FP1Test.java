import bo.BONews;
import controller.NewsController;
import org.junit.Assert;
import org.junit.Test;

public class FP1Test {

    @Test
    public void testFP1() {
        NewsController newController = new NewsController();
        BONews new1 = newController.getNewById("client1", 2);
        BONews new2 = newController.getNewById("client2", 2);
        Assert.assertNotEquals(new1.getNumberOfViews(), new2.getNumberOfViews());
    }
}
