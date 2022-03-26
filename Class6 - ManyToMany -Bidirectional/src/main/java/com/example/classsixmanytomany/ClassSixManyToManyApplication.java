package com.example.classsixmanytomany;

import com.example.classsixmanytomany.models.Stream;
import com.example.classsixmanytomany.models.Viewer;
import com.example.classsixmanytomany.repository.StreamRepository;
import com.example.classsixmanytomany.repository.ViewerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ClassSixManyToManyApplication {

    public static void main(String[] args) {
        var appContext = SpringApplication.run(ClassSixManyToManyApplication.class, args);

        var streamRepository = appContext.getBean(StreamRepository.class);
        var viewerRepository = appContext.getBean(ViewerRepository.class);

        var stream = new Stream();
        var stream2 = new Stream();
        var viewer = new Viewer();
        var viewer2 = new Viewer();

        viewer.setNickName("hypercupe");
        viewer2.setNickName("alicanli1995");

        stream.setName("ATV");
        stream2.setName("SHOW");

        var viewers = Arrays.asList(viewer,viewer2);
        var streams = Arrays.asList(stream,stream2);

        streamRepository.saveAll(streams);

        viewer.followStream(stream);
        viewer2.followStream(stream2);

        viewerRepository.saveAll(viewers);


    }

}
