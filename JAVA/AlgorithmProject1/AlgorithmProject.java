package algorithmProject;

import java.util.Scanner;

public class AlgorithmProject {

	public static void main(String[] args) {

		AlgorithmProject at = new AlgorithmProject();
		at.start();
	}

	public void swap(int[] a, int idx, int idx1) {
		int t = a[idx];
		a[idx] = a[idx1];
		a[idx1] = t;
	}

	public void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];

		while (pl <= pr) {
			while (a[pl] > x)
				pl++;
			while (a[pr] < x)
				pr--;
			if (pr <= pr)
				swap(a, pl++, pr--);
		}

		if (left < pr)
			quickSort(a, left, pr);
		if (pl < right)
			quickSort(a, pl, right);
	}

	public void start() {
		System.out.print("학생 수 입력 : ");
		Scanner scan1 = new Scanner(System.in);
		int person = scan1.nextInt();
		System.out.println();
		int[] score = new int[person];
		for (int i = 0; i < score.length; i++) {
			System.out.print("학생 " + (i + 1) + " 점수 입력 : ");
			Scanner scan2 = new Scanner(System.in);
			score[i] = scan2.nextInt();
		}
		System.out.println();
		quickSort(score, 0, person - 1);
		System.out.println("성적 순으로 정렬");
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "등 : " + score[i]);
		}
	}
}