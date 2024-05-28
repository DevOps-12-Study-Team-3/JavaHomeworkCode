//수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다.이 좌표에 좌표 압축을 적용하려고 한다.
//
//Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.
//
//X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
//
//입력
//첫째 줄에 N이 주어진다.
//
//둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
//
//출력
//첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

const int MAX = 1000000;

int N;

vector<int> X;
vector<int> Y;

void input() {
	cin >> N;
	for (int i = 0; i < N; i++) {
		int x;
		cin >> x;
		X.push_back(x);
		Y.push_back(x);
	}
}

void compress() {
	sort(Y.begin(), Y.end());
	auto last = unique(Y.begin(), Y.end());
	Y.erase(last, Y.end());
}


int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	compress();
	for (int i = 0; i < N; i++) {
		auto it = lower_bound(Y.begin(), Y.end(), X[i]);
		cout << distance(Y.begin(), it) << " ";
	}

	return 0;

}
