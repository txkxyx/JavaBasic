# JavaBasic

package com.amazonaws.samples;

import java.nio.ByteBuffer;
import java.util.List;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.iotdata.AWSIotData;
import com.amazonaws.services.iotdata.AWSIotDataClientBuilder;
import com.amazonaws.services.iotdata.model.PublishRequest;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;

public class AWSSample {
	
	static String ACCESSKEY = "";
	static String SECLETKEY = "";
	static BasicAWSCredentials awsCredentials = new BasicAWSCredentials(ACCESSKEY, SECLETKEY);
	
	public static void main(String[] args) {
		publishIoT();
	}
	
	static void publishIoT(){
		System.out.println("start publish");
		AWSIotData awsIotData = AWSIotDataClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).withEndpointConfiguration(new EndpointConfiguration("a2hwy65nxmcsqb.iot.ap-northeast-1.amazonaws.com", "ap-northeast-1")).build();
		PublishRequest publishRequest = new PublishRequest();
		ByteBuffer buffer = ByteBuffer.allocate(128);
		buffer.putInt(12345);
		publishRequest.setQos(1);
		publishRequest.setPayload(buffer);
		publishRequest.setTopic("test/test");
		
		awsIotData.publish(publishRequest);
		
	}
	
	static void S3(String bucket_name){
		AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(Regions.AP_NORTHEAST_1).withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
		//create bucket
		Bucket bucket = null;
		if(s3.doesBucketExistV2("")){
			System.out.format("Bucket %s already exists.\n", bucket_name);
		}else{
			try{
				bucket = s3.createBucket(bucket_name);
				System.out.println(bucket_name);
			}catch (AmazonS3Exception e) {
				System.err.println(e.getErrorMessage());
			}
		}
		
		//get bucket
		List<Bucket> buckets = s3.listBuckets();
		System.out.println("Your Amazon S3 buckets are:");
		for (Bucket b : buckets) {
		    System.out.println("* " + b.getName());
		}
		
		//putObject
		try{
			s3.putObject(bucket_name, "", arg2)
		}
	}
	
	
	

}
