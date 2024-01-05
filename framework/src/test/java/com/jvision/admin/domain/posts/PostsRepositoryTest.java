package com.jvision.admin.domain.posts;

import com.jvision.admin.web.dto.PostsUpdateRequestDto;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @After(value = "")
    public void cleanup()
    {
        postsRepository.deleteAll();
    }
    @Test
    public void 게시글저장_불러오기(){
        String title ="테스트 게시글";
        String content="테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("qwq3350@naver.com")
                .build());

        List<Posts> postsList=postsRepository.findAll();
        Posts posts=postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }


}
