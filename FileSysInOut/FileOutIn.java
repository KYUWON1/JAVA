package FileSysInOut;// Java 프로그래밍 - 입출력_2

import java.io.*;

public class FileOutIn {

    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter(".memo.txt");//파일명
        String memo = "헤드라인\n";
        fw.write(memo); //파일에 쓰기

        memo = "자바자바\n";
        fw.write(memo);

        fw.close(); //완료시 항상 닫아줘여함

//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo.txt");
        memo = "헤드 라인";
        pw.println(memo);

        memo = "자바자바\n";
        pw.println(memo);

        pw.close();

//      파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt",true);
        memo = "파일라이터 짱짱\n";
        fw2.write(memo);
        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt",true));

        memo = "프린터라이터";
        pw2.println(memo);

        pw2.close();

//      2. 파일 입력
        // 파일 읽어와서 출력하기
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));
        while(true){
            String line = br.readLine();

            if(line == null)
                break;

            System.out.println(line);
        }
        br.close();



    }
}
