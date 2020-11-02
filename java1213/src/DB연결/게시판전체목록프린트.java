package DB연결;

import java.util.ArrayList;

public class 게시판전체목록프린트 {

	public static void main(String[] args) throws Exception{
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsDTO> list = dao.all();
		System.out.println("게시판의 개수 : " + list.size() + "개");
		for (int i = 0; i < list.size(); i++) {
			BbsDTO dto = list.get(i);
			System.out.println("No : " + dto.getNo());
			System.out.println("Title : " +dto.getTitle());
			System.out.println("Content : " + dto.getContent());
			System.out.println("Wruter : " + dto.getWriter());
			System.out.println();
		}
	}

}
