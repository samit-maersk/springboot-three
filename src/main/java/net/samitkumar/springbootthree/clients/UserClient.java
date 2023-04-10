package net.samitkumar.springbootthree.clients;

import net.samitkumar.springbootthree.models.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@HttpExchange(url = "/users", accept = MediaType.APPLICATION_JSON_VALUE, contentType = MediaType.APPLICATION_JSON_VALUE)
public interface UserClient {
    @GetExchange("")
    Flux<User> getAll();

    @GetExchange("/{id}")
    Mono<User> getById(@PathVariable("id") String id);
}
