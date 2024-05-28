//������ ���� N���� ��ǥ X1, X2, ..., XN�� �ִ�.�� ��ǥ�� ��ǥ ������ �����Ϸ��� �Ѵ�.
//
//Xi�� ��ǥ ������ ��� X'i�� ���� Xi > Xj�� �����ϴ� ���� �ٸ� ��ǥ Xj�� ������ ���ƾ� �Ѵ�.
//
//X1, X2, ..., XN�� ��ǥ ������ ������ ��� X'1, X'2, ..., X'N�� ����غ���.
//
//�Է�
//ù° �ٿ� N�� �־�����.
//
//��° �ٿ��� ���� �� ĭ���� ���е� X1, X2, ..., XN�� �־�����.
//
//���
//ù° �ٿ� X'1, X'2, ..., X'N�� ���� �� ĭ���� �����ؼ� ����Ѵ�.

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
