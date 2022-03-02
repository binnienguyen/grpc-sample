package vn.vnpay.grpcsample.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8090)
                .addService(new HelloServiceImpl()).build();

        System.out.println("Starting server.....");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
}
