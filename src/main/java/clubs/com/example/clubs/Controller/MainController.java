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

    public MainController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public MainController(ClubUserRepository clubUserRepository){
        this.clubUserRepository = clubUserRepository;
    }

    public MainController(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public MainController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public MainController(EventClubRepository eventClubRepository) {
        this.eventClubRepository = eventClubRepository;
    }

    public MainController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public MainController(EventUserRepository eventUserRepository) {
        this.eventUserRepository = eventUserRepository;
    }

    public MainController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public MainController(UniversityClubRepository universityClubRepository){
        this.universityClubRepository = universityClubRepository;
    }

    public MainController(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }
    public MainController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

}




























