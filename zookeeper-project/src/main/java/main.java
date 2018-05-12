import org.I0Itec.zkclient.ZkClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class main implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String path="/zhuohua/com.qyf.IstudentService/nodes/node1";
        String path1="/zhuohua/com.qyf.IstudentService/nodes/node2";
        ZkClient zkClient = new ZkClient("localhost:2181", 10000);
        zkClient.createPersistent(path, true);
        zkClient.writeData(path, "{\"ip\":\"192.168.1.100\",\"port\":\"8000\"}");
        zkClient.createPersistent(path1, true);
        zkClient.writeData(path1, "{\"ip\":\"192.168.1.101\",\"port\":\"8001\"}");
        zkClient.close();
        System.in.read();
    }
}
