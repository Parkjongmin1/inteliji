    //
    // Source code recreated from a .class file by IntelliJ IDEA
    // (powered by FernFlower decompiler)
    //

    package com.jvision.admin.domain.posts;

    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import lombok.Getter;
    import lombok.NoArgsConstructor;

    @Getter
    @Entity
    public class Posts {
        @Id
        @GeneratedValue(
                strategy = GenerationType.IDENTITY
        )
        private long id;
        @Column(
                length = 500,
                nullable = false
        )
        private String title;
        @Column(
                columnDefinition = "TEXT",
                nullable = false
        )
        private String content;
        private String author;

        public Posts(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void update(String title, String content)
        {
            this.title= title;
            this.content=content;
        }

        public static PostsBuilder builder() {
            return new PostsBuilder();
        }

        public long getId() {
            return this.id;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        public Posts() {
        }

        public static class PostsBuilder {
            private String title;
            private String content;
            private String author;

            PostsBuilder() {
            }

            public PostsBuilder title(final String title) {
                this.title = title;
                return this;
            }

            public PostsBuilder content(final String content) {
                this.content = content;
                return this;
            }

            public PostsBuilder author(final String author) {
                this.author = author;
                return this;
            }

            public Posts build() {
                return new Posts(this.title, this.content, this.author);
            }

            public String toString() {
                return "Posts.PostsBuilder(title=" + this.title + ", content=" + this.content + ", author=" + this.author + ")";
            }


        }
    }
