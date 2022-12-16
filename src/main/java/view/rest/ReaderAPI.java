package view.rest;

import controller.Facade;
import dto.AllCategoriesDTO;
import dto.DTOCategory;
import entity.News;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/rest")
@Produces({ MediaType.APPLICATION_JSON })
public class ReaderAPI {
    DTOCategory fictionCategoryDTO = new DTOCategory(0, "Sport", 200);
    DTOCategory fictionCategory2DTO = new DTOCategory(1, "Games", 200);
    AllCategoriesDTO allCategoriesDTO = new AllCategoriesDTO(Arrays.asList(fictionCategoryDTO, fictionCategory2DTO));

    @GET
    @Path("/category")
    public Response getOneCategory(@QueryParam("ID") String id) {
        DTOCategory categoryDTO = allCategoriesDTO.list.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (categoryDTO == null) {
            return Response.status(404).build();
        }

        return Response.ok().entity(categoryDTO).build();
    }

    @GET
    @Path("/getAllNews")
    public Response getAllNews() {
        List<News> news = Facade.getListOfNews();

        return Response.ok().entity(news).build();
    }

    @GET
    @Path("/getHeaders")
    public Response getHeaders() {
        List<News> news = Facade.getListOfNews();
        List<String> headers = new ArrayList<>();
        news.forEach((s) -> headers.add(s.getHeader()));

        return Response.ok().entity(headers).build();
    }

    @GET
    @Path("/category/all")
    public Response getAllCategory() {
        return Response.ok().entity(allCategoriesDTO).build();
    }


    @GET
    @Path("/getNewsByCategory/{category}")
    public Response getNewsByCategory(@PathParam("category") Long categoryId) {
        List<News> news = Facade.getListOfNews();
        List<News> newNews = new ArrayList<>();
        for (News aNews : news) {
            if(aNews.getCategoryId().equals(categoryId))
                newNews.add(aNews);
        }
        return Response.ok().entity(newNews).build();
    }

}
