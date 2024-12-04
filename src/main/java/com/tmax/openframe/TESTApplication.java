package com.tmax.openframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.cache.annotation.EnableCaching;

@Import(com.tmax.openframe.OpenFrameOnlineConfig.class)
@SpringBootApplication
@EnableCaching
public class TESTApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(TESTApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(TESTApplication.class);
  }
}

