package array;

public class _12_Ex07_irregular {
	public static void main(String[] args) {
		//가변 배열
		int data[][] = new int [3][]; //행 길이만 명시
		data[0] = new int [1];
		data[1] = new int [2];
		data[2] = new int [3];
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}