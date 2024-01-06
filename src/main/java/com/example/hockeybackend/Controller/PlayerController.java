package com.example.hockeybackend.Controller;

import javax.servlet.http.HttpServletResponse;

import com.example.hockeybackend.Model.Player;
import com.example.hockeybackend.Repository.PlayerRepository;
import com.example.hockeybackend.Repository.SearchRepository;
import com.example.hockeybackend.Repository.SortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository repository;
    @Autowired
    SearchRepository searchrepo;
    @Autowired
    SortRepository sortrepo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect(" /swagger-ui.html");
    }

    @GetMapping("/players")
    public List<Player> getPlayerData() {
        return repository.findAll();
    }

    @PostMapping("/player")
    public Player addPlayerData(@RequestBody Player player) {
        return repository.save(player);
    }


    @DeleteMapping("/{id}")
    public Player deletePlayer(@PathVariable String id) {
        Player player = repository.findById(id).orElse(null);

        if (player != null) {
            repository.deleteById(id);
            return player;
        } else {
            return null;
        }
    }

    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable String id, @RequestBody Player updatedPlayer) {
        Player existingPlayer = repository.findById(id).orElse(null);

        if (existingPlayer != null) {
            existingPlayer.setFirstName(updatedPlayer.getFirstName());
            existingPlayer.setLastName(updatedPlayer.getLastName());
            existingPlayer.setPosition(updatedPlayer.getPosition());
            existingPlayer.setJerseyNumber(updatedPlayer.getJerseyNumber());
            existingPlayer.setBirthDate(updatedPlayer.getBirthDate());
            existingPlayer.setNationality(updatedPlayer.getNationality());
            existingPlayer.setHeight(updatedPlayer.getHeight());
            existingPlayer.setWeight(updatedPlayer.getWeight());
            existingPlayer.setTeam(updatedPlayer.getTeam());
            existingPlayer.setInjured(updatedPlayer.isInjured());
            existingPlayer.setStatistics(updatedPlayer.getStatistics());
            return repository.save(existingPlayer);
        } else {
            return null;
        }
    }

    @GetMapping("/players/search/{item}")
    public List<Player> Search(@PathVariable String item) {
        return searchrepo.searchItem(item);
    }

    @GetMapping("/players/sort/{entry}")
    public List<Player> Sort(@PathVariable String entry) {
        return sortrepo.sortItem(entry);
    }
}
