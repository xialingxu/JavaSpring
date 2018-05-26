package soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;

@Configuration
//@ComponentScan("soundsystem")
/*@ComponentScan(basePackages = {"soundsystem","video"})*/
@Import(CDConfig.class) /*拆分配置。或者可以重新建立一个Config文件，然后@Import({aconfig.class,bconfig.class})*/
//@ImportResource("classpath:cd-config.xml")
public class CDPlayerConfig {

  /*  @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }*/

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }


}
