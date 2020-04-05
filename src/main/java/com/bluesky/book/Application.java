package com.bluesky.book;

import com.bluesky.book.domain.posts.Posts;
import com.bluesky.book.domain.posts.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {

//    @Autowired
//    PostsRepository postsRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Test Data 생성
//    @PostConstruct
//    public void init() {
//        for(int i=0; i<20; i++) {
//            Posts posts = Posts.builder()
//                    .title("TestTitle[" + String.valueOf(i) + "]")
//                    .content("TestContent[" + String.valueOf(i) + "]")
//                    .author("hoseong")
//                    .build();
//
//            postsRepository.save(posts);
//        }
//
//    }
}
