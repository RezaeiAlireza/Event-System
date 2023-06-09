package controllers;

import config.RabbitMQConfig;
import com.Event;

import businessLogic.RecommenderService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommenderController {

    private final RecommenderService recommenderService;

    @Autowired
    public RecommenderController(RecommenderService recommenderService) {
        this.recommenderService = recommenderService;
    }

//    @PostMapping("/events")
//    public ResponseEntity<String> newEvent(@RequestBody Event newEvent) {
//        recommenderService.recommendEvent(newEvent);
//        return new ResponseEntity<>("Event processed successfully", HttpStatus.OK);
//    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeNewEventFromQueue(Event newEvent) {
        System.out.println("Message recieved from queue : " + newEvent.getEventId());


        System.out.println(recommenderService.getRecentBookmarks().get(0).getUserId());
    }
}
