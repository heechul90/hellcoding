package heech.hellcoding.spring.basic.scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Provider;

import static org.assertj.core.api.Assertions.*;


public class PrototypeProviderTest {

    @Test
    void providerTest() {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ClientBean.class, PrototypeBean.class);

        ClientBean clientBean1 = ac.getBean(ClientBean.class);
        int count1 = clientBean1.logic();
        assertThat(count1).isEqualTo(1);

        ClientBean clientBean2 = ac.getBean(ClientBean.class);
        int count2 = clientBean2.logic();
        assertThat(count2).isEqualTo(1);
    }

    static class ClientBean {

        //싱글톤 빈이 프로토타입을 사용할 때 마다 스프링 컨테이너에서 새로 요청
        /*private final ApplicationContext ac;

        @Autowired
        public ClientBean(ApplicationContext ac) {
            this.ac = ac;
        }*/

        //ObjectFactory, ObjectProvider 사용
        /*private final ObjectProvider<PrototypeBean> provider;

        @Autowired
        public ClientBean(ObjectProvider<PrototypeBean> provider) {
            this.provider = provider;
        }*/

        private final Provider<PrototypeBean> provider;

        @Autowired
        public ClientBean(Provider<PrototypeBean> provider) {
            this.provider = provider;
        }

        public int logic() {
            PrototypeBean prototypeBean = provider.get();
            prototypeBean.addCount();
            return prototypeBean.getCount();
        }
    }

    @Scope("prototype")
    static class PrototypeBean {

        private int count = 0;

        public void addCount() {
            count++;
        }

        public int getCount() {
            return count;
        }

        @PostConstruct
        public void init() {
            System.out.println("PrototypeBean.init");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("PrototypeBean.destroy");
        }
    }
}
