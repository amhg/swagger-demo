package es.usoar.tutorials.micronaut.swagger;


import io.micronaut.core.io.ResourceResolver;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.Hidden;
import io.micronaut.views.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Hidden
@Controller("/api")
@Validated
public class SwaggerController {
  Logger log = LoggerFactory.getLogger(SwaggerController.class);

  @Inject
  SwaggerConfig config;

  @Inject
  ResourceResolver resolver;

  @View("swagger/index")
  @Get
  public SwaggerConfig index() {
    log.info("Trying to render swagger-view");
    return config;
  }

}
