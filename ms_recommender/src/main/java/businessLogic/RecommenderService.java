package businessLogic;

import com.Bookmark;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@Service
public class RecommenderService {

    private final WebClient webClient;

    public RecommenderService() {
        this.webClient = WebClient.create(); // Or use WebClient.builder().baseUrl("http://localhost:3004").build()
    }

    public List<Bookmark> getRecentBookmarks() {
        return webClient.get()
                .uri("http://localhost:3004/recentBookmarks")
                .retrieve()
                .bodyToFlux(Bookmark.class)
                .collectList()
                .block(); // Be careful, as this is a blocking call
    }

}
