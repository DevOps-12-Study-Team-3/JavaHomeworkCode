//주어진 히스토그램에 대해, 가장 큰 직사각형의 넓이를 구하는 프로그램을 작성하시오.
//
//입력
//첫 행에는 N(1 ≤ N ≤ 100, 000) 이 주어진다.N은 히스토그램의 가로 칸의 수이다.
// 다음 N 행에 걸쳐 각 칸의 높이가 왼쪽에서부터 차례대로 주어진다.각 칸의 높이는 1, 000, 000, 000보다 작거나 같은 자연수 또는 0이다.
//
//출력
//첫째 줄에 가장 큰 직사각형의 넓이를 출력한다.이 값은 20억을 넘지 않는다.

#include<iostream>

#include<stack>

using namespace std;

const int MAX = 100000;

// 막대 갯수
int N;

// 막대 크기
long long s[MAX];

// next smaller first idx 
int nsi[MAX];

// before smaller first idx
int bsi[MAX];

// 최대 넓이
long long max_size;


void input() {
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> s[i];
		nsi[i] = N;
		bsi[i] = -1;
	}
}

void search_smaller() {

	stack<int> st1;
	st1.push(0);
	for (int i = 1; i < N; i++) {
		while (!st1.empty() && s[i] < s[st1.top()]) {
			nsi[st1.top()] = i;
			st1.pop();
		}
		st1.push(i);
	}

	stack<int> st2;
	st2.push(N - 1);
	for (int i = N - 2; i >= 0; i--) {
		while (!st2.empty() && s[i] < s[st2.top()]) {
			bsi[st2.top()] = i;
			st2.pop();
		}
		st2.push(i);
	}

}

long long search_maxsize() {

	for (int i = 0; i < N; i++) {
		if (max_size < (nsi[i] - bsi[i] - 1) * s[i]) {
			max_size = (nsi[i] - bsi[i] - 1) * s[i];
		}
	}
	return max_size;
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();

	search_smaller();

	cout << search_maxsize();

}