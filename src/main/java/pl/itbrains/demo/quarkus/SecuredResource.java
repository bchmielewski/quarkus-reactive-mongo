package pl.itbrains.demo.quarkus;

import io.quarkus.oidc.IdToken;
import org.eclipse.microprofile.jwt.JsonWebToken;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class SecuredResource {
  @Inject
  @IdToken
  JsonWebToken idToken;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    String subject = idToken.getSubject();
    String email = idToken.getClaim("email");
    return "Secured. Subject: " + subject + " with email: " + email;
  }
}