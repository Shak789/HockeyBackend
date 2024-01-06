package com.example.hockeybackend.Repository;

import com.example.hockeybackend.Model.Player;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class SearchRepositoryImplementation implements SearchRepository {

    @Autowired
    MongoClient client;
    @Autowired
    MongoConverter convert;

    @Override
    public List<Player> searchItem(String item) {

        final List<Player> players = new ArrayList<>();

        MongoDatabase database = client.getDatabase("ShakHockey");
        MongoCollection<Document> collection = database.getCollection("PlayerData");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                new Document("index", "default")
                        .append("text",
                                new Document("query", item)
                                        .append("path", Arrays.asList("firstName", "lastName", "position", "nationality", "team"))))));

        result.forEach(doc -> players.add(convert.read(Player.class,doc)));
        return players;
    }
}
