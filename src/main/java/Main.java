import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.Configuration;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;

public class Main {

    public static void main(String[] args){
        Configuration configuration = new ConfigurationBuilder().maxRetries(2).build();
        RemoteCacheManager remoteCacheManager = new RemoteCacheManager(configuration);
    }

}
