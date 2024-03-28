package ch18.sec00.exam;

import java.io.*;

public class Test10 {
    public static void main(String[] args) throws IOException {
        // 파일 경로 입력 받아야함
        InputStream keyboard = System.in;
        InputStreamReader isr = new InputStreamReader(keyboard);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("원본 파일 경로: ");
        String path = br.readLine();
        System.out.print("복사 파일 경로: ");
        String copyPath = br.readLine();
        
        isr.close();
        br.close();

        File file = new File(path);
        File copyFile = new File(copyPath);
        // 원본 파일이 존재하지 않을 경우 "원본 파일이 존재하지 않습니다" 출력
        if (!file.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        } else {
            // 복사 파일 경로에 디렉토리 없으면 copyPath 받은 값 기준으로
            if (!copyFile.exists()) {
                // file 상위 경로의 폴더 전부 생성
                String parent = copyFile.getParent();
                copyFile = new File(parent);
                copyFile.mkdirs();
            }
            // 파일 복사
            InputStream is = new FileInputStream(path);
            OutputStream os = new FileOutputStream(copyPath);

            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                os.write(data, 0, num);
            }
            os.flush();
            os.close();
            is.close();
            // 복사가 성공되었을 때 "복사가 성공되었습니다" 출력
            System.out.println("복사가 성공되었습니다.");
        }
    }
}
