package 배열응용;

public class 문제7 {

	public static void main(String[] args) {
		String[] 과목 = { "국어", "수학", "과학", "컴퓨터", "영어" };
		for (int i = 0; i < 과목.length; i++) {
			System.out.print(과목[i] + "\t");
		}
		//과목 배열로 5개를 적어넣고 과목을 반복해서 length까지 출력
		System.out.print("\n");
		int[] first = { 100, 99, 77, 87, 66 };
		for (int i = 0; i < first.length; i++) {
			System.out.print(first[i] + "\t");
		}
		//1학기 변수명을 first로 정하고 적어 넣은 후 배열출력
		System.out.println();
		int[] second = first.clone();
		second[2] = 44;
		second[4] = 55;
		for (int i = 0; i < second.length; i++) {
			System.out.print(second[i] + "\t");
		}
		//2학기 변수명을 second로 정하고 적어 넣은 후 배열출력
		System.out.print("\n");
		int count = 0;
		for (int i = 0; i < second.length; i++) {
			if (first[i] != second[i]) {
				count++;
			}
		}
		System.out.println("변경된 과목 수는 " + count);
		//count 초기값 지정 후 1학기와 2학기 배열이 같지않은 것을 count++;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < second.length; i++) {
			sum1 = sum1 + first[i];
			sum2 = sum2 + second[i];
		}
		if (sum1/5 > sum2/5) {
			System.out.println("평균이 더 높은 학기는  1학기");
		} else {
			System.out.println("평균이 더 높은 학기는  2학기");
		}
		//새로운 변수 sum1과 sum2에 초기값 지정 후 반복문을 통해 합계 저장
		//각 값을 5로 나눈 값을 비교하여 크다면 해당 문장을 출력하고
		//아니라면 다른 문장을 출력하도록 세팅
		System.out.print("점수가 변경된 과목명은: ");
		for (int j = 0; j < second.length; j++) {
			if (!(first[j] == second[j])) {
				System.out.print(과목[j]+" ");
			}
		}
		//1학기배열과 2학기배열을 비교하여 같지 않은 경우 해당 배열을 출력
	}

}
