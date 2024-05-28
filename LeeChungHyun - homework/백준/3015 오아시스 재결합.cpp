//오아시스의 재결합 공연에 N명이 한 줄로 서서 기다리고 있다.
//
//이 역사적인 순간을 맞이하기 위해 줄에서서 기다리고 있던 백준이는 
// 갑자기 자기가 볼 수 있는 사람의 수가 궁금해 졌다.
//
//두 사람 A와 B가 서로 볼 수 있으려면, 두 사람 사이에 A 또는 B보다 키가 큰 사람이 없어야 한다.
//
//줄에 서있는 사람의 키가 주어졌을 때, 서로 볼 수 있는 쌍의 수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 줄에서 기다리고 있는 사람의 수 N이 주어진다. (1 ≤ N ≤ 500, 000)
//
//둘째 줄부터 N개의 줄에는 각 사람의 키가 나노미터 단위로 주어진다.모든 사람의 키는 231 나노미터 보다 작다.
//
//사람들이 서 있는 순서대로 입력이 주어진다.
//
//출력
//서로 볼 수 있는 쌍의 수를 출력한다.

#include<iostream>
#include<stack>
using namespace std;

void input();
void search_pair();

int N;

// 키 저장
int h[500001];

// 페어수
long long p = 0;

// 문제를 위한 스택, 첫 인자는 키, 둘째 인자는 연속해서 중복해서 나오는 개수
stack<pair<int, int>> s;

void input() {
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> h[i];
	}
}

void search_pair() {

	for (int i = 1; i <= N; i++) {

		while (!s.empty() && s.top().first < h[i]) {
			p += s.top().second;
			s.pop();
		}

		if (s.empty()) {
			s.push(make_pair(h[i], 1));
		}
		else if (s.top().first == h[i]) {
			int temp = s.top().second;
			p += temp;
			s.pop();
			if (!s.empty()) {
				p++;
			}
			s.push(make_pair(h[i], temp + 1));
		}
		else {
			p++;
			s.push(make_pair(h[i], 1));
		}
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	search_pair();

	cout << p;

	return 0;

}