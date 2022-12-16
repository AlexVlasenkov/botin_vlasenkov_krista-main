package view.rest;

import bo.BONews;
import controller.Facade;
import entity.Categories;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/rest")
public class AuthorAPI {

    @GET
    @Path("/createNew/{jsonNew}")
    public Response createNewsObject(@PathParam("jsonNew") String jsonObject) {
        BONews newsBO = new BONews();
        Facade.createBONews(newsBO);

        return Response.ok().entity(newsBO).build();
    }

    @GET
    @Path("/getCategories")
    public Response getCategories() {
        List<Categories> listOfCategories = Facade.getCategories();

        return Response.ok().entity(listOfCategories).build();
    }

    @GET
    @Path("/updateNew/{jsonNew}")
    public Response updateNewsObject(@PathParam("jsonNew") String jsonObject) {
        BONews newsBO = new BONews();
        Facade.createBONews(newsBO);

        return Response.ok().entity(newsBO).build();
    }

    @GET
    @Path("/deleteNewById/{new_id}")
    public Response deleteNewById(@PathParam("new_id") Integer IDOfNews) {
        boolean isDeleted = Facade.deleteNewsByID(IDOfNews);

        return Response.ok(isDeleted).build();
    }
}
