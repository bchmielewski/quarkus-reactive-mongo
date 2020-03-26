package pl.itbrains.demo.quarkus;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CovidStatisticsService {
  @Inject
  private ReactiveMongoClient mongoClient;

  public Uni<List<CovidEntry>> covid19Stats() {
    Uni<List<CovidEntry>> stats = mongoClient
        .getDatabase("quarkus-demo")
        .getCollection("covid-19")
        .find()
        .map(document -> new CovidEntry(
            document.getString("Country_Region"),
            document.getString("Confirmed")
        ))
        .collectItems()
        .asList();
    return stats;
  }

}
