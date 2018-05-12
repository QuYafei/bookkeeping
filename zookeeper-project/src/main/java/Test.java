import org.I0Itec.zkclient.ZkClient;

public class Test {
    public static void main(String[] args) {
        ZkClient zkClient = new ZkClient("localhost:2181",10000);
//        boolean isExists = zkClient.exists("/zhuohua/com.qyf.IstudentService/nodes");
//        if (isExists){
//            int size = zkClient.getChildren("/zhuohua/com.qyf.IstudentService/nodes").size();
//            Random random = new Random();
//            int nodeNum = random.nextInt(size);
//            if (nodeNum == 0){
//                nodeNum = 1;
//            }else if (nodeNum >= size){
//                nodeNum = size;
//            }
//            String name = zkClient.readData("/zhuohua/com.qyf.IstudentService/nodes/node"+nodeNum);
//            System.out.println(name);
//        }
//        zkClient.subscribeChildChanges("/zk",)
    }
}
