package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.douzone.springcontainer.videosystem.Index;



@Configuration
@ComponentScan( basePackages="com.douzone.springcontainer.soundsystem")
//@ComponentScan( basePackages= {"com.douzone.springcontainer.soundsystem", "com.douzone.springcontainer.videosystem"})
// Error!!
// basePackageClasses에 지정한 클래스가 속한 패키지를 Base Package로 사용한다.
//@ComponentScan( basePackageClasses=Index.class)
public class CDPlayerConfig {
}