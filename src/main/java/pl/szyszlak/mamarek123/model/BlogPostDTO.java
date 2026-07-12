package pl.szyszlak.mamarek123.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlogPostDTO {
    private Long id;
    private String title;
    private String summary;
}