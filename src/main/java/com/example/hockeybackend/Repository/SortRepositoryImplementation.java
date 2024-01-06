package com.example.hockeybackend.Repository;

import com.example.hockeybackend.Model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class SortRepositoryImplementation implements SortRepository {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public SortRepositoryImplementation(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Player> sortItem(String entry) {
        Query query = new Query();

        switch (entry.toLowerCase()) {
            case "gamesplayed":
                query.with(Sort.by(Sort.Order.desc("statistics.gamesPlayed")));
                break;

            case "goals":
                query.with(Sort.by(Sort.Order.desc("statistics.goals")));
                break;

            case "assists":
                query.with(Sort.by(Sort.Order.desc("statistics.assists")));
                break;

            case "points":
                query.with(Sort.by(Sort.Order.desc("statistics.points")));
                break;

            case "saves":
                query.with(Sort.by(Sort.Order.desc("statistics.saves")));
                break;

            case "savePercentage":
                query.with(Sort.by(Sort.Order.desc("statistics.savePercentage")));
                break;

            default:
                break;
        }

        return mongoTemplate.find(query, Player.class);
    }
}
