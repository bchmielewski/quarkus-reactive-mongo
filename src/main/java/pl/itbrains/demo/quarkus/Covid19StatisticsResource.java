package pl.itbrains.demo.quarkus;

import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/covid-19")
public class Covid19StatisticsResource {
  @Inject
  private CovidStatisticsService covidStatisticsService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Uni<List<CovidEntry>> stats() {
    return covidStatisticsService.covid19Stats();
  }
}
