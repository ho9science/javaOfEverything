package io.pro.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JustTest {

	@Test
	public void execute() {
		String s = "baabaa";
		String result = test(s);
		System.out.println(result.equals("") ? 1 : 0);
	}

	private String test(String s) {
		System.out.println(s);
		char temp = '1';
		char[] list = s.toCharArray();
		List<Character> chars = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

		for (int i = 0; i < list.length; i++) {
			if (list[i] == temp) {
				chars.remove(i);
				chars.remove(i - 1);
				return test(chars.stream().map(Object::toString).collect(Collectors.joining()));
			} else {
				temp = list[i];
			}
		}
//		for(int i =0; i<s.length();i++){
//			if(s.charAt(i)==temp){
//				System.out.println(s.charAt(i)+"\t"+i);
//				String target = String.valueOf(s.charAt(s.indexOf(temp)));
//				s = s.replaceFirst(target+target, "");
//				System.out.println(s);
//				return test(s);
//			}else{
//				temp=s.charAt(i);
//			}
//		}
		return s;
	}

	@Test
	public void test2() {
		int nums[] = {0, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6};
		int limit = nums.length / 2;
		Integer[] changedNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		int answer = 0;
		List<Integer> list = Arrays.asList(changedNums);
		Map<Integer, Integer> result = list.stream().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));
		if (result.size() > limit) {
			answer = limit;
		} else {
			answer = result.size();
		}
		System.out.println(answer);

	}

	@Test
	public void solution() {
		int m = 4;
		int n = 5;
		String[] board = new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}; //14
//		int m =6;
//		int n =6;
//		String[] board = new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"} //15
		int answer = 0;
		String[][] matrix = createMatrix(m, n, board);
		Map<Coordinate, Boolean> temp = find2x2(m, n, matrix);
		matrix = delete2x2(temp, matrix);
		printMatrix(m, n, matrix);
		System.out.println(answer);
	}

	private String[][] createMatrix(int m, int n, String[] board) {
		String[][] matrix = new String[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = String.valueOf(board[i].charAt(j));
			}
		}
		return matrix;
	}

	private Map<Coordinate, Boolean> find2x2(int m, int n, String[][] matrix) {
		Map<Coordinate, Boolean> temp = new HashMap<>();
		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				String target = matrix[i][j];
				if (target.equals(matrix[i][j + 1]) && target.equals(matrix[i + 1][j]) && target.equals(matrix[i + 1][j + 1])) {
					Coordinate coordinate = new Coordinate(i,j);
					temp.putIfAbsent(coordinate, true);
				}
			}
		}
		return temp;
	}

	private String[][] delete2x2(Map<Coordinate, Boolean> temp, String[][] matrix){
		for(Coordinate coordinate : temp.keySet()){
			Integer m = coordinate.getM();
			Integer n = coordinate.getN();
			matrix[m][n] = "0";
			matrix[m][n + 1] = "0";
			matrix[m + 1][n] = "0";
			matrix[m + 1][n + 1] = "0";
		}
		return matrix;
	}

	private String[][] reconstructMatrix(String[][] matrix){
		return null;
	}

	private void printMatrix(int m, int n, String[][] matrix){
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	class Coordinate{
		private Integer m;
		private Integer n;
		public Coordinate(Integer m, Integer n){
			this.m = m;
			this.n = n;
		}
		public Integer getM(){
			return this.m;
		}
		public Integer getN(){
			return this.n;
		}
	}

}

