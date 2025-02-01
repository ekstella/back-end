package hh.backend.friendform.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import hh.backend.friendform.domain.Friend;

@Controller
public class FriendController {
    
    @RequestMapping(value = {"/add"}, method = RequestMethod.GET)
    public String getFriends(Model model) {
        List<Friend> friends = new ArrayList<>();
        model.addAttribute("friends", friends);
        return "friendlist";
    }

    @GetMapping("/newfriend")
    public String getNewFriendForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "friendform";
    }

    @PostMapping("/savefriend")
    public String saveNewFriend(@ModelAttribute Friend friend, Model model) {
        model.addAttribute("Friend", friend);
        return "result";
    }
}
