package org.javafeatures.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static java.lang.System.out;

/**
 * Introduced in Java 9
 * With Java 11, now HttpClient is a standard. It is recommended to use instead of other
 * HTTP Client APIs like Apache Http Client API.
 */
public class HttpClientApiTester {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://www.google.com"))
                    .build();
            HttpResponse<String> response = httpClient.send(request,
                    HttpResponse.BodyHandlers.ofString());

            out.println("Status code: " + response.statusCode());
            out.println("Headers: " + response.headers().allValues("content-type"));
            out.println("Body: " + response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
