package exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.Comment;
import entities.Post;

public class Exercicio01 {
     public static void main(String[] args) {
          List<Post> posts = new ArrayList<>();
          List<Comment> comments1 = new ArrayList<>();
          List<Comment> comments2 = new ArrayList<>();
          DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
          Comment comment1 = new Comment("Have a nice trip");
          Comment comment2 = new Comment("Wow that`s awesome!");

          Comment comment3 = new Comment("Good night");
          Comment comment4 = new Comment("May the Force be with you");
          comments1.add(comment1);
          comments1.add(comment2);

          comments2.add(comment3);
          comments2.add(comment4);

          Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dft), "Traveling to New Zealand",
                    "I'm going to visit this wonderful country!", 12, comments1);
          Post post2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", dft), "Good night guys",
                    "See you tommorrow", 5, comments2);

          posts.add(post1);
          posts.add(post2);

          for (Post p : posts) {
               System.out.println(p);
          }

     }
}
