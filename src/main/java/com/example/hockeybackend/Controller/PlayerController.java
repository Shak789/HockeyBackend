package com.example.hockeybackend.Controller;

import javax.servlet.http.HttpServletResponse;

import com.example.hockeybackend.Model.Player;
import com.example.hockeybackend.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository repository;

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
}
