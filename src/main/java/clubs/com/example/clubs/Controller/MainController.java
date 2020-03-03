package clubs.com.example.clubs.Controller;


import clubs.com.example.clubs.Entity.Club;
import clubs.com.example.clubs.Entity.Users;
import clubs.com.example.clubs.Repository.*;
import org.atmosphere.config.service.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Collection;


@RestController
@RequestMapping("/api")
@Component
public class MainController {

    public MainController(){
    }

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private ClubUserRepository clubUserRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private EventClubRepository eventClubRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventUserRepository eventUserRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    private UniversityClubRepository universityClubRepository;

    @Autowired
    private UsersRepository usersRepository;

    @PostConstruct
    public void init(){
    }



}




























