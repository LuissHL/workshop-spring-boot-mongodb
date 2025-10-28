package com.luismerces.workshopmongo.services;

import com.luismerces.workshopmongo.domain.Post;
import com.luismerces.workshopmongo.domain.User;
import com.luismerces.workshopmongo.dto.UserDTO;
import com.luismerces.workshopmongo.repository.PostRepository;
import com.luismerces.workshopmongo.repository.UserRepository;
import com.luismerces.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public Post findById(String id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return postRepository.findByTitleContainingIgnoreCase(text);
    }
}
