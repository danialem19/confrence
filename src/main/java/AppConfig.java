import com.pluralsight.repository.HibernateSpeakerRepostiroyImpl;
import com.pluralsight.repository.SpeakerRepostiroy;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
       // service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepostiroy getSpeakerRepository(){
        return new HibernateSpeakerRepostiroyImpl();
    }
}
