package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

public class 파일로저장 {

	public void save(ArrayList<Day> list) {
		// 외부에서 데이터를 받아서 파일로 저장
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			Day day = list.get(i);
			System.out.println("전달된 일과 : " + day);
			System.out.println("--------------------");
			// 파일로 저장할 예정 -> 예외처리
			try {
				// 파일을 만들어서 저장하는 부품
				FileWriter w = new FileWriter(i + ".txt");
				w.write(day.doing + "\n");
				w.write(day.time + "\n");
				w.write(day.location + "\n");
				w.close();

			} catch (Exception e) {
				// try 내에 있는 코드 에서 에러가 발생했을 때, 대응 처리
				System.out.println("파일로 저장하다 에러가 발생함");
			}
		}

	}

}
