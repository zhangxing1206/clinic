package cn;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.jupiter.api.Test;

public class ConfigToolTest {
    @SuppressWarnings("static-access")
    @Test
    public  void test1() throws Exception{
        ConfigTools configTools=new ConfigTools();
        String password="root";
        String[] arr=configTools.genKeyPair(512);
        System.out.println("privatekey:"+arr[0]);
        System.out.println("publickey:"+arr[1]);
        String encryptPassword=configTools.encrypt(arr[0],password);
        System.out.println("password:"+encryptPassword);
//        System.out.println("解密"+configTools.encrypt(arr[1],encryptPassword));

    }


}
