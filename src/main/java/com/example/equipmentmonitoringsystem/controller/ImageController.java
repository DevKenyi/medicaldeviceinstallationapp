package com.example.equipmentmonitoringsystem.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageController {
    private static final String IMAGE_DIRECTORY = "/src/main/resources/static/images/";


    @GetMapping("/images/{filename:.+}")
    public ResponseEntity<Resource> serveImage(@PathVariable String filename) throws URISyntaxException, MalformedURLException {
        String encodedFilename = URLEncoder.encode(filename, StandardCharsets.UTF_8);
        Path imagePath = Paths.get(IMAGE_DIRECTORY + encodedFilename);
        Resource resourceUrl = UrlResource.from(imagePath.toUri());
        if (resourceUrl.exists() && resourceUrl.isReadable()) {
          return   ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(resourceUrl);
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }
}
