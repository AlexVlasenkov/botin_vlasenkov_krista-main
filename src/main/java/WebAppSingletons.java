import view.rest.AuthorAPI;
import view.rest.ReaderAPI;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;
public class WebAppSingletons extends Application {

    private Set<Object> singletons = new HashSet<>();

    public WebAppSingletons() {
        singletons.add(new ReaderAPI());
        singletons.add(new AuthorAPI());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
