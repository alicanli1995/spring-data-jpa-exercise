package com.example.classsixmanytomany.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "viewer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamicUpdate
public class Viewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickName;

    @ManyToMany
    @JoinTable(
            name = "followed_streams",
            joinColumns = @JoinColumn(name = "viwer_id"),
            inverseJoinColumns = @JoinColumn(name = "stream_id")
    )
    private List<Stream> followedStreams = new ArrayList<>();

    public void followStream(Stream stream){
        followedStreams.add(stream);
    }

}
