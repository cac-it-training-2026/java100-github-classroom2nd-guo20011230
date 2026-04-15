package lesson03.challenge01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("探検隊の隊員を5名募集します。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {

			System.out.print("応募する人の名前を入れてください＞");

			String name = br.readLine();
			System.out.println("\n隊長：");
			System.out.println(name + "さん合格！\n");
		}

		System.out.println("定員に達しました。募集を締め切ります。");
