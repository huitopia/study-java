package ch19.sec00.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
    public static void main(String[] args) {
        //response
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            Socket socket = serverSocket.accept();
            try (socket) {
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw);
                try (os; osw; bw; pw;) {
                    // 본문
                    String body = """
                            <html>
                                <head>
                                    <title>직접 만든 HTML 코드</title>
                                </head>
                                <body>
                                    <h1>처음부터 만들어 본 SERVER</h1>
                                    <p>개 힘들다</p>
                                    <ul>
                                        <li>심플리 키친</li>
                                        <li>모미지 식당</li>
                                        <li>서브웨이</li>
                                    </ul>
                                </body>
                            </html>
                            """;

                    // 첫 번째 줄 : status
                    pw.println("HTTP/1.1 200 OK");

                    // 두 번째 줄 : header
                    pw.println("content-type: text/html; charset=utf-8");
                    pw.println("content-length: " + body.getBytes().length);

                    pw.println();
                    // 세 번째 줄 : HTML body
                    pw.println(body);
                    pw.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
