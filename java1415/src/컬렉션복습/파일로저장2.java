package 컬렉션복습;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class 파일로저장2 {
	public void save2(ArrayList<계좌> list) {
		
		for (int i = 0; i < list.size(); i++) {
			계좌 account = list.get(i);
			try {
				FileWriter w = new FileWriter(account.name + ".txt");
				w.write(account.name + "\n");
				w.write(account.field + "\n");
				w.write(account.money + "\n");
				w.close();
			} catch (IOException e) {
				System.out.println("error");
			}

		}
	}
}
