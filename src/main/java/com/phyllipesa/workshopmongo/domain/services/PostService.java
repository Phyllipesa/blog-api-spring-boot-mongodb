package com.phyllipesa.workshopmongo.domain.services;

import com.phyllipesa.workshopmongo.domain.entities.Post;
import com.phyllipesa.workshopmongo.domain.repository.PostRepository;
import com.phyllipesa.workshopmongo.domain.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
  @Autowired
  private PostRepository postRepository;

  public Post findById(String id) {
    Optional<Post> post = postRepository.findById(id);

    if (post.isEmpty()) {
      throw new ObjectNotFoundException("Objeto não encontrado");
    }
    return post.get();
  }

  public List<Post> findByTitle(String text) {
    return postRepository.searchTitle(text);
  }

  public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
    maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
    return postRepository.fullSearch(text, minDate, maxDate);
  }
}
