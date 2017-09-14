package net.moopa3376.cc.common.aliyun.oss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import net.moopa3376.cc.common.config.ConfigCenterConfigs;

import java.io.ByteArrayInputStream;

/**
 * Created by Moopa on 04/06/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
public class OssFileWrapper {
    private static String fileServerAddress = ConfigCenterConfigs.get("img.server",null);
    private static String id = "LTAIwqKNw5ucqahI";
    private static String secret = "XC90Ic90YaFtQccSUG4faVOYnDdEAM";
    private static String bucketName = "iucl-oss";

    public static boolean isFileExist(String key){
        try {
            // endpoint以杭州为例，其它region请按实际情况填写
            String endpoint = "http://oss-cn-shanghai.aliyuncs.com";

            // 创建OSSClient实例
            OSSClient ossClient = new OSSClient(endpoint, id, secret);

            // 检测文件是否存在
            return ossClient.doesObjectExist(bucketName,key);

        }catch (Exception e){
            return false;
        }
    }

    public static int uploadFile(byte[] bytes,String key){
        try {
            // endpoint以杭州为例，其它region请按实际情况填写
            String endpoint = "http://oss-cn-shanghai.aliyuncs.com";

            // 创建OSSClient实例
            OSSClient ossClient = new OSSClient(endpoint, id, secret);

            //upload
            PutObjectResult putObjectResult = ossClient.putObject(bucketName,key,new ByteArrayInputStream(bytes));

            ossClient.shutdown();

        }catch (Exception e){
            return -1;
        }
        return 1;
    }
}
