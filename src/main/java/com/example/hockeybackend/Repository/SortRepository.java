package com.example.hockeybackend.Repository;

import com.example.hockeybackend.Model.Player;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SortRepository {

    List<Player> sortItem(String entry);
}
