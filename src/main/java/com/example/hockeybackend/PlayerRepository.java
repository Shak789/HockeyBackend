package com.example.hockeybackend;

import com.example.hockeybackend.Model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
